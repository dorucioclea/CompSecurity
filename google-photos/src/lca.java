// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class lca extends Binder
    implements lbz
{

    public static lbz a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
        if (iinterface != null && (iinterface instanceof lbz))
        {
            return (lbz)iinterface;
        } else
        {
            return new lcb(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            parcel1 = obj;
            if (parcel.readInt() != 0)
            {
                parcel1 = lkb.a(parcel);
            }
            a(parcel1);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            parcel1 = obj1;
            if (parcel.readInt() != 0)
            {
                parcel1 = lkc.a(parcel);
            }
            a(parcel1);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            parcel1 = obj2;
            if (parcel.readInt() != 0)
            {
                parcel1 = ljz.a(parcel);
            }
            a(parcel1);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            parcel1 = obj3;
            if (parcel.readInt() != 0)
            {
                parcel1 = ljx.a(parcel);
            }
            a(parcel1);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            parcel1 = obj4;
            if (parcel.readInt() != 0)
            {
                parcel1 = ljv.a(parcel);
            }
            a(parcel1);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            parcel1 = obj5;
            if (parcel.readInt() != 0)
            {
                parcel1 = ljy.a(parcel);
            }
            a(parcel1);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            parcel1 = obj6;
            if (parcel.readInt() != 0)
            {
                parcel1 = lka.a(parcel);
            }
            a(parcel1);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            parcel1 = obj7;
            if (parcel.readInt() != 0)
            {
                parcel1 = ljw.a(parcel);
            }
            a(parcel1);
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            parcel = a();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            a(lbx.a(parcel.readStrongBinder()));
            return true;
        }
    }
}
