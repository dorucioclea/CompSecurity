// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;

// Referenced classes of package com.facebook.orca.server:
//            FetchGroupThreadsParams

final class i
    implements android.os.Parcelable.Creator
{

    i()
    {
    }

    public FetchGroupThreadsParams a(Parcel parcel)
    {
        return new FetchGroupThreadsParams(parcel, null);
    }

    public FetchGroupThreadsParams[] a(int j)
    {
        return new FetchGroupThreadsParams[j];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int j)
    {
        return a(j);
    }
}
