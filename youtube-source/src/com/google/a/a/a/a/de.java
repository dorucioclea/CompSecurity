// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.c;
import com.google.protobuf.nano.f;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.a.a.a.a:
//            sx, fk, kz, iz, 
//            in

public final class de extends b
{

    public static final de a[] = new de[0];
    public String b;
    public sx c;
    public fk d;
    public fk e;
    public fk f;
    public kz g;
    public String h;
    public fk i;
    public fk j;
    public iz k;
    public byte l[];
    public sx m[];
    public in n;

    public de()
    {
        b = "";
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = "";
        i = null;
        j = null;
        k = null;
        l = f.l;
        m = com.google.a.a.a.a.sx.a;
        n = null;
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        int j1;
        int k1;
        if (!b.equals(""))
        {
            j1 = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            j1 = 0;
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(2, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(3, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(4, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(5, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(6, g);
        }
        j1 = i1;
        if (!h.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(7, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(8, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(9, j);
        }
        k1 = j1;
        if (k != null)
        {
            k1 = j1 + CodedOutputByteBufferNano.b(11, k);
        }
        i1 = k1;
        if (!Arrays.equals(l, f.l))
        {
            i1 = k1 + CodedOutputByteBufferNano.b(12, l);
        }
        j1 = i1;
        if (m != null)
        {
            sx asx[] = m;
            int i2 = asx.length;
            int l1 = ((flag) ? 1 : 0);
            do
            {
                j1 = i1;
                if (l1 >= i2)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(13, asx[l1]);
                l1++;
            } while (true);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(0x39d6d44, n);
        }
        i1 += com.google.protobuf.nano.f.a(dl);
        dm = i1;
        return i1;
    }

    public final c a(a a1)
    {
        do
        {
            int i1 = a1.a();
            switch (i1)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                b = a1.f();
                break;

            case 18: // '\022'
                c = new sx();
                a1.a(c);
                break;

            case 26: // '\032'
                d = new fk();
                a1.a(d);
                break;

            case 34: // '"'
                e = new fk();
                a1.a(e);
                break;

            case 42: // '*'
                f = new fk();
                a1.a(f);
                break;

            case 50: // '2'
                g = new kz();
                a1.a(g);
                break;

            case 58: // ':'
                h = a1.f();
                break;

            case 66: // 'B'
                i = new fk();
                a1.a(i);
                break;

            case 74: // 'J'
                j = new fk();
                a1.a(j);
                break;

            case 90: // 'Z'
                k = new iz();
                a1.a(k);
                break;

            case 98: // 'b'
                l = a1.g();
                break;

            case 106: // 'j'
                int k1 = com.google.protobuf.nano.f.a(a1, 106);
                sx asx[];
                int j1;
                if (m == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = m.length;
                }
                asx = new sx[k1 + j1];
                if (m != null)
                {
                    System.arraycopy(m, 0, asx, 0, j1);
                }
                for (m = asx; j1 < m.length - 1; j1++)
                {
                    m[j1] = new sx();
                    a1.a(m[j1]);
                    a1.a();
                }

                m[j1] = new sx();
                a1.a(m[j1]);
                break;

            case 485190178: 
                n = new in();
                a1.a(n);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (!b.equals(""))
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (!h.equals(""))
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if (j != null)
        {
            codedoutputbytebuffernano.a(9, j);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(11, k);
        }
        if (!Arrays.equals(l, f.l))
        {
            codedoutputbytebuffernano.a(12, l);
        }
        if (m != null)
        {
            sx asx[] = m;
            int j1 = asx.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                codedoutputbytebuffernano.a(13, asx[i1]);
            }

        }
        if (n != null)
        {
            codedoutputbytebuffernano.a(0x39d6d44, n);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
