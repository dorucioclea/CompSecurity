// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final ebk a;
    final ebj b;

    private daj b()
    {
        daj daj = ebk.a(a).aa();
        if (daj == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return daj;
        }
    }

    public final Object a()
    {
        return b();
    }

    (ebj ebj1, ebk ebk1)
    {
        b = ebj1;
        a = ebk1;
        super();
    }
}
