// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.Freezable;

// Referenced classes of package com.google.android.gms.plus.model.people:
//            Person

public static interface 
    extends Freezable
{

    public abstract int getHeight();

    public abstract String getUrl();

    public abstract int getWidth();

    public abstract boolean hasHeight();

    public abstract boolean hasUrl();

    public abstract boolean hasWidth();
}
