// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.address;

import android.animation.ValueAnimator;

// Referenced classes of package com.ubercab.client.feature.trip.address:
//            MultiAddressView

final class a
    implements android.animation.torUpdateListener
{

    final MultiAddressView a;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        MultiAddressView.a(a, ((Integer)valueanimator.getAnimatedValue()).intValue());
    }

    (MultiAddressView multiaddressview)
    {
        a = multiaddressview;
        super();
    }
}
