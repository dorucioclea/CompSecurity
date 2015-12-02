// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//            ViewDragHelper

public class SlidingPaneLayout extends ViewGroup
{

    private static final int DEFAULT_FADE_COLOR = 0xcccccccc;
    private static final int DEFAULT_OVERHANG_SIZE = 32;
    static final SlidingPanelLayoutImpl IMPL;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final String TAG = "SlidingPaneLayout";
    private boolean mCanSlide;
    private int mCoveredFadeColor;
    private final ViewDragHelper mDragHelper;
    private boolean mFirstLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private boolean mIsUnableToDrag;
    private final int mOverhangSize;
    private PanelSlideListener mPanelSlideListener;
    private int mParallaxBy;
    private float mParallaxOffset;
    private final ArrayList mPostedRunnables;
    private boolean mPreservedOpenState;
    private Drawable mShadowDrawableLeft;
    private Drawable mShadowDrawableRight;
    private float mSlideOffset;
    private int mSlideRange;
    private View mSlideableView;
    private int mSliderFadeColor;
    private final Rect mTmpRect;

    public SlidingPaneLayout(Context context)
    {
        this(context, null);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mSliderFadeColor = 0xcccccccc;
        mFirstLayout = true;
        mTmpRect = new Rect();
        mPostedRunnables = new ArrayList();
        float f = context.getResources().getDisplayMetrics().density;
        mOverhangSize = (int)(32F * f + 0.5F);
        ViewConfiguration.get(context);
        setWillNotDraw(false);
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegate());
        ViewCompat.setImportantForAccessibility(this, 1);
        mDragHelper = ViewDragHelper.create(this, 0.5F, new DragHelperCallback(null));
        mDragHelper.setMinVelocity(f * 400F);
    }

    private boolean closePane(View view, int i)
    {
        boolean flag = false;
        if (mFirstLayout || smoothSlideTo(0.0F, i))
        {
            mPreservedOpenState = false;
            flag = true;
        }
        return flag;
    }

    private void dimChildView(View view, float f, int i)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (f > 0.0F && i != 0)
        {
            int j = (int)((float)((0xff000000 & i) >>> 24) * f);
            if (layoutparams.dimPaint == null)
            {
                layoutparams.dimPaint = new Paint();
            }
            layoutparams.dimPaint.setColorFilter(new PorterDuffColorFilter(j << 24 | 0xffffff & i, android.graphics.PorterDuff.Mode.SRC_OVER));
            if (ViewCompat.getLayerType(view) != 2)
            {
                ViewCompat.setLayerType(view, 2, layoutparams.dimPaint);
            }
            invalidateChildRegion(view);
        } else
        if (ViewCompat.getLayerType(view) != 0)
        {
            if (layoutparams.dimPaint != null)
            {
                layoutparams.dimPaint.setColorFilter(null);
            }
            view = new DisableLayerRunnable(view);
            mPostedRunnables.add(view);
            ViewCompat.postOnAnimation(this, view);
            return;
        }
    }

    private void invalidateChildRegion(View view)
    {
        IMPL.invalidateChildRegion(this, view);
    }

    private boolean isLayoutRtlSupport()
    {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    private void onPanelDragged(int i)
    {
        if (mSlideableView == null)
        {
            mSlideOffset = 0.0F;
            return;
        }
        boolean flag = isLayoutRtlSupport();
        LayoutParams layoutparams = (LayoutParams)mSlideableView.getLayoutParams();
        int k = mSlideableView.getWidth();
        int j = i;
        if (flag)
        {
            j = getWidth() - i - k;
        }
        if (flag)
        {
            i = getPaddingRight();
        } else
        {
            i = getPaddingLeft();
        }
        if (flag)
        {
            k = layoutparams.rightMargin;
        } else
        {
            k = layoutparams.leftMargin;
        }
        mSlideOffset = (float)(j - (k + i)) / (float)mSlideRange;
        if (mParallaxBy != 0)
        {
            parallaxOtherViews(mSlideOffset);
        }
        if (layoutparams.dimWhenOffset)
        {
            dimChildView(mSlideableView, mSlideOffset, mSliderFadeColor);
        }
        dispatchOnPanelSlide(mSlideableView);
    }

    private boolean openPane(View view, int i)
    {
        if (mFirstLayout || smoothSlideTo(1.0F, i))
        {
            mPreservedOpenState = true;
            return true;
        } else
        {
            return false;
        }
    }

    private void parallaxOtherViews(float f)
    {
        int i;
        boolean flag = isLayoutRtlSupport();
        Object obj = (LayoutParams)mSlideableView.getLayoutParams();
        if (!((LayoutParams) (obj)).dimWhenOffset)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        int j;
        int k;
        int l;
        int i1;
        if (flag)
        {
            i = ((LayoutParams) (obj)).rightMargin;
        } else
        {
            i = ((LayoutParams) (obj)).leftMargin;
        }
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        i = 1;
_L1:
        i1 = getChildCount();
        j = 0;
        while (j < i1) 
        {
            obj = getChildAt(j);
            if (obj != mSlideableView)
            {
                k = (int)((1.0F - mParallaxOffset) * (float)mParallaxBy);
                mParallaxOffset = f;
                l = k - (int)((1.0F - f) * (float)mParallaxBy);
                k = l;
                if (flag)
                {
                    k = -l;
                }
                ((View) (obj)).offsetLeftAndRight(k);
                if (i != 0)
                {
                    float f1;
                    if (flag)
                    {
                        f1 = mParallaxOffset - 1.0F;
                    } else
                    {
                        f1 = 1.0F - mParallaxOffset;
                    }
                    dimChildView(((View) (obj)), f1, mCoveredFadeColor);
                }
            }
            j++;
        }
        break MISSING_BLOCK_LABEL_190;
        i = 0;
          goto _L1
    }

    private static boolean viewIsOpaque(View view)
    {
        if (!ViewCompat.isOpaque(view))
        {
            if (android.os.Build.VERSION.SDK_INT >= 18)
            {
                return false;
            }
            view = view.getBackground();
            if (view != null)
            {
                if (view.getOpacity() != -1)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    protected boolean canScroll(View view, boolean flag, int i, int j, int k)
    {
        if (!(view instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        ViewGroup viewgroup;
        int l;
        int i1;
        int j1;
        viewgroup = (ViewGroup)view;
        i1 = view.getScrollX();
        j1 = view.getScrollY();
        l = viewgroup.getChildCount() - 1;
_L8:
        if (l < 0) goto _L2; else goto _L3
_L3:
        View view1 = viewgroup.getChildAt(l);
        if (j + i1 < view1.getLeft() || j + i1 >= view1.getRight() || k + j1 < view1.getTop() || k + j1 >= view1.getBottom() || !canScroll(view1, true, i, (j + i1) - view1.getLeft(), (k + j1) - view1.getTop())) goto _L5; else goto _L4
_L4:
        return true;
_L5:
        l--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!isLayoutRtlSupport())
        {
            i = -i;
        }
        if (ViewCompat.canScrollHorizontally(view, i)) goto _L4; else goto _L6
_L6:
        return false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean canSlide()
    {
        return mCanSlide;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public boolean closePane()
    {
        return closePane(mSlideableView, 0);
    }

    public void computeScroll()
    {
label0:
        {
            if (mDragHelper.continueSettling(true))
            {
                if (mCanSlide)
                {
                    break label0;
                }
                mDragHelper.abort();
            }
            return;
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    void dispatchOnPanelClosed(View view)
    {
        if (mPanelSlideListener != null)
        {
            mPanelSlideListener.onPanelClosed(view);
        }
        sendAccessibilityEvent(32);
    }

    void dispatchOnPanelOpened(View view)
    {
        if (mPanelSlideListener != null)
        {
            mPanelSlideListener.onPanelOpened(view);
        }
        sendAccessibilityEvent(32);
    }

    void dispatchOnPanelSlide(View view)
    {
        if (mPanelSlideListener != null)
        {
            mPanelSlideListener.onPanelSlide(view, mSlideOffset);
        }
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        Drawable drawable;
        View view;
        if (isLayoutRtlSupport())
        {
            drawable = mShadowDrawableRight;
        } else
        {
            drawable = mShadowDrawableLeft;
        }
        if (getChildCount() > 1)
        {
            view = getChildAt(1);
        } else
        {
            view = null;
        }
        if (view == null || drawable == null)
        {
            return;
        }
        int k = view.getTop();
        int l = view.getBottom();
        int i1 = drawable.getIntrinsicWidth();
        int i;
        int j;
        if (isLayoutRtlSupport())
        {
            j = view.getRight();
            i = j + i1;
        } else
        {
            i = view.getLeft();
            j = i - i1;
        }
        drawable.setBounds(j, k, i, l);
        drawable.draw(canvas);
    }

    protected boolean drawChild(Canvas canvas, View view, long l)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int i = canvas.save(2);
        boolean flag;
        if (mCanSlide && !layoutparams.slideable && mSlideableView != null)
        {
            canvas.getClipBounds(mTmpRect);
            if (isLayoutRtlSupport())
            {
                mTmpRect.left = Math.max(mTmpRect.left, mSlideableView.getRight());
            } else
            {
                mTmpRect.right = Math.min(mTmpRect.right, mSlideableView.getLeft());
            }
            canvas.clipRect(mTmpRect);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = super.drawChild(canvas, view, l);
        } else
        if (layoutparams.dimWhenOffset && mSlideOffset > 0.0F)
        {
            if (!view.isDrawingCacheEnabled())
            {
                view.setDrawingCacheEnabled(true);
            }
            android.graphics.Bitmap bitmap = view.getDrawingCache();
            if (bitmap != null)
            {
                canvas.drawBitmap(bitmap, view.getLeft(), view.getTop(), layoutparams.dimPaint);
                flag = false;
            } else
            {
                Log.e("SlidingPaneLayout", (new StringBuilder("drawChild: child view ")).append(view).append(" returned null drawing cache").toString());
                flag = super.drawChild(canvas, view, l);
            }
        } else
        {
            if (view.isDrawingCacheEnabled())
            {
                view.setDrawingCacheEnabled(false);
            }
            flag = super.drawChild(canvas, view, l);
        }
        canvas.restoreToCount(i);
        return flag;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    public int getCoveredFadeColor()
    {
        return mCoveredFadeColor;
    }

    public int getParallaxDistance()
    {
        return mParallaxBy;
    }

    public int getSliderFadeColor()
    {
        return mSliderFadeColor;
    }

    boolean isDimmed(View view)
    {
        if (view == null)
        {
            return false;
        }
        view = (LayoutParams)view.getLayoutParams();
        return mCanSlide && ((LayoutParams) (view)).dimWhenOffset && mSlideOffset > 0.0F;
    }

    public boolean isOpen()
    {
        return !mCanSlide || mSlideOffset == 1.0F;
    }

    public boolean isSlideable()
    {
        return mCanSlide;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        mFirstLayout = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        mFirstLayout = true;
        int j = mPostedRunnables.size();
        for (int i = 0; i < j; i++)
        {
            ((DisableLayerRunnable)mPostedRunnables.get(i)).run();
        }

        mPostedRunnables.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i;
        boolean flag;
        boolean flag1;
        flag1 = false;
        i = MotionEventCompat.getActionMasked(motionevent);
        if (!mCanSlide && i == 0 && getChildCount() > 1)
        {
            View view = getChildAt(1);
            if (view != null)
            {
                if (!mDragHelper.isViewUnder(view, (int)motionevent.getX(), (int)motionevent.getY()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                mPreservedOpenState = flag;
            }
        }
        if (mCanSlide && (!mIsUnableToDrag || i == 0)) goto _L2; else goto _L1
_L1:
        mDragHelper.cancel();
        flag = super.onInterceptTouchEvent(motionevent);
_L7:
        return flag;
_L2:
        if (i == 3 || i == 1)
        {
            mDragHelper.cancel();
            return false;
        }
        i;
        JVM INSTR tableswitch 0 2: default 164
    //                   0 189
    //                   1 164
    //                   2 249;
           goto _L3 _L4 _L3 _L5
_L3:
        i = 0;
_L9:
        if (mDragHelper.shouldInterceptTouchEvent(motionevent))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!i) goto _L7; else goto _L6
_L6:
        return true;
_L4:
        float f;
        float f2;
        mIsUnableToDrag = false;
        f = motionevent.getX();
        f2 = motionevent.getY();
        mInitialMotionX = f;
        mInitialMotionY = f2;
        if (!mDragHelper.isViewUnder(mSlideableView, (int)f, (int)f2) || !isDimmed(mSlideableView)) goto _L3; else goto _L8
_L8:
        i = 1;
          goto _L9
_L5:
        float f3 = motionevent.getX();
        float f1 = motionevent.getY();
        f3 = Math.abs(f3 - mInitialMotionX);
        f1 = Math.abs(f1 - mInitialMotionY);
        if (f3 > (float)mDragHelper.getTouchSlop() && f1 > f3)
        {
            mDragHelper.cancel();
            mIsUnableToDrag = true;
            return false;
        }
          goto _L3
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        boolean flag1 = isLayoutRtlSupport();
        int l1;
        int i2;
        int j2;
        if (flag1)
        {
            mDragHelper.setEdgeTrackingEnabled(2);
        } else
        {
            mDragHelper.setEdgeTrackingEnabled(1);
        }
        l1 = k - i;
        if (flag1)
        {
            i = getPaddingRight();
        } else
        {
            i = getPaddingLeft();
        }
        if (flag1)
        {
            l = getPaddingLeft();
        } else
        {
            l = getPaddingRight();
        }
        j2 = getPaddingTop();
        i2 = getChildCount();
        if (mFirstLayout)
        {
            float f;
            View view;
            int i1;
            int j1;
            if (mCanSlide && mPreservedOpenState)
            {
                f = 1.0F;
            } else
            {
                f = 0.0F;
            }
            mSlideOffset = f;
        }
        i1 = 0;
        j = i;
        while (i1 < i2) 
        {
            view = getChildAt(i1);
            if (view.getVisibility() != 8)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                int k2 = view.getMeasuredWidth();
                int k1;
                if (layoutparams.slideable)
                {
                    k = layoutparams.leftMargin;
                    j1 = layoutparams.rightMargin;
                    j1 = Math.min(i, l1 - l - mOverhangSize) - j - (k + j1);
                    mSlideRange = j1;
                    if (flag1)
                    {
                        k = layoutparams.rightMargin;
                    } else
                    {
                        k = layoutparams.leftMargin;
                    }
                    if (j + k + j1 + k2 / 2 > l1 - l)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    layoutparams.dimWhenOffset = flag;
                    j1 = (int)((float)j1 * mSlideOffset);
                    j += k + j1;
                    mSlideOffset = (float)j1 / (float)mSlideRange;
                    k = 0;
                } else
                if (mCanSlide && mParallaxBy != 0)
                {
                    k = (int)((1.0F - mSlideOffset) * (float)mParallaxBy);
                    j = i;
                } else
                {
                    k = 0;
                    j = i;
                }
                if (flag1)
                {
                    k1 = (l1 - j) + k;
                    k = k1 - k2;
                } else
                {
                    k = j - k;
                    k1 = k + k2;
                }
                view.layout(k, j2, k1, view.getMeasuredHeight() + j2);
                k = view.getWidth() + i;
                i = j;
                j = k;
            } else
            {
                k = j;
                j = i;
                i = k;
            }
            i1++;
            k = i;
            i = j;
            j = k;
        }
        if (mFirstLayout)
        {
            if (mCanSlide)
            {
                if (mParallaxBy != 0)
                {
                    parallaxOtherViews(mSlideOffset);
                }
                if (((LayoutParams)mSlideableView.getLayoutParams()).dimWhenOffset)
                {
                    dimChildView(mSlideableView, mSlideOffset, mSliderFadeColor);
                }
            } else
            {
                i = 0;
                while (i < i2) 
                {
                    dimChildView(getChildAt(i), 0.0F, mSliderFadeColor);
                    i++;
                }
            }
            updateObscuredViewsVisibility(mSlideableView);
        }
        mFirstLayout = false;
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        int i1;
        i1 = android.view.View.MeasureSpec.getMode(i);
        k = android.view.View.MeasureSpec.getSize(i);
        l = android.view.View.MeasureSpec.getMode(j);
        i = android.view.View.MeasureSpec.getSize(j);
        if (i1 == 0x40000000) goto _L2; else goto _L1
_L1:
        if (!isInEditMode()) goto _L4; else goto _L3
_L3:
        if (i1 == 0x80000000 || i1 != 0) goto _L6; else goto _L5
_L5:
        k = l;
        l = 300;
_L21:
        k;
        JVM INSTR lookupswitch 2: default 88
    //                   -2147483648: 285
    //                   1073741824: 267;
           goto _L7 _L8 _L9
_L7:
        i = 0;
        i1 = -1;
_L15:
        float f;
        int j3;
        int l3;
        int i4;
        boolean flag;
        flag = false;
        l3 = l - getPaddingLeft() - getPaddingRight();
        i4 = getChildCount();
        if (i4 > 2)
        {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        mSlideableView = null;
        j3 = 0;
        j = l3;
        f = 0.0F;
_L14:
        if (j3 >= i4) goto _L11; else goto _L10
_L10:
        View view;
        LayoutParams layoutparams;
        view = getChildAt(j3);
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (view.getVisibility() != 8) goto _L13; else goto _L12
_L12:
        layoutparams.dimWhenOffset = false;
        int j1 = j;
        j = i;
        i = j1;
_L19:
        j3++;
        int k1 = j;
        j = i;
        i = k1;
          goto _L14
_L4:
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
_L2:
        if (l == 0)
        {
            if (isInEditMode())
            {
                if (l == 0)
                {
                    j = 0x80000000;
                    l = k;
                    i = 300;
                    k = j;
                    continue; /* Loop/switch isn't completed */
                }
            } else
            {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
        }
          goto _L6
_L9:
        i = i - getPaddingTop() - getPaddingBottom();
        i1 = i;
          goto _L15
_L8:
        i1 = getPaddingTop();
        int l1 = getPaddingBottom();
        j = 0;
        i1 = i - i1 - l1;
        i = j;
          goto _L15
_L13:
        float f1 = f;
        if (layoutparams.weight <= 0.0F) goto _L17; else goto _L16
_L16:
        f1 = f + layoutparams.weight;
        if (layoutparams.width == 0) goto _L18; else goto _L17
_L17:
        int i2 = layoutparams.leftMargin + layoutparams.rightMargin;
        int l2;
        int j4;
        boolean flag1;
        if (layoutparams.width == -2)
        {
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(l3 - i2, 0x80000000);
        } else
        if (layoutparams.width == -1)
        {
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(l3 - i2, 0x40000000);
        } else
        {
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.width, 0x40000000);
        }
        if (layoutparams.height == -2)
        {
            l2 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000);
        } else
        if (layoutparams.height == -1)
        {
            l2 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
        } else
        {
            l2 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
        }
        view.measure(i2, l2);
        l2 = view.getMeasuredWidth();
        j4 = view.getMeasuredHeight();
        i2 = i;
        if (k == 0x80000000)
        {
            i2 = i;
            if (j4 > i)
            {
                i2 = Math.min(j4, i1);
            }
        }
        i = j - l2;
        if (i < 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        layoutparams.slideable = flag1;
        if (layoutparams.slideable)
        {
            mSlideableView = view;
        }
        f = f1;
        flag = flag1 | flag;
        j = i2;
          goto _L19
_L11:
        if (flag || f > 0.0F)
        {
            int k3 = l3 - mOverhangSize;
            int j2 = 0;
            while (j2 < i4) 
            {
                View view1 = getChildAt(j2);
                if (view1.getVisibility() == 8)
                {
                    continue;
                }
                LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
                if (view1.getVisibility() != 8)
                {
                    int i3;
                    if (layoutparams1.width == 0 && layoutparams1.weight > 0.0F)
                    {
                        k = 1;
                    } else
                    {
                        k = 0;
                    }
                    if (k != 0)
                    {
                        i3 = 0;
                    } else
                    {
                        i3 = view1.getMeasuredWidth();
                    }
                    if (flag && view1 != mSlideableView)
                    {
                        if (layoutparams1.width < 0 && (i3 > k3 || layoutparams1.weight > 0.0F))
                        {
                            if (k != 0)
                            {
                                if (layoutparams1.height == -2)
                                {
                                    k = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000);
                                } else
                                if (layoutparams1.height == -1)
                                {
                                    k = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
                                } else
                                {
                                    k = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams1.height, 0x40000000);
                                }
                            } else
                            {
                                k = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
                            }
                            view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(k3, 0x40000000), k);
                        }
                    } else
                    if (layoutparams1.weight > 0.0F)
                    {
                        if (layoutparams1.width == 0)
                        {
                            if (layoutparams1.height == -2)
                            {
                                k = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000);
                            } else
                            if (layoutparams1.height == -1)
                            {
                                k = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
                            } else
                            {
                                k = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams1.height, 0x40000000);
                            }
                        } else
                        {
                            k = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
                        }
                        if (flag)
                        {
                            int k4 = layoutparams1.leftMargin;
                            k4 = l3 - (layoutparams1.rightMargin + k4);
                            int i5 = android.view.View.MeasureSpec.makeMeasureSpec(k4, 0x40000000);
                            if (i3 != k4)
                            {
                                view1.measure(i5, k);
                            }
                        } else
                        {
                            int l4 = Math.max(0, j);
                            view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)((layoutparams1.weight * (float)l4) / f) + i3, 0x40000000), k);
                        }
                    }
                }
                j2++;
            }
        }
        setMeasuredDimension(l, getPaddingTop() + i + getPaddingBottom());
        mCanSlide = flag;
        if (mDragHelper.getViewDragState() != 0 && !flag)
        {
            mDragHelper.abort();
        }
        return;
_L18:
        int k2 = i;
        f = f1;
        i = j;
        j = k2;
          goto _L19
_L6:
        j = l;
        l = k;
        k = j;
        if (true) goto _L21; else goto _L20
_L20:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).isOpen)
        {
            openPane();
        } else
        {
            closePane();
        }
        mPreservedOpenState = ((SavedState) (parcelable)).isOpen;
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        boolean flag;
        if (isSlideable())
        {
            flag = isOpen();
        } else
        {
            flag = mPreservedOpenState;
        }
        savedstate.isOpen = flag;
        return savedstate;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (i != k)
        {
            mFirstLayout = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!mCanSlide)
        {
            return super.onTouchEvent(motionevent);
        }
        mDragHelper.processTouchEvent(motionevent);
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 1: default 52
    //                   0 54
    //                   1 77;
           goto _L1 _L2 _L3
_L1:
        return true;
_L2:
        float f = motionevent.getX();
        float f2 = motionevent.getY();
        mInitialMotionX = f;
        mInitialMotionY = f2;
        continue; /* Loop/switch isn't completed */
_L3:
        if (isDimmed(mSlideableView))
        {
            float f1 = motionevent.getX();
            float f3 = motionevent.getY();
            float f4 = f1 - mInitialMotionX;
            float f5 = f3 - mInitialMotionY;
            int i = mDragHelper.getTouchSlop();
            if (f4 * f4 + f5 * f5 < (float)(i * i) && mDragHelper.isViewUnder(mSlideableView, (int)f1, (int)f3))
            {
                closePane(mSlideableView, 0);
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public boolean openPane()
    {
        return openPane(mSlideableView, 0);
    }

    public void requestChildFocus(View view, View view1)
    {
        super.requestChildFocus(view, view1);
        if (!isInTouchMode() && !mCanSlide)
        {
            boolean flag;
            if (view == mSlideableView)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mPreservedOpenState = flag;
        }
    }

    void setAllChildrenVisible()
    {
        int j = getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view = getChildAt(i);
            if (view.getVisibility() == 4)
            {
                view.setVisibility(0);
            }
        }

    }

    public void setCoveredFadeColor(int i)
    {
        mCoveredFadeColor = i;
    }

    public void setPanelSlideListener(PanelSlideListener panelslidelistener)
    {
        mPanelSlideListener = panelslidelistener;
    }

    public void setParallaxDistance(int i)
    {
        mParallaxBy = i;
        requestLayout();
    }

    public void setShadowDrawable(Drawable drawable)
    {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable)
    {
        mShadowDrawableLeft = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable)
    {
        mShadowDrawableRight = drawable;
    }

    public void setShadowResource(int i)
    {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i)
    {
        setShadowDrawableLeft(getResources().getDrawable(i));
    }

    public void setShadowResourceRight(int i)
    {
        setShadowDrawableRight(getResources().getDrawable(i));
    }

    public void setSliderFadeColor(int i)
    {
        mSliderFadeColor = i;
    }

    public void smoothSlideClosed()
    {
        closePane();
    }

    public void smoothSlideOpen()
    {
        openPane();
    }

    boolean smoothSlideTo(float f, int i)
    {
        if (!mCanSlide)
        {
            return false;
        }
        boolean flag = isLayoutRtlSupport();
        LayoutParams layoutparams = (LayoutParams)mSlideableView.getLayoutParams();
        if (flag)
        {
            i = getPaddingRight();
            int j = layoutparams.rightMargin;
            int k = mSlideableView.getWidth();
            i = (int)((float)getWidth() - ((float)(j + i) + (float)mSlideRange * f + (float)k));
        } else
        {
            i = getPaddingLeft();
            i = (int)((float)(layoutparams.leftMargin + i) + (float)mSlideRange * f);
        }
        if (mDragHelper.smoothSlideViewTo(mSlideableView, i, mSlideableView.getTop()))
        {
            setAllChildrenVisible();
            ViewCompat.postInvalidateOnAnimation(this);
            return true;
        } else
        {
            return false;
        }
    }

    void updateObscuredViewsVisibility(View view)
    {
        boolean flag = isLayoutRtlSupport();
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int i2;
        int j2;
        int k2;
        int l2;
        if (flag)
        {
            i = getWidth() - getPaddingRight();
        } else
        {
            i = getPaddingLeft();
        }
        if (flag)
        {
            j = getPaddingLeft();
        } else
        {
            j = getWidth() - getPaddingRight();
        }
        i2 = getPaddingTop();
        j2 = getHeight();
        k2 = getPaddingBottom();
        if (view != null && viewIsOpaque(view))
        {
            j1 = view.getLeft();
            i1 = view.getRight();
            l = view.getTop();
            k = view.getBottom();
        } else
        {
            k = 0;
            l = 0;
            i1 = 0;
            j1 = 0;
        }
        l2 = getChildCount();
        k1 = 0;
        do
        {
            if (k1 >= l2)
            {
                break;
            }
            View view1 = getChildAt(k1);
            if (view1 == view)
            {
                break;
            }
            int l1;
            int i3;
            int j3;
            int k3;
            if (flag)
            {
                l1 = j;
            } else
            {
                l1 = i;
            }
            i3 = Math.max(l1, view1.getLeft());
            j3 = Math.max(i2, view1.getTop());
            if (flag)
            {
                l1 = i;
            } else
            {
                l1 = j;
            }
            l1 = Math.min(l1, view1.getRight());
            k3 = Math.min(j2 - k2, view1.getBottom());
            if (i3 >= j1 && j3 >= l && l1 <= i1 && k3 <= k)
            {
                l1 = 4;
            } else
            {
                l1 = 0;
            }
            view1.setVisibility(l1);
            k1++;
        } while (true);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 17)
        {
            IMPL = new SlidingPanelLayoutImplJBMR1();
        } else
        if (i >= 16)
        {
            IMPL = new SlidingPanelLayoutImplJB();
        } else
        {
            IMPL = new SlidingPanelLayoutImplBase();
        }
    }








/*
    static boolean access$502(SlidingPaneLayout slidingpanelayout, boolean flag)
    {
        slidingpanelayout.mPreservedOpenState = flag;
        return flag;
    }

*/




    /* member class not found */
    class AccessibilityDelegate {}


    /* member class not found */
    class DragHelperCallback {}


    /* member class not found */
    class LayoutParams {}


    /* member class not found */
    class DisableLayerRunnable {}


    /* member class not found */
    class SlidingPanelLayoutImpl {}


    /* member class not found */
    class PanelSlideListener {}


    /* member class not found */
    class SavedState {}


    /* member class not found */
    class SlidingPanelLayoutImplJBMR1 {}


    /* member class not found */
    class SlidingPanelLayoutImplJB {}


    /* member class not found */
    class SlidingPanelLayoutImplBase {}

}
