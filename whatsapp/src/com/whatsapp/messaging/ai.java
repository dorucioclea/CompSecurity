// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;


// Referenced classes of package com.whatsapp.messaging:
//            MessageService

class ai
    implements Runnable
{

    final MessageService a;

    ai(MessageService messageservice)
    {
        a = messageservice;
        super();
    }

    public void run()
    {
        MessageService.c(a, false);
    }
}
