// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;

public class byq
{

    private static final String a = byq.getSimpleName();
    private static final Object g = new Object();
    private static byq h;
    private final Context b;
    private final HashMap c = new HashMap();
    private final HashMap d = new HashMap();
    private final ArrayList e = new ArrayList();
    private final Handler f;

    private byq(Context context)
    {
        b = context;
        f = new byr(this, context.getMainLooper());
    }

    public static byq a(Context context)
    {
        synchronized (g)
        {
            if (h == null)
            {
                h = new byq(context.getApplicationContext());
            }
            context = h;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void a(byq byq1)
    {
_L4:
        Object obj = byq1.c;
        obj;
        JVM INSTR monitorenter ;
        int i = byq1.e.size();
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        bys abys[];
        abys = new bys[i];
        byq1.e.toArray(abys);
        byq1.e.clear();
        obj;
        JVM INSTR monitorexit ;
        i = 0;
_L2:
        if (i < abys.length)
        {
            obj = abys[i];
            for (int j = 0; j < ((bys) (obj)).b.size(); j++)
            {
                ((byt)((bys) (obj)).b.get(j)).b.onReceive(byq1.b, ((bys) (obj)).a);
            }

            break MISSING_BLOCK_LABEL_112;
        }
        continue; /* Loop/switch isn't completed */
        byq1;
        obj;
        JVM INSTR monitorexit ;
        throw byq1;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(BroadcastReceiver broadcastreceiver)
    {
        HashMap hashmap = c;
        hashmap;
        JVM INSTR monitorenter ;
        ArrayList arraylist = (ArrayList)c.remove(broadcastreceiver);
        if (arraylist != null) goto _L2; else goto _L1
_L1:
        hashmap;
        JVM INSTR monitorexit ;
        return;
_L15:
        int j;
        if (j >= arraylist.size()) goto _L4; else goto _L3
_L3:
        IntentFilter intentfilter = (IntentFilter)arraylist.get(j);
        int k = 0;
_L13:
        String s;
        ArrayList arraylist1;
        if (k >= intentfilter.countActions())
        {
            break; /* Loop/switch isn't completed */
        }
        s = intentfilter.getAction(k);
        arraylist1 = (ArrayList)d.get(s);
        if (arraylist1 == null) goto _L6; else goto _L5
_L5:
        int i = 0;
_L11:
        if (i >= arraylist1.size()) goto _L8; else goto _L7
_L7:
        if (((byt)arraylist1.get(i)).b != broadcastreceiver) goto _L10; else goto _L9
_L9:
        arraylist1.remove(i);
        i--;
          goto _L10
_L8:
        if (arraylist1.size() <= 0)
        {
            d.remove(s);
        }
        break; /* Loop/switch isn't completed */
_L4:
        hashmap;
        JVM INSTR monitorexit ;
        return;
        broadcastreceiver;
        hashmap;
        JVM INSTR monitorexit ;
        throw broadcastreceiver;
_L2:
        j = 0;
        continue; /* Loop/switch isn't completed */
_L10:
        i++;
        if (true) goto _L11; else goto _L6
_L6:
        k++;
        if (true) goto _L13; else goto _L12
_L12:
        j++;
        if (true) goto _L15; else goto _L14
_L14:
    }

    public final void a(BroadcastReceiver broadcastreceiver, IntentFilter intentfilter)
    {
        HashMap hashmap = c;
        hashmap;
        JVM INSTR monitorenter ;
        Object obj;
        byt byt1;
        byt1 = new byt(intentfilter, broadcastreceiver);
        obj = (ArrayList)c.get(broadcastreceiver);
        ArrayList arraylist;
        arraylist = ((ArrayList) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        arraylist = new ArrayList(1);
        c.put(broadcastreceiver, arraylist);
        arraylist.add(intentfilter);
        int i = 0;
_L2:
        if (i >= intentfilter.countActions())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = intentfilter.getAction(i);
        arraylist = (ArrayList)d.get(obj);
        broadcastreceiver = arraylist;
        if (arraylist != null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        broadcastreceiver = new ArrayList(1);
        d.put(obj, broadcastreceiver);
        broadcastreceiver.add(byt1);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        hashmap;
        JVM INSTR monitorexit ;
        return;
        broadcastreceiver;
        hashmap;
        JVM INSTR monitorexit ;
        throw broadcastreceiver;
    }

    public final boolean a(Intent intent)
    {
        HashMap hashmap = c;
        hashmap;
        JVM INSTR monitorenter ;
        String s;
        String s1;
        android.net.Uri uri;
        String s2;
        java.util.Set set;
        s = intent.getAction();
        s1 = intent.resolveTypeIfNeeded(b.getContentResolver());
        uri = intent.getData();
        s2 = intent.getScheme();
        set = intent.getCategories();
        ArrayList arraylist;
        ArrayList arraylist1;
        byt byt1;
        int i;
        int j;
        int k;
        if ((intent.getFlags() & 8) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        (new StringBuilder("Resolving type ")).append(s1).append(" scheme ").append(s2).append(" of intent ").append(intent);
        arraylist1 = (ArrayList)d.get(intent.getAction());
        if (arraylist1 == null) goto _L2; else goto _L1
_L1:
        if (i == 0) goto _L4; else goto _L3
_L3:
        (new StringBuilder("Action list: ")).append(arraylist1);
          goto _L4
_L15:
        if (j >= arraylist1.size()) goto _L6; else goto _L5
_L5:
        byt1 = (byt)arraylist1.get(j);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        (new StringBuilder("Matching against filter ")).append(byt1.a);
        if (!byt1.c) goto _L8; else goto _L7
_L7:
        if (i == 0);
          goto _L9
_L8:
        k = byt1.a.match(s, s1, s2, uri, set, "ClonedLocalBroadcastManager");
        if (k < 0) goto _L9; else goto _L10
_L10:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_251;
        }
        (new StringBuilder("  Filter matched!  match=0x")).append(Integer.toHexString(k));
        if (arraylist != null)
        {
            break MISSING_BLOCK_LABEL_263;
        }
        arraylist = new ArrayList();
        arraylist.add(byt1);
        byt1.c = true;
          goto _L9
        intent;
        hashmap;
        JVM INSTR monitorexit ;
        throw intent;
_L6:
        if (arraylist == null) goto _L2; else goto _L11
_L11:
        i = 0;
_L13:
        if (i >= arraylist.size())
        {
            break; /* Loop/switch isn't completed */
        }
        ((byt)arraylist.get(i)).c = false;
        i++;
        if (true) goto _L13; else goto _L12
_L12:
        e.add(new bys(intent, arraylist));
        if (!f.hasMessages(1))
        {
            f.sendEmptyMessage(1);
        }
        hashmap;
        JVM INSTR monitorexit ;
        return true;
_L2:
        hashmap;
        JVM INSTR monitorexit ;
        return false;
_L4:
        arraylist = null;
        j = 0;
        continue; /* Loop/switch isn't completed */
_L9:
        j++;
        if (true) goto _L15; else goto _L14
_L14:
    }

}
