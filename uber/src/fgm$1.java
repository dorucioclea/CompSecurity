// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fgn a;
    final fgm b;

    private dal b()
    {
        dal dal = fgn.a(a).ap();
        if (dal == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dal;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fgm fgm1, fgn fgn1)
    {
        b = fgm1;
        a = fgn1;
        super();
    }
}
