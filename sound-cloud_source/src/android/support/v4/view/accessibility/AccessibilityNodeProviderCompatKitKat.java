// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import java.util.List;

class AccessibilityNodeProviderCompatKitKat
{
    static interface AccessibilityNodeInfoBridge
    {

        public abstract Object createAccessibilityNodeInfo(int i);

        public abstract List findAccessibilityNodeInfosByText(String s, int i);

        public abstract Object findFocus(int i);

        public abstract boolean performAction(int i, int j, Bundle bundle);
    }


    AccessibilityNodeProviderCompatKitKat()
    {
    }

    public static Object newAccessibilityNodeProviderBridge(final AccessibilityNodeInfoBridge bridge)
    {
        return new _cls1();
    }

    private class _cls1 extends AccessibilityNodeProvider
    {

        final AccessibilityNodeInfoBridge val$bridge;

        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i)
        {
            return (AccessibilityNodeInfo)bridge.createAccessibilityNodeInfo(i);
        }

        public final List findAccessibilityNodeInfosByText(String s, int i)
        {
            return bridge.findAccessibilityNodeInfosByText(s, i);
        }

        public final AccessibilityNodeInfo findFocus(int i)
        {
            return (AccessibilityNodeInfo)bridge.findFocus(i);
        }

        public final boolean performAction(int i, int j, Bundle bundle)
        {
            return bridge.performAction(i, j, bundle);
        }

        _cls1()
        {
            bridge = accessibilitynodeinfobridge;
            super();
        }
    }

}
