// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import com.kik.g.r;

// Referenced classes of package kik.android.chat.fragment:
//            KikGroupMembersListFragment

final class lm extends r
{

    final KikGroupMembersListFragment a;

    lm(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        a = kikgroupmemberslistfragment;
        super();
    }

    public final volatile void a(Object obj)
    {
        obj = (Bundle)obj;
        KikGroupMembersListFragment.a(a, ((Bundle) (obj)));
    }
}
