// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.threads;

import android.os.Parcel;

// Referenced classes of package com.facebook.messages.model.threads:
//            Message

final class b
    implements android.os.Parcelable.Creator
{

    b()
    {
    }

    public Message a(Parcel parcel)
    {
        return new Message(parcel, null);
    }

    public Message[] a(int i)
    {
        return new Message[i];
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
