// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fsv
    implements hst
{

    static final boolean a;
    private final frt b;
    private final hzb c;
    private final hzb d;
    private final hzb e;
    private final hzb f;
    private final hzb g;
    private final hzb h;
    private final hzb i;

    private fsv(frt frt1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6, 
            hzb hzb7)
    {
        if (!a && frt1 == null)
        {
            throw new AssertionError();
        }
        b = frt1;
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
        }
        f = hzb4;
        if (!a && hzb5 == null)
        {
            throw new AssertionError();
        }
        g = hzb5;
        if (!a && hzb6 == null)
        {
            throw new AssertionError();
        }
        h = hzb6;
        if (!a && hzb7 == null)
        {
            throw new AssertionError();
        } else
        {
            i = hzb7;
            return;
        }
    }

    public static hst a(frt frt1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6, hzb hzb7)
    {
        return new fsv(frt1, hzb1, hzb2, hzb3, hzb4, hzb5, hzb6, hzb7);
    }

    private fxn b()
    {
        return frt.a((cev)c.a(), (gju)d.a(), (gmg)e.a(), (evt)f.a(), (dak)g.a(), (dal)h.a(), (fte)i.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!fsv.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
