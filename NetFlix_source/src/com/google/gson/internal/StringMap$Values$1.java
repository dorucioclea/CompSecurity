// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;


// Referenced classes of package com.google.gson.internal:
//            StringMap

class is._cls0 extends hIterator
{

    final ry.value this$1;

    public final Object next()
    {
        return nextEntry().value;
    }

    ry()
    {
        this$1 = this._cls1.this;
        super(_fld0, null);
    }
}
