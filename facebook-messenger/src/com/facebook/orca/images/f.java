// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.images;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.facebook.orca.images:
//            ImageSearchActivity

class f
    implements android.widget.AdapterView.OnItemClickListener
{

    final ImageSearchActivity a;

    f(ImageSearchActivity imagesearchactivity)
    {
        a = imagesearchactivity;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        ImageSearchActivity.a(a, i);
    }
}
