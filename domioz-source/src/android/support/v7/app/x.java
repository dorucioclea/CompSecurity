// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.y;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7, o

final class x
    implements y
{

    final AppCompatDelegateImplV7 a;

    private x(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        a = appcompatdelegateimplv7;
        super();
    }

    x(AppCompatDelegateImplV7 appcompatdelegateimplv7, byte byte0)
    {
        this(appcompatdelegateimplv7);
    }

    public final void a(i i, boolean flag)
    {
        AppCompatDelegateImplV7.a(a, i);
    }

    public final boolean a(i i)
    {
        android.view.Window.Callback callback = ((o) (a)).b.getCallback();
        if (callback != null)
        {
            callback.onMenuOpened(8, i);
        }
        return true;
    }
}
