// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.loyalty;

import com.dominos.android.sdk.common.BaseCallback;

public abstract class I extends BaseCallback
{

    public abstract void onLoyaltyFail();

    public abstract void onLoyaltySuccess();

    public I()
    {
    }
}
