// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class esx
{

    private dfe a;
    private dff b;
    private eqg c;
    private dph d;
    private dfp e;

    private esx()
    {
    }

    esx(byte byte0)
    {
        this();
    }

    static dfp a(esx esx1)
    {
        return esx1.e;
    }

    static dff b(esx esx1)
    {
        return esx1.b;
    }

    static dfe c(esx esx1)
    {
        return esx1.a;
    }

    static dph d(esx esx1)
    {
        return esx1.d;
    }

    public final esx a(dfe dfe)
    {
        a = dfe;
        return this;
    }

    public final esx a(dfp dfp)
    {
        if (dfp == null)
        {
            throw new NullPointerException("riderApplicationComponent");
        } else
        {
            e = dfp;
            return this;
        }
    }

    public final esx a(eqg eqg1)
    {
        c = eqg1;
        return this;
    }

    public final eto a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderActivityModule must be set");
        }
        if (b == null)
        {
            b = new dff();
        }
        if (c == null)
        {
            c = new eqg();
        }
        if (d == null)
        {
            d = new dph();
        }
        if (e == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new esw(this, (byte)0);
        }
    }
}
