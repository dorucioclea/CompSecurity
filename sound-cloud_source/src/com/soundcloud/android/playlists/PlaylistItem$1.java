// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistItem

final class 
    implements f
{

    public final PlaylistItem call(PropertySet propertyset)
    {
        return PlaylistItem.from(propertyset);
    }

    public final volatile Object call(Object obj)
    {
        return call((PropertySet)obj);
    }

    ()
    {
    }
}
