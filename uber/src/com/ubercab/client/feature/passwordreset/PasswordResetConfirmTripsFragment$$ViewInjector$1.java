// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.passwordreset;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.passwordreset:
//            PasswordResetConfirmTripsFragment

final class a extends DebouncingOnClickListener
{

    final PasswordResetConfirmTripsFragment a;
    final  b;

    public final void doClick(View view)
    {
        a.onClickButtonYes();
    }

    ( , PasswordResetConfirmTripsFragment passwordresetconfirmtripsfragment)
    {
        b = ;
        a = passwordresetconfirmtripsfragment;
        super();
    }
}
