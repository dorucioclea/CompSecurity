// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;


// Referenced classes of package com.fasterxml.jackson.core:
//            JsonProcessingException, JsonLocation

public class JsonParseException extends JsonProcessingException
{

    static final long serialVersionUID = 123L;

    public JsonParseException(String s, JsonLocation jsonlocation)
    {
        super(s, jsonlocation);
    }

    public JsonParseException(String s, JsonLocation jsonlocation, Throwable throwable)
    {
        super(s, jsonlocation, throwable);
    }
}
