// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.q;

import com.facebook.f.n;
import com.facebook.inject.d;
import com.facebook.prefs.shared.ae;

public class b extends d
{

    public static final ae a = n.a("messenger_vvm_enable_sms_reporting");
    private final com.facebook.prefs.shared.d b;

    public b(com.facebook.prefs.shared.d d1)
    {
        b = d1;
    }

    public Boolean a()
    {
        return Boolean.valueOf(b.a(a, false));
    }

    public Object b()
    {
        return a();
    }

}
