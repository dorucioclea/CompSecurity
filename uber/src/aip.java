// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class aip
{

    private final air a;
    private final LinkedList b;
    private final Object c;
    private final String d;
    private final String e;
    private long f;
    private long g;
    private boolean h;
    private long i;
    private long j;
    private long k;
    private long l;

    private aip(air air1, String s, String s1)
    {
        c = new Object();
        f = -1L;
        g = -1L;
        h = false;
        i = -1L;
        j = 0L;
        k = -1L;
        l = -1L;
        a = air1;
        d = s;
        e = s1;
        b = new LinkedList();
    }

    public aip(String s, String s1)
    {
        this(ot.h(), s, s1);
    }

    public final void a()
    {
        synchronized (c)
        {
            if (l != -1L && g == -1L)
            {
                g = SystemClock.elapsedRealtime();
                a.a(this);
            }
            a.c().c();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(long l1)
    {
        synchronized (c)
        {
            l = l1;
            if (l != -1L)
            {
                a.a(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(AdRequestParcel adrequestparcel)
    {
        synchronized (c)
        {
            k = SystemClock.elapsedRealtime();
            a.c().a(adrequestparcel, k);
        }
        return;
        adrequestparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adrequestparcel;
    }

    public final void a(boolean flag)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (l == -1L)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        i = SystemClock.elapsedRealtime();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        g = i;
        a.a(this);
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        synchronized (c)
        {
            if (l != -1L)
            {
                aiq aiq1 = new aiq();
                aiq1.c();
                b.add(aiq1);
                j = j + 1L;
                a.c().b();
                a.a(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(long l1)
    {
        synchronized (c)
        {
            if (l != -1L)
            {
                f = l1;
                a.a(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(boolean flag)
    {
        synchronized (c)
        {
            if (l != -1L)
            {
                h = flag;
                a.a(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c()
    {
        synchronized (c)
        {
            if (l != -1L && !b.isEmpty())
            {
                aiq aiq1 = (aiq)b.getLast();
                if (aiq1.a() == -1L)
                {
                    aiq1.b();
                    a.a(this);
                }
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Bundle d()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        ArrayList arraylist;
        obj1 = new Bundle();
        ((Bundle) (obj1)).putString("seq_num", d);
        ((Bundle) (obj1)).putString("slotid", e);
        ((Bundle) (obj1)).putBoolean("ismediation", h);
        ((Bundle) (obj1)).putLong("treq", k);
        ((Bundle) (obj1)).putLong("tresponse", l);
        ((Bundle) (obj1)).putLong("timp", g);
        ((Bundle) (obj1)).putLong("tload", i);
        ((Bundle) (obj1)).putLong("pcc", j);
        ((Bundle) (obj1)).putLong("tfetch", f);
        arraylist = new ArrayList();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); arraylist.add(((aiq)iterator.next()).d())) { }
        break MISSING_BLOCK_LABEL_158;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        ((Bundle) (obj1)).putParcelableArrayList("tclick", arraylist);
        obj;
        JVM INSTR monitorexit ;
        return ((Bundle) (obj1));
    }
}
