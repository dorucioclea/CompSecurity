// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.t;

// Referenced classes of package com.google.android.gms.maps.internal:
//            t

public static abstract class a.ld extends Binder
    implements com.google.android.gms.maps.internal.t
{
    static final class a
        implements com.google.android.gms.maps.internal.t
    {

        private IBinder ld;

        public final IBinder asBinder()
        {
            return ld;
        }

        public final void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetviewpanoramaorientation)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
            if (streetviewpanoramaorientation == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            streetviewpanoramaorientation.writeToParcel(parcel, 0);
_L1:
            ld.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            streetviewpanoramaorientation;
            parcel1.recycle();
            parcel.recycle();
            throw streetviewpanoramaorientation;
        }

        a(IBinder ibinder)
        {
            ld = ibinder;
        }
    }


    public static com.google.android.gms.maps.internal.t cT(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
        if (iinterface != null && (iinterface instanceof com.google.android.gms.maps.internal.t))
        {
            return (com.google.android.gms.maps.internal.t)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
            break;
        }
        if (parcel.readInt() != 0)
        {
            t t1 = StreetViewPanoramaOrientation.CREATOR;
            parcel = t.gx(parcel);
        } else
        {
            parcel = null;
        }
        onStreetViewPanoramaClick(parcel);
        parcel1.writeNoException();
        return true;
    }
}
