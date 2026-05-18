package androidx.appcompat.view.menu;

import T1.Z;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import q.T;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k extends p.d implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, i, View.OnKeyListener {
    public static final int v = i.g.m;
    public final Context b;
    public final e c;
    public final d d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final T i;
    public PopupWindow.OnDismissListener l;
    public View m;
    public View n;
    public i.a o;
    public ViewTreeObserver p;
    public boolean q;
    public boolean r;
    public int s;
    public boolean u;
    public final ViewTreeObserver.OnGlobalLayoutListener j = new a();
    public final View.OnAttachStateChangeListener k = new b();
    public int t = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (!k.this.a() || k.this.i.w()) {
                return;
            }
            View view = k.this.n;
            if (view == null || !view.isShown()) {
                k.this.dismiss();
            } else {
                k.this.i.show();
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = k.this.p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    k.this.p = view.getViewTreeObserver();
                }
                k kVar = k.this;
                kVar.p.removeGlobalOnLayoutListener(kVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public k(Context context, e eVar, View view, int i, int i2, boolean z) {
        this.b = context;
        this.c = eVar;
        this.e = z;
        this.d = new d(eVar, LayoutInflater.from(context), z, v);
        this.g = i;
        this.h = i2;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(i.d.b));
        this.m = view;
        this.i = new T(context, null, i, i2);
        eVar.c(this, context);
    }

    public boolean a() {
        return !this.q && this.i.a();
    }

    public void b(e eVar, boolean z) {
        if (eVar != this.c) {
            return;
        }
        dismiss();
        i.a aVar = this.o;
        if (aVar != null) {
            aVar.b(eVar, z);
        }
    }

    public void d(i.a aVar) {
        this.o = aVar;
    }

    public void dismiss() {
        if (a()) {
            this.i.dismiss();
        }
    }

    public boolean e(l lVar) {
        if (lVar.hasVisibleItems()) {
            h hVar = new h(this.b, lVar, this.n, this.e, this.g, this.h);
            hVar.j(this.o);
            hVar.g(p.d.w(lVar));
            hVar.i(this.l);
            this.l = null;
            this.c.e(false);
            int b2 = this.i.b();
            int k = this.i.k();
            if ((Gravity.getAbsoluteGravity(this.t, Z.t(this.m)) & 7) == 5) {
                b2 += this.m.getWidth();
            }
            if (hVar.n(b2, k)) {
                i.a aVar = this.o;
                if (aVar == null) {
                    return true;
                }
                aVar.c(lVar);
                return true;
            }
        }
        return false;
    }

    public void f(boolean z) {
        this.r = false;
        d dVar = this.d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    public boolean g() {
        return false;
    }

    public void j(e eVar) {
    }

    public ListView n() {
        return this.i.n();
    }

    public void o(View view) {
        this.m = view;
    }

    public void onDismiss() {
        this.q = true;
        this.c.close();
        ViewTreeObserver viewTreeObserver = this.p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.p = this.n.getViewTreeObserver();
            }
            this.p.removeGlobalOnLayoutListener(this.j);
            this.p = null;
        }
        this.n.removeOnAttachStateChangeListener(this.k);
        PopupWindow.OnDismissListener onDismissListener = this.l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.d.d(z);
    }

    public void r(int i) {
        this.t = i;
    }

    public void s(int i) {
        this.i.d(i);
    }

    public void show() {
        if (!y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.l = onDismissListener;
    }

    public void u(boolean z) {
        this.u = z;
    }

    public void v(int i) {
        this.i.h(i);
    }

    public final boolean y() {
        View view;
        if (a()) {
            return true;
        }
        if (this.q || (view = this.m) == null) {
            return false;
        }
        this.n = view;
        this.i.F(this);
        this.i.G(this);
        this.i.E(true);
        View view2 = this.n;
        boolean z = this.p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.p = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.j);
        }
        view2.addOnAttachStateChangeListener(this.k);
        this.i.y(view2);
        this.i.B(this.t);
        if (!this.r) {
            this.s = p.d.m(this.d, null, this.b, this.f);
            this.r = true;
        }
        this.i.A(this.s);
        this.i.D(2);
        this.i.C(l());
        this.i.show();
        ListView n = this.i.n();
        n.setOnKeyListener(this);
        if (this.u && this.c.x() != null) {
            FrameLayout inflate = LayoutInflater.from(this.b).inflate(i.g.l, n, false);
            TextView findViewById = inflate.findViewById(16908310);
            if (findViewById != null) {
                findViewById.setText(this.c.x());
            }
            inflate.setEnabled(false);
            n.addHeaderView(inflate, (Object) null, false);
        }
        this.i.l(this.d);
        this.i.show();
        return true;
    }
}
