// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.location;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.location:
//            Shape_RiderLocation, RiderLocation

final class 
    implements android.os.Shape_RiderLocation._cls1
{

    private static RiderLocation a(Parcel parcel)
    {
        return new Shape_RiderLocation(parcel, (byte)0);
    }

    private static RiderLocation[] a(int i)
    {
        return new RiderLocation[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
