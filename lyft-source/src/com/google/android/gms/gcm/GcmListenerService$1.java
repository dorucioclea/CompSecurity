// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.content.Intent;

// Referenced classes of package com.google.android.gms.gcm:
//            GcmListenerService

class a
    implements Runnable
{

    final Intent a;
    final GcmListenerService b;

    public void run()
    {
        GcmListenerService.zza(b, a);
    }

    (GcmListenerService gcmlistenerservice, Intent intent)
    {
        b = gcmlistenerservice;
        a = intent;
        super();
    }
}
