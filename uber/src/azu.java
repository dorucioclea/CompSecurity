// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public final class azu
    implements android.os.Parcelable.Creator
{

    public azu()
    {
    }

    public static StreetViewPanoramaOrientation a(Parcel parcel)
    {
        float f1 = 0.0F;
        int j = up.b(parcel);
        int i = 0;
        float f = 0.0F;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = up.a(parcel);
                switch (up.a(k))
                {
                default:
                    up.a(parcel, k);
                    break;

                case 1: // '\001'
                    i = up.e(parcel, k);
                    break;

                case 2: // '\002'
                    f = up.i(parcel, k);
                    break;

                case 3: // '\003'
                    f1 = up.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new uq((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaOrientation(i, f, f1);
            }
        } while (true);
    }

    public static void a(StreetViewPanoramaOrientation streetviewpanoramaorientation, Parcel parcel)
    {
        int i = ur.a(parcel);
        ur.a(parcel, 1, streetviewpanoramaorientation.a());
        ur.a(parcel, 2, streetviewpanoramaorientation.a);
        ur.a(parcel, 3, streetviewpanoramaorientation.b);
        ur.a(parcel, i);
    }

    private static StreetViewPanoramaOrientation[] a(int i)
    {
        return new StreetViewPanoramaOrientation[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return a(i);
    }
}
