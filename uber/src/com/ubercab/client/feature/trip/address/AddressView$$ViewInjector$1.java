// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.address;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.trip.address:
//            AddressView

final class a extends DebouncingOnClickListener
{

    final AddressView a;
    final a b;

    public final void doClick(View view)
    {
        a.onClickAdd();
    }

    I(I i, AddressView addressview)
    {
        b = i;
        a = addressview;
        super();
    }
}
