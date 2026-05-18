package androidx.fragment.app;

import T1.A0;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class x extends FrameLayout {
    public final List a;
    public final List b;
    public View.OnApplyWindowInsetsListener c;
    public boolean d;

    public static final class a {
        public static final a a = new a();

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            kotlin.jvm.internal.t.g(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            kotlin.jvm.internal.t.g(view, "v");
            kotlin.jvm.internal.t.g(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            kotlin.jvm.internal.t.f(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, AttributeSet attributeSet, J j) {
        String str;
        super(context, attributeSet);
        kotlin.jvm.internal.t.g(context, "context");
        kotlin.jvm.internal.t.g(attributeSet, "attrs");
        kotlin.jvm.internal.t.g(j, "fm");
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = x2.c.e;
        kotlin.jvm.internal.t.f(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(x2.c.f) : classAttribute;
        String string = obtainStyledAttributes.getString(x2.c.g);
        obtainStyledAttributes.recycle();
        int id = getId();
        p m0 = j.m0(id);
        if (classAttribute != null && m0 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            p a2 = j.y0().a(context.getClassLoader(), classAttribute);
            kotlin.jvm.internal.t.f(a2, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a2.mFragmentId = id;
            a2.mContainerId = id;
            a2.mTag = string;
            a2.mFragmentManager = j;
            a2.mHost = j.A0();
            a2.onInflate(context, attributeSet, (Bundle) null);
            j.q().m(true).c(this, a2, string).i();
        }
        j.f1(this);
    }

    public final void a(View view) {
        if (this.b.contains(view)) {
            this.a.add(view);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.t.g(view, "child");
        if (J.H0(view) != null) {
            super/*android.view.ViewGroup*/.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        A0 L;
        kotlin.jvm.internal.t.g(windowInsets, "insets");
        A0 x = A0.x(windowInsets);
        kotlin.jvm.internal.t.f(x, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.a;
            kotlin.jvm.internal.t.d(onApplyWindowInsetsListener);
            L = A0.x(aVar.a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            L = T1.Z.L(this, x);
        }
        kotlin.jvm.internal.t.f(L, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!L.p()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                T1.Z.e(getChildAt(i), L);
            }
        }
        return windowInsets;
    }

    public void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.t.g(canvas, "canvas");
        if (this.d) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                super/*android.view.ViewGroup*/.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super/*android.view.View*/.dispatchDraw(canvas);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        kotlin.jvm.internal.t.g(canvas, "canvas");
        kotlin.jvm.internal.t.g(view, "child");
        if (this.d && !this.a.isEmpty() && this.a.contains(view)) {
            return false;
        }
        return super/*android.view.ViewGroup*/.drawChild(canvas, view, j);
    }

    public void endViewTransition(View view) {
        kotlin.jvm.internal.t.g(view, "view");
        this.b.remove(view);
        if (this.a.remove(view)) {
            this.d = true;
        }
        super/*android.view.ViewGroup*/.endViewTransition(view);
    }

    public final p getFragment() {
        return J.p0(this).m0(getId());
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        kotlin.jvm.internal.t.g(windowInsets, "insets");
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super/*android.view.ViewGroup*/.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                kotlin.jvm.internal.t.f(childAt, "view");
                a(childAt);
            }
        }
    }

    public void removeView(View view) {
        kotlin.jvm.internal.t.g(view, "view");
        a(view);
        super/*android.view.ViewGroup*/.removeView(view);
    }

    public void removeViewAt(int i) {
        View childAt = getChildAt(i);
        kotlin.jvm.internal.t.f(childAt, "view");
        a(childAt);
        super/*android.view.ViewGroup*/.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        kotlin.jvm.internal.t.g(view, "view");
        a(view);
        super/*android.view.ViewGroup*/.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            kotlin.jvm.internal.t.f(childAt, "view");
            a(childAt);
        }
        super/*android.view.ViewGroup*/.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            kotlin.jvm.internal.t.f(childAt, "view");
            a(childAt);
        }
        super/*android.view.ViewGroup*/.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.d = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        kotlin.jvm.internal.t.g(onApplyWindowInsetsListener, "listener");
        this.c = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        kotlin.jvm.internal.t.g(view, "view");
        if (view.getParent() == this) {
            this.b.add(view);
        }
        super/*android.view.ViewGroup*/.startViewTransition(view);
    }
}
