// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.nux;

import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;

public class a
    implements javax.inject.a
{

    private static final ae a = n.a("messenger_sms_force_android");
    private final d b;

    public a(d d1)
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
