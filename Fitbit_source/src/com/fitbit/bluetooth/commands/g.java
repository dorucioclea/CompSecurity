// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.commands;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.fitbit.bluetooth.galileo.GalileoProfile;
import com.fitbit.util.threading.c;
import java.util.UUID;

// Referenced classes of package com.fitbit.bluetooth.commands:
//            e

final class g extends e
{

    private static final String n = "ConfigureFitbitNotificationsCommand";
    private final c o;
    private final boolean p;

    public g(com.fitbit.bluetooth.connection.g g1, Bundle bundle, d.a a1)
    {
        super(g1, bundle, a1);
        o = new c(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.a) {

            final g a;

            public void a(Intent intent)
            {
                if ("com.fitbit.bluetooth.galileo.ACTION_NOTIFICATIONS_ENABLED".equals(intent.getAction()))
                {
                    intent = (UUID)intent.getSerializableExtra("android.bluetooth.device.extra.UUID");
                    if (com.fitbit.bluetooth.galileo.c.a(a.k.l(), intent))
                    {
                        g.a(a);
                    }
                } else
                if ("com.fitbit.bluetooth.galileo.ACTION_NOTIFICATIONS_DISABLED".equals(intent.getAction()))
                {
                    intent = (UUID)intent.getSerializableExtra("android.bluetooth.device.extra.UUID");
                    if (com.fitbit.bluetooth.galileo.c.a(a.k.l(), intent))
                    {
                        g.b(a);
                        return;
                    }
                }
            }

            
            {
                a = g.this;
                super(threadname);
            }
        };
        p = bundle.getBoolean("com.fitbit.bluetooth.commands.Command.EXTRA_ENABLE", true);
    }

    private void a()
    {
        r();
        m.a(p, null);
    }

    static void a(g g1)
    {
        g1.a();
    }

    private void b()
    {
        r();
        d.a a1 = m;
        boolean flag;
        if (!p)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a1.a(flag, null);
    }

    static void b(g g1)
    {
        g1.b();
    }

    protected void g()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.fitbit.bluetooth.galileo.ACTION_NOTIFICATIONS_ENABLED");
        intentfilter.addAction("com.fitbit.bluetooth.galileo.ACTION_NOTIFICATIONS_DISABLED");
        o.a(intentfilter);
        if (k.a().setFitbitNotificationsEnabled(k.l(), p))
        {
            s();
            return;
        } else
        {
            r();
            m.a(false, null);
            return;
        }
    }

    protected void h()
    {
        t();
        o.d();
    }

    protected void i()
    {
        r();
        m.a(false, null);
    }

    protected boolean j()
    {
        return l != null && l.containsKey("com.fitbit.bluetooth.commands.Command.EXTRA_ENABLE");
    }

    protected String k()
    {
        return "ConfigureFitbitNotificationsCommand";
    }

    protected long u()
    {
        return 10000L;
    }
}
