// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.app.AlertDialog;
import android.view.View;
import com.roidapp.photogrid.common.af;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            br

final class cc
    implements android.view.View.OnClickListener
{

    final AlertDialog a;
    final br b;

    cc(br br1, AlertDialog alertdialog)
    {
        b = br1;
        a = alertdialog;
        super();
    }

    public final void onClick(View view)
    {
        af.b(br.c(b), "SharePage/ShareToFB/continue_share");
        br.j(b);
        a.dismiss();
    }
}
