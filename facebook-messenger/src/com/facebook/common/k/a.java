// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.k;

import com.google.common.a.ev;
import com.google.common.a.ew;
import java.util.Locale;

public class a
{

    private static final ev a = (new ew()).b("af", "af_ZA").b("ar", "ar_AR").b("az", "az_AZ").b("be", "be_BY").b("bg", "bg_BG").b("bn", "bn_IN").b("bs", "bs_BA").b("ca", "ca_ES").b("ck", "ck_US").b("cs", "cz_CZ").b("cy", "cy_GB").b("da", "da_DK").b("de", "de_DE").b("el", "el_GR").b("eo", "eo_EO").b("et", "et_EE").b("es", "es_LA").b("eu", "eu_ES").b("fa", "fa_IR").b("fi", "fi_FI").b("fo", "fo_FO").b("fr", "fr_FR").b("fy", "fy_NL").b("ga", "ga_IE").b("gl", "gl_ES").b("he", "he_IL").b("hi", "hi_IN").b("hr", "hr_HR").b("hu", "hu_HU").b("hy", "hy_AM").b("id", "id_ID").b("in", "id_ID").b("is", "is_IS").b("it", "it_IT").b("iw", "he_IL").b("ja", "ja_JP").b("ka", "ka_GE").b("km", "km_KH").b("ko", "ko_KR").b("ku", "ku_TR").b("la", "la_VA").b("lv", "lv_LV").b("mk", "mk_MK").b("ml", "ml_IN").b("ms", "ms_MY").b("nb", "nb_NO").b("ne", "ne_NP").b("nl", "nl_NL").b("nn", "nn_NO").b("pa", "pa_IN").b("pl", "pl_PL").b("ps", "ps_AF").b("pt", "pt_BR").b("ro", "ro_RO").b("ru", "ru_RU").b("sk", "sk_SK").b("sl", "sl_SL").b("sq", "sq_AL").b("sr", "sr_RS").b("sv", "sv_SE").b("sw", "sw_KE").b("ta", "ta_IN").b("th", "th_TH").b("tl", "tl_PH").b("tr", "tr_TR").b("uk", "uk_UA").b("vi", "vi_VN").b("zh", "zh_CN").b();
    private static final ev b = (new ew()).b("es_ES", "es_ES").b("fr_CA", "fr_CA").b("pt_PT", "pt_PT").b("zh_TW", "zh_TW").b("zh_HK", "zh_HK").b();

    public a()
    {
    }

    public static final String a(Locale locale)
    {
        String s1 = (String)b.get(locale.toString());
        String s = s1;
        if (s1 == null)
        {
            s = (String)a.get(locale.getLanguage());
        }
        locale = s;
        if (s == null)
        {
            locale = "en_US";
        }
        return locale;
    }

}
