// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.e;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class a
{

    byte a[];
    private long b;
    private long c;
    private long d;

    public a()
    {
        a = new byte[1024];
    }

    private long a(byte abyte0[], int i)
    {
        for (; i < abyte0.length && abyte0[i] != 10; i++)
        {
            if (abyte0[i] >= 48 && abyte0[i] <= 57)
            {
                int j;
                for (j = i + 1; j < abyte0.length && abyte0[j] >= 48 && abyte0[j] <= 57; j++) { }
                return (long)Integer.parseInt(new String(abyte0, 0, i, j - i)) * 1024L;
            }
        }

        return 0L;
    }

    private boolean a(byte abyte0[], int i, String s)
    {
        int k = s.length();
        if (i + k < abyte0.length) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = 0;
label0:
        do
        {
label1:
            {
                if (j >= k)
                {
                    break label1;
                }
                if (abyte0[i + j] != s.charAt(j))
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public void a()
    {
        int k = 0;
        int i;
        int j;
        int l;
        int i1;
        int j1;
        try
        {
            b = 0L;
            c = 0L;
            d = 0L;
            FileInputStream fileinputstream = new FileInputStream("/proc/meminfo");
            i1 = fileinputstream.read(a);
            fileinputstream.close();
            j1 = a.length;
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            return;
        }
        catch (IOException ioexception)
        {
            break; /* Loop/switch isn't completed */
        }
        l = 0;
        if (k >= i1 || l >= 3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!a(a, k, "MemTotal")) goto _L2; else goto _L1
_L1:
        i = k + 8;
        b = a(a, i);
        j = l + 1;
_L4:
        if (i >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (a[i] == 10)
        {
            break; /* Loop/switch isn't completed */
        }
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (!a(a, k, "MemFree"))
        {
            break MISSING_BLOCK_LABEL_170;
        }
        i = k + 7;
        c = a(a, i);
        j = l + 1;
        continue; /* Loop/switch isn't completed */
        i = k;
        j = l;
        if (!a(a, k, "Cached"))
        {
            continue; /* Loop/switch isn't completed */
        }
        i = k + 6;
        d = a(a, i);
        j = l + 1;
        if (true) goto _L4; else goto _L3
_L3:
        k = i + 1;
        l = j;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L6; else goto _L5
_L6:
        break MISSING_BLOCK_LABEL_52;
_L5:
    }

    public long b()
    {
        return b;
    }
}
