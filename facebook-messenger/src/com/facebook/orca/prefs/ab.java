// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.preference.Preference;
import com.facebook.common.executors.d;
import com.facebook.o;

// Referenced classes of package com.facebook.orca.prefs:
//            OrcaInternalPreferenceActivity, ac

class ab
    implements android.preference.Preference.OnPreferenceClickListener
{

    final OrcaInternalPreferenceActivity a;

    ab(OrcaInternalPreferenceActivity orcainternalpreferenceactivity)
    {
        a = orcainternalpreferenceactivity;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        OrcaInternalPreferenceActivity.b(a).a(o.clearing_stickers_cache_title, o.clearing_stickers_cache_message, new ac(this));
        return true;
    }
}
