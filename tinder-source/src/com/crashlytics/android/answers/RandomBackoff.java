// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.a.a;
import java.util.Random;

class RandomBackoff
    implements a
{

    final a a;
    final Random b;
    final double c;

    public RandomBackoff(a a1)
    {
        this(a1, new Random());
    }

    private RandomBackoff(a a1, Random random)
    {
        if (a1 == null)
        {
            throw new NullPointerException("backoff must not be null");
        } else
        {
            a = a1;
            c = 0.10000000000000001D;
            b = random;
            return;
        }
    }

    public final long a(int i)
    {
        double d = 1.0D - c;
        return (long)((d + ((c + 1.0D) - d) * b.nextDouble()) * (double)a.a(i));
    }
}
