// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

// Referenced classes of package com.google.android.gms.internal:
//            fg, fd

public final class zzrx
{
    public static class zza extends IOException
    {

        zza(int i, int j)
        {
            super((new StringBuilder("CodedOutputStream was writing to a flat byte array and ran out of space (pos ")).append(i).append(" limit ").append(j).append(").").toString());
        }
    }


    final ByteBuffer a;

    private zzrx(ByteBuffer bytebuffer)
    {
        a = bytebuffer;
        a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private zzrx(byte abyte0[], int i)
    {
        this(ByteBuffer.wrap(abyte0, 0, i));
    }

    public static int a(int i)
    {
        return c(fg.a(i, 0));
    }

    public static int a(long l)
    {
        if ((-128L & l) == 0L)
        {
            return 1;
        }
        if ((-16384L & l) == 0L)
        {
            return 2;
        }
        if ((0xffffffffffe00000L & l) == 0L)
        {
            return 3;
        }
        if ((0xfffffffff0000000L & l) == 0L)
        {
            return 4;
        }
        if ((0xfffffff800000000L & l) == 0L)
        {
            return 5;
        }
        if ((0xfffffc0000000000L & l) == 0L)
        {
            return 6;
        }
        if ((0xfffe000000000000L & l) == 0L)
        {
            return 7;
        }
        if ((0xff00000000000000L & l) == 0L)
        {
            return 8;
        }
        return (0x8000000000000000L & l) != 0L ? 10 : 9;
    }

    private static int a(CharSequence charsequence)
    {
_L2:
        int i;
        if (j < i1)
        {
            char c1 = charsequence.charAt(j);
            if (c1 < '\u0800')
            {
                i += 127 - c1 >>> 31;
                j++;
                continue; /* Loop/switch isn't completed */
            }
            int k1 = charsequence.length();
            while (j < k1) 
            {
                char c2 = charsequence.charAt(j);
                int l;
                if (c2 < '\u0800')
                {
                    k += 127 - c2 >>> 31;
                    l = j;
                } else
                {
                    int j1 = k + 2;
                    k = j1;
                    l = j;
                    if ('\uD800' <= c2)
                    {
                        k = j1;
                        l = j;
                        if (c2 <= '\uDFFF')
                        {
                            if (Character.codePointAt(charsequence, j) < 0x10000)
                            {
                                throw new IllegalArgumentException((new StringBuilder("Unpaired surrogate at index ")).append(j).toString());
                            }
                            l = j + 1;
                            k = j1;
                        }
                    }
                }
                j = l + 1;
            }
            i = k + i;
        }
        if (i < i1)
        {
            throw new IllegalArgumentException((new StringBuilder("UTF-8 length does not fit in int: ")).append((long)i + 0x100000000L).toString());
        } else
        {
            return i;
        }
        int k = 0;
        int i1 = charsequence.length();
        int j;
        for (j = 0; j < i1 && charsequence.charAt(j) < '\200'; j++) { }
        i = i1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static int a(CharSequence charsequence, byte abyte0[], int i, int j)
    {
        int l1;
        int i2;
        l1 = charsequence.length();
        boolean flag = false;
        i2 = i + j;
        j = ((flag) ? 1 : 0);
        do
        {
            if (j >= l1 || j + i >= i2)
            {
                break;
            }
            char c3 = charsequence.charAt(j);
            if (c3 >= '\200')
            {
                break;
            }
            abyte0[i + j] = (byte)c3;
            j++;
        } while (true);
        if (j == l1)
        {
            return i + l1;
        }
        i += j;
_L2:
        char c1;
        if (j >= l1)
        {
            break MISSING_BLOCK_LABEL_540;
        }
        c1 = charsequence.charAt(j);
        if (c1 >= '\200' || i >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        int k = i + 1;
        abyte0[i] = (byte)c1;
        i = k;
_L3:
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        if (c1 < '\u0800' && i <= i2 - 2)
        {
            int l = i + 1;
            abyte0[i] = (byte)(c1 >>> 6 | 0x3c0);
            i = l + 1;
            abyte0[l] = (byte)(c1 & 0x3f | 0x80);
        } else
        if ((c1 < '\uD800' || '\uDFFF' < c1) && i <= i2 - 3)
        {
            int i1 = i + 1;
            abyte0[i] = (byte)(c1 >>> 12 | 0x1e0);
            int j2 = i1 + 1;
            abyte0[i1] = (byte)(c1 >>> 6 & 0x3f | 0x80);
            i = j2 + 1;
            abyte0[j2] = (byte)(c1 & 0x3f | 0x80);
        } else
        {
label0:
            {
                char c2;
label1:
                {
                    if (i > i2 - 4)
                    {
                        break label0;
                    }
                    int j1 = j;
                    if (j + 1 != charsequence.length())
                    {
                        j++;
                        c2 = charsequence.charAt(j);
                        if (Character.isSurrogatePair(c1, c2))
                        {
                            break label1;
                        }
                        j1 = j;
                    }
                    throw new IllegalArgumentException((new StringBuilder("Unpaired surrogate at index ")).append(j1 - 1).toString());
                }
                int k1 = Character.toCodePoint(c1, c2);
                int k2 = i + 1;
                abyte0[i] = (byte)(k1 >>> 18 | 0xf0);
                i = k2 + 1;
                abyte0[k2] = (byte)(k1 >>> 12 & 0x3f | 0x80);
                k2 = i + 1;
                abyte0[i] = (byte)(k1 >>> 6 & 0x3f | 0x80);
                i = k2 + 1;
                abyte0[k2] = (byte)(k1 & 0x3f | 0x80);
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        if ('\uD800' <= c1 && c1 <= '\uDFFF' && (j + 1 == charsequence.length() || !Character.isSurrogatePair(c1, charsequence.charAt(j + 1))))
        {
            throw new IllegalArgumentException((new StringBuilder("Unpaired surrogate at index ")).append(j).toString());
        } else
        {
            throw new ArrayIndexOutOfBoundsException((new StringBuilder("Failed writing ")).append(c1).append(" at index ").append(i).toString());
        }
        return i;
    }

    public static int a(String s)
    {
        int i = a(((CharSequence) (s)));
        return i + c(i);
    }

    public static zzrx a(byte abyte0[], int i)
    {
        return new zzrx(abyte0, i);
    }

    private static void a(CharSequence charsequence, ByteBuffer bytebuffer)
    {
        if (bytebuffer.isReadOnly())
        {
            throw new ReadOnlyBufferException();
        }
        if (bytebuffer.hasArray())
        {
            try
            {
                bytebuffer.position(a(charsequence, bytebuffer.array(), bytebuffer.arrayOffset() + bytebuffer.position(), bytebuffer.remaining()) - bytebuffer.arrayOffset());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                bytebuffer = new BufferOverflowException();
            }
            bytebuffer.initCause(charsequence);
            throw bytebuffer;
        } else
        {
            b(charsequence, bytebuffer);
            return;
        }
    }

    public static int b(int i, int j)
    {
        int k = a(i);
        if (j >= 0)
        {
            i = c(j);
        } else
        {
            i = 10;
        }
        return i + k;
    }

    public static int b(int i, long l)
    {
        return a(i) + a(l);
    }

    public static int b(int i, fd fd1)
    {
        i = a(i);
        int j = fd1.e();
        return i + (j + c(j));
    }

    public static int b(int i, String s)
    {
        return a(i) + a(s);
    }

    private void b(long l)
        throws IOException
    {
        do
        {
            if ((-128L & l) == 0L)
            {
                e((int)l);
                return;
            }
            e((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    private static void b(CharSequence charsequence, ByteBuffer bytebuffer)
    {
        int i;
        int l;
        l = charsequence.length();
        i = 0;
_L2:
        char c1;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_295;
        }
        c1 = charsequence.charAt(i);
        if (c1 >= '\200')
        {
            break; /* Loop/switch isn't completed */
        }
        bytebuffer.put((byte)c1);
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (c1 < '\u0800')
        {
            bytebuffer.put((byte)(c1 >>> 6 | 0x3c0));
            bytebuffer.put((byte)(c1 & 0x3f | 0x80));
        } else
        if (c1 < '\uD800' || '\uDFFF' < c1)
        {
            bytebuffer.put((byte)(c1 >>> 12 | 0x1e0));
            bytebuffer.put((byte)(c1 >>> 6 & 0x3f | 0x80));
            bytebuffer.put((byte)(c1 & 0x3f | 0x80));
        } else
        {
            char c2;
label0:
            {
                int j = i;
                if (i + 1 != charsequence.length())
                {
                    i++;
                    c2 = charsequence.charAt(i);
                    if (Character.isSurrogatePair(c1, c2))
                    {
                        break label0;
                    }
                    j = i;
                }
                throw new IllegalArgumentException((new StringBuilder("Unpaired surrogate at index ")).append(j - 1).toString());
            }
            int k = Character.toCodePoint(c1, c2);
            bytebuffer.put((byte)(k >>> 18 | 0xf0));
            bytebuffer.put((byte)(k >>> 12 & 0x3f | 0x80));
            bytebuffer.put((byte)(k >>> 6 & 0x3f | 0x80));
            bytebuffer.put((byte)(k & 0x3f | 0x80));
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public static int c(int i)
    {
        if ((i & 0xffffff80) == 0)
        {
            return 1;
        }
        if ((i & 0xffffc000) == 0)
        {
            return 2;
        }
        if ((0xffe00000 & i) == 0)
        {
            return 3;
        }
        return (0xf0000000 & i) != 0 ? 5 : 4;
    }

    public static int d(int i)
    {
        return i << 1 ^ i >> 31;
    }

    private void e(int i)
        throws IOException
    {
        byte byte0 = (byte)i;
        if (!a.hasRemaining())
        {
            throw new zza(a.position(), a.limit());
        } else
        {
            a.put(byte0);
            return;
        }
    }

    public final void a()
    {
        if (a.remaining() != 0)
        {
            throw new IllegalStateException("Did not write as much data as expected.");
        } else
        {
            return;
        }
    }

    public final void a(int i, float f)
        throws IOException
    {
        c(i, 5);
        i = Float.floatToIntBits(f);
        if (a.remaining() < 4)
        {
            throw new zza(a.position(), a.limit());
        } else
        {
            a.putInt(i);
            return;
        }
    }

    public final void a(int i, int j)
        throws IOException
    {
        c(i, 0);
        if (j >= 0)
        {
            b(j);
            return;
        } else
        {
            b(j);
            return;
        }
    }

    public final void a(int i, long l)
        throws IOException
    {
        c(i, 0);
        b(l);
    }

    public final void a(int i, fd fd1)
        throws IOException
    {
        c(i, 2);
        a(fd1);
    }

    public final void a(int i, String s)
        throws IOException
    {
        c(i, 2);
        zza zza1;
        int j;
        i = c(s.length());
        if (i != c(s.length() * 3))
        {
            break MISSING_BLOCK_LABEL_158;
        }
        j = a.position();
        if (a.remaining() < i)
        {
            throw new zza(i + j, a.limit());
        }
        try
        {
            a.position(j + i);
            a(((CharSequence) (s)), a);
            int k = a.position();
            a.position(j);
            b(k - j - i);
            a.position(k);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zza1 = new zza(a.position(), a.limit());
            zza1.initCause(s);
            throw zza1;
        }
        b(a(((CharSequence) (s))));
        a(((CharSequence) (s)), a);
        return;
    }

    public final void a(int i, boolean flag)
        throws IOException
    {
        boolean flag1 = false;
        c(i, 0);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        e(i);
    }

    public final void a(fd fd1)
        throws IOException
    {
        b(fd1.d());
        fd1.a(this);
    }

    public final void a(byte abyte0[])
        throws IOException
    {
        int i = abyte0.length;
        if (a.remaining() >= i)
        {
            a.put(abyte0, 0, i);
            return;
        } else
        {
            throw new zza(a.position(), a.limit());
        }
    }

    public final void b(int i)
        throws IOException
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                e(i);
                return;
            }
            e(i & 0x7f | 0x80);
            i >>>= 7;
        } while (true);
    }

    public final void c(int i, int j)
        throws IOException
    {
        b(fg.a(i, j));
    }
}
