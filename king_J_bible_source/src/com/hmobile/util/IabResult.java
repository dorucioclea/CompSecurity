// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.util;


// Referenced classes of package com.hmobile.util:
//            IabHelper

public class IabResult
{

    String mMessage;
    int mResponse;

    public IabResult(int i, String s)
    {
        mResponse = i;
        if (s == null || s.trim().length() == 0)
        {
            mMessage = IabHelper.getResponseDesc(i);
            return;
        } else
        {
            mMessage = (new StringBuilder(String.valueOf(s))).append(" (response: ").append(IabHelper.getResponseDesc(i)).append(")").toString();
            return;
        }
    }

    public String getMessage()
    {
        return mMessage;
    }

    public int getResponse()
    {
        return mResponse;
    }

    public boolean isFailure()
    {
        return !isSuccess();
    }

    public boolean isSuccess()
    {
        return mResponse == 0;
    }

    public String toString()
    {
        return (new StringBuilder("IabResult: ")).append(getMessage()).toString();
    }
}
