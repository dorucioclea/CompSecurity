// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.safetynet;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.ubercab.client.feature.safetynet:
//            SafetyNetConfiguredShareTripFragment

final class a
    implements android.widget.gment..ViewInjector._cls1
{

    final SafetyNetConfiguredShareTripFragment a;
    final a b;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.onItemClicked(i);
    }

    ( , SafetyNetConfiguredShareTripFragment safetynetconfiguredsharetripfragment)
    {
        b = ;
        a = safetynetconfiguredsharetripfragment;
        super();
    }
}
