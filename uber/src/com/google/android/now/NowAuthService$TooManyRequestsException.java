// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.now;


public class mNextRetryTimestampMillis extends Exception
{

    private final long mNextRetryTimestampMillis;

    public long getNextRetryTimestampMillis()
    {
        return mNextRetryTimestampMillis;
    }

    public (long l)
    {
        mNextRetryTimestampMillis = l;
    }
}
