// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.google.common.collect:
//            ct, cj, MapMakerInternalMap

final class cv extends ct
    implements cj
{

    volatile long d;
    cj e;
    cj f;

    cv(ReferenceQueue referencequeue, Object obj, int i, cj cj1)
    {
        super(referencequeue, obj, i, cj1);
        d = 0x7fffffffffffffffL;
        e = MapMakerInternalMap.nullEntry();
        f = MapMakerInternalMap.nullEntry();
    }

    public final long getExpirationTime()
    {
        return d;
    }

    public final cj getNextExpirable()
    {
        return e;
    }

    public final cj getPreviousExpirable()
    {
        return f;
    }

    public final void setExpirationTime(long l)
    {
        d = l;
    }

    public final void setNextExpirable(cj cj1)
    {
        e = cj1;
    }

    public final void setPreviousExpirable(cj cj1)
    {
        f = cj1;
    }
}
