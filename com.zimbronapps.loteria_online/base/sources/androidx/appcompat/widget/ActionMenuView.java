package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.b;
import q.m0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class ActionMenuView extends androidx.appcompat.widget.b implements e.b, j {
    public e A;
    public androidx.appcompat.view.menu.e p;
    public Context q;
    public int r;
    public boolean s;
    public androidx.appcompat.widget.a t;
    public i.a u;
    public e.a v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements i.a {
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
        }

        public boolean c(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends b.a {
        public boolean a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;
        public boolean f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.a = cVar.a;
        }

        public c(int i, int i2) {
            super(i, i2);
            this.a = false;
        }
    }

    public class d implements e.a {
        public d() {
        }

        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.A;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.v;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int J(android.view.View r5, int r6, int r7, int r8, int r9) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r0 = (androidx.appcompat.widget.ActionMenuView.c) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r9 == 0) goto L1b
            r9 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L28
            boolean r9 = r9.r()
            if (r9 == 0) goto L28
            r9 = r2
            goto L29
        L28:
            r9 = r1
        L29:
            if (r7 <= 0) goto L4c
            r3 = 2
            if (r9 == 0) goto L30
            if (r7 < r3) goto L4c
        L30:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L45
            int r4 = r4 + 1
        L45:
            if (r9 == 0) goto L4a
            if (r4 >= r3) goto L4a
            goto L4d
        L4a:
            r3 = r4
            goto L4d
        L4c:
            r3 = r1
        L4d:
            boolean r7 = r0.a
            if (r7 != 0) goto L54
            if (r9 == 0) goto L54
            r1 = r2
        L54:
            r0.d = r1
            r0.b = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.J(android.view.View, int, int, int, int):int");
    }

    /* renamed from: A, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c k() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    /* renamed from: B, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c l(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* renamed from: C, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c m(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return k();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c D() {
        c k = k();
        k.a = true;
        return k;
    }

    public boolean E(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        a childAt = getChildAt(i - 1);
        a childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z = childAt.a();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? z : z | childAt2.b();
    }

    public boolean F() {
        androidx.appcompat.widget.a aVar = this.t;
        return aVar != null && aVar.B();
    }

    public boolean G() {
        androidx.appcompat.widget.a aVar = this.t;
        return aVar != null && aVar.D();
    }

    public boolean H() {
        androidx.appcompat.widget.a aVar = this.t;
        return aVar != null && aVar.E();
    }

    public boolean I() {
        return this.s;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    public final void K(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i8 = size - paddingLeft;
        int i9 = this.y;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = i9 + (i11 / i10);
        int childCount = getChildCount();
        int i13 = 0;
        int i14 = 0;
        boolean z4 = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        long j = 0;
        while (i14 < childCount) {
            ActionMenuItemView childAt = getChildAt(i14);
            int i18 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i19 = i15 + 1;
                if (z5) {
                    int i20 = this.z;
                    i7 = i19;
                    r14 = 0;
                    childAt.setPadding(i20, 0, i20, 0);
                } else {
                    i7 = i19;
                    r14 = 0;
                }
                c layoutParams = childAt.getLayoutParams();
                layoutParams.f = r14;
                layoutParams.c = r14;
                layoutParams.b = r14;
                layoutParams.d = r14;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = r14;
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = r14;
                layoutParams.e = z5 && childAt.r();
                int J = J(childAt, i12, layoutParams.a ? 1 : i10, childMeasureSpec, paddingTop);
                i16 = Math.max(i16, J);
                if (layoutParams.d) {
                    i17++;
                }
                if (layoutParams.a) {
                    z4 = true;
                }
                i10 -= J;
                i13 = Math.max(i13, childAt.getMeasuredHeight());
                if (J == 1) {
                    j |= 1 << i14;
                    i13 = i13;
                }
                i15 = i7;
            }
            i14++;
            size2 = i18;
        }
        int i21 = size2;
        boolean z6 = z4 && i15 == 2;
        boolean z7 = false;
        while (i17 > 0 && i10 > 0) {
            int i22 = Integer.MAX_VALUE;
            int i23 = 0;
            int i24 = 0;
            long j2 = 0;
            while (i24 < childCount) {
                boolean z8 = z7;
                c layoutParams2 = getChildAt(i24).getLayoutParams();
                int i25 = i13;
                if (layoutParams2.d) {
                    int i26 = layoutParams2.b;
                    if (i26 < i22) {
                        j2 = 1 << i24;
                        i22 = i26;
                        i23 = 1;
                    } else if (i26 == i22) {
                        i23++;
                        j2 |= 1 << i24;
                    }
                }
                i24++;
                i13 = i25;
                z7 = z8;
            }
            z = z7;
            i5 = i13;
            j |= j2;
            if (i23 > i10) {
                i3 = mode;
                i4 = i8;
                break;
            }
            int i27 = i22 + 1;
            int i28 = 0;
            while (i28 < childCount) {
                View childAt2 = getChildAt(i28);
                c layoutParams3 = childAt2.getLayoutParams();
                int i29 = i8;
                int i30 = mode;
                long j3 = 1 << i28;
                if ((j2 & j3) == 0) {
                    if (layoutParams3.b == i27) {
                        j |= j3;
                    }
                    z3 = z6;
                } else {
                    if (z6 && layoutParams3.e && i10 == 1) {
                        int i31 = this.z;
                        z3 = z6;
                        childAt2.setPadding(i31 + i12, 0, i31, 0);
                    } else {
                        z3 = z6;
                    }
                    layoutParams3.b++;
                    layoutParams3.f = true;
                    i10--;
                }
                i28++;
                mode = i30;
                i8 = i29;
                z6 = z3;
            }
            i13 = i5;
            z7 = true;
        }
        i3 = mode;
        i4 = i8;
        z = z7;
        i5 = i13;
        boolean z9 = !z4 && i15 == 1;
        if (i10 <= 0 || j == 0 || (i10 >= i15 - 1 && !z9 && i16 <= 1)) {
            i6 = 0;
            z2 = z;
        } else {
            float bitCount = Long.bitCount(j);
            if (z9) {
                i6 = 0;
            } else {
                i6 = 0;
                if ((j & 1) != 0 && !getChildAt(0).getLayoutParams().e) {
                    bitCount -= 0.5f;
                }
                int i32 = childCount - 1;
                if ((j & (1 << i32)) != 0 && !getChildAt(i32).getLayoutParams().e) {
                    bitCount -= 0.5f;
                }
            }
            int i33 = bitCount > 0.0f ? (int) ((i10 * i12) / bitCount) : i6;
            z2 = z;
            for (int i34 = i6; i34 < childCount; i34++) {
                if ((j & (1 << i34)) != 0) {
                    View childAt3 = getChildAt(i34);
                    c layoutParams4 = childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.c = i33;
                        layoutParams4.f = true;
                        if (i34 == 0 && !layoutParams4.e) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = (-i33) / 2;
                        }
                        z2 = true;
                    } else if (layoutParams4.a) {
                        layoutParams4.c = i33;
                        layoutParams4.f = true;
                        ((LinearLayout.LayoutParams) layoutParams4).rightMargin = (-i33) / 2;
                        z2 = true;
                    } else {
                        if (i34 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i33 / 2;
                        }
                        if (i34 != childCount - 1) {
                            ((LinearLayout.LayoutParams) layoutParams4).rightMargin = i33 / 2;
                        }
                    }
                }
            }
        }
        if (z2) {
            for (int i35 = i6; i35 < childCount; i35++) {
                View childAt4 = getChildAt(i35);
                c layoutParams5 = childAt4.getLayoutParams();
                if (layoutParams5.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.b * i12) + layoutParams5.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i4, i3 != 1073741824 ? i5 : i21);
    }

    public androidx.appcompat.view.menu.e L() {
        return this.p;
    }

    public void M(i.a aVar, e.a aVar2) {
        this.u = aVar;
        this.v = aVar2;
    }

    public boolean N() {
        androidx.appcompat.widget.a aVar = this.t;
        return aVar != null && aVar.K();
    }

    public void a(androidx.appcompat.view.menu.e eVar) {
        this.p = eVar;
    }

    public boolean c(g gVar) {
        return this.p.L(gVar, 0);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.p = eVar;
            eVar.R(new d());
            androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(context);
            this.t = aVar;
            aVar.J(true);
            androidx.appcompat.widget.a aVar2 = this.t;
            i.a aVar3 = this.u;
            if (aVar3 == null) {
                aVar3 = new b();
            }
            aVar2.d(aVar3);
            this.p.c(this.t, this.q);
            this.t.H(this);
        }
        return this.p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.t.A();
    }

    public int getPopupTheme() {
        return this.r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
        androidx.appcompat.widget.a aVar = this.t;
        if (aVar != null) {
            aVar.f(false);
            if (this.t.E()) {
                this.t.B();
                this.t.K();
            }
        }
    }

    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        z();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.w) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean b2 = m0.b(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                c layoutParams = childAt.getLayoutParams();
                if (layoutParams.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (E(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b2) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    E(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (b2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                c layoutParams2 = childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            c layoutParams3 = childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = i19 + measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + max;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        androidx.appcompat.view.menu.e eVar;
        boolean z = this.w;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.w = z2;
        if (z != z2) {
            this.x = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.w && (eVar = this.p) != null && size != this.x) {
            this.x = size;
            eVar.K(true);
        }
        int childCount = getChildCount();
        if (this.w && childCount > 0) {
            K(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            c layoutParams = getChildAt(i3).getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.t.G(z);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.t.I(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.s = z;
    }

    public void setPopupTheme(int i) {
        if (this.r != i) {
            this.r = i;
            if (i == 0) {
                this.q = getContext();
            } else {
                this.q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.a aVar) {
        this.t = aVar;
        aVar.H(this);
    }

    public void z() {
        androidx.appcompat.widget.a aVar = this.t;
        if (aVar != null) {
            aVar.y();
        }
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.y = (int) (56.0f * f);
        this.z = (int) (f * 4.0f);
        this.q = context;
        this.r = 0;
    }
}
