// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.facebook.fbservice.service:
//            z, OperationResult

class ab
    implements z
{

    private IBinder a;

    ab(IBinder ibinder)
    {
        a = ibinder;
    }

    public void a(OperationResult operationresult)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.fbservice.service.ICompletionHandler");
        if (operationresult == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        operationresult.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        operationresult;
        parcel1.recycle();
        parcel.recycle();
        throw operationresult;
    }

    public IBinder asBinder()
    {
        return a;
    }

    public void b(OperationResult operationresult)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.fbservice.service.ICompletionHandler");
        if (operationresult == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        operationresult.writeToParcel(parcel, 0);
_L1:
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        operationresult;
        parcel1.recycle();
        parcel.recycle();
        throw operationresult;
    }
}
