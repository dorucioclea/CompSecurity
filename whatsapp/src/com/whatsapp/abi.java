// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;

final class abi
    implements android.media.AudioManager.OnAudioFocusChangeListener
{

    private static final String z;

    abi()
    {
    }

    public void onAudioFocusChange(int i)
    {
        Log.i((new StringBuilder()).append(z).append(i).toString());
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "C-\177D4T7r]{\025$yWaFbu\\u[%sP.\025".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 20;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 53;
          goto _L8
_L3:
        byte0 = 66;
          goto _L8
_L4:
        byte0 = 22;
          goto _L8
        byte0 = 52;
          goto _L8
    }
}
