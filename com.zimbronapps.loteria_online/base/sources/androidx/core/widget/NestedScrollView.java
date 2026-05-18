package androidx.core.widget;

import T1.C;
import T1.D;
import T1.F;
import T1.G;
import T1.L;
import T1.Z;
import T1.o;
import T1.p;
import U1.v;
import U1.x;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class NestedScrollView extends FrameLayout implements F, L {
    public static final float D = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final a E = new a();
    public static final int[] F = {16843130};
    public e A;
    public final d B;
    public o C;
    public final float a;
    public long b;
    public final Rect c;
    public OverScroller d;
    public EdgeEffect e;
    public EdgeEffect f;
    public int g;
    public boolean h;
    public boolean i;
    public View j;
    public boolean k;
    public VelocityTracker l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public final int[] s;
    public final int[] t;
    public int u;
    public int v;
    public f w;
    public final G x;
    public final D y;
    public float z;

    public static class a extends T1.a {
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            x.a(accessibilityEvent, nestedScrollView.getScrollX());
            x.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public void g(View view, v vVar) {
            int scrollRange;
            super.g(view, vVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            vVar.g0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            vVar.G0(true);
            if (nestedScrollView.getScrollY() > 0) {
                vVar.b(v.a.q);
                vVar.b(v.a.B);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                vVar.b(v.a.p);
                vVar.b(v.a.D);
            }
        }

        public boolean j(View view, int i, Bundle bundle) {
            if (super.j(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.W(0, max, true);
                    return true;
                }
                if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.W(0, min, true);
            return true;
        }
    }

    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public static final class c {
        public static void a(View view, float f) {
            try {
                view.setFrameContentVelocity(f);
            } catch (LinkageError unused) {
            }
        }
    }

    public class d implements p {
        public d() {
        }

        public boolean a(float f) {
            if (f == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.v((int) f);
            return true;
        }

        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        public void c() {
            NestedScrollView.b(NestedScrollView.this).abortAnimation();
        }
    }

    public interface e {
        void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new a();
        public int a;

        public class a implements Parcelable.Creator {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        public f(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, F1.a.c);
    }

    public static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        View parent = view.getParent();
        return (parent instanceof ViewGroup) && F(parent, view2);
    }

    public static /* synthetic */ OverScroller b(NestedScrollView nestedScrollView) {
        return nestedScrollView.d;
    }

    public static int f(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    public final void A() {
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker == null) {
            this.l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void B() {
        this.d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.o = viewConfiguration.getScaledTouchSlop();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final void C() {
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
    }

    public final void D(int i, int i2) {
        this.g = i;
        this.r = i2;
        X(2, 0);
    }

    public final boolean E(View view) {
        return !G(view, 0, getHeight());
    }

    public final boolean G(View view, int i, int i2) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        return this.c.bottom + i >= getScrollY() && this.c.top - i <= getScrollY() + i2;
    }

    public final void H(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.y.e(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    public final void I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.g = (int) motionEvent.getY(i);
            this.r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean J(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        boolean z4 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i9 = i3 + i;
        int i10 = !z6 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z7 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            i9 = i14;
            z2 = true;
        } else if (i9 < i13) {
            z2 = true;
            i9 = i13;
        } else {
            z2 = false;
        }
        if (i11 > i16) {
            i11 = i16;
            z3 = true;
        } else if (i11 < i15) {
            z3 = true;
            i11 = i15;
        } else {
            z3 = false;
        }
        if (z3 && !y(1)) {
            this.d.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z2, z3);
        return z2 || z3;
    }

    public boolean K(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + childAt.getLayoutParams().bottomMargin + getPaddingBottom();
                Rect rect = this.c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.c.top = getScrollY() - height;
            Rect rect2 = this.c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.c;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return O(i, i2, i3);
    }

    public final void L() {
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int M(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.e
            float r0 = X1.d.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.e
            float r4 = -r4
            float r4 = X1.d.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.e
            float r5 = X1.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.e
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f
            float r0 = X1.d.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = X1.d.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f
            float r5 = X1.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.M(int, float):int");
    }

    public final void N(boolean z) {
        if (z) {
            X(2, 1);
        } else {
            Z(1);
        }
        this.v = getScrollY();
        postInvalidateOnAnimation();
    }

    public final boolean O(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View u = u(z2, i2, i3);
        if (u == null) {
            u = this;
        }
        if (i2 < scrollY || i3 > i4) {
            P(z2 ? i2 - scrollY : i3 - i4, 0, 1, true);
            z = true;
        }
        if (u != findFocus()) {
            u.requestFocus(i);
        }
        return z;
    }

    public final int P(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        VelocityTracker velocityTracker;
        if (i3 == 1) {
            X(2, i3);
        }
        boolean z2 = false;
        if (l(0, i, this.t, this.s, i3)) {
            i4 = i - this.t[1];
            i5 = this.s[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z3 = d() && !z;
        boolean z4 = J(0, i4, 0, scrollY, 0, scrollRange, 0, 0, true) && !y(i3);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.t;
        iArr[1] = 0;
        p(0, scrollY2, 0, i4 - scrollY2, this.s, i3, iArr);
        int i6 = i5 + this.s[1];
        int i7 = i4 - this.t[1];
        int i8 = scrollY + i7;
        if (i8 < 0) {
            if (z3) {
                X1.d.d(this.e, (-i7) / getHeight(), i2 / getWidth());
                if (!this.f.isFinished()) {
                    this.f.onRelease();
                }
            }
        } else if (i8 > scrollRange && z3) {
            X1.d.d(this.f, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!this.e.isFinished()) {
                this.e.onRelease();
            }
        }
        if (this.e.isFinished() && this.f.isFinished()) {
            z2 = z4;
        } else {
            postInvalidateOnAnimation();
        }
        if (z2 && i3 == 0 && (velocityTracker = this.l) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            Z(i3);
            this.e.onRelease();
            this.f.onRelease();
        }
        return i6;
    }

    public final void Q(View view) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        int g = g(this.c);
        if (g != 0) {
            scrollBy(0, g);
        }
    }

    public final boolean R(Rect rect, boolean z) {
        int g = g(rect);
        boolean z2 = g != 0;
        if (z2) {
            if (z) {
                scrollBy(0, g);
            } else {
                T(0, g);
            }
        }
        return z2;
    }

    public final boolean S(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        return x(-i) < X1.d.b(edgeEffect) * ((float) getHeight());
    }

    public final void T(int i, int i2) {
        U(i, i2, 250, false);
    }

    public final void U(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, i3);
            N(z);
        } else {
            if (!this.d.isFinished()) {
                a();
            }
            scrollBy(i, i2);
        }
        this.b = AnimationUtils.currentAnimationTimeMillis();
    }

    public void V(int i, int i2, int i3, boolean z) {
        U(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    public void W(int i, int i2, boolean z) {
        V(i, i2, 250, z);
    }

    public boolean X(int i, int i2) {
        return this.y.q(i, i2);
    }

    public final boolean Y(MotionEvent motionEvent) {
        boolean z;
        if (X1.d.b(this.e) != 0.0f) {
            X1.d.d(this.e, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (X1.d.b(this.f) == 0.0f) {
            return z;
        }
        X1.d.d(this.f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public void Z(int i) {
        this.y.s(i);
    }

    public final void a() {
        this.d.abortAnimation();
        Z(1);
    }

    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super/*android.view.ViewGroup*/.addView(view);
    }

    public boolean c(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !G(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + childAt.getLayoutParams().bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            P(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.c);
            offsetDescendantRectToMyCoords(findNextFocus, this.c);
            P(g(this.c), 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && E(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super/*android.view.View*/.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super/*android.view.View*/.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super/*android.view.View*/.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (this.d.isFinished()) {
            return;
        }
        this.d.computeScrollOffset();
        int currY = this.d.getCurrY();
        int h = h(currY - this.v);
        this.v = currY;
        int[] iArr = this.t;
        iArr[1] = 0;
        l(0, h, iArr, null, 1);
        int i = h - this.t[1];
        int scrollRange = getScrollRange();
        if (P1.a.e()) {
            c.a(this, Math.abs(this.d.getCurrVelocity()));
        }
        if (i != 0) {
            int scrollY = getScrollY();
            J(0, i, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i2 = i - scrollY2;
            int[] iArr2 = this.t;
            iArr2[1] = 0;
            p(0, scrollY2, 0, i2, this.s, 1, iArr2);
            i = i2 - this.t[1];
        }
        if (i != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i < 0) {
                    if (this.e.isFinished()) {
                        this.e.onAbsorb((int) this.d.getCurrVelocity());
                    }
                } else if (this.f.isFinished()) {
                    this.f.onAbsorb((int) this.d.getCurrVelocity());
                }
            }
            a();
        }
        if (this.d.isFinished()) {
            Z(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    public int computeVerticalScrollExtent() {
        return super/*android.view.View*/.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super/*android.view.View*/.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + childAt.getLayoutParams().bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public final boolean d() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super/*android.view.View*/.dispatchKeyEvent(keyEvent) || t(keyEvent);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.y.a(f2, f3, z);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.y.b(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return l(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.y.f(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super/*android.view.View*/.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.e.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            this.e.setSize(width, height);
            if (this.e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        if (this.f.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i2 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i2 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f.setSize(width2, height2);
        if (this.f.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    public final boolean e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public int g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.x.a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.z;
    }

    public int h(int i) {
        int height = getHeight();
        if (i > 0 && X1.d.b(this.e) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * X1.d.d(this.e, ((-i) * 4.0f) / height, 0.5f));
            if (round != i) {
                this.e.finish();
            }
            return i - round;
        }
        if (i >= 0 || X1.d.b(this.f) == 0.0f) {
            return i;
        }
        float f2 = height;
        int round2 = Math.round((f2 / 4.0f) * X1.d.d(this.f, (i * 4.0f) / f2, 0.5f));
        if (round2 != i) {
            this.f.finish();
        }
        return i - round2;
    }

    public boolean hasNestedScrollingParent() {
        return y(0);
    }

    public void i(View view, View view2, int i, int i2) {
        this.x.c(view, view2, i, i2);
        X(2, i2);
    }

    public boolean isNestedScrollingEnabled() {
        return this.y.m();
    }

    public void j(View view, int i) {
        this.x.d(view, i);
        Z(i);
    }

    public void k(View view, int i, int i2, int[] iArr, int i3) {
        l(i, i2, iArr, null, i3);
    }

    public boolean l(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.y.d(i, i2, iArr, iArr2, i3);
    }

    public void m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        H(i4, i5, iArr);
    }

    public void measureChild(View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin + i2, layoutParams.width), View.MeasureSpec.makeMeasureSpec(layoutParams.topMargin + layoutParams.bottomMargin, 0));
    }

    public void n(View view, int i, int i2, int i3, int i4, int i5) {
        H(i4, i5, null);
    }

    public boolean o(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        this.i = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        float f2;
        if (motionEvent.getAction() == 8 && !this.k) {
            if (C.a(motionEvent, 2)) {
                i = 9;
                f2 = motionEvent.getAxisValue(9);
                i2 = (int) motionEvent.getX();
            } else if (C.a(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i2 = getWidth() / 2;
                i = 26;
                f2 = axisValue;
            } else {
                i = 0;
                i2 = 0;
                f2 = 0.0f;
            }
            if (f2 != 0.0f) {
                P(-((int) (f2 * getVerticalScrollFactorCompat())), i2, 1, C.a(motionEvent, 8194));
                if (i != 0) {
                    this.C.g(motionEvent, i);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.h = false;
        View view = this.j;
        if (view != null && F(view, this)) {
            Q(this.j);
        }
        this.j = null;
        if (!this.i) {
            if (this.w != null) {
                scrollTo(getScrollX(), this.w.a);
                this.w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int f2 = f(scrollY, paddingTop, i5);
            if (f2 != scrollY) {
                scrollTo(getScrollX(), f2);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.i = true;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        v((int) f3);
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        k(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        H(i4, 0, null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        i(view, view2, i, 0);
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super/*android.view.View*/.scrollTo(i, i2);
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, (View) null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus == null || E(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super/*android.view.View*/.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super/*android.view.View*/.onRestoreInstanceState(fVar.getSuperState());
        this.w = fVar;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        f fVar = new f(super/*android.view.View*/.onSaveInstanceState());
        fVar.a = getScrollY();
        return fVar;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onScrollChanged(i, i2, i3, i4);
        e eVar = this.A;
        if (eVar != null) {
            eVar.a(this, i, i2, i3, i4);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !G(findFocus, 0, i4)) {
            return;
        }
        findFocus.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(findFocus, this.c);
        q(g(this.c));
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return o(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.u = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.l;
                velocityTracker.computeCurrentVelocity(1000, this.q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.r);
                if (Math.abs(yVelocity) >= this.p) {
                    if (!r(yVelocity)) {
                        int i = -yVelocity;
                        float f2 = i;
                        if (!dispatchNestedPreFling(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            v(i);
                        }
                    }
                } else if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.r);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.r + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i2 = this.g - y;
                    int M = i2 - M(i2, motionEvent.getX(findPointerIndex));
                    if (!this.k && Math.abs(M) > this.o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.k = true;
                        M = M > 0 ? M - this.o : M + this.o;
                    }
                    if (this.k) {
                        int P = P(M, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.g = y - P;
                        this.u += P;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.k && getChildCount() > 0 && this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.g = (int) motionEvent.getY(actionIndex);
                this.r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                I(motionEvent);
                this.g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.d.isFinished()) {
                a();
            }
            D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void p(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.y.e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void q(int i) {
        if (i != 0) {
            if (this.n) {
                T(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    public final boolean r(int i) {
        if (X1.d.b(this.e) != 0.0f) {
            if (S(this.e, i)) {
                this.e.onAbsorb(i);
            } else {
                v(-i);
            }
        } else {
            if (X1.d.b(this.f) == 0.0f) {
                return false;
            }
            int i2 = -i;
            if (S(this.f, i2)) {
                this.f.onAbsorb(i2);
            } else {
                v(i2);
            }
        }
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        if (this.h) {
            this.j = view2;
        } else {
            Q(view2);
        }
        super/*android.view.ViewGroup*/.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return R(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            L();
        }
        super/*android.view.ViewGroup*/.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.h = true;
        super/*android.view.View*/.requestLayout();
    }

    public final void s() {
        this.r = -1;
        this.k = false;
        L();
        Z(0);
        this.e.onRelease();
        this.f.onRelease();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int f2 = f(i, width, width2);
            int f3 = f(i2, height, height2);
            if (f2 == getScrollX() && f3 == getScrollY()) {
                return;
            }
            super/*android.view.View*/.scrollTo(f2, f3);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.m) {
            this.m = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.y.n(z);
    }

    public void setOnScrollChangeListener(e eVar) {
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.n = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return X(i, 0);
    }

    public void stopNestedScroll() {
        Z(0);
    }

    public boolean t(KeyEvent keyEvent) {
        this.c.setEmpty();
        if (!e()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return keyEvent.isAltPressed() ? w(33) : c(33);
        }
        if (keyCode == 20) {
            return keyEvent.isAltPressed() ? w(130) : c(130);
        }
        if (keyCode == 62) {
            K(keyEvent.isShiftPressed() ? 33 : 130);
            return false;
        }
        if (keyCode == 92) {
            return w(33);
        }
        if (keyCode == 93) {
            return w(130);
        }
        if (keyCode == 122) {
            K(33);
            return false;
        }
        if (keyCode != 123) {
            return false;
        }
        K(130);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View u(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = r4
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            r9 = 1
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = r9
            goto L29
        L28:
            r10 = r3
        L29:
            if (r2 != 0) goto L2e
            r2 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r2.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r2.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = r9
            goto L41
        L40:
            r7 = r3
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r2 = r6
            r5 = r9
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r2 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.u(boolean, int, int):android.view.View");
    }

    public void v(int i) {
        if (getChildCount() > 0) {
            this.d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            N(true);
            if (P1.a.e()) {
                c.a(this, Math.abs(this.d.getCurrVelocity()));
            }
        }
    }

    public boolean w(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.c.bottom = childAt.getBottom() + childAt.getLayoutParams().bottomMargin + getPaddingBottom();
            Rect rect2 = this.c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.c;
        return O(i, rect3.top, rect3.bottom);
    }

    public final float x(int i) {
        double log = Math.log((Math.abs(i) * 0.35f) / (this.a * 0.015f));
        float f2 = D;
        return (float) (this.a * 0.015f * Math.exp((f2 / (f2 - 1.0d)) * log));
    }

    public boolean y(int i) {
        return this.y.l(i);
    }

    public final boolean z(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Rect();
        this.h = true;
        this.i = false;
        this.j = null;
        this.k = false;
        this.n = true;
        this.r = -1;
        this.s = new int[2];
        this.t = new int[2];
        d dVar = new d();
        this.B = dVar;
        this.C = new o(getContext(), dVar);
        this.e = X1.d.a(context, attributeSet);
        this.f = X1.d.a(context, attributeSet);
        this.a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        B();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, F, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.x = new G(this);
        this.y = new D(this);
        setNestedScrollingEnabled(true);
        Z.U(this, E);
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super/*android.view.ViewGroup*/.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super/*android.view.ViewGroup*/.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super/*android.view.ViewGroup*/.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
