// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderActivity;

public final class dpi
    implements hst
{

    static final boolean a;
    private final dph b;
    private final hzb c;
    private final hzb d;

    private dpi(dph dph1, hzb hzb1, hzb hzb2)
    {
        if (!a && dph1 == null)
        {
            throw new AssertionError();
        }
        b = dph1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        } else
        {
            d = hzb2;
            return;
        }
    }

    public static hst a(dph dph1, hzb hzb1, hzb hzb2)
    {
        return new dpi(dph1, hzb1, hzb2);
    }

    private dot b()
    {
        return dph.a((RiderActivity)c.a(), (dpb)d.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dpi.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
