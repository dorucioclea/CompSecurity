// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class etl
{

    private djb a;
    private dfp b;

    private etl()
    {
    }

    etl(byte byte0)
    {
        this();
    }

    static dfp a(etl etl1)
    {
        return etl1.b;
    }

    static djb b(etl etl1)
    {
        return etl1.a;
    }

    public final etl a(dfp dfp)
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

    public final etl a(djb djb)
    {
        a = djb;
        return this;
    }

    public final euf a()
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
            return new etk(this, (byte)0);
        }
    }
}
