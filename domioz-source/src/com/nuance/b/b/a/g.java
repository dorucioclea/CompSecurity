// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b.a;


public final class g extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    private static final g d[];

    private g(String s, int i)
    {
        super(s, i);
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/nuance/b/b/a/g, s);
    }

    public static g[] values()
    {
        return (g[])d.clone();
    }

    static 
    {
        a = new g("EXCEPTION", 0);
        b = new g("SESSION_EXPIRED", 1);
        c = new g("OTHER", 2);
        d = (new g[] {
            a, b, c
        });
    }
}
