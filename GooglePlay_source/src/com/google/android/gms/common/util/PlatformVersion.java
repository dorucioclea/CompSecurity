// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;


public final class PlatformVersion
{

    public static boolean checkVersion(int i)
    {
        return android.os.Build.VERSION.SDK_INT >= i;
    }
}
