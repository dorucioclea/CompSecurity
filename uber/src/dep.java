// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;

public final class dep
    implements hst
{

    static final boolean a;
    private final dei b;
    private final hzb c;

    private dep(dei dei1, hzb hzb1)
    {
        if (!a && dei1 == null)
        {
            throw new AssertionError();
        }
        b = dei1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(dei dei1, hzb hzb1)
    {
        return new dep(dei1, hzb1);
    }

    private gqs b()
    {
        return b.a((Application)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dep.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
