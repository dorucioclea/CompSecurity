// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.fitness.request:
//            ab

public class aa
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ab();
    private final int CK;
    private final PendingIntent mPendingIntent;

    aa(int i, PendingIntent pendingintent)
    {
        CK = i;
        mPendingIntent = pendingintent;
    }

    public aa(PendingIntent pendingintent)
    {
        CK = 3;
        mPendingIntent = pendingintent;
    }

    private boolean a(aa aa1)
    {
        return jv.equal(mPendingIntent, aa1.mPendingIntent);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof aa) && a((aa)obj);
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            mPendingIntent
        });
    }

    public PendingIntent kb()
    {
        return mPendingIntent;
    }

    public String toString()
    {
        return jv.h(this).a("pendingIntent", mPendingIntent).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ab.a(this, parcel, i);
    }

}
