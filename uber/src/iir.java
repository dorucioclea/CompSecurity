// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class iir extends iit
{

    private final iiu b;
    private final idv c = idv.a();

    private iir(icc icc, iiu iiu1)
    {
        super(icc);
        b = iiu1;
    }

    public static iir m()
    {
        return n();
    }

    private static iir n()
    {
        iiu iiu1 = new iiu();
        iiu1.g = new ide(iiu1) {

            final iiu a;

            private void a(iiw iiw1)
            {
                Object obj = a.a();
                idv idv1 = a.i;
                iiw1.c(obj);
            }

            public final void call(Object obj)
            {
                a((iiw)obj);
            }

            
            {
                a = iiu1;
                super();
            }
        };
        iiu1.h = iiu1.g;
        return new iir(iiu1, iiu1);
    }

    public final void a()
    {
        if (b.a() == null || b.e)
        {
            Object obj = idv.b();
            iiw aiiw[] = b.b(obj);
            int j = aiiw.length;
            for (int i = 0; i < j; i++)
            {
                iiw iiw1 = aiiw[i];
                idv idv1 = b.i;
                iiw1.b(obj);
            }

        }
    }

    public final void a(Object obj)
    {
        if (b.a() == null || b.e)
        {
            obj = idv.a(obj);
            iiw aiiw[] = b.a(obj);
            int j = aiiw.length;
            for (int i = 0; i < j; i++)
            {
                iiw iiw1 = aiiw[i];
                idv idv1 = b.i;
                iiw1.b(obj);
            }

        }
    }

    public final void a(Throwable throwable)
    {
        if (b.a() == null || b.e)
        {
            Object obj1 = idv.a(throwable);
            iiw aiiw[] = b.b(obj1);
            int j = aiiw.length;
            int i = 0;
            throwable = null;
            do
            {
                if (i >= j)
                {
                    break;
                }
                iiw iiw1 = aiiw[i];
                try
                {
                    idv idv1 = b.i;
                    iiw1.b(obj1);
                }
                catch (Throwable throwable1)
                {
                    Object obj = throwable;
                    if (throwable == null)
                    {
                        obj = new ArrayList();
                    }
                    ((List) (obj)).add(throwable1);
                    throwable = ((Throwable) (obj));
                }
                i++;
            } while (true);
            icw.a(throwable);
        }
    }
}
