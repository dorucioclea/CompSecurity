// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            bn, df, cn, cm

final class bz extends bn
{

    bz(String s, int i)
    {
        super(s, i, null);
    }

    cm newEntry(cn cn1, Object obj, int i, cm cm)
    {
        return new df(cn1.g, obj, i, cm);
    }
}
