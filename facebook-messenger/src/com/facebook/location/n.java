// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;

import android.os.Parcel;

// Referenced classes of package com.facebook.location:
//            GetDeviceLocationParams

final class n
    implements android.os.Parcelable.Creator
{

    n()
    {
    }

    public GetDeviceLocationParams a(Parcel parcel)
    {
        return new GetDeviceLocationParams(parcel, null);
    }

    public GetDeviceLocationParams[] a(int i)
    {
        return new GetDeviceLocationParams[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
