// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ekf
{

    private final String a;
    private final String b;
    private final String c;

    public ekf(String s, String s1, String s2)
    {
        a = s;
        b = s1;
        c = s2;
    }

    public final String a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final String c()
    {
        return c;
    }
}
