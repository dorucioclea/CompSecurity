// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.os.Parcel;

// Referenced classes of package com.cardinalblue.android.piccollage.model:
//            RecentStickersBundle

static final class 
    implements android.os.e.model.RecentStickersBundle._cls1
{

    public RecentStickersBundle a(Parcel parcel)
    {
        return new RecentStickersBundle(parcel);
    }

    public RecentStickersBundle[] a(int i)
    {
        return new RecentStickersBundle[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
