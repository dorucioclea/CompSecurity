// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import java.io.BufferedReader;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FastParser

private static interface on
{

    public abstract Object parse(FastParser fastparser, BufferedReader bufferedreader)
        throws on, IOException;
}
