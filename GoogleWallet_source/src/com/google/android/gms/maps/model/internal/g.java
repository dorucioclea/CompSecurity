// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;

public interface g
    extends IInterface
{
    public static abstract class a extends Binder
        implements g
    {

        public static g db(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            if (iinterface != null && (iinterface instanceof g))
            {
                return (g)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            d d1 = null;
            Object obj4 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                parcel = jd(parcel.readInt());
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel = parcel.asBinder();
                } else
                {
                    parcel = null;
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                d1 = cH(parcel.readString());
                parcel1.writeNoException();
                parcel = obj;
                if (d1 != null)
                {
                    parcel = d1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                d1 = cI(parcel.readString());
                parcel1.writeNoException();
                parcel = obj1;
                if (d1 != null)
                {
                    parcel = d1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                d1 = qy();
                parcel1.writeNoException();
                parcel = obj2;
                if (d1 != null)
                {
                    parcel = d1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                d1 = c(parcel.readFloat());
                parcel1.writeNoException();
                parcel = obj3;
                if (d1 != null)
                {
                    parcel = d1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                d d2;
                if (parcel.readInt() != 0)
                {
                    parcel = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                d2 = d(parcel);
                parcel1.writeNoException();
                parcel = d1;
                if (d2 != null)
                {
                    parcel = d2.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                d1 = cJ(parcel.readString());
                parcel1.writeNoException();
                parcel = obj4;
                break;
            }
            if (d1 != null)
            {
                parcel = d1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;
        }
    }

    static final class a.a
        implements g
    {

        private IBinder ld;

        public final IBinder asBinder()
        {
            return ld;
        }

        public final d c(float f)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            d d1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            parcel.writeFloat(f);
            ld.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            d1 = com.google.android.gms.dynamic.d.a.bH(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final d cH(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            parcel.writeString(s);
            ld.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            s = com.google.android.gms.dynamic.d.a.bH(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return s;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final d cI(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            parcel.writeString(s);
            ld.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            s = com.google.android.gms.dynamic.d.a.bH(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return s;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final d cJ(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            parcel.writeString(s);
            ld.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            s = com.google.android.gms.dynamic.d.a.bH(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return s;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final d d(Bitmap bitmap)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            if (bitmap == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            bitmap.writeToParcel(parcel, 0);
_L1:
            ld.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            bitmap = com.google.android.gms.dynamic.d.a.bH(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return bitmap;
            parcel.writeInt(0);
              goto _L1
            bitmap;
            parcel1.recycle();
            parcel.recycle();
            throw bitmap;
        }

        public final d jd(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            d d1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            parcel.writeInt(i);
            ld.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            d1 = com.google.android.gms.dynamic.d.a.bH(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final d qy()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            d d1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            ld.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            d1 = com.google.android.gms.dynamic.d.a.bH(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        a.a(IBinder ibinder)
        {
            ld = ibinder;
        }
    }


    public abstract d c(float f)
        throws RemoteException;

    public abstract d cH(String s)
        throws RemoteException;

    public abstract d cI(String s)
        throws RemoteException;

    public abstract d cJ(String s)
        throws RemoteException;

    public abstract d d(Bitmap bitmap)
        throws RemoteException;

    public abstract d jd(int i)
        throws RemoteException;

    public abstract d qy()
        throws RemoteException;
}
