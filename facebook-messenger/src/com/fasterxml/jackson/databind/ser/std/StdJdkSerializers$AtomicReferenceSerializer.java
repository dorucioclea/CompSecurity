// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdSerializer

public final class  extends StdSerializer
{

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
    {
        return createSchemaNode("any", true);
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serialize((AtomicReference)obj, jsongenerator, serializerprovider);
    }

    public void serialize(AtomicReference atomicreference, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serializerprovider.defaultSerializeValue(atomicreference.get(), jsongenerator);
    }

    public ()
    {
        super(java/util/concurrent/atomic/AtomicReference, false);
    }
}
