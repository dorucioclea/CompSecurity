// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Closeable;
import java.io.Flushable;

public interface hzv
    extends Closeable, Flushable
{

    public abstract void close();

    public abstract void flush();

    public abstract hzx timeout();

    public abstract void write(hzf hzf, long l);
}
