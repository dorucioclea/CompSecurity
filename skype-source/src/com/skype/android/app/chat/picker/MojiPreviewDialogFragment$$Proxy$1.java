// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import com.skype.android.inject.EventThread;
import com.skype.android.inject.LifecycleState;
import com.skype.android.inject.Proxy;
import com.skype.android.inject.ProxyEventListener;
import com.skype.android.mediacontent.OnVideoReady;

// Referenced classes of package com.skype.android.app.chat.picker:
//            MojiPreviewDialogFragment

final class this._cls0 extends ProxyEventListener
{

    final onEvent this$0;

    public final void onEvent(OnVideoReady onvideoready)
    {
        ((MojiPreviewDialogFragment)tTarget()).onEvent(onvideoready);
    }

    public final volatile void onEvent(Object obj)
    {
        onEvent((OnVideoReady)obj);
    }

    (Proxy proxy, Class class1, LifecycleState lifecyclestate, EventThread eventthread)
    {
        this$0 = this._cls0.this;
        super(proxy, class1, lifecyclestate, eventthread);
    }
}
