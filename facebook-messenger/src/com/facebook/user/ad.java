// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import java.text.SimpleDateFormat;
import java.util.Locale;

// Referenced classes of package com.facebook.user:
//            ac

class ad extends ThreadLocal
{

    final ac a;

    ad(ac ac)
    {
        a = ac;
        super();
    }

    protected SimpleDateFormat a()
    {
        return new SimpleDateFormat("M/d/y", Locale.US);
    }

    protected Object initialValue()
    {
        return a();
    }
}
