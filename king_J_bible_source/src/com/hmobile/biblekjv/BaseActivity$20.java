// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity

class this._cls0
    implements android.view.ener
{

    final BaseActivity this$0;

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.VIEW");
        view.setData(Uri.parse((new StringBuilder("market://details?id=")).append(getResources().getString(0x7f07004a)).toString()));
        startActivity(view);
    }

    ()
    {
        this$0 = BaseActivity.this;
        super();
    }
}
