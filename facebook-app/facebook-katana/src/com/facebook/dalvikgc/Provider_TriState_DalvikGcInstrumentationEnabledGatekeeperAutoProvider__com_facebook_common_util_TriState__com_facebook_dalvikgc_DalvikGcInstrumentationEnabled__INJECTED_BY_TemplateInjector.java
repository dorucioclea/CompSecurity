// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.dalvikgc;

import com.facebook.inject.AbstractDefaultScopeProvider;
import com.facebook.inject.InjectorLike;
import javax.inject.Provider;

// Referenced classes of package com.facebook.dalvikgc:
//            TriState_DalvikGcInstrumentationEnabledGatekeeperAutoProvider

public final class Provider_TriState_DalvikGcInstrumentationEnabledGatekeeperAutoProvider__com_facebook_common_util_TriState__com_facebook_dalvikgc_DalvikGcInstrumentationEnabled__INJECTED_BY_TemplateInjector extends AbstractDefaultScopeProvider
{

    private Provider_TriState_DalvikGcInstrumentationEnabledGatekeeperAutoProvider__com_facebook_common_util_TriState__com_facebook_dalvikgc_DalvikGcInstrumentationEnabled__INJECTED_BY_TemplateInjector(InjectorLike injectorlike, boolean flag)
    {
        super(injectorlike, flag);
    }

    public static Provider a(InjectorLike injectorlike)
    {
        return new Provider_TriState_DalvikGcInstrumentationEnabledGatekeeperAutoProvider__com_facebook_common_util_TriState__com_facebook_dalvikgc_DalvikGcInstrumentationEnabled__INJECTED_BY_TemplateInjector(injectorlike, false);
    }

    protected final Object onGetInstance(InjectorLike injectorlike)
    {
        return TriState_DalvikGcInstrumentationEnabledGatekeeperAutoProvider.a(injectorlike);
    }
}
