// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hannesdorfmann.parcelableplease.annotation;

import java.lang.annotation.Annotation;

public interface Bagger
    extends Annotation
{

    public abstract Class value();
}
