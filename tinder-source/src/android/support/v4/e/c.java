// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.e;

import android.os.Parcel;

// Referenced classes of package android.support.v4.e:
//            b

public final class c
    implements android.os.Parcelable.ClassLoaderCreator
{

    private final b a;

    public c(b b1)
    {
        a = b1;
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a.a(parcel, null);
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classloader)
    {
        return a.a(parcel, classloader);
    }

    public final Object[] newArray(int i)
    {
        return a.a(i);
    }
}
