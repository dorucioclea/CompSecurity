// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class bwm extends bwi
{

    public String a;
    public String b;
    public long c;
    public boolean d;

    public bwm(String s, buk buk, bus bus, String s1)
    {
        super(bup.c, buk, bus, c(s, s1));
    }

    public final String b()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("response_type", "token");
        hashmap.put("grant_type", "client_credentials");
        hashmap.put("return_authn_schemes", "true");
        hashmap.put("device_info", bwq.a(bto.a().toString()));
        hashmap.put("app_info", bwq.a(btl.a().toString()));
        hashmap.put("risk_data", bwq.a(bqw.a().c().toString()));
        return bwq.a(hashmap);
    }

    public final void c()
    {
        JSONObject jsonobject = n();
        JSONArray jsonarray;
        a = jsonobject.getString("access_token");
        b = jsonobject.getString("scope");
        c = jsonobject.getLong("expires_in");
        jsonarray = jsonobject.getJSONArray("supported_authn_schemes");
        int i = 0;
_L2:
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        if (jsonarray.get(i).equals("phone_pin"))
        {
            d = true;
        }
        i++;
        if (true) goto _L2; else goto _L1
        JSONException jsonexception;
        jsonexception;
        b(jsonobject);
_L1:
    }

    public final void d()
    {
        b(n());
    }

    public final String e()
    {
        return "{\"scope\":\"https://api.paypal.com/v1/payments/.* https://api.paypal.com/v1/vault/credit-card https://api.paypal.com/v1/vault/credit-card/.* openid\",\"access_token\":\"iPVzWUwTo1fEG6n.2sTZCahv8wa2b8uGpBs1KZ-6XxA\",\"token_type\":\"Bearer\",\"expires_in\":900,\"supported_authn_schemes\": [ \"email_password\", \"phone_pin\" ]}";
    }
}
