// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import com.facebook.c.s;
import com.facebook.inject.d;
import com.facebook.orca.h.a;
import com.facebook.orca.h.b;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class aw extends d
{

    final h a;

    private aw(h h)
    {
        a = h;
        super();
    }

    aw(h h, i i)
    {
        this(h);
    }

    public b a()
    {
        return new b((Context)a(android/content/Context), (s)a(com/facebook/c/s), (a)a(com/facebook/orca/h/a));
    }

    public Object b()
    {
        return a();
    }
}
