// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import dagger.Factory;

public final class InstanceFactory
    implements Factory
{

    private final Object instance;

    public final Object get()
    {
        return instance;
    }
}
