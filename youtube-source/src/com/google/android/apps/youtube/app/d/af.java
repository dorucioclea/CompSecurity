// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            ae, ai

final class af
    implements android.view.View.OnClickListener
{

    final ae a;

    af(ae ae1)
    {
        a = ae1;
        super();
    }

    public final void onClick(View view)
    {
        if (ae.a(a) != null)
        {
            ae.a(a).b();
        }
    }
}
