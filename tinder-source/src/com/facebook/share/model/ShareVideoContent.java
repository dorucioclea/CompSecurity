// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareContent, ShareModel, SharePhoto, ShareVideo

public final class ShareVideoContent extends ShareContent
    implements ShareModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ShareVideoContent(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ShareVideoContent[i];
        }

    };
    private final String a;
    private final String b;
    private final SharePhoto c;
    private final ShareVideo d;

    ShareVideoContent(Parcel parcel)
    {
        super(parcel);
        a = parcel.readString();
        b = parcel.readString();
        SharePhoto.a a1 = (new SharePhoto.a()).a(parcel);
        if (a1.c != null || a1.b != null)
        {
            c = new SharePhoto(a1, (byte)0);
        } else
        {
            c = null;
        }
        d = new ShareVideo((new ShareVideo.a()).a(parcel), (byte)0);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeParcelable(c, 0);
        parcel.writeParcelable(d, 0);
    }

}
