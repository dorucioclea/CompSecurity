// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.passwordreset.PasswordResetNewPasswordFragment;

public final class enf
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;
    private final hzb d;
    private final hzb e;

    private enf(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        if (!a && hsr1 == null)
        {
            throw new AssertionError();
        }
        b = hsr1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        }
        d = hzb2;
        if (!a && hzb3 == null)
        {
            throw new AssertionError();
        } else
        {
            e = hzb3;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        return new enf(hsr1, hzb1, hzb2, hzb3);
    }

    private void a(PasswordResetNewPasswordFragment passwordresetnewpasswordfragment)
    {
        if (passwordresetnewpasswordfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(passwordresetnewpasswordfragment);
            passwordresetnewpasswordfragment.c = (chp)c.a();
            passwordresetnewpasswordfragment.d = (dkf)d.a();
            passwordresetnewpasswordfragment.e = (emu)e.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((PasswordResetNewPasswordFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!enf.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
