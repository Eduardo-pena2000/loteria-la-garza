package androidx.appcompat.widget;

import T1.B;
import T1.Z;
import T1.s;
import T1.v;
import T1.w;
import T1.z;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import i.j;
import j.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import q.H;
import q.W;
import q.c0;
import q.d0;
import q.e0;
import q.f0;
import q.g0;
import q.m0;
import q.n;
import q.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class Toolbar extends ViewGroup implements w {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final int[] F;
    public final z G;
    public ArrayList H;
    public h I;
    public final ActionMenuView.e J;
    public androidx.appcompat.widget.d K;
    public androidx.appcompat.widget.a L;
    public f M;
    public i.a N;
    public e.a O;
    public boolean P;
    public OnBackInvokedCallback Q;
    public OnBackInvokedDispatcher R;
    public boolean S;
    public final Runnable T;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageButton d;
    public ImageView e;
    public Drawable f;
    public CharSequence g;
    public ImageButton h;
    public View i;
    public Context j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public W t;
    public int u;
    public int v;
    public int w;
    public CharSequence x;
    public CharSequence y;
    public ColorStateList z;

    public class a implements ActionMenuView.e {
        public a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.G.j(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.I;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            Toolbar.this.Q();
        }
    }

    public class c implements e.a {
        public c() {
        }

        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e.a aVar = Toolbar.this.O;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.a.H()) {
                Toolbar.this.G.k(eVar);
            }
            e.a aVar = Toolbar.this.O;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new f0(runnable);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class f implements androidx.appcompat.view.menu.i {
        public androidx.appcompat.view.menu.e a;
        public androidx.appcompat.view.menu.g b;

        public f() {
        }

        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
        }

        public boolean c(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            Toolbar parent = Toolbar.this.h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    parent.removeView(toolbar.h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.h);
            }
            Toolbar.this.i = gVar.getActionView();
            this.b = gVar;
            Toolbar parent2 = Toolbar.this.i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    parent2.removeView(toolbar3.i);
                }
                g generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.a = (toolbar4.n & 112) | 8388611;
                generateDefaultLayoutParams.b = 2;
                toolbar4.i.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.i);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            gVar.r(true);
            o.c cVar = Toolbar.this.i;
            if (cVar instanceof o.c) {
                cVar.b();
            }
            Toolbar.this.R();
            return true;
        }

        public boolean e(l lVar) {
            return false;
        }

        public void f(boolean z) {
            if (this.b != null) {
                androidx.appcompat.view.menu.e eVar = this.a;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i = 0; i < size; i++) {
                        if (this.a.getItem(i) == this.b) {
                            return;
                        }
                    }
                }
                h(this.a, this.b);
            }
        }

        public boolean g() {
            return false;
        }

        public boolean h(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            o.c cVar = Toolbar.this.i;
            if (cVar instanceof o.c) {
                cVar.d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.i = null;
            toolbar3.a();
            this.b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.R();
            return true;
        }

        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.a;
            if (eVar2 != null && (gVar = this.b) != null) {
                eVar2.f(gVar);
            }
            this.a = eVar;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.K);
    }

    private ArrayList getCurrentMenuItems() {
        ArrayList arrayList = new ArrayList();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new o.g(getContext());
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.G();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.H();
    }

    public final int C(View view, int i2, int[] iArr, int i3) {
        g layoutParams = view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int max = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int q = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q, max + measuredWidth, view.getMeasuredHeight() + q);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    public final int D(View view, int i2, int[] iArr, int i3) {
        g layoutParams = view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int q = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q, max, view.getMeasuredHeight() + q);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    public final int E(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams layoutParams = view.getLayoutParams();
        int i6 = layoutParams.leftMargin - iArr[0];
        int i7 = layoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + max + i3, layoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + layoutParams.topMargin + layoutParams.bottomMargin + i5, layoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void F(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams layoutParams = view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin + i3, layoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + layoutParams.topMargin + layoutParams.bottomMargin + i5, layoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void G() {
        Menu menu = getMenu();
        ArrayList currentMenuItems = getCurrentMenuItems();
        this.G.h(menu, getMenuInflater());
        ArrayList currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    public final void H() {
        removeCallbacks(this.T);
        post(this.T);
    }

    public void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            ActionMenuView childAt = getChildAt(childCount);
            if (childAt.getLayoutParams().b != 2 && childAt != this.a) {
                removeViewAt(childCount);
                this.E.add(childAt);
            }
        }
    }

    public void J(int i2, int i3) {
        h();
        this.t.g(i2, i3);
    }

    public void K(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.a aVar) {
        if (eVar == null && this.a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e L = this.a.L();
        if (L == eVar) {
            return;
        }
        if (L != null) {
            L.O(this.L);
            L.O(this.M);
        }
        if (this.M == null) {
            this.M = new f();
        }
        aVar.G(true);
        if (eVar != null) {
            eVar.c(aVar, this.j);
            eVar.c(this.M, this.j);
        } else {
            aVar.i(this.j, null);
            this.M.i(this.j, null);
            aVar.f(true);
            this.M.f(true);
        }
        this.a.setPopupTheme(this.k);
        this.a.setPresenter(aVar);
        this.L = aVar;
        R();
    }

    public void L(i.a aVar, e.a aVar2) {
        this.N = aVar;
        this.O = aVar2;
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            actionMenuView.M(aVar, aVar2);
        }
    }

    public void M(Context context, int i2) {
        this.m = i2;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void N(Context context, int i2) {
        this.l = i2;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public final boolean O() {
        if (!this.P) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.N();
    }

    public void R() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a2 = e.a(this);
            boolean z = v() && a2 != null && Z.G(this) && this.S;
            if (z && this.R == null) {
                if (this.Q == null) {
                    this.Q = e.b(new d0(this));
                }
                e.c(a2, this.Q);
                this.R = a2;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.R) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.Q);
            this.R = null;
        }
    }

    public void a() {
        for (int size = this.E.size() - 1; size >= 0; size--) {
            addView((View) this.E.get(size));
        }
        this.E.clear();
    }

    public void addMenuProvider(B b2) {
        this.G.c(b2);
    }

    public final void b(List list, int i2) {
        boolean z = Z.t(this) == 1;
        int childCount = getChildCount();
        int a2 = s.a(i2, Z.t(this));
        list.clear();
        if (!z) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                g layoutParams = childAt.getLayoutParams();
                if (layoutParams.b == 0 && P(childAt) && p(layoutParams.a) == a2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            g layoutParams2 = childAt2.getLayoutParams();
            if (layoutParams2.b == 0 && P(childAt2) && p(layoutParams2.a) == a2) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        generateDefaultLayoutParams.b = 1;
        if (!z || this.i == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.E.add(view);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.a) != null && actionMenuView.I();
    }

    public void e() {
        f fVar = this.M;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    public void g() {
        if (this.h == null) {
            n nVar = new n(getContext(), null, i.a.J);
            this.h = nVar;
            nVar.setImageDrawable(this.f);
            this.h.setContentDescription(this.g);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = (this.n & 112) | 8388611;
            generateDefaultLayoutParams.b = 2;
            this.h.setLayoutParams(generateDefaultLayoutParams);
            this.h.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        W w = this.t;
        if (w != null) {
            return w.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        W w = this.t;
        if (w != null) {
            return w.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        W w = this.t;
        if (w != null) {
            return w.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        W w = this.t;
        if (w != null) {
            return w.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.u;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e L;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (L = actionMenuView.L()) == null || !L.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return Z.t(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return Z.t(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
        return this.L;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.j;
    }

    public int getPopupTheme() {
        return this.k;
    }

    public CharSequence getSubtitle() {
        return this.y;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.x;
    }

    public int getTitleMarginBottom() {
        return this.s;
    }

    public int getTitleMarginEnd() {
        return this.q;
    }

    public int getTitleMarginStart() {
        return this.p;
    }

    public int getTitleMarginTop() {
        return this.r;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public H getWrapper() {
        if (this.K == null) {
            this.K = new androidx.appcompat.widget.d(this, true);
        }
        return this.K;
    }

    public final void h() {
        if (this.t == null) {
            this.t = new W();
        }
    }

    public final void i() {
        if (this.e == null) {
            this.e = new p(getContext());
        }
    }

    public final void j() {
        k();
        if (this.a.L() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.a.getMenu();
            if (this.M == null) {
                this.M = new f();
            }
            this.a.setExpandedActionViewsExclusive(true);
            eVar.c(this.M, this.j);
            R();
        }
    }

    public final void k() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.k);
            this.a.setOnMenuItemClickListener(this.J);
            this.a.M(this.N, new c());
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = (this.n & 112) | 8388613;
            this.a.setLayoutParams(generateDefaultLayoutParams);
            c(this.a, false);
        }
    }

    public final void l() {
        if (this.d == null) {
            this.d = new n(getContext(), null, i.a.J);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = (this.n & 112) | 8388611;
            this.d.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof a.a ? new g((a.a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.T);
        R();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean onHoverEvent = super/*android.view.View*/.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02a1 A[LOOP:0: B:41:0x029f->B:42:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c3 A[LOOP:1: B:45:0x02c1->B:46:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02fc A[LOOP:2: B:54:0x02fa->B:55:0x02fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.F;
        boolean b2 = m0.b(this);
        int i11 = !b2 ? 1 : 0;
        if (P(this.d)) {
            F(this.d, i2, 0, i3, 0, this.o);
            i4 = this.d.getMeasuredWidth() + s(this.d);
            i5 = Math.max(0, this.d.getMeasuredHeight() + t(this.d));
            i6 = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (P(this.h)) {
            F(this.h, i2, 0, i3, 0, this.o);
            i4 = this.h.getMeasuredWidth() + s(this.h);
            i5 = Math.max(i5, this.h.getMeasuredHeight() + t(this.h));
            i6 = View.combineMeasuredStates(i6, this.h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i4);
        iArr[b2 ? 1 : 0] = Math.max(0, currentContentInsetStart - i4);
        if (P(this.a)) {
            F(this.a, i2, max, i3, 0, this.o);
            i7 = this.a.getMeasuredWidth() + s(this.a);
            i5 = Math.max(i5, this.a.getMeasuredHeight() + t(this.a));
            i6 = View.combineMeasuredStates(i6, this.a.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i7);
        iArr[i11] = Math.max(0, currentContentInsetEnd - i7);
        if (P(this.i)) {
            max2 += E(this.i, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.i.getMeasuredHeight() + t(this.i));
            i6 = View.combineMeasuredStates(i6, this.i.getMeasuredState());
        }
        if (P(this.e)) {
            max2 += E(this.e, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.e.getMeasuredHeight() + t(this.e));
            i6 = View.combineMeasuredStates(i6, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getLayoutParams().b == 0 && P(childAt)) {
                max2 += E(childAt, i2, max2, i3, 0, iArr);
                i5 = Math.max(i5, childAt.getMeasuredHeight() + t(childAt));
                i6 = View.combineMeasuredStates(i6, childAt.getMeasuredState());
            }
        }
        int i13 = this.r + this.s;
        int i14 = this.p + this.q;
        if (P(this.b)) {
            E(this.b, i2, max2 + i14, i3, i13, iArr);
            int measuredWidth = this.b.getMeasuredWidth() + s(this.b);
            i8 = this.b.getMeasuredHeight() + t(this.b);
            i9 = View.combineMeasuredStates(i6, this.b.getMeasuredState());
            i10 = measuredWidth;
        } else {
            i8 = 0;
            i9 = i6;
            i10 = 0;
        }
        if (P(this.c)) {
            i10 = Math.max(i10, E(this.c, i2, max2 + i14, i3, i8 + i13, iArr));
            i8 += this.c.getMeasuredHeight() + t(this.c);
            i9 = View.combineMeasuredStates(i9, this.c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i10 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, (-16777216) & i9), O() ? 0 : View.resolveSizeAndState(Math.max(Math.max(i5, i8) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, i9 << 16));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super/*android.view.View*/.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super/*android.view.View*/.onRestoreInstanceState(iVar.b());
        ActionMenuView actionMenuView = this.a;
        androidx.appcompat.view.menu.e L = actionMenuView != null ? actionMenuView.L() : null;
        int i2 = iVar.c;
        if (i2 != 0 && this.M != null && L != null && (findItem = L.findItem(i2)) != null) {
            findItem.expandActionView();
        }
        if (iVar.d) {
            H();
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        super/*android.view.View*/.onRtlPropertiesChanged(i2);
        h();
        this.t.f(i2 == 1);
    }

    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        i iVar = new i(super/*android.view.View*/.onSaveInstanceState());
        f fVar = this.M;
        if (fVar != null && (gVar = fVar.b) != null) {
            iVar.c = gVar.getItemId();
        }
        iVar.d = B();
        return iVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean onTouchEvent = super/*android.view.View*/.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public final int p(int i2) {
        int t = Z.t(this);
        int a2 = s.a(i2, t) & 7;
        return (a2 == 1 || a2 == 3 || a2 == 5) ? a2 : t == 1 ? 5 : 3;
    }

    public final int q(View view, int i2) {
        g layoutParams = view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int r = r(layoutParams.a);
        if (r == 48) {
            return getPaddingTop() - i3;
        }
        if (r == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    public final int r(int i2) {
        int i3 = i2 & 112;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.w & 112;
    }

    public void removeMenuProvider(B b2) {
        this.G.l(b2);
    }

    public final int s(View view) {
        ViewGroup.MarginLayoutParams layoutParams = view.getLayoutParams();
        return v.b(layoutParams) + v.a(layoutParams);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.S != z) {
            this.S = z;
            R();
        }
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(k.a.b(getContext(), i2));
    }

    public void setCollapsible(boolean z) {
        this.P = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.v) {
            this.v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.u) {
            this.u = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(k.a.b(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(k.a.b(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.I = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.k != i2) {
            this.k = i2;
            if (i2 == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.s = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.q = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.p = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.r = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public final int t(View view) {
        ViewGroup.MarginLayoutParams layoutParams = view.getLayoutParams();
        return layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final int u(List list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            View view = (View) list.get(i4);
            g layoutParams = view.getLayoutParams();
            int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - i2;
            int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - i3;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i7);
            int max3 = Math.max(0, -i6);
            int max4 = Math.max(0, -i7);
            i5 += max + view.getMeasuredWidth() + max2;
            i4++;
            i3 = max4;
            i2 = max3;
        }
        return i5;
    }

    public boolean v() {
        f fVar = this.M;
        return (fVar == null || fVar.b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.F();
    }

    public void x(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public void y() {
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        G();
    }

    public final boolean z(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public static class g extends a.a {
        public int b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0;
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i, int i2) {
            super(i, i2);
            this.b = 0;
            this.a = 8388627;
        }

        public g(g gVar) {
            super(gVar);
            this.b = 0;
            this.b = gVar.b;
        }

        public g(a.a aVar) {
            super(aVar);
            this.b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.w = 8388627;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new int[2];
        this.G = new z(new e0(this));
        this.H = new ArrayList();
        this.J = new a();
        this.T = new b();
        c0 u = c0.u(getContext(), attributeSet, j.d3, i2, 0);
        Z.S(this, context, j.d3, attributeSet, u.q(), i2, 0);
        this.l = u.m(j.F3, 0);
        this.m = u.m(j.w3, 0);
        this.w = u.k(j.e3, this.w);
        this.n = u.k(j.f3, 48);
        int d2 = u.d(j.z3, 0);
        d2 = u.r(j.E3) ? u.d(j.E3, d2) : d2;
        this.s = d2;
        this.r = d2;
        this.q = d2;
        this.p = d2;
        int d3 = u.d(j.C3, -1);
        if (d3 >= 0) {
            this.p = d3;
        }
        int d4 = u.d(j.B3, -1);
        if (d4 >= 0) {
            this.q = d4;
        }
        int d5 = u.d(j.D3, -1);
        if (d5 >= 0) {
            this.r = d5;
        }
        int d6 = u.d(j.A3, -1);
        if (d6 >= 0) {
            this.s = d6;
        }
        this.o = u.e(j.q3, -1);
        int d7 = u.d(j.m3, Integer.MIN_VALUE);
        int d8 = u.d(j.i3, Integer.MIN_VALUE);
        int e2 = u.e(j.k3, 0);
        int e3 = u.e(j.l3, 0);
        h();
        this.t.e(e2, e3);
        if (d7 != Integer.MIN_VALUE || d8 != Integer.MIN_VALUE) {
            this.t.g(d7, d8);
        }
        this.u = u.d(j.n3, Integer.MIN_VALUE);
        this.v = u.d(j.j3, Integer.MIN_VALUE);
        this.f = u.f(j.h3);
        this.g = u.o(j.g3);
        CharSequence o = u.o(j.y3);
        if (!TextUtils.isEmpty(o)) {
            setTitle(o);
        }
        CharSequence o2 = u.o(j.v3);
        if (!TextUtils.isEmpty(o2)) {
            setSubtitle(o2);
        }
        this.j = getContext();
        setPopupTheme(u.m(j.u3, 0));
        Drawable f2 = u.f(j.t3);
        if (f2 != null) {
            setNavigationIcon(f2);
        }
        CharSequence o3 = u.o(j.s3);
        if (!TextUtils.isEmpty(o3)) {
            setNavigationContentDescription(o3);
        }
        Drawable f3 = u.f(j.o3);
        if (f3 != null) {
            setLogo(f3);
        }
        CharSequence o4 = u.o(j.p3);
        if (!TextUtils.isEmpty(o4)) {
            setLogoDescription(o4);
        }
        if (u.r(j.G3)) {
            setTitleTextColor(u.c(j.G3));
        }
        if (u.r(j.x3)) {
            setSubtitleTextColor(u.c(j.x3));
        }
        if (u.r(j.r3)) {
            x(u.m(j.r3, 0));
        }
        u.v();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.e)) {
                c(this.e, true);
            }
        } else {
            ImageView imageView = this.e;
            if (imageView != null && z(imageView)) {
                removeView(this.e);
                this.E.remove(this.e);
            }
        }
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            g0.a(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.d)) {
                c(this.d, true);
            }
        } else {
            ImageButton imageButton = this.d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.d);
                this.E.remove(this.d);
            }
        }
        ImageButton imageButton2 = this.d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.c;
            if (textView != null && z(textView)) {
                removeView(this.c);
                this.E.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                q.B b2 = new q.B(context);
                this.c = b2;
                b2.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.m;
                if (i2 != 0) {
                    this.c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!z(this.c)) {
                c(this.c, true);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.b;
            if (textView != null && z(textView)) {
                removeView(this.b);
                this.E.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                q.B b2 = new q.B(context);
                this.b = b2;
                b2.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.l;
                if (i2 != 0) {
                    this.b.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.z;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!z(this.b)) {
                c(this.b, true);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.z = colorStateList;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class i extends m2.a {
        public static final Parcelable.Creator CREATOR = new a();
        public int c;
        public boolean d;

        public class a implements Parcelable.ClassLoaderCreator {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i) {
                return new i[i];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
