// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.d;

import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.auth.d:
//            b, c

class o extends d
{

    final b a;

    private o(b b1)
    {
        a = b1;
        super();
    }

    o(b b1, c c)
    {
        this(b1);
    }

    public String a()
    {
        ViewerContext viewercontext = (ViewerContext)a(com/facebook/auth/viewercontext/ViewerContext);
        if (viewercontext != null)
        {
            return viewercontext.a();
        } else
        {
            return null;
        }
    }

    public Object b()
    {
        return a();
    }
}
