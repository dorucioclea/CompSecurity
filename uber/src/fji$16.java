// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fjj a;
    final fji b;

    private hjn b()
    {
        hjn hjn = fjj.a(a).ae();
        if (hjn == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return hjn;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(fji fji1, fjj fjj1)
    {
        b = fji1;
        a = fjj1;
        super();
    }
}
