// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            ParcelableIndexReference

public class q
    implements android.os.Parcelable.Creator
{

    public q()
    {
    }

    static void a(ParcelableIndexReference parcelableindexreference, Parcel parcel, int i)
    {
        i = b.D(parcel);
        b.c(parcel, 1, parcelableindexreference.BR);
        b.a(parcel, 2, parcelableindexreference.Rp, false);
        b.c(parcel, 3, parcelableindexreference.mIndex);
        b.a(parcel, 4, parcelableindexreference.Rq);
        b.H(parcel, i);
    }

    public ParcelableIndexReference aX(Parcel parcel)
    {
        boolean flag = false;
        int k = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        String s = null;
        int j = 0;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new ParcelableIndexReference(i, s, j, flag);
            }
        } while (true);
    }

    public ParcelableIndexReference[] ck(int i)
    {
        return new ParcelableIndexReference[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aX(parcel);
    }

    public Object[] newArray(int i)
    {
        return ck(i);
    }
}
