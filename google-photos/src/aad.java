// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class aad extends BroadcastReceiver
{

    private aac a;

    aad(aac aac1)
    {
        a = aac1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        aac.a(a);
    }
}
