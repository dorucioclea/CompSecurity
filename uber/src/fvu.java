// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderActivity;

public final class fvu
    implements hst
{

    static final boolean a;
    private final hzb b;

    private fvu(hzb hzb1)
    {
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = hzb1;
            return;
        }
    }

    public static hst a(hzb hzb1)
    {
        return new fvu(hzb1);
    }

    private fvs b()
    {
        return new fvs((RiderActivity)b.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!fvu.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
