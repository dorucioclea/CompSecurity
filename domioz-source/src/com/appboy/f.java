// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy;

import android.os.Build;

public final class f
{

    public static final String a = String.format("%s v%s ", new Object[] {
        "Appboy", "1.8.2"
    });
    public static final Boolean b;

    static 
    {
        b = Boolean.valueOf(Build.MANUFACTURER.equals("Amazon"));
    }
}
