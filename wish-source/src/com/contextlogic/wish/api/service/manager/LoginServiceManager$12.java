// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;


// Referenced classes of package com.contextlogic.wish.api.service.manager:
//            LoginServiceManager

class val.allowStoredSession
    implements Runnable
{

    final LoginServiceManager this$0;
    final boolean val$allowStoredSession;
    final String val$googlePlusId;

    public void run()
    {
        (new ncGooglePlusLoginOperation(LoginServiceManager.this, val$googlePlusId, val$allowStoredSession)).execute(new Void[0]);
    }

    ncGooglePlusLoginOperation()
    {
        this$0 = final_loginservicemanager;
        val$googlePlusId = s;
        val$allowStoredSession = Z.this;
        super();
    }
}
