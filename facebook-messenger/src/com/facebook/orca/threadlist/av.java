// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.media.MediaPlayer;

// Referenced classes of package com.facebook.orca.threadlist:
//            au

class av
    implements android.media.MediaPlayer.OnCompletionListener
{

    final au a;

    av(au au)
    {
        a = au;
        super();
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        mediaplayer.release();
    }
}
