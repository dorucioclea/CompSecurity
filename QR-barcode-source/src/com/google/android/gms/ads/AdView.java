// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.internal.bh;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest, AdSize, AdListener

public final class AdView extends ViewGroup
{

    private final bh li;

    public AdView(Context context)
    {
        super(context);
        li = new bh(this);
    }

    public AdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        li = new bh(this, attributeset, false);
    }

    public AdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        li = new bh(this, attributeset, false);
    }

    public void destroy()
    {
        li.destroy();
    }

    public AdListener getAdListener()
    {
        return li.getAdListener();
    }

    public AdSize getAdSize()
    {
        return li.getAdSize();
    }

    public String getAdUnitId()
    {
        return li.getAdUnitId();
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return li.getInAppPurchaseListener();
    }

    public String getMediationAdapterClassName()
    {
        return li.getMediationAdapterClassName();
    }

    public void loadAd(AdRequest adrequest)
    {
        li.a(adrequest.V());
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        View view = getChildAt(0);
        if (view != null && view.getVisibility() != 8)
        {
            int i1 = view.getMeasuredWidth();
            int j1 = view.getMeasuredHeight();
            i = (k - i - i1) / 2;
            j = (l - j - j1) / 2;
            view.layout(i, j, i1 + i, j1 + j);
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k = 0;
        View view = getChildAt(0);
        AdSize adsize = getAdSize();
        int l;
        if (view != null && view.getVisibility() != 8)
        {
            measureChild(view, i, j);
            l = view.getMeasuredWidth();
            k = view.getMeasuredHeight();
        } else
        if (adsize != null)
        {
            Context context = getContext();
            l = adsize.getWidthInPixels(context);
            k = adsize.getHeightInPixels(context);
        } else
        {
            l = 0;
        }
        l = Math.max(l, getSuggestedMinimumWidth());
        k = Math.max(k, getSuggestedMinimumHeight());
        setMeasuredDimension(View.resolveSize(l, i), View.resolveSize(k, j));
    }

    public void pause()
    {
        li.pause();
    }

    public void resume()
    {
        li.resume();
    }

    public void setAdListener(AdListener adlistener)
    {
        li.setAdListener(adlistener);
    }

    public void setAdSize(AdSize adsize)
    {
        li.setAdSizes(new AdSize[] {
            adsize
        });
    }

    public void setAdUnitId(String s)
    {
        li.setAdUnitId(s);
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        li.setInAppPurchaseListener(inapppurchaselistener);
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        li.setPlayStorePurchaseParams(playstorepurchaselistener, s);
    }
}
