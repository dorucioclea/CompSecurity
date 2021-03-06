// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v7.internal.view.ActionBarPolicy;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

// Referenced classes of package android.support.v7.internal.widget:
//            SpinnerCompat, AdapterViewCompat, TintTypedArray, CompatTextView

public class ScrollingTabContainerView extends HorizontalScrollView
    implements AdapterViewCompat.OnItemClickListener
{
    final class TabAdapter extends BaseAdapter
    {

        final ScrollingTabContainerView this$0;

        public final int getCount()
        {
            return mTabLayout.getChildCount();
        }

        public final Object getItem(int i)
        {
            return ((TabView)mTabLayout.getChildAt(i)).getTab();
        }

        public final long getItemId(int i)
        {
            return (long)i;
        }

        public final View getView(int i, View view, ViewGroup viewgroup)
        {
            if (view == null)
            {
                return createTabView((android.support.v7.app.ActionBar.Tab)getItem(i), true);
            } else
            {
                ((TabView)view).bindTab((android.support.v7.app.ActionBar.Tab)getItem(i));
                return view;
            }
        }

        private TabAdapter()
        {
            this$0 = ScrollingTabContainerView.this;
            super();
        }

    }

    final class TabClickListener
        implements android.view.View.OnClickListener
    {

        final ScrollingTabContainerView this$0;

        public final void onClick(View view)
        {
            ((TabView)view).getTab();
            int j = mTabLayout.getChildCount();
            int i = 0;
            while (i < j) 
            {
                View view1 = mTabLayout.getChildAt(i);
                boolean flag;
                if (view1 == view)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view1.setSelected(flag);
                i++;
            }
        }

        private TabClickListener()
        {
            this$0 = ScrollingTabContainerView.this;
            super();
        }

    }

    final class TabView extends LinearLayoutCompat
        implements android.view.View.OnLongClickListener
    {

        private final int BG_ATTRS[] = {
            0x10100d4
        };
        private View mCustomView;
        private ImageView mIconView;
        private android.support.v7.app.ActionBar.Tab mTab;
        private TextView mTextView;
        final ScrollingTabContainerView this$0;

        private void update()
        {
            Object obj = mTab;
            Object obj1 = ((android.support.v7.app.ActionBar.Tab) (obj)).getCustomView();
            if (obj1 != null)
            {
                obj = ((View) (obj1)).getParent();
                if (obj != this)
                {
                    if (obj != null)
                    {
                        ((ViewGroup)obj).removeView(((View) (obj1)));
                    }
                    addView(((View) (obj1)));
                }
                mCustomView = ((View) (obj1));
                if (mTextView != null)
                {
                    mTextView.setVisibility(8);
                }
                if (mIconView != null)
                {
                    mIconView.setVisibility(8);
                    mIconView.setImageDrawable(null);
                }
                return;
            }
            if (mCustomView != null)
            {
                removeView(mCustomView);
                mCustomView = null;
            }
            android.graphics.drawable.Drawable drawable = ((android.support.v7.app.ActionBar.Tab) (obj)).getIcon();
            obj1 = ((android.support.v7.app.ActionBar.Tab) (obj)).getText();
            boolean flag;
            if (drawable != null)
            {
                if (mIconView == null)
                {
                    ImageView imageview = new ImageView(getContext());
                    android.support.v7.widget.LinearLayoutCompat.LayoutParams layoutparams1 = new android.support.v7.widget.LinearLayoutCompat.LayoutParams(-2, -2);
                    layoutparams1.gravity = 16;
                    imageview.setLayoutParams(layoutparams1);
                    addView(imageview, 0);
                    mIconView = imageview;
                }
                mIconView.setImageDrawable(drawable);
                mIconView.setVisibility(0);
            } else
            if (mIconView != null)
            {
                mIconView.setVisibility(8);
                mIconView.setImageDrawable(null);
            }
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                if (mTextView == null)
                {
                    CompatTextView compattextview = new CompatTextView(getContext(), null, android.support.v7.appcompat.R.attr.actionBarTabTextStyle);
                    compattextview.setEllipsize(android.text.TextUtils.TruncateAt.END);
                    android.support.v7.widget.LinearLayoutCompat.LayoutParams layoutparams = new android.support.v7.widget.LinearLayoutCompat.LayoutParams(-2, -2);
                    layoutparams.gravity = 16;
                    compattextview.setLayoutParams(layoutparams);
                    addView(compattextview);
                    mTextView = compattextview;
                }
                mTextView.setText(((CharSequence) (obj1)));
                mTextView.setVisibility(0);
            } else
            if (mTextView != null)
            {
                mTextView.setVisibility(8);
                mTextView.setText(null);
            }
            if (mIconView != null)
            {
                mIconView.setContentDescription(((android.support.v7.app.ActionBar.Tab) (obj)).getContentDescription());
            }
            if (!flag && !TextUtils.isEmpty(((android.support.v7.app.ActionBar.Tab) (obj)).getContentDescription()))
            {
                setOnLongClickListener(this);
                return;
            } else
            {
                setOnLongClickListener(null);
                setLongClickable(false);
                return;
            }
        }

        public final void bindTab(android.support.v7.app.ActionBar.Tab tab)
        {
            mTab = tab;
            update();
        }

        public final android.support.v7.app.ActionBar.Tab getTab()
        {
            return mTab;
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
        {
            super.onInitializeAccessibilityEvent(accessibilityevent);
            accessibilityevent.setClassName(android/support/v7/app/ActionBar$Tab.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
        {
            super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                accessibilitynodeinfo.setClassName(android/support/v7/app/ActionBar$Tab.getName());
            }
        }

        public final boolean onLongClick(View view)
        {
            view = new int[2];
            getLocationOnScreen(view);
            Object obj = getContext();
            int i = getWidth();
            int j = getHeight();
            int k = ((Context) (obj)).getResources().getDisplayMetrics().widthPixels;
            obj = Toast.makeText(((Context) (obj)), mTab.getContentDescription(), 0);
            ((Toast) (obj)).setGravity(49, (view[0] + i / 2) - k / 2, j);
            ((Toast) (obj)).show();
            return true;
        }

        public final void onMeasure(int i, int j)
        {
            super.onMeasure(i, j);
            if (mMaxTabWidth > 0 && getMeasuredWidth() > mMaxTabWidth)
            {
                super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(mMaxTabWidth, 0x40000000), j);
            }
        }

        public final void setSelected(boolean flag)
        {
            boolean flag1;
            if (isSelected() != flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            super.setSelected(flag);
            if (flag1 && flag)
            {
                sendAccessibilityEvent(4);
            }
        }

        public TabView(Context context, android.support.v7.app.ActionBar.Tab tab, boolean flag)
        {
            this$0 = ScrollingTabContainerView.this;
            super(context, null, android.support.v7.appcompat.R.attr.actionBarTabStyle);
            mTab = tab;
            scrollingtabcontainerview = TintTypedArray.obtainStyledAttributes(context, null, BG_ATTRS, android.support.v7.appcompat.R.attr.actionBarTabStyle, 0);
            if (hasValue(0))
            {
                setBackgroundDrawable(getDrawable(0));
            }
            recycle();
            if (flag)
            {
                setGravity(0x800013);
            }
            update();
        }
    }

    public final class VisibilityAnimListener
        implements ViewPropertyAnimatorListener
    {

        private boolean mCanceled;
        private int mFinalVisibility;
        final ScrollingTabContainerView this$0;

        public final void onAnimationCancel(View view)
        {
            mCanceled = true;
        }

        public final void onAnimationEnd(View view)
        {
            if (mCanceled)
            {
                return;
            } else
            {
                mVisibilityAnim = null;
                setVisibility(mFinalVisibility);
                return;
            }
        }

        public final void onAnimationStart(View view)
        {
            setVisibility(0);
            mCanceled = false;
        }

        protected VisibilityAnimListener()
        {
            this$0 = ScrollingTabContainerView.this;
            super();
            mCanceled = false;
        }
    }


    private static final Interpolator sAlphaInterpolator = new DecelerateInterpolator();
    private boolean mAllowCollapse;
    private int mContentHeight;
    int mMaxTabWidth;
    private int mSelectedTabIndex;
    int mStackedTabMaxWidth;
    private TabClickListener mTabClickListener;
    private LinearLayoutCompat mTabLayout;
    Runnable mTabSelector;
    private SpinnerCompat mTabSpinner;
    protected final VisibilityAnimListener mVisAnimListener = new VisibilityAnimListener();
    protected ViewPropertyAnimatorCompat mVisibilityAnim;

    public ScrollingTabContainerView(Context context)
    {
        super(context);
        setHorizontalScrollBarEnabled(false);
        context = ActionBarPolicy.get(context);
        setContentHeight(context.getTabContainerHeight());
        mStackedTabMaxWidth = context.getStackedTabMaxWidth();
        mTabLayout = createTabLayout();
        addView(mTabLayout, new android.view.ViewGroup.LayoutParams(-2, -1));
    }

    private void animateToTab(int i)
    {
        final View tabView = mTabLayout.getChildAt(i);
        if (mTabSelector != null)
        {
            removeCallbacks(mTabSelector);
        }
        mTabSelector = new Runnable() {

            final ScrollingTabContainerView this$0;
            final View val$tabView;

            public final void run()
            {
                int j = tabView.getLeft();
                int k = (getWidth() - tabView.getWidth()) / 2;
                smoothScrollTo(j - k, 0);
                mTabSelector = null;
            }

            
            {
                this$0 = ScrollingTabContainerView.this;
                tabView = view;
                super();
            }
        };
        post(mTabSelector);
    }

    private SpinnerCompat createSpinner()
    {
        SpinnerCompat spinnercompat = new SpinnerCompat(getContext(), null, android.support.v7.appcompat.R.attr.actionDropDownStyle);
        spinnercompat.setLayoutParams(new android.support.v7.widget.LinearLayoutCompat.LayoutParams(-2, -1));
        spinnercompat.setOnItemClickListenerInt(this);
        return spinnercompat;
    }

    private LinearLayoutCompat createTabLayout()
    {
        LinearLayoutCompat linearlayoutcompat = new LinearLayoutCompat(getContext(), null, android.support.v7.appcompat.R.attr.actionBarTabBarStyle);
        linearlayoutcompat.setMeasureWithLargestChildEnabled(true);
        linearlayoutcompat.setGravity(17);
        linearlayoutcompat.setLayoutParams(new android.support.v7.widget.LinearLayoutCompat.LayoutParams(-2, -1));
        return linearlayoutcompat;
    }

    private TabView createTabView(android.support.v7.app.ActionBar.Tab tab, boolean flag)
    {
        tab = new TabView(getContext(), tab, flag);
        if (flag)
        {
            tab.setBackgroundDrawable(null);
            tab.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, mContentHeight));
            return tab;
        }
        tab.setFocusable(true);
        if (mTabClickListener == null)
        {
            mTabClickListener = new TabClickListener();
        }
        tab.setOnClickListener(mTabClickListener);
        return tab;
    }

    private boolean isCollapsed()
    {
        return mTabSpinner != null && mTabSpinner.getParent() == this;
    }

    private void performCollapse()
    {
        if (isCollapsed())
        {
            return;
        }
        if (mTabSpinner == null)
        {
            mTabSpinner = createSpinner();
        }
        removeView(mTabLayout);
        addView(mTabSpinner, new android.view.ViewGroup.LayoutParams(-2, -1));
        if (mTabSpinner.getAdapter() == null)
        {
            mTabSpinner.setAdapter(new TabAdapter());
        }
        if (mTabSelector != null)
        {
            removeCallbacks(mTabSelector);
            mTabSelector = null;
        }
        mTabSpinner.setSelection(mSelectedTabIndex);
    }

    private boolean performExpand()
    {
        if (!isCollapsed())
        {
            return false;
        } else
        {
            removeView(mTabSpinner);
            addView(mTabLayout, new android.view.ViewGroup.LayoutParams(-2, -1));
            setTabSelected(mTabSpinner.getSelectedItemPosition());
            return false;
        }
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (mTabSelector != null)
        {
            post(mTabSelector);
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        configuration = ActionBarPolicy.get(getContext());
        setContentHeight(configuration.getTabContainerHeight());
        mStackedTabMaxWidth = configuration.getStackedTabMaxWidth();
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (mTabSelector != null)
        {
            removeCallbacks(mTabSelector);
        }
    }

    public final void onItemClick(AdapterViewCompat adapterviewcompat, View view, int i, long l)
    {
        ((TabView)view).getTab();
    }

    public void onMeasure(int i, int j)
    {
        j = android.view.View.MeasureSpec.getMode(i);
        int k;
        boolean flag;
        if (j == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setFillViewport(flag);
        k = mTabLayout.getChildCount();
        if (k > 1 && (j == 0x40000000 || j == 0x80000000))
        {
            if (k > 2)
            {
                mMaxTabWidth = (int)((float)android.view.View.MeasureSpec.getSize(i) * 0.4F);
            } else
            {
                mMaxTabWidth = android.view.View.MeasureSpec.getSize(i) / 2;
            }
            mMaxTabWidth = Math.min(mMaxTabWidth, mStackedTabMaxWidth);
        } else
        {
            mMaxTabWidth = -1;
        }
        k = android.view.View.MeasureSpec.makeMeasureSpec(mContentHeight, 0x40000000);
        if (!flag && mAllowCollapse)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0)
        {
            mTabLayout.measure(0, k);
            if (mTabLayout.getMeasuredWidth() > android.view.View.MeasureSpec.getSize(i))
            {
                performCollapse();
            } else
            {
                performExpand();
            }
        } else
        {
            performExpand();
        }
        j = getMeasuredWidth();
        super.onMeasure(i, k);
        i = getMeasuredWidth();
        if (flag && j != i)
        {
            setTabSelected(mSelectedTabIndex);
        }
    }

    public void setAllowCollapse(boolean flag)
    {
        mAllowCollapse = flag;
    }

    public void setContentHeight(int i)
    {
        mContentHeight = i;
        requestLayout();
    }

    public void setTabSelected(int i)
    {
        mSelectedTabIndex = i;
        int k = mTabLayout.getChildCount();
        int j = 0;
        while (j < k) 
        {
            View view = mTabLayout.getChildAt(j);
            boolean flag;
            if (j == i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setSelected(flag);
            if (flag)
            {
                animateToTab(i);
            }
            j++;
        }
        if (mTabSpinner != null && i >= 0)
        {
            mTabSpinner.setSelection(i);
        }
    }



}
