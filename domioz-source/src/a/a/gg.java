// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.ListIterator;

// Referenced classes of package a.a:
//            fb, ft, du, gt

final class gg extends fb
{

    private final transient int b;
    private final transient int c;
    private final transient Object d[];

    gg(Object aobj[])
    {
        this(aobj, 0, aobj.length);
    }

    private gg(Object aobj[], int i, int j)
    {
        b = i;
        c = j;
        d = aobj;
    }

    final int a(Object aobj[], int i)
    {
        System.arraycopy(((Object) (d)), b, ((Object) (aobj)), i, c);
        return c + i;
    }

    public final gt a(int i)
    {
        return ft.a(d, b, c, i);
    }

    final fb b(int i, int j)
    {
        return new gg(d, b + i, j - i);
    }

    final boolean e()
    {
        return c != d.length;
    }

    public final Object get(int i)
    {
        du.a(i, c);
        return d[b + i];
    }

    public final int indexOf(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= c)
                {
                    break label1;
                }
                j = i;
                if (d[b + i].equals(obj))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public final int lastIndexOf(Object obj)
    {
        if (obj != null)
        {
            int i = c - 1;
            while (i >= 0) 
            {
                if (d[b + i].equals(obj))
                {
                    return i;
                }
                i--;
            }
        }
        return -1;
    }

    public final ListIterator listIterator(int i)
    {
        return a(i);
    }

    public final int size()
    {
        return c;
    }
}
