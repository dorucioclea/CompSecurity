// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final emc a;
    final emb b;

    private grs b()
    {
        grs grs = emc.a(a).aK();
        if (grs == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return grs;
        }
    }

    public final Object a()
    {
        return b();
    }

    (emb emb1, emc emc1)
    {
        b = emb1;
        a = emc1;
        super();
    }
}
