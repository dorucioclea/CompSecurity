// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.vendor.google.now.GoogleNowApi;
import com.ubercab.client.core.vendor.google.now.RtNowApi;

public final class dxd
    implements hst
{

    static final boolean a;
    private final dxb b;
    private final hzb c;
    private final hzb d;
    private final hzb e;
    private final hzb f;

    private dxd(dxb dxb1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4)
    {
        if (!a && dxb1 == null)
        {
            throw new AssertionError();
        }
        b = dxb1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        }
        d = hzb2;
        if (!a && hzb3 == null)
        {
            throw new AssertionError();
        }
        e = hzb3;
        if (!a && hzb4 == null)
        {
            throw new AssertionError();
        } else
        {
            f = hzb4;
            return;
        }
    }

    public static hst a(dxb dxb1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4)
    {
        return new dxd(dxb1, hzb1, hzb2, hzb3, hzb4);
    }

    private dwx b()
    {
        return dxb.a((gmg)c.a(), (GoogleNowApi)d.a(), (RtNowApi)e.a(), (dal)f.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dxd.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
