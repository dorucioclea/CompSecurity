// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final ema a;
    final elz b;

    private emu b()
    {
        emu emu = ema.a(a).e();
        if (emu == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return emu;
        }
    }

    public final Object a()
    {
        return b();
    }

    (elz elz1, ema ema1)
    {
        b = elz1;
        a = ema1;
        super();
    }
}
