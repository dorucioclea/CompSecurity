// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final eds a;
    final edr b;

    private cev b()
    {
        cev cev = eds.a(a).D();
        if (cev == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return cev;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(edr edr1, eds eds1)
    {
        b = edr1;
        a = eds1;
        super();
    }
}
