// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.location.api;

import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;

// Referenced classes of package com.google.android.apps.wallet.location.api:
//            GoogleLocationSettingHelper

public class LocationApiModule
{

    public LocationApiModule()
    {
    }

    static InitializedEventPublisher getInitializedEventPublishers(GoogleLocationSettingHelper googlelocationsettinghelper)
    {
        return googlelocationsettinghelper;
    }
}
