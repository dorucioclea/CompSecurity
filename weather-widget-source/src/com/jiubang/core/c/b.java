// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.c;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class b
    implements ThreadFactory
{

    private final AtomicInteger a = new AtomicInteger();

    b()
    {
    }

    public Thread newThread(Runnable runnable)
    {
        return new Thread(runnable, (new StringBuilder()).append("AsyncTask #").append(a.getAndIncrement()).toString());
    }
}
