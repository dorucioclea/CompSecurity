// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.android.app.chat.picker.OnTranslatorEnabled;
import com.skype.android.inject.EventThread;
import com.skype.android.inject.LifecycleState;
import com.skype.android.inject.Proxy;
import com.skype.android.inject.ProxyEventListener;

// Referenced classes of package com.skype.android.app.chat:
//            ChatActivity

final class > extends ProxyEventListener
{

    final bled this$0;

    public final void onEvent(OnTranslatorEnabled ontranslatorenabled)
    {
        ((ChatActivity)tTarget()).onEvent(ontranslatorenabled);
    }

    public final volatile void onEvent(Object obj)
    {
        onEvent((OnTranslatorEnabled)obj);
    }

    bled(Proxy proxy, Class class1, LifecycleState lifecyclestate, EventThread eventthread)
    {
        this$0 = this._cls0.this;
        super(proxy, class1, lifecyclestate, eventthread);
    }
}
