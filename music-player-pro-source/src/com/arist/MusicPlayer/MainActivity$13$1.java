// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.Editable;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity, MyApplication

class val.sleepTimeMillis extends TimerTask
{

    final is._cls0 this$1;
    private final long val$sleepTimeMillis;

    public void run()
    {
        if (System.currentTimeMillis() > val$sleepTimeMillis)
        {
            sendBroadcast(new Intent("com.MediaPlayer.action.START_SLEEP"));
            finish();
            MainActivity.access$39(_fld0).cancel();
        }
    }

    l.et()
    {
        this$1 = final_et;
        val$sleepTimeMillis = J.this;
        super();
    }

    // Unreferenced inner class com/arist/MusicPlayer/MainActivity$13

/* anonymous class */
    class MainActivity._cls13
        implements android.content.DialogInterface.OnClickListener
    {

        final MainActivity this$0;
        private final EditText val$et;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            MainActivity.access$40(MainActivity.this, Integer.parseInt(et.getText().toString().trim()));
            MyApplication.getDefaultSharedPreferences().edit().putInt("sleep_time", MainActivity.access$41(MainActivity.this)).commit();
            long l = MainActivity.access$41(MainActivity.this) * 60 * 1000;
            long l1 = System.currentTimeMillis();
            MainActivity.access$42(MainActivity.this, new Timer());
            MainActivity.access$39(MainActivity.this).schedule((l + l1). new MainActivity._cls13._cls1(), 0L, 60000L);
            MainActivity.access$38(MainActivity.this, true);
            Toast.makeText(MainActivity.this, String.format(getString(0x7f080055), new Object[] {
                Integer.valueOf(MainActivity.access$41(MainActivity.this))
            }), 1).show();
        }


            
            {
                this$0 = final_mainactivity;
                et = EditText.this;
                super();
            }
    }

}
