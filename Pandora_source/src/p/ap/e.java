// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class e
{

    private final LinkedHashMap a = new LinkedHashMap(100, 0.75F, true);
    private int b;
    private final int c;
    private int d;

    public e(int i)
    {
        d = 0;
        c = i;
        b = i;
    }

    private void c()
    {
        b(b);
    }

    protected int a(Object obj)
    {
        return 1;
    }

    public void a()
    {
        b(0);
    }

    protected void a(Object obj, Object obj1)
    {
    }

    public int b()
    {
        return d;
    }

    public Object b(Object obj)
    {
        return a.get(obj);
    }

    public Object b(Object obj, Object obj1)
    {
        if (a(obj1) >= b)
        {
            a(obj, obj1);
            return null;
        }
        obj = a.put(obj, obj1);
        if (obj1 != null)
        {
            d = d + a(obj1);
        }
        if (obj != null)
        {
            d = d - a(obj);
        }
        c();
        return obj;
    }

    protected void b(int i)
    {
        while (d > i) 
        {
            Object obj1 = (java.util.Map.Entry)a.entrySet().iterator().next();
            Object obj = ((java.util.Map.Entry) (obj1)).getValue();
            d = d - a(obj);
            obj1 = ((java.util.Map.Entry) (obj1)).getKey();
            a.remove(obj1);
            a(obj1, obj);
        }
    }

    public Object c(Object obj)
    {
        obj = a.remove(obj);
        if (obj != null)
        {
            d = d - a(obj);
        }
        return obj;
    }
}
