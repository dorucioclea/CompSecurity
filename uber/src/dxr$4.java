// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final dxs a;
    final dxr b;

    private dce b()
    {
        dce dce = dxs.a(a).af();
        if (dce == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dce;
        }
    }

    public final Object a()
    {
        return b();
    }

    (dxr dxr1, dxs dxs1)
    {
        b = dxr1;
        a = dxs1;
        super();
    }
}
