// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

public final class akr extends MutableContextWrapper
{

    private Activity a;
    private Context b;
    private Context c;

    public akr(Context context)
    {
        super(context);
        setBaseContext(context);
    }

    public final Activity a()
    {
        return a;
    }

    public final Context b()
    {
        return c;
    }

    public final Object getSystemService(String s)
    {
        return c.getSystemService(s);
    }

    public final void setBaseContext(Context context)
    {
        b = context.getApplicationContext();
        Activity activity;
        if (context instanceof Activity)
        {
            activity = (Activity)context;
        } else
        {
            activity = null;
        }
        a = activity;
        c = context;
        super.setBaseContext(b);
    }

    public final void startActivity(Intent intent)
    {
        if (a != null && !alv.g())
        {
            a.startActivity(intent);
            return;
        } else
        {
            intent.setFlags(0x10000000);
            b.startActivity(intent);
            return;
        }
    }
}
