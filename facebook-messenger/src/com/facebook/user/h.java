// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import android.os.Parcel;

// Referenced classes of package com.facebook.user:
//            Name

final class h
    implements android.os.Parcelable.Creator
{

    h()
    {
    }

    public Name a(Parcel parcel)
    {
        return new Name(parcel, null);
    }

    public Name[] a(int i)
    {
        return new Name[i];
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
