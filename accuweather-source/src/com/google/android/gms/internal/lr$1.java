// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            lr, ls

class b extends com.google.android.gms.wallet.t.b
{

    final int UA;
    final lr akD;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((ls));
    }

    protected void a(ls ls1)
    {
        ls1.dQ(UA);
        b(Status.Ek);
    }

    .a(lr lr1, int i)
    {
        akD = lr1;
        UA = i;
        super();
    }
}
