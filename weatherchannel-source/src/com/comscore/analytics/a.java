// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;

import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.comscore.analytics:
//            Core

class a
    implements Runnable
{

    final Core a;

    a(Core core)
    {
        a = core;
        super();
    }

    public void run()
    {
        if (a.z())
        {
            return;
        }
        if (a.Q < 0)
        {
            a.Q = 0;
        }
        a.A.getAndIncrement();
        a.n();
    }
}
