// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, BrowseAgent, BrowseAgentCallback

class this._cls1 extends SimpleBrowseAgentCallback
{

    final _cls1.val.statusCode this$1;

    public void onVideosFetched(final List requestedVideos, final int statusCode)
    {
        dateCacheIfNecessary(requestedVideos, statusCode);
        BrowseAgent.access$500(_fld0).post(new Runnable() {

            final BrowseAgent.FetchGenreVideosTask._cls1 this$2;
            final List val$requestedVideos;
            final int val$statusCode;

            public void run()
            {
                getCallback().onVideosFetched(requestedVideos, statusCode);
            }

            
            {
                this$2 = BrowseAgent.FetchGenreVideosTask._cls1.this;
                requestedVideos = list;
                statusCode = i;
                super();
            }
        });
    }

    _cls1.val.statusCode()
    {
        this$1 = this._cls1.this;
        super();
    }
}
