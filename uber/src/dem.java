// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dem
    implements hst
{

    static final boolean a;
    private final dei b;
    private final hzb c;
    private final hzb d;
    private final hzb e;

    private dem(dei dei1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        if (!a && dei1 == null)
        {
            throw new AssertionError();
        }
        b = dei1;
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
        } else
        {
            e = hzb3;
            return;
        }
    }

    public static hst a(dei dei1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        return new dem(dei1, hzb1, hzb2, hzb3);
    }

    private gqy b()
    {
        return b.a((cyy)c.a(), (dal)d.a(), (cix)e.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dem.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
