// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.profile:
//            UpdatePassengerPhotoFromEditProfileView

class this._cls0
    implements Action1
{

    final UpdatePassengerPhotoFromEditProfileView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        appFlow.goBack();
    }

    ()
    {
        this$0 = UpdatePassengerPhotoFromEditProfileView.this;
        super();
    }
}
