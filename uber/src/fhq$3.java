// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fhr a;
    final fhq b;

    private hku b()
    {
        hku hku = fhr.a(a).aS();
        if (hku == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return hku;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fhq fhq1, fhr fhr1)
    {
        b = fhq1;
        a = fhr1;
        super();
    }
}
