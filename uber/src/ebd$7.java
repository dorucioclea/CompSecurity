// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final ebe a;
    final ebd b;

    private drc b()
    {
        drc drc = ebe.a(a).aN();
        if (drc == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return drc;
        }
    }

    public final Object a()
    {
        return b();
    }

    (ebd ebd1, ebe ebe1)
    {
        b = ebd1;
        a = ebe1;
        super();
    }
}
