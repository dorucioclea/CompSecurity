// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            co

class cp extends BroadcastReceiver
{

    final co a;

    cp(co co1)
    {
        a = co1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        co.a(a);
    }
}
