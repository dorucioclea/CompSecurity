// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.event;


public final class ForceUpgradeUrlEvent
{

    private final String mForceUpgradeUrl;

    public ForceUpgradeUrlEvent(String s)
    {
        mForceUpgradeUrl = s;
    }

    public final String getForceUpgradeUrl()
    {
        return mForceUpgradeUrl;
    }
}
