// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ffr
{

    private djb a;
    private dfp b;

    private ffr()
    {
    }

    ffr(byte byte0)
    {
        this();
    }

    static dfp a(ffr ffr1)
    {
        return ffr1.b;
    }

    static djb b(ffr ffr1)
    {
        return ffr1.a;
    }

    public final ffr a(dfp dfp)
    {
        if (dfp == null)
        {
            throw new NullPointerException("riderApplicationComponent");
        } else
        {
            b = dfp;
            return this;
        }
    }

    public final ffr a(djb djb)
    {
        a = djb;
        return this;
    }

    public final ffv a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new ffq(this, (byte)0);
        }
    }
}
