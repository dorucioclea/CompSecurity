// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


// Referenced classes of package com.taplytics:
//            cv

final class dc
    implements Runnable
{

    final cv a;

    dc(cv cv1)
    {
        a = cv1;
        super();
    }

    public final void run()
    {
        cv.a(a);
    }
}
