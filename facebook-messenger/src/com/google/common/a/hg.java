// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            gw, kl, hm, gx

class hg
    implements Iterator
{

    final Set a;
    hm b;
    hm c;
    final gw d;

    private hg(gw gw1)
    {
        d = gw1;
        super();
        a = kl.a(d.g().size());
        b = gw.a(d);
    }

    hg(gw gw1, gx gx)
    {
        this(gw1);
    }

    public boolean hasNext()
    {
        return b != null;
    }

    public Object next()
    {
        gw.e(b);
        c = b;
        a.add(c.a);
        do
        {
            b = b.c;
        } while (b != null && !a.add(b.a));
        return c.a;
    }

    public void remove()
    {
        boolean flag;
        if (c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        gw.a(d, c.a);
        c = null;
    }
}
