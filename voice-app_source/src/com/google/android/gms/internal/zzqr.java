// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzqr
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzqr
    {

        public static zzqr zzdG(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
            if (iinterface != null && (iinterface instanceof zzqr))
            {
                return (zzqr)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
                i = parcel.readInt();
                j = parcel.readInt();
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            zza(i, j, parcel);
            parcel1.writeNoException();
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
        }
    }

    private static class zza.zza
        implements zzqr
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void zza(int i, int j, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
            parcel.writeInt(i);
            parcel.writeInt(j);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            zznF.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
        }

        zza.zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public abstract void zza(int i, int j, Bundle bundle)
        throws RemoteException;
}
