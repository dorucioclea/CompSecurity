// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            j, zzdf

class bv extends j
{

    private static final String a;

    public bv()
    {
        super(a, new String[0]);
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        return zzdf.zzE(Long.valueOf(System.currentTimeMillis()));
    }

    public boolean zzwn()
    {
        return false;
    }

    static 
    {
        a = zza.zzW.toString();
    }
}
