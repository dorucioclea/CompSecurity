// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.EntityBuffer;

// Referenced classes of package com.google.android.gms.games.quest:
//            QuestRef

public final class QuestBuffer extends EntityBuffer
{

    public QuestBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    protected final volatile Object getEntry(int i, int j)
    {
        return new QuestRef(mDataHolder, i, j);
    }

    protected final String getPrimaryDataMarkerColumn()
    {
        return "external_quest_id";
    }
}
