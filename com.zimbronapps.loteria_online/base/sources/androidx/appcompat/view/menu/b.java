package androidx.appcompat.view.menu;

import T1.Z;
import T1.s;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q.S;
import q.T;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b extends p.d implements i, View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int B = i.g.e;
    public boolean A;
    public final Context b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final Handler g;
    public View o;
    public View p;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public boolean w;
    public i.a x;
    public ViewTreeObserver y;
    public PopupWindow.OnDismissListener z;
    public final List h = new ArrayList();
    public final List i = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener j = new a();
    public final View.OnAttachStateChangeListener k = new b();
    public final S l = new c();
    public int m = 0;
    public int n = 0;
    public boolean v = false;
    public int q = C();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (!b.this.a() || b.this.i.size() <= 0 || ((d) b.this.i.get(0)).a.w()) {
                return;
            }
            View view = b.this.p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.i.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a.show();
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.y.removeGlobalOnLayoutListener(bVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements S {

        public class a implements Runnable {
            public final /* synthetic */ d a;
            public final /* synthetic */ MenuItem b;
            public final /* synthetic */ e c;

            public a(d dVar, MenuItem menuItem, e eVar) {
                this.a = dVar;
                this.b = menuItem;
                this.c = eVar;
            }

            public void run() {
                d dVar = this.a;
                if (dVar != null) {
                    b.this.A = true;
                    dVar.b.e(false);
                    b.this.A = false;
                }
                if (this.b.isEnabled() && this.b.hasSubMenu()) {
                    this.c.L(this.b, 4);
                }
            }
        }

        public c() {
        }

        public void c(e eVar, MenuItem menuItem) {
            b.this.g.removeCallbacksAndMessages((Object) null);
            int size = b.this.i.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (eVar == ((d) b.this.i.get(i)).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            b.this.g.postAtTime(new a(i2 < b.this.i.size() ? (d) b.this.i.get(i2) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        public void m(e eVar, MenuItem menuItem) {
            b.this.g.removeCallbacksAndMessages(eVar);
        }
    }

    public static class d {
        public final T a;
        public final e b;
        public final int c;

        public d(T t, e eVar, int i) {
            this.a = t;
            this.b = eVar;
            this.c = i;
        }

        public ListView a() {
            return this.a.n();
        }
    }

    public b(Context context, View view, int i, int i2, boolean z) {
        this.b = context;
        this.o = view;
        this.d = i;
        this.e = i2;
        this.f = z;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(i.d.b));
        this.g = new Handler();
    }

    public final MenuItem A(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View B(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int i;
        int firstVisiblePosition;
        MenuItem A = A(dVar.b, eVar);
        if (A == null) {
            return null;
        }
        ListView a2 = dVar.a();
        HeaderViewListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = adapter;
            i = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            i = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            }
            if (A == dVar2.c(i2)) {
                break;
            }
            i2++;
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int C() {
        return Z.t(this.o) == 1 ? 0 : 1;
    }

    public final int D(int i) {
        List list = this.i;
        ListView a2 = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.p.getWindowVisibleDisplayFrame(rect);
        return this.q == 1 ? (iArr[0] + a2.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    public final void E(e eVar) {
        d dVar;
        View view;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, from, this.f, B);
        if (!a() && this.v) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(p.d.w(eVar));
        }
        int m = p.d.m(dVar2, null, this.b, this.c);
        T y = y();
        y.l(dVar2);
        y.A(m);
        y.B(this.n);
        if (this.i.size() > 0) {
            List list = this.i;
            dVar = (d) list.get(list.size() - 1);
            view = B(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            y.P(false);
            y.M(null);
            int D = D(m);
            boolean z = D == 1;
            this.q = D;
            if (Build.VERSION.SDK_INT >= 26) {
                y.y(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.n & 7) == 5) {
                    iArr[0] = iArr[0] + this.o.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.n & 5) == 5) {
                if (!z) {
                    m = view.getWidth();
                    i3 = i - m;
                }
                i3 = i + m;
            } else {
                if (z) {
                    m = view.getWidth();
                    i3 = i + m;
                }
                i3 = i - m;
            }
            y.d(i3);
            y.H(true);
            y.h(i2);
        } else {
            if (this.r) {
                y.d(this.t);
            }
            if (this.s) {
                y.h(this.u);
            }
            y.C(l());
        }
        this.i.add(new d(y, eVar, this.q));
        y.show();
        ListView n = y.n();
        n.setOnKeyListener(this);
        if (dVar == null && this.w && eVar.x() != null) {
            FrameLayout inflate = from.inflate(i.g.l, n, false);
            TextView findViewById = inflate.findViewById(16908310);
            inflate.setEnabled(false);
            findViewById.setText(eVar.x());
            n.addHeaderView(inflate, (Object) null, false);
            y.show();
        }
    }

    public boolean a() {
        return this.i.size() > 0 && ((d) this.i.get(0)).a.a();
    }

    public void b(e eVar, boolean z) {
        int z2 = z(eVar);
        if (z2 < 0) {
            return;
        }
        int i = z2 + 1;
        if (i < this.i.size()) {
            ((d) this.i.get(i)).b.e(false);
        }
        d dVar = (d) this.i.remove(z2);
        dVar.b.O(this);
        if (this.A) {
            dVar.a.N(null);
            dVar.a.z(0);
        }
        dVar.a.dismiss();
        int size = this.i.size();
        if (size > 0) {
            this.q = ((d) this.i.get(size - 1)).c;
        } else {
            this.q = C();
        }
        if (size != 0) {
            if (z) {
                ((d) this.i.get(0)).b.e(false);
                return;
            }
            return;
        }
        dismiss();
        i.a aVar = this.x;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.y.removeGlobalOnLayoutListener(this.j);
            }
            this.y = null;
        }
        this.p.removeOnAttachStateChangeListener(this.k);
        this.z.onDismiss();
    }

    public void d(i.a aVar) {
        this.x = aVar;
    }

    public void dismiss() {
        int size = this.i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.i.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.a.a()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    public boolean e(l lVar) {
        for (d dVar : this.i) {
            if (lVar == dVar.b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        j(lVar);
        i.a aVar = this.x;
        if (aVar != null) {
            aVar.c(lVar);
        }
        return true;
    }

    public void f(boolean z) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            p.d.x(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    public boolean g() {
        return false;
    }

    public void j(e eVar) {
        eVar.c(this, this.b);
        if (a()) {
            E(eVar);
        } else {
            this.h.add(eVar);
        }
    }

    public boolean k() {
        return false;
    }

    public ListView n() {
        if (this.i.isEmpty()) {
            return null;
        }
        return ((d) this.i.get(r0.size() - 1)).a();
    }

    public void o(View view) {
        if (this.o != view) {
            this.o = view;
            this.n = s.a(this.m, Z.t(view));
        }
    }

    public void onDismiss() {
        d dVar;
        int size = this.i.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.i.get(i);
            if (!dVar.a.a()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.b.e(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void q(boolean z) {
        this.v = z;
    }

    public void r(int i) {
        if (this.m != i) {
            this.m = i;
            this.n = s.a(i, Z.t(this.o));
        }
    }

    public void s(int i) {
        this.r = true;
        this.t = i;
    }

    public void show() {
        if (a()) {
            return;
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            E((e) it.next());
        }
        this.h.clear();
        View view = this.o;
        this.p = view;
        if (view != null) {
            boolean z = this.y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.y = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.j);
            }
            this.p.addOnAttachStateChangeListener(this.k);
        }
    }

    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    public void u(boolean z) {
        this.w = z;
    }

    public void v(int i) {
        this.s = true;
        this.u = i;
    }

    public final T y() {
        T t = new T(this.b, null, this.d, this.e);
        t.O(this.l);
        t.G(this);
        t.F(this);
        t.y(this.o);
        t.B(this.n);
        t.E(true);
        t.D(2);
        return t;
    }

    public final int z(e eVar) {
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            if (eVar == ((d) this.i.get(i)).b) {
                return i;
            }
        }
        return -1;
    }
}
