// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final emc a;
    final emb b;

    private dak b()
    {
        dak dak = emc.a(a).aj();
        if (dak == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dak;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(emb emb1, emc emc1)
    {
        b = emb1;
        a = emc1;
        super();
    }
}
