// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;

// Referenced classes of package android.support.v4.app:
//            o, Fragment

class f
    implements o
{

    final Fragment a;

    f(Fragment fragment)
    {
        a = fragment;
        super();
    }

    public View a(int i)
    {
        if (a.S == null)
        {
            throw new IllegalStateException("Fragment does not have a view");
        } else
        {
            return a.S.findViewById(i);
        }
    }
}
