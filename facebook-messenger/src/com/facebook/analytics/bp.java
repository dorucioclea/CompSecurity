// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.facebook.analytics:
//            av

public class bp
    implements TextWatcher
{

    private av a;

    public bp(av av1)
    {
        a = av1;
    }

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        a.d();
    }
}
