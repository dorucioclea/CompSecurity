// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.view.View;

// Referenced classes of package com.facebook.orca.threadview:
//            l, r

class n
    implements android.view.View.OnClickListener
{

    final l a;

    n(l l1)
    {
        a = l1;
        super();
    }

    public void onClick(View view)
    {
        if (l.a(a) != null)
        {
            l.a(a).a(a.getRowMessageItem());
        }
    }
}
