// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.share;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.share:
//            ConfirmContactsDialogFragment

final class a extends DebouncingOnClickListener
{

    final ConfirmContactsDialogFragment a;
    final a b;

    public final void doClick(View view)
    {
        a.onClickCancel();
    }

    ( , ConfirmContactsDialogFragment confirmcontactsdialogfragment)
    {
        b = ;
        a = confirmcontactsdialogfragment;
        super();
    }
}
