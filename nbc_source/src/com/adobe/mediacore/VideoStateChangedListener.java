// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerState, MediaPlayerNotification

interface VideoStateChangedListener
    extends MediaPlayer.EventListener
{

    public abstract void onStateChanged(MediaPlayerState mediaplayerstate, MediaPlayerNotification mediaplayernotification);
}
