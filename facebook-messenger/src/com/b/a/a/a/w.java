// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a.a;

import com.b.a.a.a;

public class w extends a
{

    private static final int TARGET_VERSION = 9;

    public w()
    {
    }

    public int getMinimumApiLevel()
    {
        return 9;
    }

    protected android.os.StrictMode.ThreadPolicy onUpdateThreadPolicy(android.os.StrictMode.ThreadPolicy.Builder builder)
    {
        return (new android.os.StrictMode.ThreadPolicy.Builder()).build();
    }
}
