// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.KeyEvent;

// Referenced classes of package android.support.v4.view:
//            KeyEventCompatEclair, KeyEventCompatHoneycomb

public final class KeyEventCompat
{
    static class EclairKeyEventVersionImpl extends KeyEventVersionImpl
    {

        public final void startTracking(KeyEvent keyevent)
        {
            KeyEventCompatEclair.startTracking(keyevent);
        }

        EclairKeyEventVersionImpl()
        {
        }
    }

    static final class HoneycombKeyEventVersionImpl extends EclairKeyEventVersionImpl
    {

        public final boolean metaStateHasModifiers(int i, int j)
        {
            return KeyEventCompatHoneycomb.metaStateHasModifiers(i, j);
        }

        public final boolean metaStateHasNoModifiers(int i)
        {
            return KeyEventCompatHoneycomb.metaStateHasNoModifiers(i);
        }

        public final int normalizeMetaState(int i)
        {
            return KeyEventCompatHoneycomb.normalizeMetaState(i);
        }

        HoneycombKeyEventVersionImpl()
        {
        }
    }

    static class KeyEventVersionImpl
    {

        private static int metaStateFilterDirectionalModifiers(int i, int j, int k, int l, int i1)
        {
            boolean flag1 = true;
            boolean flag;
            if ((j & k) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l |= i1;
            if ((j & l) != 0)
            {
                j = ((flag1) ? 1 : 0);
            } else
            {
                j = 0;
            }
            if (flag)
            {
                if (j != 0)
                {
                    throw new IllegalArgumentException("bad arguments");
                }
                l = i & ~l;
            } else
            {
                l = i;
                if (j != 0)
                {
                    return i & ~k;
                }
            }
            return l;
        }

        public boolean metaStateHasModifiers(int i, int j)
        {
            return metaStateFilterDirectionalModifiers(metaStateFilterDirectionalModifiers(normalizeMetaState(i) & 0xf7, j, 1, 64, 128), j, 2, 16, 32) == j;
        }

        public boolean metaStateHasNoModifiers(int i)
        {
            return (normalizeMetaState(i) & 0xf7) == 0;
        }

        public int normalizeMetaState(int i)
        {
            int j = i;
            if ((i & 0xc0) != 0)
            {
                j = i | 1;
            }
            i = j;
            if ((j & 0x30) != 0)
            {
                i = j | 2;
            }
            return i & 0xf7;
        }

        public void startTracking(KeyEvent keyevent)
        {
        }

        KeyEventVersionImpl()
        {
        }
    }


    static final KeyEventVersionImpl IMPL;

    public static boolean hasModifiers(KeyEvent keyevent, int i)
    {
        return IMPL.metaStateHasModifiers(keyevent.getMetaState(), i);
    }

    public static boolean hasNoModifiers(KeyEvent keyevent)
    {
        return IMPL.metaStateHasNoModifiers(keyevent.getMetaState());
    }

    public static void startTracking(KeyEvent keyevent)
    {
        IMPL.startTracking(keyevent);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            IMPL = new HoneycombKeyEventVersionImpl();
        } else
        {
            IMPL = new KeyEventVersionImpl();
        }
    }
}
