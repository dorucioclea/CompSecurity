// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.os.Bundle;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            AcceptTermsLayout, SignupVia

public static interface Q
{

    public abstract void onAcceptTerms(SignupVia signupvia, Bundle bundle);

    public abstract void onRejectTerms();

    public abstract void onShowPrivacyPolicy();

    public abstract void onShowTermsOfUse();
}
