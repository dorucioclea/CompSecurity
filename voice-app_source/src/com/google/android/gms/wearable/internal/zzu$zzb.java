// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataItem;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzu

public static class zzaUl
    implements com.google.android.gms.wearable.DataItemResult
{

    private final Status zzOt;
    private final DataItem zzaUl;

    public DataItem getDataItem()
    {
        return zzaUl;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public esult(Status status, DataItem dataitem)
    {
        zzOt = status;
        zzaUl = dataitem;
    }
}
