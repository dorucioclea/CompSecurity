// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.core.ui:
//            ToggleButton

final class a extends DebouncingOnClickListener
{

    final ToggleButton a;
    final ck b;

    public final void doClick(View view)
    {
        a.onRightButtonClick();
    }

    ( , ToggleButton togglebutton)
    {
        b = ;
        a = togglebutton;
        super();
    }
}
