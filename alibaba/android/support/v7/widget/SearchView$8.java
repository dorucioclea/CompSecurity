// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.KeyEvent;
import android.view.View;
import cs;

// Referenced classes of package android.support.v7.widget:
//            SearchView

class this._cls0
    implements android.view.tener
{

    final SearchView this$0;

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (SearchView.access$1500(SearchView.this) != null)
        {
            if (SearchView.access$1300(SearchView.this).isPopupShowing() && SearchView.access$1300(SearchView.this).getListSelection() != -1)
            {
                return SearchView.access$1600(SearchView.this, view, i, keyevent);
            }
            if (!archAutoComplete.access._mth1700(SearchView.access$1300(SearchView.this)) && cs.a(keyevent) && keyevent.getAction() == 1 && i == 66)
            {
                view.cancelLongPress();
                SearchView.access$1800(SearchView.this, 0, null, SearchView.access$1300(SearchView.this).getText().toString());
                return true;
            }
        }
        return false;
    }

    archAutoComplete()
    {
        this$0 = SearchView.this;
        super();
    }
}
