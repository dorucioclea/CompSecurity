// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            az, gr

public final class ay
    implements SafeParcelable
{

    public static final az CREATOR = new az();
    public final int height;
    public final int heightPixels;
    public final String of;
    public final boolean og;
    public final ay oh[];
    public final int versionCode;
    public final int width;
    public final int widthPixels;

    public ay()
    {
        this(2, "interstitial_mb", 0, 0, true, 0, 0, null);
    }

    ay(int i, String s, int j, int k, boolean flag, int l, int i1, 
            ay aay[])
    {
        versionCode = i;
        of = s;
        height = j;
        heightPixels = k;
        og = flag;
        width = l;
        widthPixels = i1;
        oh = aay;
    }

    public ay(Context context, AdSize adsize)
    {
        this(context, new AdSize[] {
            adsize
        });
    }

    public ay(Context context, AdSize aadsize[])
    {
        boolean flag1 = false;
        super();
        AdSize adsize = aadsize[0];
        versionCode = 2;
        og = false;
        width = adsize.getWidth();
        height = adsize.getHeight();
        DisplayMetrics displaymetrics;
        int i;
        boolean flag;
        int j;
        int k;
        if (width == -1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (height == -2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        displaymetrics = context.getResources().getDisplayMetrics();
        if (i != 0)
        {
            widthPixels = a(displaymetrics);
            j = (int)((float)widthPixels / displaymetrics.density);
        } else
        {
            j = width;
            widthPixels = com.google.android.gms.internal.gr.a(displaymetrics, width);
        }
        if (flag)
        {
            k = c(displaymetrics);
        } else
        {
            k = height;
        }
        heightPixels = com.google.android.gms.internal.gr.a(displaymetrics, k);
        if (i != 0 || flag)
        {
            of = (new StringBuilder()).append(j).append("x").append(k).append("_as").toString();
        } else
        {
            of = adsize.toString();
        }
        if (aadsize.length > 1)
        {
            oh = new ay[aadsize.length];
            for (i = ((flag1) ? 1 : 0); i < aadsize.length; i++)
            {
                oh[i] = new ay(context, aadsize[i]);
            }

        } else
        {
            oh = null;
        }
    }

    public ay(ay ay1, ay aay[])
    {
        this(2, ay1.of, ay1.height, ay1.heightPixels, ay1.og, ay1.width, ay1.widthPixels, aay);
    }

    public static int a(DisplayMetrics displaymetrics)
    {
        return displaymetrics.widthPixels;
    }

    public static int b(DisplayMetrics displaymetrics)
    {
        return (int)((float)c(displaymetrics) * displaymetrics.density);
    }

    private static int c(DisplayMetrics displaymetrics)
    {
        int i = (int)((float)displaymetrics.heightPixels / displaymetrics.density);
        if (i <= 400)
        {
            return 32;
        }
        return i > 720 ? 90 : 50;
    }

    public AdSize bc()
    {
        return com.google.android.gms.ads.a.a(width, height, of);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.internal.az.a(this, parcel, i);
    }

}
