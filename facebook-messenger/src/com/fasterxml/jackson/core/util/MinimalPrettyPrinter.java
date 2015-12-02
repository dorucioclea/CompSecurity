// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;

public class MinimalPrettyPrinter
    implements PrettyPrinter
{

    public static final String DEFAULT_ROOT_VALUE_SEPARATOR = " ";
    protected String _rootValueSeparator;

    public MinimalPrettyPrinter()
    {
        this(" ");
    }

    public MinimalPrettyPrinter(String s)
    {
        _rootValueSeparator = " ";
        _rootValueSeparator = s;
    }

    public void beforeArrayValues(JsonGenerator jsongenerator)
    {
    }

    public void beforeObjectEntries(JsonGenerator jsongenerator)
    {
    }

    public void setRootValueSeparator(String s)
    {
        _rootValueSeparator = s;
    }

    public void writeArrayValueSeparator(JsonGenerator jsongenerator)
    {
        jsongenerator.writeRaw(',');
    }

    public void writeEndArray(JsonGenerator jsongenerator, int i)
    {
        jsongenerator.writeRaw(']');
    }

    public void writeEndObject(JsonGenerator jsongenerator, int i)
    {
        jsongenerator.writeRaw('}');
    }

    public void writeObjectEntrySeparator(JsonGenerator jsongenerator)
    {
        jsongenerator.writeRaw(',');
    }

    public void writeObjectFieldValueSeparator(JsonGenerator jsongenerator)
    {
        jsongenerator.writeRaw(':');
    }

    public void writeRootValueSeparator(JsonGenerator jsongenerator)
    {
        if (_rootValueSeparator != null)
        {
            jsongenerator.writeRaw(_rootValueSeparator);
        }
    }

    public void writeStartArray(JsonGenerator jsongenerator)
    {
        jsongenerator.writeRaw('[');
    }

    public void writeStartObject(JsonGenerator jsongenerator)
    {
        jsongenerator.writeRaw('{');
    }
}
