// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            u

public final class t
{
    public static final class a
    {

        private final List a;
        private final Object b;

        public final a a(String s, Object obj)
        {
            a.add((new StringBuilder()).append((String)u.a(s)).append("=").append(String.valueOf(obj)).toString());
            return this;
        }

        public final String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder(100)).append(b.getClass().getSimpleName()).append('{');
            int j = a.size();
            for (int i = 0; i < j; i++)
            {
                stringbuilder.append((String)a.get(i));
                if (i < j - 1)
                {
                    stringbuilder.append(", ");
                }
            }

            return stringbuilder.append('}').toString();
        }

        private a(Object obj)
        {
            b = u.a(obj);
            a = new ArrayList();
        }

        a(Object obj, byte byte0)
        {
            this(obj);
        }
    }


    public static a a(Object obj)
    {
        return new a(obj, (byte)0);
    }

    public static boolean a(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }
}
