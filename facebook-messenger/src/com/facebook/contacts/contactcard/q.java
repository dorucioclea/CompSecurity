// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.view.View;

// Referenced classes of package com.facebook.contacts.contactcard:
//            ContactCardFragment

class q
    implements android.view.View.OnClickListener
{

    final ContactCardFragment a;

    q(ContactCardFragment contactcardfragment)
    {
        a = contactcardfragment;
        super();
    }

    public void onClick(View view)
    {
        ContactCardFragment.a(a, "view_in_address_book");
        ContactCardFragment.c(a);
    }
}
