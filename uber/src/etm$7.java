// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final etn a;
    final etm b;

    private gmg b()
    {
        gmg gmg = etn.a(a).h();
        if (gmg == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return gmg;
        }
    }

    public final Object a()
    {
        return b();
    }

    (etm etm1, etn etn1)
    {
        b = etm1;
        a = etn1;
        super();
    }
}
