// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderApplication;

final class ang.Object
    implements hst
{

    final fjl a;
    final fjk b;

    private RiderApplication b()
    {
        RiderApplication riderapplication = fjl.a(a).d();
        if (riderapplication == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return riderapplication;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fjk fjk1, fjl fjl1)
    {
        b = fjk1;
        a = fjl1;
        super();
    }
}
