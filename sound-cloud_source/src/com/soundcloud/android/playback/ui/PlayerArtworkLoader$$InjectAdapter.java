// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.content.res.Resources;
import com.soundcloud.android.image.ImageOperations;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerArtworkLoader

public final class  extends b
    implements Provider
{

    private b imageOperations;
    private b resources;

    public final void attach(l l1)
    {
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/playback/ui/PlayerArtworkLoader, getClass().getClassLoader());
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/playback/ui/PlayerArtworkLoader, getClass().getClassLoader());
    }

    public final PlayerArtworkLoader get()
    {
        return new PlayerArtworkLoader((ImageOperations)imageOperations.get(), (Resources)resources.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(imageOperations);
        set.add(resources);
    }

    public ()
    {
        super("com.soundcloud.android.playback.ui.PlayerArtworkLoader", "members/com.soundcloud.android.playback.ui.PlayerArtworkLoader", false, com/soundcloud/android/playback/ui/PlayerArtworkLoader);
    }
}
