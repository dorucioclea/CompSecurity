// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            EnterPhoneNumber

class _s
    implements android.content.DialogInterface.OnClickListener
{

    final EnterPhoneNumber a;

    _s(EnterPhoneNumber enterphonenumber)
    {
        a = enterphonenumber;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.removeDialog(22);
    }
}
