// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.shoprunner;

import org.c.c.c;

// Referenced classes of package com.dominos.android.sdk.data.http.shoprunner:
//            ShopRunnerRestInterface_

class val.arg0 extends c
{

    final ShopRunnerRestInterface_ this$0;
    final String val$arg0;

    public String getHeaderValue()
    {
        return (new StringBuilder("Bearer ")).append(val$arg0).toString();
    }

    ()
    {
        this$0 = final_shoprunnerrestinterface_;
        val$arg0 = String.this;
        super();
    }
}
