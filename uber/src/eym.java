// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.profiles.OnBoardingFinishedFragment;

public final class eym
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;
    private final hzb d;
    private final hzb e;
    private final hzb f;
    private final hzb g;

    private eym(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5)
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
        }
        e = hzb3;
        if (!a && hzb4 == null)
        {
            throw new AssertionError();
        }
        f = hzb4;
        if (!a && hzb5 == null)
        {
            throw new AssertionError();
        } else
        {
            g = hzb5;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5)
    {
        return new eym(hsr1, hzb1, hzb2, hzb3, hzb4, hzb5);
    }

    private void a(OnBoardingFinishedFragment onboardingfinishedfragment)
    {
        if (onboardingfinishedfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(onboardingfinishedfragment);
            onboardingfinishedfragment.c = (chp)c.a();
            onboardingfinishedfragment.d = (cev)d.a();
            onboardingfinishedfragment.e = (hkr)e.a();
            onboardingfinishedfragment.f = (cgh)f.a();
            onboardingfinishedfragment.g = (eyy)g.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((OnBoardingFinishedFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!eym.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
