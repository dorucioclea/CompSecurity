// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.view.View;
import com.a.b.a;

final class aa extends a
{

    aa(String s)
    {
        super(s);
    }

    public Float a(View view)
    {
        return Float.valueOf(com.a.c.a.a.a(view).getTranslationX());
    }

    public volatile Object a(Object obj)
    {
        return a((View)obj);
    }

    public void a(View view, float f)
    {
        com.a.c.a.a.a(view).setTranslationX(f);
    }

    public volatile void a(Object obj, float f)
    {
        a((View)obj, f);
    }
}
