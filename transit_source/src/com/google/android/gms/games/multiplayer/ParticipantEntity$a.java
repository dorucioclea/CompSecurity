// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.PlayerEntity;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            c, ParticipantEntity

static final class  extends c
{

    public Object createFromParcel(Parcel parcel)
    {
        return w(parcel);
    }

    public ParticipantEntity w(Parcel parcel)
    {
        boolean flag = false;
        if (ParticipantEntity.b(ParticipantEntity.bQ()) || ParticipantEntity.J(com/google/android/gms/games/multiplayer/ParticipantEntity.getCanonicalName()))
        {
            return super.w(parcel);
        }
        String s = parcel.readString();
        String s1 = parcel.readString();
        Object obj = parcel.readString();
        Object obj1;
        String s2;
        int i;
        boolean flag1;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = Uri.parse(((String) (obj)));
        }
        obj1 = parcel.readString();
        if (obj1 == null)
        {
            obj1 = null;
        } else
        {
            obj1 = Uri.parse(((String) (obj1)));
        }
        i = parcel.readInt();
        s2 = parcel.readString();
        if (parcel.readInt() > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (parcel.readInt() > 0)
        {
            flag = true;
        }
        if (flag)
        {
            parcel = (PlayerEntity)PlayerEntity.CREATOR.reateFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        return new ParticipantEntity(1, s, s1, ((Uri) (obj)), ((Uri) (obj1)), i, s2, flag1, parcel, 7);
    }

    ()
    {
    }
}
