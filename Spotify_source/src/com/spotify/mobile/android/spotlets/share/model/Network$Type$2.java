// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share.model;

import com.spotify.mobile.android.spotlets.share.oauth.model.OAuthInfo;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import fhi;
import fhl;
import fht;
import fys;

final class nit> extends nit>
{

    public final fhi a(Flags flags)
    {
        if (((String)flags.a(fys.Y)).equals("Enabled"))
        {
            return fht.a(this);
        } else
        {
            return fhl.a(this);
        }
    }

    public final OAuthInfo b()
    {
        return OAuthInfo.a;
    }

    (String s, String s1)
    {
        super(s, 1, s1, (byte)0);
    }
}
