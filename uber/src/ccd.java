// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import com.paypal.android.sdk.payments.PayPalService;
import com.paypal.android.sdk.payments.PaymentMethodActivity;

public final class ccd
    implements android.content.DialogInterface.OnClickListener
{

    private PaymentMethodActivity a;

    public ccd(PaymentMethodActivity paymentmethodactivity)
    {
        a = paymentmethodactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        PaymentMethodActivity.g(a).h();
        PaymentMethodActivity.g(a).c().a();
        PaymentMethodActivity.h(a);
    }
}
