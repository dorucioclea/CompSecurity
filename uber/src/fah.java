// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fah
    implements hst
{

    static final boolean a;
    private final fag b;
    private final hzb c;

    private fah(fag fag1, hzb hzb1)
    {
        if (!a && fag1 == null)
        {
            throw new AssertionError();
        }
        b = fag1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(fag fag1, hzb hzb1)
    {
        return new fah(fag1, hzb1);
    }

    private ezz b()
    {
        return fag.a((gmg)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!fah.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
