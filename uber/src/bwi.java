// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class bwi extends bui
{

    private static final String a = bwi.getSimpleName();
    public String g;
    public boolean h;
    public Map i;

    public bwi(bup bup, buk buk, bus bus, String s)
    {
        super(new buo(bup), buk, bus, s);
        a("Accept", "application/json; charset=utf-8");
        a("Accept-Language", "en_US");
        a("Content-Type", "application/x-www-form-urlencoded");
    }

    protected static String a(JSONObject jsonobject)
    {
        JSONArray jsonarray = new JSONArray();
        jsonarray.put(jsonobject);
        return bwq.a(jsonarray.toString());
    }

    protected static String c(String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder("Basic ");
        if (bst.a(s) && s1 == null)
        {
            s = "mock:";
        } else
        {
            s = (new StringBuilder()).append(new String(Base64.encode(s1.getBytes(), 2))).append(":").toString();
        }
        return stringbuilder.append(s).toString();
    }

    protected final void b(JSONObject jsonobject)
    {
        String s = jsonobject.getString("error");
        String s1 = jsonobject.optString("error_description");
        if (jsonobject.has("nonce"))
        {
            g = jsonobject.getString("nonce");
        }
        if (jsonobject.has("2fa_enabled") && jsonobject.getBoolean("2fa_enabled"))
        {
            h = true;
            i = new LinkedHashMap();
            if (jsonobject.has("2fa_token_identifier"))
            {
                jsonobject = jsonobject.getJSONArray("2fa_token_identifier");
                int j = 0;
                while (j < jsonobject.length()) 
                {
                    Object obj = jsonobject.getJSONObject(j);
                    String s2 = ((JSONObject) (obj)).getString("type");
                    String s3 = ((JSONObject) (obj)).getString("token_identifier");
                    obj = ((JSONObject) (obj)).getString("token_identifier_display");
                    if ("sms_otp".equals(s2))
                    {
                        i.put(s3, obj);
                        (new StringBuilder("adding token [")).append(s3).append(",").append(((String) (obj))).append("]");
                    } else
                    {
                        (new StringBuilder("skipping token [")).append(s3).append(",").append(((String) (obj))).append("], as the type is not supported:").append(s2);
                    }
                    j++;
                }
            }
        }
        b(s, s1);
    }

}
