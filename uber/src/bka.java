// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bka extends bkd
    implements Iterable
{

    private final List a = new ArrayList();

    public bka()
    {
    }

    public final Number a()
    {
        if (a.size() == 1)
        {
            return ((bkd)a.get(0)).a();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final void a(bkd bkd1)
    {
        Object obj = bkd1;
        if (bkd1 == null)
        {
            obj = bkf.a;
        }
        a.add(obj);
    }

    public final String b()
    {
        if (a.size() == 1)
        {
            return ((bkd)a.get(0)).b();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final double c()
    {
        if (a.size() == 1)
        {
            return ((bkd)a.get(0)).c();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final long d()
    {
        if (a.size() == 1)
        {
            return ((bkd)a.get(0)).d();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final int e()
    {
        if (a.size() == 1)
        {
            return ((bkd)a.get(0)).e();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final boolean equals(Object obj)
    {
        return obj == this || (obj instanceof bka) && ((bka)obj).a.equals(a);
    }

    public final boolean f()
    {
        if (a.size() == 1)
        {
            return ((bkd)a.get(0)).f();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final Iterator iterator()
    {
        return a.iterator();
    }
}
