// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.maps.internal.c;
import com.google.android.gms.maps.internal.x;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            SupportStreetViewPanoramaFragment, MapsInitializer, OnStreetViewPanoramaReadyCallback

static final class VB extends a
{

    private final Fragment VB;
    protected f azc;
    private final List azw = new ArrayList();
    private Activity mActivity;

    static void a(VB vb, Activity activity)
    {
        vb.setActivity(activity);
    }

    private void qc()
    {
        if (mActivity == null || azc == null || lf() != null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        try
        {
            MapsInitializer.initialize(mActivity);
            com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate = x.V(mActivity).n(e.q(mActivity));
            azc.a(new <init>(VB, istreetviewpanoramafragmentdelegate));
            OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
            for (Iterator iterator = azw.iterator(); iterator.hasNext(); ((azw)lf()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback))
            {
                onstreetviewpanoramareadycallback = (OnStreetViewPanoramaReadyCallback)iterator.next();
            }

        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
        {
            return;
        }
        azw.clear();
    }

    private void setActivity(Activity activity)
    {
        mActivity = activity;
        qc();
    }

    protected final void a(f f1)
    {
        azc = f1;
        qc();
    }

    ption(Fragment fragment)
    {
        VB = fragment;
    }
}
