// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import android.app.Activity;
import com.qihoo.security.alasticbutton.ElasticImageButton;
import com.qihoo.security.locale.d;

// Referenced classes of package com.qihoo.security.ui.antivirus:
//            VirusScanFragmentV3

class a
    implements Runnable
{

    final a a;

    public void run()
    {
        a.a.b(null);
        VirusScanFragmentV3.f(a.a, false);
        a.a.a_(VirusScanFragmentV3.ah(a.a).a(0x7f0c01d3));
        VirusScanFragmentV3.f(a.a, false);
        VirusScanFragmentV3.ai(a.a).a(true);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$13

/* anonymous class */
    class VirusScanFragmentV3._cls13 extends Thread
    {

        final VirusScanFragmentV3 a;

        public void run()
        {
            int ai[] = VirusScanFragmentV3.I(a);
            int ai1[] = VirusScanFragmentV3.b(a);
            int i = VirusScanFragmentV3.J(a);
            if (ai[1] + ai1[0] + i > 0)
            {
                return;
            } else
            {
                VirusScanFragmentV3.g(a).runOnUiThread(new VirusScanFragmentV3._cls13._cls1(this));
                return;
            }
        }

            
            {
                a = virusscanfragmentv3;
                super();
            }
    }

}
