// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.engines.SkipjackEngine;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            Skipjack

public static class <init> extends BaseMac
{

    public ()
    {
        super(new CBCBlockCipherMac(new SkipjackEngine()));
    }
}
