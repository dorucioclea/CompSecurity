// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.pinit;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import com.pinterest.pinit.exceptions.ImageException;
import com.pinterest.pinit.exceptions.NotInstalledException;
import com.pinterest.pinit.exceptions.PartnerIdException;
import com.pinterest.pinit.exceptions.SourceUrlException;

// Referenced classes of package com.pinterest.pinit:
//            PinItListener

public class PinIt
{

    private static final String EXTRA_DESCRIPTION = "com.pinterest.EXTRA_DESCRIPTION";
    private static final String EXTRA_IMAGE = "com.pinterest.EXTRA_IMAGE";
    private static final String EXTRA_PARTNER_ID = "com.pinterest.EXTRA_PARTNER_ID";
    private static final String EXTRA_PARTNER_PACKAGE = "com.pinterest.EXTRA_PARTNER_PACKAGE";
    private static final String EXTRA_URI = "com.pinterest.EXTRA_URI";
    private static final String EXTRA_URL = "com.pinterest.EXTRA_URL";
    private static final String INTENT_PIN_IT = "com.pinterest.action.PIN_IT";
    private static final String TAG = "Pinterest Pin It";
    private static String _partnerId;
    private static boolean debugMode;
    private String _description;
    private Uri _imageUri;
    private String _imageUrl;
    private PinItListener _listener;
    private String _url;

    public PinIt()
    {
    }

    private static boolean forceInstallPinterest(Context context)
    {
        try
        {
            context.startActivity((new Intent("android.intent.action.VIEW")).setData(Uri.parse("market://details?id=com.pinterest")));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

    public static String getPartnerId()
    {
        return _partnerId;
    }

    public static boolean isDebugMode()
    {
        return debugMode;
    }

    private static transient void log(String s, Object aobj[])
    {
        if (debugMode)
        {
            Log.i("Pinterest Pin It", String.format(s, aobj));
        }
    }

    private static transient void loge(String s, Object aobj[])
    {
        if (debugMode)
        {
            Log.e("Pinterest Pin It", String.format(s, aobj));
        }
    }

    public static boolean meetsRequirements()
    {
        return android.os.Build.VERSION.SDK_INT >= 8;
    }

    private static boolean pinterestInstalled(Context context)
    {
        if (meetsRequirements()) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L4:
        return flag1;
_L2:
        boolean flag;
        flag = false;
        try
        {
            context = context.getPackageManager().getPackageInfo("com.pinterest", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (debugMode)
            {
                context.printStackTrace();
            }
            return false;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        if (((PackageInfo) (context)).versionCode >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        loge("Pinterest versionCode:%s versionName:%s", new Object[] {
            Integer.valueOf(((PackageInfo) (context)).versionCode), ((PackageInfo) (context)).versionName
        });
_L5:
        flag1 = flag;
        if (flag) goto _L4; else goto _L3
_L3:
        loge("Pinterest app version too low!", new Object[0]);
        return flag;
        loge("Pinterest app not installed!", new Object[0]);
          goto _L5
    }

    public static void setDebugMode(boolean flag)
    {
        debugMode = flag;
    }

    public static void setPartnerId(String s)
    {
        _partnerId = s;
    }

    public void doPinIt(Context context)
    {
        if (meetsRequirements()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Intent intent;
        boolean flag;
        if (_listener != null)
        {
            _listener.onStart();
        }
        if (!pinterestInstalled(context))
        {
            if (_listener != null)
            {
                _listener.onException(new NotInstalledException());
            }
            forceInstallPinterest(context);
            return;
        }
        intent = new Intent();
        intent.setAction("com.pinterest.action.PIN_IT");
        flag = false;
        if (_imageUrl == null || _imageUrl.length() <= 0) goto _L4; else goto _L3
_L3:
        flag = true;
        intent.putExtra("com.pinterest.EXTRA_IMAGE", _imageUrl);
_L6:
        if (!flag)
        {
            if (_listener != null)
            {
                _listener.onException(new ImageException());
            }
            loge("imageUrl and/or imageUri cannot be null! Did you call setImageUrl(String) or setImageUri(Uri)?", new Object[0]);
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (_imageUri != null)
        {
            flag = true;
            intent.putExtra("com.pinterest.EXTRA_URI", _imageUri);
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (_partnerId == null || _partnerId.length() == 0)
        {
            if (_listener != null)
            {
                _listener.onException(new PartnerIdException());
            }
            loge("partnerId cannot be null! Did you call setPartnerId?", new Object[0]);
            return;
        }
        intent.putExtra("com.pinterest.EXTRA_PARTNER_ID", _partnerId);
        if (_url == null)
        {
            if (_imageUri == null)
            {
                if (_listener != null)
                {
                    _listener.onException(new SourceUrlException());
                }
                loge("url cannot be null! Did you call setUrl?", new Object[0]);
                return;
            }
        } else
        {
            intent.putExtra("com.pinterest.EXTRA_URL", _url);
        }
        if (_description == null)
        {
            log("description is null. You can optionally set it with setDescription.", new Object[0]);
        } else
        {
            intent.putExtra("com.pinterest.EXTRA_DESCRIPTION", _description);
        }
        intent.putExtra("com.pinterest.EXTRA_PARTNER_PACKAGE", context.getPackageName());
        try
        {
            context.startActivity(intent);
            if (_listener != null)
            {
                _listener.onComplete(true);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (_listener != null)
            {
                _listener.onComplete(false);
                return;
            }
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    public String getDescription()
    {
        return _description;
    }

    public Uri getImageUri()
    {
        return _imageUri;
    }

    public String getImageUrl()
    {
        return _imageUrl;
    }

    public PinItListener getListener()
    {
        return _listener;
    }

    public String getUrl()
    {
        return _url;
    }

    public void reset()
    {
        _url = null;
        _imageUri = null;
        _imageUrl = null;
        _description = null;
        _listener = null;
    }

    public void setDescription(String s)
    {
        _description = s;
    }

    public void setImageUri(Uri uri)
    {
        _imageUrl = null;
        _imageUri = uri;
    }

    public void setImageUrl(String s)
    {
        _imageUri = null;
        _imageUrl = s;
    }

    public void setListener(PinItListener pinitlistener)
    {
        _listener = pinitlistener;
    }

    public void setUrl(String s)
    {
        _url = s;
    }
}
