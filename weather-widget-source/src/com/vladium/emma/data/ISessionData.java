// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.data;


// Referenced classes of package com.vladium.emma.data:
//            ICoverageData, IMetaData

public interface ISessionData
{

    public abstract ICoverageData getCoverageData();

    public abstract IMetaData getMetaData();
}
