// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.api:
//            zzg

private static class zzQP extends BroadcastReceiver
{

    private WeakReference zzQP;

    public void onReceive(Context context, Intent intent)
    {
        intent = intent.getData();
        context = null;
        if (intent != null)
        {
            context = intent.getSchemeSpecificPart();
        }
        if (context != null && context.equals("com.google.android.gms"))
        {
            if ((context = (zzg)zzQP.get()) != null)
            {
                zzg.zzf(context);
                return;
            }
        }
    }

    (zzg zzg1)
    {
        zzQP = new WeakReference(zzg1);
    }
}
