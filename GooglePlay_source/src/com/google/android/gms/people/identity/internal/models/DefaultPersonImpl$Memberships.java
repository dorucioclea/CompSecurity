// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            DefaultPersonImpl, DefaultPersonImpl_MembershipsCreator, DefaultMetadataImpl

public static final class mSystemContactGroup extends FastJsonResponse
    implements SafeParcelable
{

    public static final DefaultPersonImpl_MembershipsCreator CREATOR = new DefaultPersonImpl_MembershipsCreator();
    private static final HashMap sFields;
    String mCircle;
    String mContactGroup;
    final Set mIndicatorSet;
    DefaultMetadataImpl mMetadata;
    String mSystemContactGroup;
    final int mVersionCode;

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.berships berships, String s, FastJsonResponse fastjsonresponse)
    {
        int i = berships.ParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

        case 4: // '\004'
            mMetadata = (DefaultMetadataImpl)fastjsonresponse;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof mIndicatorSet) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (mIndicatorSet)obj;
        iterator = sFields.values().iterator();
_L5:
        com.google.android.gms.common.server.response.berships berships;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        berships = (com.google.android.gms.common.server.response.berships.sFields)iterator.next();
        if (!isFieldSet(berships))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(berships)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(berships).equals(((getFieldValue) (obj)).getFieldValue(berships))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(berships)) goto _L5; else goto _L6
_L6:
        return false;
        return true;
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final Object getFieldValue(com.google.android.gms.common.server.response.berships berships)
    {
        switch (berships.ParcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(berships.ParcelableFieldId()).toString());

        case 2: // '\002'
            return mCircle;

        case 3: // '\003'
            return mContactGroup;

        case 4: // '\004'
            return mMetadata;

        case 5: // '\005'
            return mSystemContactGroup;
        }
    }

    protected final Object getValueObject(String s)
    {
        return null;
    }

    public final int hashCode()
    {
        int i = 0;
        Iterator iterator = sFields.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.server.response.berships berships = (com.google.android.gms.common.server.response.berships.sFields)iterator.next();
            if (isFieldSet(berships))
            {
                i = berships.ParcelableFieldId() + i + getFieldValue(berships).hashCode();
            }
        } while (true);
        return i;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.berships berships)
    {
        return mIndicatorSet.contains(Integer.valueOf(berships.ParcelableFieldId()));
    }

    protected final boolean isPrimitiveFieldSet(String s)
    {
        return false;
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.berships berships, String s, String s1)
    {
        int i = berships.ParcelableFieldId();
        i;
        JVM INSTR tableswitch 2 5: default 40
    //                   2 70
    //                   3 91
    //                   4 40
    //                   5 99;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mCircle = s1;
_L6:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mContactGroup = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mSystemContactGroup = s1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        DefaultPersonImpl_MembershipsCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("circle", com.google.android.gms.common.server.response.ng("circle", 2));
        sFields.put("contactGroup", com.google.android.gms.common.server.response.ng("contactGroup", 3));
        sFields.put("metadata", com.google.android.gms.common.server.response.reteType("metadata", 4, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
        sFields.put("systemContactGroup", com.google.android.gms.common.server.response.ng("systemContactGroup", 5));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, String s, String s1, DefaultMetadataImpl defaultmetadataimpl, String s2)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mCircle = s;
        mContactGroup = s1;
        mMetadata = defaultmetadataimpl;
        mSystemContactGroup = s2;
    }
}
