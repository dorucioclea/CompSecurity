// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.f;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter

private class mPopup
    implements Runnable
{

    private this._cls0 mPopup;
    final ActionMenuPresenter this$0;

    public void run()
    {
        Object obj = ActionMenuPresenter.access$800(ActionMenuPresenter.this);
        if (((f) (obj)).b != null)
        {
            ((f) (obj)).b.(((f) (obj)));
        }
        obj = (View)ActionMenuPresenter.access$900(ActionMenuPresenter.this);
        if (obj != null && ((View) (obj)).getWindowToken() != null && mPopup.())
        {
            ActionMenuPresenter.access$202(ActionMenuPresenter.this, mPopup);
        }
        ActionMenuPresenter.access$302(ActionMenuPresenter.this, null);
    }

    public ( )
    {
        this$0 = ActionMenuPresenter.this;
        super();
        mPopup = ;
    }
}
