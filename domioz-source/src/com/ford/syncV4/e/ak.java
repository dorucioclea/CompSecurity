// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.bd;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class ak
    implements Runnable
{

    final bd a;
    final j b;

    ak(j j1, bd bd)
    {
        b = j1;
        a = bd;
        super();
    }

    public final void run()
    {
        j.e(b).onSetAppIconResponse(a);
    }
}
