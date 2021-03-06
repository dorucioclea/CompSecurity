// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            u, aa, o, ak

public class HitBuilders
{
    public static class AppViewBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public AppViewBuilder()
        {
            u.cP().a(u.a.wd);
            set("&t", "screenview");
        }
    }

    public static class EventBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public EventBuilder setAction(String s)
        {
            set("&ea", s);
            return this;
        }

        public EventBuilder setCategory(String s)
        {
            set("&ec", s);
            return this;
        }

        public EventBuilder setLabel(String s)
        {
            set("&el", s);
            return this;
        }

        public EventBuilder setValue(long l)
        {
            set("&ev", Long.toString(l));
            return this;
        }

        public EventBuilder()
        {
            u.cP().a(u.a.vR);
            set("&t", "event");
        }

        public EventBuilder(String s, String s1)
        {
            this();
            setCategory(s);
            setAction(s1);
        }
    }

    public static class ExceptionBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public ExceptionBuilder setDescription(String s)
        {
            set("&exd", s);
            return this;
        }

        public ExceptionBuilder setFatal(boolean flag)
        {
            set("&exf", ak.v(flag));
            return this;
        }

        public ExceptionBuilder()
        {
            u.cP().a(u.a.vA);
            set("&t", "exception");
        }
    }

    protected static class HitBuilder
    {

        List wA;
        private Map ww;
        ProductAction wx;
        Map wy;
        List wz;

        public HitBuilder addImpression(Product product, String s)
        {
            if (product == null)
            {
                aa.D("product should be non-null");
                return this;
            }
            String s1 = s;
            if (s == null)
            {
                s1 = "";
            }
            if (!wy.containsKey(s1))
            {
                wy.put(s1, new ArrayList());
            }
            ((List)wy.get(s1)).add(product);
            return this;
        }

        public HitBuilder addProduct(Product product)
        {
            if (product == null)
            {
                aa.D("product should be non-null");
                return this;
            } else
            {
                wA.add(product);
                return this;
            }
        }

        public HitBuilder addPromotion(Promotion promotion)
        {
            if (promotion == null)
            {
                aa.D("promotion should be non-null");
                return this;
            } else
            {
                wz.add(promotion);
                return this;
            }
        }

        public Map build()
        {
            HashMap hashmap = new HashMap(ww);
            if (wx != null)
            {
                hashmap.putAll(wx.build());
            }
            Iterator iterator = wz.iterator();
            for (int i = 1; iterator.hasNext(); i++)
            {
                hashmap.putAll(((Promotion)iterator.next()).X(o.v(i)));
            }

            iterator = wA.iterator();
            for (int j = 1; iterator.hasNext(); j++)
            {
                hashmap.putAll(((Product)iterator.next()).X(o.u(j)));
            }

            iterator = wy.entrySet().iterator();
            for (int k = 1; iterator.hasNext(); k++)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                Object obj = (List)entry.getValue();
                String s = o.x(k);
                obj = ((List) (obj)).iterator();
                for (int l = 1; ((Iterator) (obj)).hasNext(); l++)
                {
                    hashmap.putAll(((Product)((Iterator) (obj)).next()).X((new StringBuilder()).append(s).append(o.w(l)).toString()));
                }

                if (!TextUtils.isEmpty((CharSequence)entry.getKey()))
                {
                    hashmap.put((new StringBuilder()).append(s).append("nm").toString(), entry.getKey());
                }
            }

            return hashmap;
        }

        protected String get(String s)
        {
            return (String)ww.get(s);
        }

        public final HitBuilder set(String s, String s1)
        {
            u.cP().a(u.a.uT);
            if (s != null)
            {
                ww.put(s, s1);
                return this;
            } else
            {
                aa.D(" HitBuilder.set() called with a null paramName.");
                return this;
            }
        }

        public final HitBuilder setAll(Map map)
        {
            u.cP().a(u.a.uU);
            if (map == null)
            {
                return this;
            } else
            {
                ww.putAll(new HashMap(map));
                return this;
            }
        }

        public HitBuilder setCampaignParamsFromUrl(String s)
        {
            u.cP().a(u.a.uW);
            s = ak.V(s);
            if (TextUtils.isEmpty(s))
            {
                return this;
            } else
            {
                s = ak.U(s);
                set("&cc", (String)s.get("utm_content"));
                set("&cm", (String)s.get("utm_medium"));
                set("&cn", (String)s.get("utm_campaign"));
                set("&cs", (String)s.get("utm_source"));
                set("&ck", (String)s.get("utm_term"));
                set("&ci", (String)s.get("utm_id"));
                set("&gclid", (String)s.get("gclid"));
                set("&dclid", (String)s.get("dclid"));
                set("&gmob_t", (String)s.get("gmob_t"));
                return this;
            }
        }

        public HitBuilder setCustomDimension(int i, String s)
        {
            set(o.s(i), s);
            return this;
        }

        public HitBuilder setCustomMetric(int i, float f)
        {
            set(o.t(i), Float.toString(f));
            return this;
        }

        protected HitBuilder setHitType(String s)
        {
            set("&t", s);
            return this;
        }

        public HitBuilder setNewSession()
        {
            set("&sc", "start");
            return this;
        }

        public HitBuilder setNonInteraction(boolean flag)
        {
            set("&ni", ak.v(flag));
            return this;
        }

        public HitBuilder setProductAction(ProductAction productaction)
        {
            wx = productaction;
            return this;
        }

        public HitBuilder setPromotionAction(String s)
        {
            ww.put("&promoa", s);
            return this;
        }

        protected HitBuilder()
        {
            ww = new HashMap();
            wy = new HashMap();
            wz = new ArrayList();
            wA = new ArrayList();
        }
    }

    public static class ItemBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public ItemBuilder setCategory(String s)
        {
            set("&iv", s);
            return this;
        }

        public ItemBuilder setCurrencyCode(String s)
        {
            set("&cu", s);
            return this;
        }

        public ItemBuilder setName(String s)
        {
            set("&in", s);
            return this;
        }

        public ItemBuilder setPrice(double d)
        {
            set("&ip", Double.toString(d));
            return this;
        }

        public ItemBuilder setQuantity(long l)
        {
            set("&iq", Long.toString(l));
            return this;
        }

        public ItemBuilder setSku(String s)
        {
            set("&ic", s);
            return this;
        }

        public ItemBuilder setTransactionId(String s)
        {
            set("&ti", s);
            return this;
        }

        public ItemBuilder()
        {
            u.cP().a(u.a.vS);
            set("&t", "item");
        }
    }

    public static class ScreenViewBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public ScreenViewBuilder()
        {
            u.cP().a(u.a.wd);
            set("&t", "screenview");
        }
    }

    public static class SocialBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public SocialBuilder setAction(String s)
        {
            set("&sa", s);
            return this;
        }

        public SocialBuilder setNetwork(String s)
        {
            set("&sn", s);
            return this;
        }

        public SocialBuilder setTarget(String s)
        {
            set("&st", s);
            return this;
        }

        public SocialBuilder()
        {
            u.cP().a(u.a.vD);
            set("&t", "social");
        }
    }

    public static class TimingBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public TimingBuilder setCategory(String s)
        {
            set("&utc", s);
            return this;
        }

        public TimingBuilder setLabel(String s)
        {
            set("&utl", s);
            return this;
        }

        public TimingBuilder setValue(long l)
        {
            set("&utt", Long.toString(l));
            return this;
        }

        public TimingBuilder setVariable(String s)
        {
            set("&utv", s);
            return this;
        }

        public TimingBuilder()
        {
            u.cP().a(u.a.vC);
            set("&t", "timing");
        }

        public TimingBuilder(String s, String s1, long l)
        {
            this();
            setVariable(s1);
            setValue(l);
            setCategory(s);
        }
    }

    public static class TransactionBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public TransactionBuilder setAffiliation(String s)
        {
            set("&ta", s);
            return this;
        }

        public TransactionBuilder setCurrencyCode(String s)
        {
            set("&cu", s);
            return this;
        }

        public TransactionBuilder setRevenue(double d)
        {
            set("&tr", Double.toString(d));
            return this;
        }

        public TransactionBuilder setShipping(double d)
        {
            set("&ts", Double.toString(d));
            return this;
        }

        public TransactionBuilder setTax(double d)
        {
            set("&tt", Double.toString(d));
            return this;
        }

        public TransactionBuilder setTransactionId(String s)
        {
            set("&ti", s);
            return this;
        }

        public TransactionBuilder()
        {
            u.cP().a(u.a.vz);
            set("&t", "transaction");
        }
    }


    public HitBuilders()
    {
    }
}
