// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol;

import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.protocol:
//            d, e

class h extends d
{

    final com.facebook.orca.protocol.d a;

    private h(com.facebook.orca.protocol.d d1)
    {
        a = d1;
        super();
    }

    h(com.facebook.orca.protocol.d d1, e e)
    {
        this(d1);
    }

    public com.facebook.orca.protocol.methods.d a()
    {
        return new com.facebook.orca.protocol.methods.d((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d));
    }

    public Object b()
    {
        return a();
    }
}
