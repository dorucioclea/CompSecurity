// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.OutputStream;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsProtocolHandler

class TlsOutputStream extends OutputStream
{

    private byte buf[];
    private TlsProtocolHandler handler;

    TlsOutputStream(TlsProtocolHandler tlsprotocolhandler)
    {
        buf = new byte[1];
        handler = tlsprotocolhandler;
    }

    public void close()
    {
        handler.close();
    }

    public void flush()
    {
        handler.flush();
    }

    public void write(int i)
    {
        buf[0] = (byte)i;
        write(buf, 0, 1);
    }

    public void write(byte abyte0[], int i, int j)
    {
        handler.writeData(abyte0, i, j);
    }
}
