// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class duw
    implements hrt
{

    private final Object a;
    private final int b = 5;

    public duw(Object obj)
    {
        a = obj;
    }

    private Object a(hsf hsf1)
    {
        if (b <= 0)
        {
            return null;
        }
        hsf1 = (CharSequence)hsf1.b();
        if (hsf1 == null || hsf1.length() < b)
        {
            return a;
        } else
        {
            return null;
        }
    }

    public final volatile Object a(Object obj)
    {
        return a((hsf)obj);
    }
}
