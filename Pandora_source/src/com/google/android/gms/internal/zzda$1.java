// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            zzda

class a
    implements android.content.nterface.OnClickListener
{

    final zzda a;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = a.createIntent();
        zzda.zza(a).startActivity(dialoginterface);
    }

    Listener(zzda zzda1)
    {
        a = zzda1;
        super();
    }
}
