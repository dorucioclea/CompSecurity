// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;

// Referenced classes of package org.chromium.net:
//            X509Util

private static interface 
{

    public abstract List checkServerTrusted(X509Certificate ax509certificate[], String s, String s1)
        throws CertificateException;
}
