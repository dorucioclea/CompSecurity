// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import com.facebook.common.executors.a;
import com.facebook.common.executors.b;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class g extends d
{

    final com.facebook.base.c.a a;

    private g(com.facebook.base.c.a a1)
    {
        a = a1;
        super();
    }

    g(com.facebook.base.c.a a1, com.facebook.base.c.b b1)
    {
        this(a1);
    }

    public a a()
    {
        return new b();
    }

    public Object b()
    {
        return a();
    }
}
