// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.content.Intent;
import android.view.View;
import com.wf.wellsfargomobile.hcewallet.activity.WalletPinActivity;

// Referenced classes of package com.wf.wellsfargomobile:
//            MainActivity

class af
    implements android.view.View.OnClickListener
{

    final MainActivity a;

    af(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    public void onClick(View view)
    {
        if (view == MainActivity.g(a))
        {
            view = new Intent(a, com/wf/wellsfargomobile/hcewallet/activity/WalletPinActivity);
            view.putExtra("wallet_pin", true);
            a.startActivity(view);
        }
    }
}
