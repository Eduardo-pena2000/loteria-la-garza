package androidx.appcompat.widget;

import T1.Z;
import T1.i0;
import T1.k0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import i.e;
import i.f;
import i.h;
import i.j;
import q.H;
import q.c0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class d implements H {
    public Toolbar a;
    public int b;
    public View c;
    public View d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public boolean h;
    public CharSequence i;
    public CharSequence j;
    public CharSequence k;
    public Window.Callback l;
    public boolean m;
    public androidx.appcompat.widget.a n;
    public int o;
    public int p;
    public Drawable q;

    public class a implements View.OnClickListener {
        public final p.a a;

        public a() {
            this.a = new p.a(d.this.a.getContext(), 0, 16908332, 0, 0, d.this.i);
        }

        public void onClick(View view) {
            d dVar = d.this;
            Window.Callback callback = dVar.l;
            if (callback == null || !dVar.m) {
                return;
            }
            callback.onMenuItemSelected(0, this.a);
        }
    }

    public class b extends k0 {
        public boolean a = false;
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        public void a(View view) {
            this.a = true;
        }

        public void b(View view) {
            if (this.a) {
                return;
            }
            d.this.a.setVisibility(this.b);
        }

        public void c(View view) {
            d.this.a.setVisibility(0);
        }
    }

    public d(Toolbar toolbar, boolean z) {
        this(toolbar, z, h.a, e.n);
    }

    public void A(Drawable drawable) {
        this.f = drawable;
        J();
    }

    public void B(int i) {
        C(i == 0 ? null : getContext().getString(i));
    }

    public void C(CharSequence charSequence) {
        this.k = charSequence;
        H();
    }

    public void D(Drawable drawable) {
        this.g = drawable;
        I();
    }

    public void E(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    public void F(CharSequence charSequence) {
        this.h = true;
        G(charSequence);
    }

    public final void G(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
            if (this.h) {
                Z.W(this.a.getRootView(), charSequence);
            }
        }
    }

    public final void H() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.a.setNavigationContentDescription(this.p);
            } else {
                this.a.setNavigationContentDescription(this.k);
            }
        }
    }

    public final void I() {
        if ((this.b & 4) == 0) {
            this.a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.a;
        Drawable drawable = this.g;
        if (drawable == null) {
            drawable = this.q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void J() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f;
            if (drawable == null) {
                drawable = this.e;
            }
        } else {
            drawable = this.e;
        }
        this.a.setLogo(drawable);
    }

    public boolean a() {
        return this.a.d();
    }

    public boolean b() {
        return this.a.w();
    }

    public boolean c() {
        return this.a.Q();
    }

    public void collapseActionView() {
        this.a.e();
    }

    public void d(Menu menu, i.a aVar) {
        if (this.n == null) {
            androidx.appcompat.widget.a aVar2 = new androidx.appcompat.widget.a(this.a.getContext());
            this.n = aVar2;
            aVar2.p(f.g);
        }
        this.n.d(aVar);
        this.a.K((androidx.appcompat.view.menu.e) menu, this.n);
    }

    public boolean e() {
        return this.a.B();
    }

    public void f() {
        this.m = true;
    }

    public boolean g() {
        return this.a.A();
    }

    public Context getContext() {
        return this.a.getContext();
    }

    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    public boolean h() {
        return this.a.v();
    }

    public void i(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i2 & 3) != 0) {
                J();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.setTitle(this.i);
                    this.a.setSubtitle(this.j);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    public Menu j() {
        return this.a.getMenu();
    }

    public int k() {
        return this.o;
    }

    public i0 l(int i, long j) {
        return Z.c(this.a).b(i == 0 ? 1.0f : 0.0f).f(j).h(new b(i));
    }

    public ViewGroup m() {
        return this.a;
    }

    public void n(boolean z) {
    }

    public void o() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void p(boolean z) {
        this.a.setCollapsible(z);
    }

    public void q() {
        this.a.f();
    }

    public void r(c cVar) {
        View view = this.c;
        if (view != null) {
            Toolbar parent = view.getParent();
            Toolbar toolbar = this.a;
            if (parent == toolbar) {
                toolbar.removeView(this.c);
            }
        }
        this.c = cVar;
    }

    public void s(int i) {
        A(i != 0 ? k.a.b(getContext(), i) : null);
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? k.a.b(getContext(), i) : null);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (this.h) {
            return;
        }
        G(charSequence);
    }

    public void t(i.a aVar, e.a aVar2) {
        this.a.L(aVar, aVar2);
    }

    public void u(int i) {
        this.a.setVisibility(i);
    }

    public int v() {
        return this.b;
    }

    public void w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final int x() {
        if (this.a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.a.getNavigationIcon();
        return 15;
    }

    public void y(View view) {
        View view2 = this.d;
        if (view2 != null && (this.b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.d = view;
        if (view == null || (this.b & 16) == 0) {
            return;
        }
        this.a.addView(view);
    }

    public void z(int i) {
        if (i == this.p) {
            return;
        }
        this.p = i;
        if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
            B(this.p);
        }
    }

    public d(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        c0 u = c0.u(toolbar.getContext(), null, j.a, i.a.c, 0);
        this.q = u.f(j.l);
        if (z) {
            CharSequence o = u.o(j.r);
            if (!TextUtils.isEmpty(o)) {
                F(o);
            }
            CharSequence o2 = u.o(j.p);
            if (!TextUtils.isEmpty(o2)) {
                E(o2);
            }
            Drawable f = u.f(j.n);
            if (f != null) {
                A(f);
            }
            Drawable f2 = u.f(j.m);
            if (f2 != null) {
                setIcon(f2);
            }
            if (this.g == null && (drawable = this.q) != null) {
                D(drawable);
            }
            i(u.j(j.h, 0));
            int m = u.m(j.g, 0);
            if (m != 0) {
                y(LayoutInflater.from(this.a.getContext()).inflate(m, this.a, false));
                i(this.b | 16);
            }
            int l = u.l(j.j, 0);
            if (l > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = l;
                this.a.setLayoutParams(layoutParams);
            }
            int d = u.d(j.f, -1);
            int d2 = u.d(j.e, -1);
            if (d >= 0 || d2 >= 0) {
                this.a.J(Math.max(d, 0), Math.max(d2, 0));
            }
            int m2 = u.m(j.s, 0);
            if (m2 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.N(toolbar2.getContext(), m2);
            }
            int m3 = u.m(j.q, 0);
            if (m3 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.M(toolbar3.getContext(), m3);
            }
            int m4 = u.m(j.o, 0);
            if (m4 != 0) {
                this.a.setPopupTheme(m4);
            }
        } else {
            this.b = x();
        }
        u.v();
        z(i);
        this.k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a());
    }

    public void setIcon(Drawable drawable) {
        this.e = drawable;
        J();
    }
}
