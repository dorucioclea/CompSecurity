// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.io.InputStream;

public final class cft
{

    final InputStream a;
    final Bitmap b;
    final boolean c;
    final long d;

    public cft(InputStream inputstream, boolean flag, long l)
    {
        if (inputstream == null)
        {
            throw new IllegalArgumentException("Stream may not be null.");
        } else
        {
            a = inputstream;
            b = null;
            c = flag;
            d = l;
            return;
        }
    }

    public final InputStream a()
    {
        return a;
    }

    public final Bitmap b()
    {
        return b;
    }

    public final long c()
    {
        return d;
    }
}
