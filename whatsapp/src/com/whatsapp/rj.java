// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.whatsapp:
//            a1h, uj, p5

class rj
    implements a1h
{

    private static final String z[];
    final uj a;

    rj(uj uj1)
    {
        a = uj1;
        super();
    }

    public void a(int i)
    {
        p5.a(a.c, new Integer[] {
            Integer.valueOf(i)
        });
    }

    public void a(String s)
    {
        try
        {
            s = new JSONObject(s);
            a.c.f = new b();
            a.c.f.b = s.optString(z[1]);
            a.c.f.e = s.optString(z[4]);
            a.c.f.c = s.optLong(z[3]);
            a.c.f.f = s.optInt(z[0]);
            a.c.f.d = s.optString(z[2]);
            a.c.a = true;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e((new StringBuilder()).append(z[5]).append(s.toString()).toString());
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "O\"S\b\021B8O";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "F>L\f\021R'D";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "M>M\f\rJ$I";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "X>[\f";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "^%M";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "F2E\000\004^'M\006\004OxK\032\nE2Y\n\000[#H\006\013\013";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 246
    //                   2 253
    //                   3 260;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_260;
_L3:
        byte byte1 = 101;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 43;
          goto _L9
_L5:
        byte1 = 87;
          goto _L9
_L6:
        byte1 = 33;
          goto _L9
        byte1 = 105;
          goto _L9
    }
}
