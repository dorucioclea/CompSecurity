// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;

import com.google.android.apps.wallet.rpc.RpcCaller;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.navdrawer:
//            NavDrawerPublisher, NavigationStorageManager

final class this._cls0
    implements Callable
{

    final NavDrawerPublisher this$0;

    private com.google.wallet.proto.api.FetchNavigationResponse call()
        throws Exception
    {
        Object obj = new com.google.wallet.proto.api.FetchNavigationRequest();
        obj.theme = Integer.valueOf(1);
        obj = (com.google.wallet.proto.api.FetchNavigationResponse)NavDrawerPublisher.access$500(NavDrawerPublisher.this).call("b/navigation/fetch", ((com.google.protobuf.nano.MessageNano) (obj)), new com.google.wallet.proto.api.FetchNavigationResponse());
        if (((com.google.wallet.proto.api.FetchNavigationResponse) (obj)).topNavigation == null)
        {
            throw new IllegalArgumentException("RPC to xBar to retrieve NavDrawer succeeded, but NavDrawer data was invalid");
        } else
        {
            NavDrawerPublisher.access$200(NavDrawerPublisher.this).put(((com.google.protobuf.nano.MessageNano) (obj)));
            return ((com.google.wallet.proto.api.FetchNavigationResponse) (obj));
        }
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    onResponse()
    {
        this$0 = NavDrawerPublisher.this;
        super();
    }
}
