// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;
import com.facebook.widget.images.e;

// Referenced classes of package com.facebook.orca.camera:
//            v, u, t

abstract class s extends ImageView
{

    private static final Class a = com/facebook/orca/camera/s;
    private final Matrix b;
    private final float c[];
    private v d;
    private Runnable e;
    protected Matrix f;
    protected Matrix g;
    protected final e h;
    int i;
    int j;
    float k;
    protected Handler l;

    public s(Context context)
    {
        super(context);
        f = new Matrix();
        g = new Matrix();
        b = new Matrix();
        c = new float[9];
        h = new e(null);
        i = -1;
        j = -1;
        l = new Handler();
        e = null;
        e();
    }

    public s(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = new Matrix();
        g = new Matrix();
        b = new Matrix();
        c = new float[9];
        h = new e(null);
        i = -1;
        j = -1;
        l = new Handler();
        e = null;
        e();
    }

    private void a(Bitmap bitmap, int i1)
    {
        super.setImageBitmap(bitmap);
        Object obj = getDrawable();
        if (obj != null)
        {
            ((Drawable) (obj)).setDither(true);
        }
        obj = h.b();
        h.a(bitmap);
        h.a(i1);
        if (obj != null && obj != bitmap && d != null)
        {
            d.a(((Bitmap) (obj)));
        }
    }

    private void a(e e1, Matrix matrix)
    {
        float f1 = getWidth();
        float f2 = getHeight();
        float f3 = e1.f();
        float f4 = e1.e();
        matrix.reset();
        float f5 = Math.min(Math.min(f1 / f3, 3F), Math.min(f2 / f4, 3F));
        matrix.postConcat(e1.c());
        matrix.postScale(f5, f5);
        matrix.postTranslate((f1 - f3 * f5) / 2.0F, (f2 - f4 * f5) / 2.0F);
    }

    private void e()
    {
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    protected float a(Matrix matrix)
    {
        return a(matrix, 0);
    }

    protected float a(Matrix matrix, int i1)
    {
        matrix.getValues(c);
        return c[i1];
    }

    public void a()
    {
        a(((Bitmap) (null)), true);
    }

    protected void a(float f1)
    {
        a(f1, (float)getWidth() / 2.0F, (float)getHeight() / 2.0F);
    }

    protected void a(float f1, float f2)
    {
        g.postTranslate(f1, f2);
    }

    protected void a(float f1, float f2, float f3)
    {
        float f4 = f1;
        if (f1 > k)
        {
            f4 = k;
        }
        f1 = f4 / b();
        g.postScale(f1, f1, f2, f3);
        setImageMatrix(c());
        a(true, true);
    }

    protected void a(float f1, float f2, float f3, float f4)
    {
        f1 = (f1 - b()) / f4;
        float f5 = b();
        long l1 = System.currentTimeMillis();
        l.post(new u(this, f4, l1, f5, f1, f2, f3));
    }

    public void a(Bitmap bitmap, boolean flag)
    {
        a(new e(bitmap), flag);
    }

    public void a(e e1, boolean flag)
    {
        if (getWidth() <= 0)
        {
            e = new t(this, e1, flag);
            return;
        }
        if (e1.b() != null)
        {
            a(e1, f);
            a(e1.b(), e1.a());
        } else
        {
            f.reset();
            setImageBitmap(null);
        }
        if (flag)
        {
            g.reset();
        }
        setImageMatrix(c());
        k = d();
    }

    protected void a(boolean flag, boolean flag1)
    {
        float f1;
        float f3;
        float f4;
        RectF rectf;
        f3 = 0.0F;
        if (h.b() == null)
        {
            return;
        }
        Matrix matrix = c();
        rectf = new RectF(0.0F, 0.0F, h.b().getWidth(), h.b().getHeight());
        matrix.mapRect(rectf);
        f1 = rectf.height();
        f4 = rectf.width();
        if (!flag1) goto _L2; else goto _L1
_L1:
        int i1 = getHeight();
        if (f1 >= (float)i1) goto _L4; else goto _L3
_L3:
        f1 = ((float)i1 - f1) / 2.0F - rectf.top;
_L10:
        float f2 = f3;
        if (!flag) goto _L6; else goto _L5
_L5:
        i1 = getWidth();
        if (f4 >= (float)i1) goto _L8; else goto _L7
_L7:
        f2 = ((float)i1 - f4) / 2.0F - rectf.left;
_L6:
        a(f2, f1);
        setImageMatrix(c());
        return;
_L4:
        if (rectf.top > 0.0F)
        {
            f1 = -rectf.top;
        } else
        {
            if (rectf.bottom >= (float)i1)
            {
                break; /* Loop/switch isn't completed */
            }
            f1 = (float)getHeight() - rectf.bottom;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (rectf.left > 0.0F)
        {
            f2 = -rectf.left;
        } else
        {
            f2 = f3;
            if (rectf.right < (float)i1)
            {
                f2 = (float)i1 - rectf.right;
            }
        }
        if (true) goto _L6; else goto _L2
_L2:
        f1 = 0.0F;
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected float b()
    {
        return a(g);
    }

    protected void b(float f1, float f2)
    {
        a(f1, f2);
        setImageMatrix(c());
    }

    protected Matrix c()
    {
        b.set(f);
        b.postConcat(g);
        return b;
    }

    protected float d()
    {
        if (h.b() == null)
        {
            return 1.0F;
        } else
        {
            return Math.max((float)h.f() / (float)i, (float)h.e() / (float)j) * 4F;
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4 && keyevent.getRepeatCount() == 0)
        {
            keyevent.startTracking();
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        if (i1 == 4 && keyevent.isTracking() && !keyevent.isCanceled() && b() > 1.0F)
        {
            a(1.0F);
            return true;
        } else
        {
            return super.onKeyUp(i1, keyevent);
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        i = k1 - i1;
        j = l1 - j1;
        Runnable runnable = e;
        if (runnable != null)
        {
            e = null;
            runnable.run();
        }
        if (h.b() != null)
        {
            a(h, f);
            setImageMatrix(c());
        }
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        a(bitmap, 0);
    }

}
