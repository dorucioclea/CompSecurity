// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gbm
{

    private diw a;
    private dfp b;

    private gbm()
    {
    }

    gbm(byte byte0)
    {
        this();
    }

    static dfp a(gbm gbm1)
    {
        return gbm1.b;
    }

    static diw b(gbm gbm1)
    {
        return gbm1.a;
    }

    public final gbm a(dfp dfp)
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

    public final gbm a(diw diw)
    {
        a = diw;
        return this;
    }

    public final gbq a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderDialogFragmentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new gbl(this, (byte)0);
        }
    }
}
