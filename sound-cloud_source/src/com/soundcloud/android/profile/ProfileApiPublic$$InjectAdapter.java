// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.api.ApiClientRx;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfileApiPublic

public final class  extends b
    implements Provider
{

    private b apiClientRx;

    public final void attach(l l1)
    {
        apiClientRx = l1.a("com.soundcloud.android.api.ApiClientRx", com/soundcloud/android/profile/ProfileApiPublic, getClass().getClassLoader());
    }

    public final ProfileApiPublic get()
    {
        return new ProfileApiPublic((ApiClientRx)apiClientRx.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(apiClientRx);
    }

    public ()
    {
        super("com.soundcloud.android.profile.ProfileApiPublic", "members/com.soundcloud.android.profile.ProfileApiPublic", false, com/soundcloud/android/profile/ProfileApiPublic);
    }
}
