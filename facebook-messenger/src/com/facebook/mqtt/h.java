// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt;


// Referenced classes of package com.facebook.mqtt:
//            m, b

class h
    implements Runnable
{

    final b a;

    h(b b1)
    {
        a = b1;
        super();
    }

    public void run()
    {
        b.a(a, m.DISCONNECT, null);
    }
}
