// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;

public final class lkb
    implements android.os.Parcelable.Creator
{

    public lkb()
    {
    }

    public static StartScanRequest a(Parcel parcel)
    {
        android.os.IBinder ibinder1 = null;
        int j = b.b(parcel);
        int i = 0;
        android.os.IBinder ibinder = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    b.b(parcel, k);
                    break;

                case 1: // '\001'
                    ibinder = b.j(parcel, k);
                    break;

                case 1000: 
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder1 = b.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StartScanRequest(i, ibinder, ibinder1);
            }
        } while (true);
    }

    public static void a(StartScanRequest startscanrequest, Parcel parcel)
    {
        Object obj = null;
        int i = b.q(parcel, 20293);
        android.os.IBinder ibinder;
        if (startscanrequest.b == null)
        {
            ibinder = null;
        } else
        {
            ibinder = startscanrequest.b.asBinder();
        }
        b.a(parcel, 1, ibinder, false);
        b.c(parcel, 1000, startscanrequest.a);
        if (startscanrequest.c == null)
        {
            startscanrequest = obj;
        } else
        {
            startscanrequest = startscanrequest.c.asBinder();
        }
        b.a(parcel, 2, startscanrequest, false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new StartScanRequest[i];
    }
}
