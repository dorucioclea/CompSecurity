// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.facebook:
//            AsyncTask

class able extends FutureTask
{

    final AsyncTask this$0;

    protected void done()
    {
        try
        {
            AsyncTask.access$500(AsyncTask.this, get());
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.w("AsyncTask", interruptedexception);
            return;
        }
        catch (ExecutionException executionexception)
        {
            throw new RuntimeException("An error occured while executing doInBackground()", executionexception.getCause());
        }
        catch (CancellationException cancellationexception)
        {
            AsyncTask.access$500(AsyncTask.this, null);
        }
    }

    able(Callable callable)
    {
        this$0 = AsyncTask.this;
        super(callable);
    }
}
