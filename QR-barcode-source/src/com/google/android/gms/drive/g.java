// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive:
//            StorageStats

public class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    static void a(StorageStats storagestats, Parcel parcel, int i)
    {
        i = b.D(parcel);
        b.c(parcel, 1, storagestats.BR);
        b.a(parcel, 2, storagestats.NB);
        b.a(parcel, 3, storagestats.NC);
        b.a(parcel, 4, storagestats.ND);
        b.a(parcel, 5, storagestats.NE);
        b.c(parcel, 6, storagestats.NF);
        b.H(parcel, i);
    }

    public StorageStats R(Parcel parcel)
    {
        int i = 0;
        long l1 = 0L;
        int k = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        long l2 = 0L;
        long l3 = 0L;
        long l4 = 0L;
        int j = 0;
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
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    l4 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 3: // '\003'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 4: // '\004'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 5: // '\005'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new StorageStats(j, l4, l3, l2, l1, i);
            }
        } while (true);
    }

    public StorageStats[] aY(int i)
    {
        return new StorageStats[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return R(parcel);
    }

    public Object[] newArray(int i)
    {
        return aY(i);
    }
}
