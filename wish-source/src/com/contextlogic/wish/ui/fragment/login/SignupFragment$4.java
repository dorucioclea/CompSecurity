// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login;

import android.view.View;
import com.contextlogic.wish.analytics.Analytics;

// Referenced classes of package com.contextlogic.wish.ui.fragment.login:
//            SignupFragment

class this._cls0
    implements android.view.ner
{

    final SignupFragment this$0;

    public void onClick(View view)
    {
        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.pe.GoogleLogin, com.contextlogic.wish.analytics.wType.LoginSplash, com.contextlogic.wish.analytics.pe.Click);
        startGooglePlusLogin();
    }

    ()
    {
        this$0 = SignupFragment.this;
        super();
    }
}
