// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private static final class zzOs extends AbstractGamesCallbacks
{

    private final com.google.android.gms.common.api.init> zzOs;

    public void zzf(int i, String s)
    {
        zzOs.zzOs(new >(i, s));
    }

    (com.google.android.gms.common.api.ack ack)
    {
        zzOs = (com.google.android.gms.common.api.ack.zzOs)zzu.zzb(ack, "Holder must not be null");
    }
}
