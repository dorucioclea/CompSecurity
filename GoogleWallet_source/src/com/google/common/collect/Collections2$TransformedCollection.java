// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            Collections2, Iterators

static final class function extends AbstractCollection
{

    final Collection fromCollection;
    final Function function;

    public final void clear()
    {
        fromCollection.clear();
    }

    public final boolean isEmpty()
    {
        return fromCollection.isEmpty();
    }

    public final Iterator iterator()
    {
        return Iterators.transform(fromCollection.iterator(), function);
    }

    public final int size()
    {
        return fromCollection.size();
    }

    (Collection collection, Function function1)
    {
        fromCollection = (Collection)Preconditions.checkNotNull(collection);
        function = (Function)Preconditions.checkNotNull(function1);
    }
}
