package androidx.appcompat.widget;

import T1.b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import q.P;
import q.g0;
import q.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a extends androidx.appcompat.view.menu.a implements b.a {
    public c A;
    public b B;
    public final f C;
    public int D;
    public d k;
    public Drawable l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public final SparseBooleanArray x;
    public e y;
    public a z;

    public class a extends h {
        public a(Context context, l lVar, View view) {
            super(context, lVar, view, false, i.a.i);
            if (!((g) lVar.getItem()).l()) {
                View view2 = a.this.k;
                f(view2 == null ? (View) a.t(a.this) : view2);
            }
            j(a.this.C);
        }

        public void e() {
            a aVar = a.this;
            aVar.z = null;
            aVar.D = 0;
            super.e();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }

        public p.f a() {
            a aVar = a.this.z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    public class c implements Runnable {
        public e a;

        public c(e eVar) {
            this.a = eVar;
        }

        public void run() {
            if (a.v(a.this) != null) {
                a.w(a.this).d();
            }
            View x = a.x(a.this);
            if (x != null && x.getWindowToken() != null && this.a.m()) {
                a.this.y = this.a;
            }
            a.this.A = null;
        }
    }

    public class d extends p implements ActionMenuView.a {

        public class a extends P {
            public final /* synthetic */ a j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view, a aVar) {
                super(view);
                this.j = aVar;
            }

            public p.f b() {
                e eVar = a.this.y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            public boolean c() {
                a.this.K();
                return true;
            }

            public boolean d() {
                a aVar = a.this;
                if (aVar.A != null) {
                    return false;
                }
                aVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, i.a.h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            g0.a(this, getContentDescription());
            setOnTouchListener(new a(this, a.this));
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super/*android.view.View*/.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.K();
            return true;
        }

        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                L1.a.d(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends h {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z) {
            super(context, eVar, view, z, i.a.i);
            h(8388613);
            j(a.this.C);
        }

        public void e() {
            if (a.r(a.this) != null) {
                a.s(a.this).close();
            }
            a.this.y = null;
            super.e();
        }
    }

    public class f implements i.a {
        public f() {
        }

        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
            if (eVar instanceof l) {
                eVar.D().e(false);
            }
            i.a m = a.this.m();
            if (m != null) {
                m.b(eVar, z);
            }
        }

        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == a.u(a.this)) {
                return false;
            }
            a.this.D = ((l) eVar).getItem().getItemId();
            i.a m = a.this.m();
            if (m != null) {
                return m.c(eVar);
            }
            return false;
        }
    }

    public a(Context context) {
        super(context, i.g.c, i.g.b);
        this.x = new SparseBooleanArray();
        this.C = new f();
    }

    public static /* synthetic */ androidx.appcompat.view.menu.e r(a aVar) {
        return aVar.c;
    }

    public static /* synthetic */ androidx.appcompat.view.menu.e s(a aVar) {
        return aVar.c;
    }

    public static /* synthetic */ j t(a aVar) {
        return aVar.i;
    }

    public static /* synthetic */ androidx.appcompat.view.menu.e u(a aVar) {
        return aVar.c;
    }

    public static /* synthetic */ androidx.appcompat.view.menu.e v(a aVar) {
        return aVar.c;
    }

    public static /* synthetic */ androidx.appcompat.view.menu.e w(a aVar) {
        return aVar.c;
    }

    public static /* synthetic */ j x(a aVar) {
        return aVar.i;
    }

    public Drawable A() {
        d dVar = this.k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.m) {
            return this.l;
        }
        return null;
    }

    public boolean B() {
        View view;
        c cVar = this.A;
        if (cVar != null && (view = this.i) != null) {
            view.removeCallbacks(cVar);
            this.A = null;
            return true;
        }
        e eVar = this.y;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.z;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.A != null || E();
    }

    public boolean E() {
        e eVar = this.y;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.s) {
            this.r = o.a.b(this.b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.c;
        if (eVar != null) {
            eVar.K(true);
        }
    }

    public void G(boolean z) {
        this.v = z;
    }

    public void H(ActionMenuView actionMenuView) {
        this.i = actionMenuView;
        actionMenuView.a(this.c);
    }

    public void I(Drawable drawable) {
        d dVar = this.k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.m = true;
            this.l = drawable;
        }
    }

    public void J(boolean z) {
        this.n = z;
        this.o = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.n || E() || (eVar = this.c) == null || this.i == null || this.A != null || eVar.z().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.b, this.c, this.k, true));
        this.A = cVar;
        this.i.post(cVar);
        return true;
    }

    public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
        y();
        super.b(eVar, z);
    }

    public boolean e(l lVar) {
        boolean z = false;
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        l lVar2 = lVar;
        while (lVar2.e0() != this.c) {
            lVar2 = (l) lVar2.e0();
        }
        View z2 = z(lVar2.getItem());
        if (z2 == null) {
            return false;
        }
        this.D = lVar.getItem().getItemId();
        int size = lVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = lVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        a aVar = new a(this.b, lVar, z2);
        this.z = aVar;
        aVar.g(z);
        this.z.k();
        super.e(lVar);
        return true;
    }

    public void f(boolean z) {
        super.f(z);
        this.i.requestLayout();
        androidx.appcompat.view.menu.e eVar = this.c;
        boolean z2 = false;
        if (eVar != null) {
            ArrayList s = eVar.s();
            int size = s.size();
            for (int i = 0; i < size; i++) {
                T1.b a2 = ((g) s.get(i)).a();
                if (a2 != null) {
                    a2.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.c;
        ArrayList z3 = eVar2 != null ? eVar2.z() : null;
        if (this.n && z3 != null) {
            int size2 = z3.size();
            if (size2 == 1) {
                z2 = !((g) z3.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.k == null) {
                this.k = new d(this.a);
            }
            j jVar = (ViewGroup) this.k.getParent();
            if (jVar != this.i) {
                if (jVar != null) {
                    jVar.removeView(this.k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i;
                actionMenuView.addView(this.k, actionMenuView.D());
            }
        } else {
            d dVar = this.k;
            if (dVar != null) {
                ViewGroup parent = dVar.getParent();
                ViewGroup viewGroup = this.i;
                if (parent == viewGroup) {
                    viewGroup.removeView(this.k);
                }
            }
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    public boolean g() {
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        a aVar = this;
        androidx.appcompat.view.menu.e eVar = aVar.c;
        View view = null;
        ?? r3 = 0;
        if (eVar != null) {
            arrayList = eVar.E();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i5 = aVar.r;
        int i6 = aVar.q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.i;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            g gVar = (g) arrayList.get(i9);
            if (gVar.o()) {
                i7++;
            } else if (gVar.n()) {
                i8++;
            } else {
                z2 = true;
            }
            if (aVar.v && gVar.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (aVar.n && (z2 || i8 + i7 > i5)) {
            i5--;
        }
        int i10 = i5 - i7;
        SparseBooleanArray sparseBooleanArray = aVar.x;
        sparseBooleanArray.clear();
        if (aVar.t) {
            int i11 = aVar.w;
            i3 = i6 / i11;
            i2 = i11 + ((i6 % i11) / i3);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            g gVar2 = (g) arrayList.get(i12);
            if (gVar2.o()) {
                View n = aVar.n(gVar2, view, viewGroup);
                if (aVar.t) {
                    i3 -= ActionMenuView.J(n, i2, i3, makeMeasureSpec, r3);
                } else {
                    n.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                z = r3;
                i4 = i;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i10 > 0 || z3) && i6 > 0 && (!aVar.t || i3 > 0);
                boolean z5 = z4;
                i4 = i;
                if (z4) {
                    View n2 = aVar.n(gVar2, null, viewGroup);
                    if (aVar.t) {
                        int J = ActionMenuView.J(n2, i2, i3, makeMeasureSpec, 0);
                        i3 -= J;
                        if (J == 0) {
                            z5 = false;
                        }
                    } else {
                        n2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z6 = z5;
                    int measuredWidth2 = n2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z4 = z6 & (!aVar.t ? i6 + i13 <= 0 : i6 < 0);
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i14 = 0; i14 < i12; i14++) {
                        g gVar3 = (g) arrayList.get(i14);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i10++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z4) {
                    i10--;
                }
                gVar2.u(z4);
                z = false;
            } else {
                z = r3;
                i4 = i;
                gVar2.u(z);
            }
            i12++;
            r3 = z;
            i = i4;
            view = null;
            aVar = this;
        }
        return true;
    }

    public void i(Context context, androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        o.a b2 = o.a.b(context);
        if (!this.o) {
            this.n = b2.f();
        }
        if (!this.u) {
            this.p = b2.c();
        }
        if (!this.s) {
            this.r = b2.d();
        }
        int i = this.p;
        if (this.n) {
            if (this.k == null) {
                d dVar = new d(this.a);
                this.k = dVar;
                if (this.m) {
                    dVar.setImageDrawable(this.l);
                    this.l = null;
                    this.m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.k.getMeasuredWidth();
        } else {
            this.k = null;
        }
        this.q = i;
        this.w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public void j(g gVar, j.a aVar) {
        aVar.c(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.i);
        if (this.B == null) {
            this.B = new b();
        }
        actionMenuItemView.setPopupCallback(this.B);
    }

    public boolean l(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.k) {
            return false;
        }
        return super.l(viewGroup, i);
    }

    public View n(g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.m(layoutParams));
        }
        return actionView;
    }

    public j o(ViewGroup viewGroup) {
        j jVar = this.i;
        j o = super.o(viewGroup);
        if (jVar != o) {
            ((ActionMenuView) o).setPresenter(this);
        }
        return o;
    }

    public boolean q(int i, g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return B() | C();
    }

    public final View z(MenuItem menuItem) {
        ViewGroup viewGroup = this.i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            j.a childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof j.a) && childAt.getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }
}
