// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;

public class ahd extends agv
{

    ahd(Context context, aio aio, akk akk, ahc ahc)
    {
        super(context, aio, akk, ahc);
    }

    protected final void b(long l)
    {
        ajc.a.post(new _cls1());
        a(l);
    }

    protected void c()
    {
    }

    /* member class not found */
    class _cls1 {}

}
