// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.attachments;

import android.os.Parcel;

// Referenced classes of package com.facebook.orca.attachments:
//            ImageAttachmentData

final class e
    implements android.os.Parcelable.Creator
{

    e()
    {
    }

    public ImageAttachmentData a(Parcel parcel)
    {
        return new ImageAttachmentData(parcel, null);
    }

    public ImageAttachmentData[] a(int i)
    {
        return new ImageAttachmentData[i];
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
