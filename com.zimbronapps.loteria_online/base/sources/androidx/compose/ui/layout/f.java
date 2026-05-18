package androidx.compose.ui.layout;

import M0.T;
import M0.U;
import M0.V;
import T1.A0;
import T1.H;
import T1.Z;
import T1.n0;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.layout.C;
import androidx.compose.ui.platform.AndroidComposeView;
import b0.C0;
import b0.J1;
import b0.U1;
import java.util.List;
import w.F;
import w.L;
import w.P;
import w.c0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f extends n0.b implements Runnable, H, View.OnAttachStateChangeListener {
    public final AndroidComposeView c;
    public boolean d;
    public int e;
    public A0 f;
    public final c0 g;
    public final b0.A0 h;
    public final L i;
    public final l0.E j;

    public f(AndroidComposeView androidComposeView) {
        super(1);
        this.c = androidComposeView;
        P p = new P(9);
        C.a aVar = C.a;
        p.x(aVar.a(), new V("caption bar"));
        p.x(aVar.b(), new V("display cutout"));
        p.x(aVar.c(), new V("ime"));
        p.x(aVar.d(), new V("mandatory system gestures"));
        p.x(aVar.e(), new V("navigation bars"));
        p.x(aVar.f(), new V("status bars"));
        p.x(aVar.g(), new V("system gestures"));
        p.x(aVar.h(), new V("tappable element"));
        p.x(aVar.i(), new V("waterfall"));
        this.g = p;
        this.h = J1.a(0);
        this.i = new L(4);
        this.j = U1.e();
    }

    public A0 a(View view, A0 a0) {
        if (this.d) {
            this.f = a0;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (this.e == 0) {
            m(a0);
        }
        return a0;
    }

    public void c(n0 n0Var) {
        this.d = false;
        int d = n0Var.d();
        this.e &= ~d;
        this.f = null;
        C c = (C) E.b().c(d);
        if (c != null) {
            Object e = this.g.e(c);
            kotlin.jvm.internal.t.d(e);
            V v = (V) e;
            v.l(0.0f);
            v.h(1.0f);
            v.k(0L);
            v.l(0.0f);
            k(v);
            b0.A0 a0 = this.h;
            a0.j(a0.getIntValue() + 1);
            l0.l.e.m();
        }
        super.c(n0Var);
    }

    public void d(n0 n0Var) {
        this.d = true;
        super.d(n0Var);
    }

    public A0 e(A0 a0, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            n0 n0Var = (n0) list.get(i);
            C c = (C) E.b().c(n0Var.d());
            if (c != null) {
                Object e = this.g.e(c);
                kotlin.jvm.internal.t.d(e);
                V v = (V) e;
                if (v.g()) {
                    l(v, n0Var);
                }
            }
        }
        m(a0);
        return a0;
    }

    public n0.a f(n0 n0Var, n0.a aVar) {
        A0 a0 = this.f;
        this.d = false;
        this.f = null;
        if (n0Var.b() > 0 && a0 != null) {
            int d = n0Var.d();
            this.e |= d;
            C c = (C) E.b().c(d);
            if (c != null) {
                Object e = this.g.e(c);
                kotlin.jvm.internal.t.d(e);
                V v = (V) e;
                K1.b f = a0.f(d);
                long a = T.a(f.d | (f.a << 48) | (f.b << 32) | (f.c << 16));
                long a2 = v.a();
                if (!T.b(a, a2)) {
                    v.n(a2);
                    v.o(a);
                    v.i(true);
                    l(v, n0Var);
                    b0.A0 a02 = this.h;
                    a02.j(a02.getIntValue() + 1);
                    l0.l.e.m();
                }
            }
        }
        return super.f(n0Var, aVar);
    }

    public final l0.E g() {
        return this.j;
    }

    public final L h() {
        return this.i;
    }

    public final b0.A0 i() {
        return this.h;
    }

    public final c0 j() {
        return this.g;
    }

    public final void k(V v) {
        v.i(false);
        v.n(U.a());
        v.o(U.a());
    }

    public final void l(V v, n0 n0Var) {
        v.l(n0Var.c());
        v.h(n0Var.a());
        v.k(n0Var.b());
    }

    public final void m(A0 a0) {
        boolean z;
        boolean z2;
        long a;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i;
        int i2;
        int i3;
        w.o c = E.c();
        int[] iArr3 = c.b;
        Object[] objArr = c.c;
        long[] jArr3 = c.a;
        int length = jArr3.length - 2;
        long j = 255;
        char c2 = 7;
        long j2 = -9187201950435737472L;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            z = false;
            z2 = false;
            while (true) {
                long j3 = jArr3[i5];
                if ((((~j3) << c2) & j3 & j2) != j2) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j3 & j) < 128) {
                            int i8 = (i5 << 3) + i7;
                            int i9 = iArr3[i8];
                            C c3 = (C) objArr[i8];
                            K1.b f = a0.f(i9);
                            i3 = i5;
                            i2 = i6;
                            long a2 = T.a((f.b << 32) | (f.a << 48) | (f.c << 16) | f.d);
                            Object e = this.g.e(c3);
                            kotlin.jvm.internal.t.d(e);
                            V v = (V) e;
                            if (!T.b(a2, v.a())) {
                                v.j(a2);
                                z = true;
                                if (!T.b(a2, U.b())) {
                                    z2 = true;
                                }
                            }
                            i4 = 8;
                        } else {
                            i2 = i6;
                            i3 = i5;
                        }
                        j3 >>= i4;
                        i7++;
                        i5 = i3;
                        i6 = i2;
                        j = 255;
                    }
                    int i10 = i5;
                    if (i6 != i4) {
                        break;
                    } else {
                        i = i10;
                    }
                } else {
                    i = i5;
                }
                if (i == length) {
                    break;
                }
                i5 = i + 1;
                i4 = 8;
                j = 255;
                c2 = 7;
                j2 = -9187201950435737472L;
            }
        } else {
            z = false;
            z2 = false;
        }
        F b = E.b();
        int[] iArr4 = b.b;
        Object[] objArr2 = b.c;
        long[] jArr4 = b.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i11 = 0;
            while (true) {
                long j4 = jArr4[i11];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length2)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j4 & 255) < 128) {
                            int i14 = (i11 << 3) + i13;
                            int i15 = iArr4[i14];
                            Object e2 = this.g.e((C) objArr2[i14]);
                            kotlin.jvm.internal.t.d(e2);
                            V v2 = (V) e2;
                            if (i15 != A0.l.d()) {
                                K1.b g = a0.g(i15);
                                jArr2 = jArr4;
                                iArr2 = iArr4;
                                long a3 = T.a((g.b << 32) | (g.a << 48) | (g.c << 16) | g.d);
                                if (!T.b(v2.b(), a3)) {
                                    v2.m(a3);
                                    z = true;
                                    if (!T.b(a3, U.b())) {
                                        z2 = true;
                                    }
                                }
                            } else {
                                jArr2 = jArr4;
                                iArr2 = iArr4;
                            }
                            v2.p(a0.q(i15));
                        } else {
                            jArr2 = jArr4;
                            iArr2 = iArr4;
                        }
                        j4 >>= 8;
                        i13++;
                        jArr4 = jArr2;
                        iArr4 = iArr2;
                    }
                    jArr = jArr4;
                    iArr = iArr4;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    iArr = iArr4;
                }
                if (i11 == length2) {
                    break;
                }
                i11++;
                jArr4 = jArr;
                iArr4 = iArr;
            }
        }
        T1.r e3 = a0.e();
        if (e3 == null) {
            a = U.b();
        } else {
            K1.b f2 = e3.f();
            a = T.a((f2.a << 48) | (f2.b << 32) | (f2.c << 16) | f2.d);
        }
        c0 c0Var = this.g;
        C.a aVar = C.a;
        Object e4 = c0Var.e(aVar.i());
        kotlin.jvm.internal.t.d(e4);
        V v3 = (V) e4;
        if (!T.b(v3.a(), a)) {
            v3.j(a);
            v3.m(a);
            z = true;
            if (!T.b(a, U.b())) {
                z2 = true;
            }
        }
        long b2 = e3 == null ? U.b() : T.a((e3.e() << 32) | (e3.c() << 48) | (e3.d() << 16) | e3.b());
        Object e5 = this.g.e(aVar.b());
        kotlin.jvm.internal.t.d(e5);
        V v4 = (V) e5;
        if (!T.b(b2, v4.a())) {
            v4.j(b2);
            v4.m(b2);
            z = true;
            if (!T.b(b2, U.b())) {
                z2 = true;
            }
        }
        if (e3 != null) {
            List a4 = e3.a();
            if (a4.size() < this.i.d()) {
                this.i.s(a4.size(), this.i.d());
                this.j.v(a4.size(), this.j.size());
                z = true;
            } else {
                int size = a4.size() - this.i.d();
                int i16 = 0;
                while (i16 < size) {
                    L l = this.i;
                    l.k(U1.i(a4.get(l.d()), null, 2, null));
                    this.j.add(t.a("display cutout rect " + this.i.d()));
                    i16++;
                    z = true;
                }
            }
            int size2 = a4.size();
            for (int i17 = 0; i17 < size2; i17++) {
                Rect rect = (Rect) a4.get(i17);
                C0 c0 = (C0) this.i.c(i17);
                if (!kotlin.jvm.internal.t.c(c0.getValue(), rect)) {
                    c0.setValue(rect);
                    z = true;
                }
            }
            if (!a4.isEmpty()) {
                z2 = true;
            }
        } else if (this.i.d() > 0) {
            this.i.n();
            this.j.clear();
            z = true;
        }
        if ((z2 || this.h.getIntValue() != 0) && z) {
            b0.A0 a02 = this.h;
            a02.j(a02.getIntValue() + 1);
            l0.l.e.m();
        }
    }

    public void onViewAttachedToWindow(View view) {
        ViewParent parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Z.g0(view, this);
        Z.l0(view, this);
    }

    public void onViewDetachedFromWindow(View view) {
        ViewParent parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Z.g0(view, null);
        Z.l0(view, null);
    }

    public void run() {
        if (this.d) {
            this.e = 0;
            this.d = false;
            A0 a0 = this.f;
            if (a0 != null) {
                m(a0);
                this.f = null;
            }
        }
    }
}
