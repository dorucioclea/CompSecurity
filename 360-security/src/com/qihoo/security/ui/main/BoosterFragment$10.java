// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.content.Intent;
import android.view.View;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.opti.sysclear.ProcessClearActivity;

// Referenced classes of package com.qihoo.security.ui.main:
//            BoosterFragment

class a
    implements android.view.r
{

    final BoosterFragment a;

    public void onClick(View view)
    {
        view = new Intent();
        long l;
        if (BoosterFragment.a(a) == -1L)
        {
            l = com.qihoo.security.ui.main.BoosterFragment.b(a);
        } else
        {
            l = BoosterFragment.a(a);
        }
        view.putExtra("free_memory_kb", l);
        view.putExtra("exam_status", BoosterFragment.c(a));
        view.setClass(a.getActivity(), com/qihoo/security/ui/opti/sysclear/ProcessClearActivity);
        a.startActivityForResult(view, 1000);
        b.c(11014);
    }

    arActivity(BoosterFragment boosterfragment)
    {
        a = boosterfragment;
        super();
    }
}
