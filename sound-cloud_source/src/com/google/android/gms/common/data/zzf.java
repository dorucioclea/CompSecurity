// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.data:
//            AbstractDataBuffer, DataHolder

public abstract class zzf extends AbstractDataBuffer
{

    private boolean zzaby;
    private ArrayList zzabz;

    protected zzf(DataHolder dataholder)
    {
        super(dataholder);
        zzaby = false;
    }

    private void zznX()
    {
        this;
        JVM INSTR monitorenter ;
        if (zzaby) goto _L2; else goto _L1
_L1:
        int k;
        k = zzYX.getCount();
        zzabz = new ArrayList();
        if (k <= 0) goto _L4; else goto _L3
_L3:
        Object obj;
        String s1;
        zzabz.add(Integer.valueOf(0));
        s1 = zznW();
        int i = zzYX.zzbo(0);
        obj = zzYX.zzd(s1, 0, i);
        int j = 1;
_L9:
        if (j >= k) goto _L4; else goto _L5
_L5:
        String s;
        int l;
        l = zzYX.zzbo(j);
        s = zzYX.zzd(s1, j, l);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        throw new NullPointerException((new StringBuilder("Missing value for markerColumn: ")).append(s1).append(", at row: ").append(j).append(", for window: ").append(l).toString());
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        if (s.equals(obj)) goto _L7; else goto _L6
_L6:
        zzabz.add(Integer.valueOf(j));
        obj = s;
          goto _L7
_L4:
        zzaby = true;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L7:
        j++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final Object get(int i)
    {
        zznX();
        return zzk(zzbr(i), zzbs(i));
    }

    public int getCount()
    {
        zznX();
        return zzabz.size();
    }

    int zzbr(int i)
    {
        if (i < 0 || i >= zzabz.size())
        {
            throw new IllegalArgumentException((new StringBuilder("Position ")).append(i).append(" is out of bounds for this buffer").toString());
        } else
        {
            return ((Integer)zzabz.get(i)).intValue();
        }
    }

    protected int zzbs(int i)
    {
        int k;
        if (i < 0 || i == zzabz.size())
        {
            k = 0;
        } else
        {
            int j;
            if (i == zzabz.size() - 1)
            {
                j = zzYX.getCount() - ((Integer)zzabz.get(i)).intValue();
            } else
            {
                j = ((Integer)zzabz.get(i + 1)).intValue() - ((Integer)zzabz.get(i)).intValue();
            }
            k = j;
            if (j == 1)
            {
                i = zzbr(i);
                int l = zzYX.zzbo(i);
                String s = zznY();
                k = j;
                if (s != null)
                {
                    k = j;
                    if (zzYX.zzd(s, i, l) == null)
                    {
                        return 0;
                    }
                }
            }
        }
        return k;
    }

    protected abstract Object zzk(int i, int j);

    protected abstract String zznW();

    protected String zznY()
    {
        return null;
    }
}
