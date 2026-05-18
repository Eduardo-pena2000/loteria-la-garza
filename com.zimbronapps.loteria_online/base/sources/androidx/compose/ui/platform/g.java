package androidx.compose.ui.platform;

import Ca.I;
import O0.J;
import O0.g0;
import O0.p0;
import P0.c1;
import P0.d1;
import P0.e1;
import P0.p;
import P0.q;
import P0.r;
import P0.s;
import U1.v;
import W0.C;
import W0.t;
import W0.x;
import W0.y;
import Z0.T0;
import Z0.W0;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.k;
import i1.w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u;
import v0.E1;
import v0.S;
import v0.i1;
import v0.m1;
import w.D;
import w.F;
import w.G;
import w.e0;
import w.j0;
import w.m;
import w.n;
import w.o;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g extends T1.a {
    public static final d S = new d(null);
    public static final int T = 8;
    public static final m U = n.a(o0.l.a, o0.l.b, o0.l.m, o0.l.x, o0.l.A, o0.l.B, o0.l.C, o0.l.D, o0.l.E, o0.l.F, o0.l.c, o0.l.d, o0.l.e, o0.l.f, o0.l.g, o0.l.h, o0.l.i, o0.l.j, o0.l.k, o0.l.l, o0.l.n, o0.l.o, o0.l.p, o0.l.q, o0.l.r, o0.l.s, o0.l.t, o0.l.u, o0.l.v, o0.l.w, o0.l.y, o0.l.z);
    public final w.b A;
    public final eb.g B;
    public boolean C;
    public f D;
    public o E;
    public G F;
    public D G;
    public D H;
    public final String I;
    public final String J;
    public final w K;
    public F L;
    public d1 M;
    public boolean N;
    public final D O;
    public final Runnable P;
    public final List Q;
    public final Qa.l R;
    public final AndroidComposeView d;
    public int e = Integer.MIN_VALUE;
    public Qa.l f = new h();
    public final AccessibilityManager g;
    public boolean h;
    public long i;
    public final AccessibilityManager.AccessibilityStateChangeListener j;
    public final AccessibilityManager.TouchExplorationStateChangeListener k;
    public List l;
    public Boolean m;
    public final Handler n;
    public e o;
    public int p;
    public int q;
    public v r;
    public v s;
    public boolean t;
    public final F u;
    public final F v;
    public j0 w;
    public j0 x;
    public int y;
    public Integer z;

    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        public void onViewAttachedToWindow(View view) {
            AccessibilityManager u = g.u(g.this);
            g gVar = g.this;
            g.M(gVar, g.u(gVar).getEnabledAccessibilityServiceList(-1));
            u.addAccessibilityStateChangeListener(g.y(gVar));
            u.addTouchExplorationStateChangeListener(g.F(gVar));
        }

        public void onViewDetachedFromWindow(View view) {
            g.A(g.this).removeCallbacks(g.D(g.this));
            AccessibilityManager u = g.u(g.this);
            g gVar = g.this;
            u.removeAccessibilityStateChangeListener(g.y(gVar));
            u.removeTouchExplorationStateChangeListener(g.F(gVar));
        }
    }

    public static final class b {
        public static final b a = new b();

        public static final void a(v vVar, t tVar) {
            W0.a aVar;
            if (!s.b(tVar) || (aVar = (W0.a) W0.n.a(tVar.y(), W0.l.a.x())) == null) {
                return;
            }
            vVar.b(new v.a(16908349, aVar.b()));
        }
    }

    public static final class c {
        public static final c a = new c();

        public static final void a(v vVar, t tVar) {
            W0.h hVar = (W0.h) W0.n.a(tVar.y(), y.a.D());
            if (s.b(tVar)) {
                if (hVar == null ? false : W0.h.m(hVar.p(), W0.h.b.b())) {
                    return;
                }
                W0.m y = tVar.y();
                W0.l lVar = W0.l.a;
                W0.a aVar = (W0.a) W0.n.a(y, lVar.r());
                if (aVar != null) {
                    vVar.b(new v.a(16908358, aVar.b()));
                }
                W0.a aVar2 = (W0.a) W0.n.a(tVar.y(), lVar.o());
                if (aVar2 != null) {
                    vVar.b(new v.a(16908359, aVar2.b()));
                }
                W0.a aVar3 = (W0.a) W0.n.a(tVar.y(), lVar.p());
                if (aVar3 != null) {
                    vVar.b(new v.a(16908360, aVar3.b()));
                }
                W0.a aVar4 = (W0.a) W0.n.a(tVar.y(), lVar.q());
                if (aVar4 != null) {
                    vVar.b(new v.a(16908361, aVar4.b()));
                }
            }
        }
    }

    public static final class d {
        public /* synthetic */ d(kotlin.jvm.internal.k kVar) {
            this();
        }

        public d() {
        }
    }

    public final class e extends U1.w {
        public e() {
        }

        public void a(int i, v vVar, String str, Bundle bundle) {
            g.q(g.this, i, vVar, str, bundle);
        }

        public v b(int i) {
            v s = g.s(g.this, i);
            g gVar = g.this;
            if (g.E(gVar)) {
                if (i == g.t(gVar)) {
                    g.K(gVar, s);
                }
                if (i == g.z(gVar)) {
                    g.L(gVar, s);
                }
            }
            return s;
        }

        public v d(int i) {
            if (i == 1) {
                if (g.z(g.this) == Integer.MIN_VALUE) {
                    return null;
                }
                return b(g.z(g.this));
            }
            if (i == 2) {
                return b(g.t(g.this));
            }
            throw new IllegalArgumentException("Unknown focus type: " + i);
        }

        public boolean f(int i, int i2, Bundle bundle) {
            return g.H(g.this, i, i2, bundle);
        }
    }

    public static final class f {
        public final t a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final long f;

        public f(t tVar, int i, int i2, int i3, int i4, long j) {
            this.a = tVar;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = j;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.d;
        }

        public final int c() {
            return this.c;
        }

        public final t d() {
            return this.a;
        }

        public final int e() {
            return this.e;
        }

        public final long f() {
            return this.f;
        }
    }

    public static final class g extends Ia.d {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public g(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return g.this.P(this);
        }
    }

    public static final class h extends u implements Qa.l {
        public h() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(g.this.l0().getParent().requestSendAccessibilityEvent(g.this.l0(), accessibilityEvent));
        }
    }

    public static final class i extends u implements Qa.a {
        public final /* synthetic */ c1 a;
        public final /* synthetic */ g b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(c1 c1Var, g gVar) {
            super(0);
            this.a = c1Var;
            this.b = gVar;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            t b;
            J s;
            W0.j a = this.a.a();
            W0.j e = this.a.e();
            Float b2 = this.a.b();
            Float c = this.a.c();
            float floatValue = (a == null || b2 == null) ? 0.0f : ((Number) a.c().invoke()).floatValue() - b2.floatValue();
            float floatValue2 = (e == null || c == null) ? 0.0f : ((Number) e.c().invoke()).floatValue() - c.floatValue();
            if (floatValue != 0.0f || floatValue2 != 0.0f) {
                int J = g.J(this.b, this.a.d());
                W0.v vVar = (W0.v) g.v(this.b).c(g.t(this.b));
                if (vVar != null) {
                    g gVar = this.b;
                    try {
                        v w = g.w(gVar);
                        if (w != null) {
                            w.d0(g.r(gVar, vVar));
                            I i = I.a;
                        }
                    } catch (IllegalStateException unused) {
                        I i2 = I.a;
                    }
                }
                W0.v vVar2 = (W0.v) g.v(this.b).c(g.z(this.b));
                if (vVar2 != null) {
                    g gVar2 = this.b;
                    try {
                        v x = g.x(gVar2);
                        if (x != null) {
                            x.d0(g.r(gVar2, vVar2));
                            I i3 = I.a;
                        }
                    } catch (IllegalStateException unused2) {
                        I i4 = I.a;
                    }
                }
                this.b.l0().invalidate();
                W0.v vVar3 = (W0.v) g.v(this.b).c(J);
                if (vVar3 != null && (b = vVar3.b()) != null && (s = b.s()) != null) {
                    g gVar3 = this.b;
                    if (a != null) {
                        g.B(gVar3).s(J, a);
                    }
                    if (e != null) {
                        g.C(gVar3).s(J, e);
                    }
                    g.G(gVar3, s);
                }
            }
            if (a != null) {
                this.a.g((Float) a.c().invoke());
            }
            if (e != null) {
                this.a.h((Float) e.c().invoke());
            }
        }
    }

    public static final class j extends u implements Qa.l {
        public j() {
            super(1);
        }

        public final void a(c1 c1Var) {
            g.I(g.this, c1Var);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((c1) obj);
            return I.a;
        }
    }

    public static final class k extends u implements Qa.l {
        public static final k a = new k();

        public k() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(J j) {
            W0.m c = j.c();
            boolean z = false;
            if (c != null && c.p()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class l extends u implements Qa.l {
        public static final l a = new l();

        public l() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(J j) {
            return Boolean.valueOf(j.s0().p(g0.a(8)));
        }
    }

    public g(AndroidComposeView androidComposeView) {
        this.d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        kotlin.jvm.internal.t.e(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.g = accessibilityManager;
        this.i = 100L;
        this.j = new p(this);
        this.k = new q(this);
        this.l = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.n = new Handler(Looper.getMainLooper());
        this.o = new e();
        this.p = Integer.MIN_VALUE;
        this.q = Integer.MIN_VALUE;
        this.u = new F(0, 1, null);
        this.v = new F(0, 1, null);
        this.w = new j0(0, 1, null);
        this.x = new j0(0, 1, null);
        this.y = -1;
        this.A = new w.b(0, 1, null);
        this.B = eb.j.b(1, (eb.a) null, (Qa.l) null, 6, (Object) null);
        this.C = true;
        this.E = w.p.b();
        this.F = new G(0, 1, null);
        this.G = new D(0, 1, null);
        this.H = new D(0, 1, null);
        this.I = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.J = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.K = new w();
        this.L = w.p.c();
        this.M = new d1(androidComposeView.getSemanticsOwner().d(), w.p.b());
        this.O = w.k.a();
        androidComposeView.addOnAttachStateChangeListener(new a());
        this.P = new r(this);
        this.Q = new ArrayList();
        this.R = new j();
    }

    public static final /* synthetic */ Handler A(g gVar) {
        return gVar.n;
    }

    public static final boolean A0(W0.j jVar) {
        return (((Number) jVar.c().invoke()).floatValue() < ((Number) jVar.a().invoke()).floatValue() && !jVar.b()) || (((Number) jVar.c().invoke()).floatValue() > 0.0f && jVar.b());
    }

    public static final /* synthetic */ F B(g gVar) {
        return gVar.u;
    }

    public static final /* synthetic */ F C(g gVar) {
        return gVar.v;
    }

    public static final /* synthetic */ Runnable D(g gVar) {
        return gVar.P;
    }

    public static final /* synthetic */ boolean E(g gVar) {
        return gVar.t;
    }

    public static final void E0(g gVar) {
        Trace.beginSection("measureAndLayout");
        try {
            p0.p(gVar.d, false, 1, null);
            I i2 = I.a;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                gVar.S();
                Trace.endSection();
                gVar.N = false;
            } finally {
            }
        } finally {
        }
    }

    public static final /* synthetic */ AccessibilityManager.TouchExplorationStateChangeListener F(g gVar) {
        return gVar.k;
    }

    public static final /* synthetic */ void G(g gVar, J j2) {
        gVar.s0(j2);
    }

    public static final /* synthetic */ boolean H(g gVar, int i2, int i3, Bundle bundle) {
        return gVar.v0(i2, i3, bundle);
    }

    public static final /* synthetic */ void I(g gVar, c1 c1Var) {
        gVar.D0(c1Var);
    }

    public static final /* synthetic */ int J(g gVar, int i2) {
        return gVar.F0(i2);
    }

    public static /* synthetic */ boolean J0(g gVar, int i2, int i3, Integer num, List list, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        if ((i4 & 8) != 0) {
            list = null;
        }
        return gVar.I0(i2, i3, num, list);
    }

    public static final /* synthetic */ void K(g gVar, v vVar) {
        gVar.r = vVar;
    }

    public static final /* synthetic */ void L(g gVar, v vVar) {
        gVar.s = vVar;
    }

    public static final /* synthetic */ void M(g gVar, List list) {
        gVar.l = list;
    }

    public static final void Z0(g gVar, boolean z) {
        gVar.l = gVar.g.getEnabledAccessibilityServiceList(-1);
    }

    public static final void a0(g gVar, boolean z) {
        gVar.l = z ? gVar.g.getEnabledAccessibilityServiceList(-1) : Da.v.n();
    }

    public static /* synthetic */ void n(g gVar, boolean z) {
        Z0(gVar, z);
    }

    public static /* synthetic */ void o(g gVar) {
        E0(gVar);
    }

    public static /* synthetic */ void p(g gVar, boolean z) {
        a0(gVar, z);
    }

    public static final /* synthetic */ void q(g gVar, int i2, v vVar, String str, Bundle bundle) {
        gVar.N(i2, vVar, str, bundle);
    }

    public static final /* synthetic */ Rect r(g gVar, W0.v vVar) {
        return gVar.O(vVar);
    }

    public static final /* synthetic */ v s(g gVar, int i2) {
        return gVar.V(i2);
    }

    public static final /* synthetic */ int t(g gVar) {
        return gVar.p;
    }

    public static final /* synthetic */ AccessibilityManager u(g gVar) {
        return gVar.g;
    }

    public static final /* synthetic */ o v(g gVar) {
        return gVar.d0();
    }

    public static final /* synthetic */ v w(g gVar) {
        return gVar.r;
    }

    public static final boolean w0(W0.j jVar, float f2) {
        return (f2 < 0.0f && ((Number) jVar.c().invoke()).floatValue() > 0.0f) || (f2 > 0.0f && ((Number) jVar.c().invoke()).floatValue() < ((Number) jVar.a().invoke()).floatValue());
    }

    public static final /* synthetic */ v x(g gVar) {
        return gVar.s;
    }

    public static final float x0(float f2, float f3) {
        if (Math.signum(f2) == Math.signum(f3)) {
            return Math.abs(f2) < Math.abs(f3) ? f2 : f3;
        }
        return 0.0f;
    }

    public static final /* synthetic */ AccessibilityManager.AccessibilityStateChangeListener y(g gVar) {
        return gVar.j;
    }

    public static final /* synthetic */ int z(g gVar) {
        return gVar.q;
    }

    public static final boolean z0(W0.j jVar) {
        return (((Number) jVar.c().invoke()).floatValue() > 0.0f && !jVar.b()) || (((Number) jVar.c().invoke()).floatValue() < ((Number) jVar.a().invoke()).floatValue() && jVar.b());
    }

    public final boolean B0(int i2, List list) {
        boolean z;
        c1 a2 = e1.a(list, i2);
        if (a2 != null) {
            z = false;
        } else {
            a2 = new c1(i2, this.Q, null, null, null, null);
            z = true;
        }
        this.Q.add(a2);
        return z;
    }

    public final boolean C0(int i2) {
        if (!r0() || n0(i2)) {
            return false;
        }
        int i3 = this.p;
        if (i3 != Integer.MIN_VALUE) {
            J0(this, i3, 65536, null, null, 12, null);
        }
        this.p = i2;
        this.d.invalidate();
        J0(this, i2, 32768, null, null, 12, null);
        return true;
    }

    public final void D0(c1 c1Var) {
        if (c1Var.N0()) {
            this.d.getSnapshotObserver().i(c1Var, this.R, new i(c1Var, this));
        }
    }

    public final int F0(int i2) {
        if (i2 == this.d.getSemanticsOwner().d().q()) {
            return -1;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G0(W0.t r17, P0.d1 r18) {
        /*
            r16 = this;
            r0 = r16
            w.G r1 = w.r.b()
            java.util.List r2 = r17.v()
            int r3 = r2.size()
            r4 = 0
            r5 = r4
        L10:
            if (r5 >= r3) goto L46
            java.lang.Object r6 = r2.get(r5)
            W0.t r6 = (W0.t) r6
            w.o r7 = r16.d0()
            int r8 = r6.q()
            boolean r7 = r7.b(r8)
            if (r7 == 0) goto L43
            w.G r7 = r18.a()
            int r8 = r6.q()
            boolean r7 = r7.a(r8)
            if (r7 != 0) goto L3c
            O0.J r1 = r17.s()
            r0.s0(r1)
            return
        L3c:
            int r6 = r6.q()
            r1.g(r6)
        L43:
            int r5 = r5 + 1
            goto L10
        L46:
            w.G r2 = r18.a()
            int[] r3 = r2.b
            long[] r2 = r2.a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L97
            r6 = r4
        L54:
            r7 = r2[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L92
            int r9 = r6 - r5
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r4
        L6e:
            if (r11 >= r9) goto L90
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L8c
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            boolean r12 = r1.a(r12)
            if (r12 != 0) goto L8c
            O0.J r1 = r17.s()
            r0.s0(r1)
            return
        L8c:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L6e
        L90:
            if (r9 != r10) goto L97
        L92:
            if (r6 == r5) goto L97
            int r6 = r6 + 1
            goto L54
        L97:
            java.util.List r1 = r17.v()
            int r2 = r1.size()
        L9f:
            if (r4 >= r2) goto Lc9
            java.lang.Object r3 = r1.get(r4)
            W0.t r3 = (W0.t) r3
            w.F r5 = r0.L
            int r6 = r3.q()
            java.lang.Object r5 = r5.c(r6)
            P0.d1 r5 = (P0.d1) r5
            if (r5 == 0) goto Lc6
            w.o r6 = r16.d0()
            int r7 = r3.q()
            boolean r6 = r6.b(r7)
            if (r6 == 0) goto Lc6
            r0.G0(r3, r5)
        Lc6:
            int r4 = r4 + 1
            goto L9f
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.g.G0(W0.t, P0.d1):void");
    }

    public final boolean H0(AccessibilityEvent accessibilityEvent) {
        if (!p0()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.t = true;
        }
        try {
            return ((Boolean) this.f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.t = false;
        }
    }

    public final boolean I0(int i2, int i3, Integer num, List list) {
        if (i2 == Integer.MIN_VALUE || !p0()) {
            return false;
        }
        AccessibilityEvent U2 = U(i2, i3);
        if (num != null) {
            U2.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            U2.setContentDescription(p1.a.e(list, ",", null, null, 0, null, null, 62, null));
        }
        return H0(U2);
    }

    public final void K0(int i2, int i3, String str) {
        AccessibilityEvent U2 = U(F0(i2), 32);
        U2.setContentChangeTypes(i3);
        if (str != null) {
            U2.getText().add(str);
        }
        H0(U2);
    }

    public final void L0(int i2) {
        f fVar = this.D;
        if (fVar != null) {
            if (i2 != fVar.d().q()) {
                return;
            }
            if (SystemClock.uptimeMillis() - fVar.f() <= 1000) {
                AccessibilityEvent U2 = U(F0(fVar.d().q()), 131072);
                U2.setFromIndex(fVar.b());
                U2.setToIndex(fVar.e());
                U2.setAction(fVar.a());
                U2.setMovementGranularity(fVar.c());
                U2.getText().add(i0(fVar.d()));
                H0(U2);
            }
        }
        this.D = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x06a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M0(w.o r55) {
        /*
            Method dump skipped, instructions count: 1776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.g.M0(w.o):void");
    }

    public final void N(int i2, v vVar, String str, Bundle bundle) {
        t b2;
        Region W0;
        float[] V0;
        Rect U0;
        W0.v vVar2 = (W0.v) d0().c(i2);
        if (vVar2 == null || (b2 = vVar2.b()) == null) {
            return;
        }
        String i0 = i0(b2);
        if (kotlin.jvm.internal.t.c(str, this.I)) {
            int e2 = this.G.e(i2, -1);
            if (e2 != -1) {
                vVar.t().putInt(str, e2);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.t.c(str, this.J)) {
            int e3 = this.H.e(i2, -1);
            if (e3 != -1) {
                vVar.t().putInt(str, e3);
                return;
            }
            return;
        }
        if (b2.y().e(W0.l.a.i()) && bundle != null && kotlin.jvm.internal.t.c(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i4 > 0 && i3 >= 0) {
                if (i3 < (i0 != null ? i0.length() : Integer.MAX_VALUE)) {
                    T0 c2 = e1.c(b2.y());
                    if (c2 == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = i3 + i5;
                        if (i6 >= c2.l().j().length()) {
                            arrayList.add((Object) null);
                        } else {
                            arrayList.add(X0(b2, c2.d(i6)));
                        }
                    }
                    vVar.t().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        W0.m y = b2.y();
        y yVar = y.a;
        if (y.e(yVar.I()) && bundle != null && kotlin.jvm.internal.t.c(str, "androidx.compose.ui.semantics.testTag")) {
            String str2 = (String) W0.n.a(b2.y(), yVar.I());
            if (str2 != null) {
                vVar.t().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.t.c(str, "androidx.compose.ui.semantics.id")) {
            vVar.t().putInt(str, b2.q());
            return;
        }
        if (kotlin.jvm.internal.t.c(str, "androidx.compose.ui.semantics.shapeType")) {
            E1 e1 = (E1) W0.n.a(b2.y(), yVar.G());
            if (e1 != null) {
                i1 W = W(e1, b2);
                if (W instanceof i1.b) {
                    vVar.t().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    vVar.t().putParcelable("androidx.compose.ui.semantics.shapeRect", U0(W));
                    return;
                } else if (W instanceof i1.c) {
                    vVar.t().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    vVar.t().putParcelable("androidx.compose.ui.semantics.shapeRect", U0(W));
                    vVar.t().putFloatArray("androidx.compose.ui.semantics.shapeCorners", V0(W));
                    return;
                } else {
                    if (!(W instanceof i1.a)) {
                        throw new Ca.o();
                    }
                    vVar.t().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    vVar.t().putParcelable("androidx.compose.ui.semantics.shapeRegion", W0(W));
                    return;
                }
            }
            return;
        }
        if (kotlin.jvm.internal.t.c(str, "androidx.compose.ui.semantics.shapeRect")) {
            E1 e12 = (E1) W0.n.a(b2.y(), yVar.G());
            if (e12 == null || (U0 = U0(W(e12, b2))) == null) {
                return;
            }
            vVar.t().putParcelable("androidx.compose.ui.semantics.shapeRect", U0);
            return;
        }
        if (kotlin.jvm.internal.t.c(str, "androidx.compose.ui.semantics.shapeCorners")) {
            E1 e13 = (E1) W0.n.a(b2.y(), yVar.G());
            if (e13 == null || (V0 = V0(W(e13, b2))) == null) {
                return;
            }
            vVar.t().putFloatArray("androidx.compose.ui.semantics.shapeCorners", V0);
            return;
        }
        if (kotlin.jvm.internal.t.c(str, "androidx.compose.ui.semantics.shapeRegion")) {
            E1 e14 = (E1) W0.n.a(b2.y(), yVar.G());
            if (e14 == null || (W0 = W0(W(e14, b2))) == null) {
                return;
            }
            vVar.t().putParcelable("androidx.compose.ui.semantics.shapeRegion", W0);
            return;
        }
        e0 j2 = b2.y().j();
        if (j2 == null) {
            return;
        }
        Object[] objArr = j2.b;
        long[] jArr = j2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j3 = jArr[i7];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j3) < 128) {
                        C c3 = (C) objArr[(i7 << 3) + i9];
                        String a2 = c3.a();
                        if (kotlin.jvm.internal.t.c(a2, str)) {
                            Object a3 = W0.n.a(b2.y(), c3);
                            if (a3 instanceof Serializable) {
                                vVar.t().putSerializable(a2, (Serializable) a3);
                            } else {
                                if (!(a3 instanceof Parcelable)) {
                                    throw new IllegalStateException("Accessibility extra values must be either Serializable or Parcelable.");
                                }
                                vVar.t().putParcelable(a2, (Parcelable) a3);
                            }
                        } else {
                            continue;
                        }
                    }
                    j3 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final void N0(J j2, G g2) {
        W0.m c2;
        J d2;
        if (j2.g() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(j2)) {
            if (!j2.s0().p(g0.a(8))) {
                j2 = s.d(j2, l.a);
            }
            if (j2 == null || (c2 = j2.c()) == null) {
                return;
            }
            if (!c2.p() && (d2 = s.d(j2, k.a)) != null) {
                j2 = d2;
            }
            int y = j2.y();
            if (g2.g(y)) {
                J0(this, F0(y), 2048, 1, null, 8, null);
            }
        }
    }

    public final Rect O(W0.v vVar) {
        n1.p a2 = vVar.a();
        AndroidComposeView androidComposeView = this.d;
        float f2 = a2.f();
        float h2 = a2.h();
        long B = androidComposeView.B(u0.f.e((Float.floatToRawIntBits(h2) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32)));
        AndroidComposeView androidComposeView2 = this.d;
        float g2 = a2.g();
        float d2 = a2.d();
        long B2 = androidComposeView2.B(u0.f.e((Float.floatToRawIntBits(g2) << 32) | (Float.floatToRawIntBits(d2) & 4294967295L)));
        int i2 = (int) (B >> 32);
        int i3 = (int) (B2 >> 32);
        int i4 = (int) (B & 4294967295L);
        int i5 = (int) (B2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3))), (int) Math.floor(Math.min(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5))));
    }

    public final void O0(J j2) {
        if (j2.g() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(j2)) {
            int y = j2.y();
            W0.j jVar = (W0.j) this.u.c(y);
            W0.j jVar2 = (W0.j) this.v.c(y);
            if (jVar == null && jVar2 == null) {
                return;
            }
            AccessibilityEvent U2 = U(y, 4096);
            if (jVar != null) {
                U2.setScrollX((int) ((Number) jVar.c().invoke()).floatValue());
                U2.setMaxScrollX((int) ((Number) jVar.a().invoke()).floatValue());
            }
            if (jVar2 != null) {
                U2.setScrollY((int) ((Number) jVar2.c().invoke()).floatValue());
                U2.setMaxScrollY((int) ((Number) jVar2.a().invoke()).floatValue());
            }
            H0(U2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0031, B:14:0x005c, B:19:0x006c, B:21:0x0074, B:23:0x007d, B:25:0x0086, B:27:0x0097, B:29:0x009e, B:30:0x00a7, B:39:0x0049, B:41:0x0050), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c2 -> B:13:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object P(Ga.e r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.compose.ui.platform.g.g
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.ui.platform.g$g r0 = (androidx.compose.ui.platform.g.g) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            androidx.compose.ui.platform.g$g r0 = new androidx.compose.ui.platform.g$g
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.c
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L41
            if (r2 != r4) goto L39
            java.lang.Object r2 = r0.b
            eb.i r2 = (eb.i) r2
            java.lang.Object r6 = r0.a
            w.G r6 = (w.G) r6
            Ca.t.b(r11)     // Catch: java.lang.Throwable -> L36
        L34:
            r11 = r6
            goto L5c
        L36:
            r11 = move-exception
            goto Lcd
        L39:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L41:
            java.lang.Object r2 = r0.b
            eb.i r2 = (eb.i) r2
            java.lang.Object r6 = r0.a
            w.G r6 = (w.G) r6
            Ca.t.b(r11)     // Catch: java.lang.Throwable -> L36
            goto L6c
        L4d:
            Ca.t.b(r11)
            w.G r11 = new w.G     // Catch: java.lang.Throwable -> L36
            r2 = 0
            r11.<init>(r3, r5, r2)     // Catch: java.lang.Throwable -> L36
            eb.g r2 = r10.B     // Catch: java.lang.Throwable -> L36
            eb.i r2 = r2.iterator()     // Catch: java.lang.Throwable -> L36
        L5c:
            r0.a = r11     // Catch: java.lang.Throwable -> L36
            r0.b = r2     // Catch: java.lang.Throwable -> L36
            r0.e = r5     // Catch: java.lang.Throwable -> L36
            java.lang.Object r6 = r2.b(r0)     // Catch: java.lang.Throwable -> L36
            if (r6 != r1) goto L69
            return r1
        L69:
            r9 = r6
            r6 = r11
            r11 = r9
        L6c:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L36
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r11 == 0) goto Lc5
            r2.next()     // Catch: java.lang.Throwable -> L36
            boolean r11 = r10.p0()     // Catch: java.lang.Throwable -> L36
            if (r11 == 0) goto La7
            w.b r11 = r10.A     // Catch: java.lang.Throwable -> L36
            int r11 = r11.size()     // Catch: java.lang.Throwable -> L36
            r7 = r3
        L84:
            if (r7 >= r11) goto L97
            w.b r8 = r10.A     // Catch: java.lang.Throwable -> L36
            java.lang.Object r8 = r8.n(r7)     // Catch: java.lang.Throwable -> L36
            O0.J r8 = (O0.J) r8     // Catch: java.lang.Throwable -> L36
            r10.N0(r8, r6)     // Catch: java.lang.Throwable -> L36
            r10.O0(r8)     // Catch: java.lang.Throwable -> L36
            int r7 = r7 + 1
            goto L84
        L97:
            r6.i()     // Catch: java.lang.Throwable -> L36
            boolean r11 = r10.N     // Catch: java.lang.Throwable -> L36
            if (r11 != 0) goto La7
            r10.N = r5     // Catch: java.lang.Throwable -> L36
            android.os.Handler r11 = r10.n     // Catch: java.lang.Throwable -> L36
            java.lang.Runnable r7 = r10.P     // Catch: java.lang.Throwable -> L36
            r11.post(r7)     // Catch: java.lang.Throwable -> L36
        La7:
            w.b r11 = r10.A     // Catch: java.lang.Throwable -> L36
            r11.clear()     // Catch: java.lang.Throwable -> L36
            w.F r11 = r10.u     // Catch: java.lang.Throwable -> L36
            r11.h()     // Catch: java.lang.Throwable -> L36
            w.F r11 = r10.v     // Catch: java.lang.Throwable -> L36
            r11.h()     // Catch: java.lang.Throwable -> L36
            long r7 = r10.i     // Catch: java.lang.Throwable -> L36
            r0.a = r6     // Catch: java.lang.Throwable -> L36
            r0.b = r2     // Catch: java.lang.Throwable -> L36
            r0.e = r4     // Catch: java.lang.Throwable -> L36
            java.lang.Object r11 = cb.Z.a(r7, r0)     // Catch: java.lang.Throwable -> L36
            if (r11 != r1) goto L34
            return r1
        Lc5:
            w.b r11 = r10.A
            r11.clear()
            Ca.I r11 = Ca.I.a
            return r11
        Lcd:
            w.b r0 = r10.A
            r0.clear()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.g.P(Ga.e):java.lang.Object");
    }

    public final boolean P0(t tVar, int i2, int i3, boolean z) {
        String i0;
        W0.m y = tVar.y();
        W0.l lVar = W0.l.a;
        if (y.e(lVar.y()) && s.b(tVar)) {
            Qa.q a2 = ((W0.a) tVar.y().h(lVar.y())).a();
            if (a2 != null) {
                return ((Boolean) a2.invoke(Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue();
            }
            return false;
        }
        if ((i2 == i3 && i3 == this.y) || (i0 = i0(tVar)) == null) {
            return false;
        }
        if (i2 < 0 || i2 != i3 || i3 > i0.length()) {
            i2 = -1;
        }
        this.y = i2;
        boolean z2 = i0.length() > 0;
        H0(X(F0(tVar.q()), z2 ? Integer.valueOf(this.y) : null, z2 ? Integer.valueOf(this.y) : null, z2 ? Integer.valueOf(i0.length()) : null, i0));
        L0(tVar.q());
        return true;
    }

    public final boolean Q(boolean z, int i2, long j2) {
        if (kotlin.jvm.internal.t.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return R(d0(), z, i2, j2);
        }
        return false;
    }

    public final void Q0(t tVar, v vVar) {
        W0.m y = tVar.y();
        y yVar = y.a;
        if (y.e(yVar.h())) {
            vVar.l0(true);
            vVar.p0((CharSequence) W0.n.a(tVar.y(), yVar.h()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean R(w.o r21, boolean r22, int r23, long r24) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.g.R(w.o, boolean, int, long):boolean");
    }

    public final void R0(long j2) {
        this.i = j2;
    }

    public final void S() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (p0()) {
                G0(this.d.getSemanticsOwner().d(), this.M);
            }
            I i2 = I.a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                M0(d0());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    d1();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void S0(t tVar, v vVar) {
        Z0.e g2 = s.g(tVar);
        vVar.K0(g2 != null ? Y0(g2) : null);
    }

    public final boolean T(int i2) {
        if (!n0(i2)) {
            return false;
        }
        this.p = Integer.MIN_VALUE;
        this.r = null;
        this.d.invalidate();
        J0(this, i2, 65536, null, null, 12, null);
        return true;
    }

    public final Rect T0(u0.h hVar) {
        return new Rect((int) hVar.i(), (int) hVar.l(), (int) hVar.j(), (int) hVar.e());
    }

    public final AccessibilityEvent U(int i2, int i3) {
        W0.v vVar;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.d.getContext().getPackageName());
        obtain.setSource(this.d, i2);
        if (p0() && (vVar = (W0.v) d0().c(i2)) != null) {
            W0.m y = vVar.b().y();
            y yVar = y.a;
            obtain.setPassword(y.e(yVar.B()));
            U1.b.b(obtain, kotlin.jvm.internal.t.c(W0.n.a(vVar.b().y(), yVar.u()), Boolean.TRUE));
        }
        return obtain;
    }

    public final Rect U0(i1 i1Var) {
        if ((i1Var instanceof i1.b) || (i1Var instanceof i1.c)) {
            return T0(i1Var.a());
        }
        return null;
    }

    public final v V(int i2) {
        androidx.lifecycle.r a2;
        androidx.lifecycle.k lifecycle;
        AndroidComposeView.b viewTreeOwners = this.d.getViewTreeOwners();
        if (((viewTreeOwners == null || (a2 = viewTreeOwners.a()) == null || (lifecycle = a2.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) == k.b.a) {
            return Z();
        }
        W0.v vVar = (W0.v) d0().c(i2);
        if (vVar == null) {
            return Z();
        }
        t b2 = vVar.b();
        boolean c2 = kotlin.jvm.internal.t.c(W0.n.a(b2.p(), y.a.u()), Boolean.TRUE);
        if (c2 && !q0()) {
            return null;
        }
        v W = v.W();
        W.Z(c2);
        if (i2 == -1) {
            View parentForAccessibility = this.d.getParentForAccessibility();
            W.A0(parentForAccessibility instanceof View ? parentForAccessibility : null);
        } else {
            t t = b2.t();
            View valueOf = t != null ? Integer.valueOf(t.q()) : null;
            if (valueOf == null) {
                L0.a.c("semanticsNode " + i2 + " has null parent");
                throw new Ca.i();
            }
            int intValue = valueOf.intValue();
            W.B0(this.d, intValue != this.d.getSemanticsOwner().d().q() ? intValue : -1);
        }
        W.I0(this.d, i2);
        W.d0(O(vVar));
        y0(i2, W, b2);
        return W;
    }

    public final float[] V0(i1 i1Var) {
        if (!(i1Var instanceof i1.c)) {
            return null;
        }
        i1.c cVar = (i1.c) i1Var;
        return new float[]{Float.intBitsToFloat((int) (cVar.b().h() >> 32)), Float.intBitsToFloat((int) (cVar.b().h() & 4294967295L)), Float.intBitsToFloat((int) (cVar.b().i() >> 32)), Float.intBitsToFloat((int) (cVar.b().i() & 4294967295L)), Float.intBitsToFloat((int) (cVar.b().c() >> 32)), Float.intBitsToFloat((int) (cVar.b().c() & 4294967295L)), Float.intBitsToFloat((int) (cVar.b().b() >> 32)), Float.intBitsToFloat((int) (cVar.b().b() & 4294967295L))};
    }

    public final i1 W(E1 e1, t tVar) {
        return e1.createOutline-Pq9zytI(n1.s.d(tVar.w()), tVar.r().getLayoutDirection(), this.d.getDensity());
    }

    public final Region W0(i1 i1Var) {
        if (!(i1Var instanceof i1.a)) {
            return null;
        }
        i1.a aVar = (i1.a) i1Var;
        Region region = new Region(T0(aVar.a()));
        Region region2 = new Region();
        m1 b2 = aVar.b();
        if (!(b2 instanceof S)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        region2.setPath(((S) b2).x(), region);
        return region2;
    }

    public final AccessibilityEvent X(int i2, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent U2 = U(i2, 8192);
        if (num != null) {
            U2.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            U2.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            U2.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            U2.getText().add(charSequence);
        }
        return U2;
    }

    public final RectF X0(t tVar, u0.h hVar) {
        if (tVar == null) {
            return null;
        }
        u0.h t = hVar.t(tVar.u());
        u0.h k2 = tVar.k();
        u0.h p = t.r(k2) ? t.p(k2) : null;
        if (p == null) {
            return null;
        }
        AndroidComposeView androidComposeView = this.d;
        float i2 = p.i();
        long B = androidComposeView.B(u0.f.e((Float.floatToRawIntBits(p.l()) & 4294967295L) | (Float.floatToRawIntBits(i2) << 32)));
        long B2 = this.d.B(u0.f.e((Float.floatToRawIntBits(p.j()) << 32) | (Float.floatToRawIntBits(p.e()) & 4294967295L)));
        int i3 = (int) (B >> 32);
        int i4 = (int) (B2 >> 32);
        int i5 = (int) (B & 4294967295L);
        int i6 = (int) (B2 & 4294967295L);
        return new RectF(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6)), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.max(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6)));
    }

    public final boolean Y(MotionEvent motionEvent) {
        if (!r0()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int m0 = m0(motionEvent.getX(), motionEvent.getY());
            boolean dispatchGenericMotionEvent = this.d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            c1(m0);
            if (m0 == Integer.MIN_VALUE) {
                return dispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.e == Integer.MIN_VALUE) {
            return this.d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        }
        c1(Integer.MIN_VALUE);
        return true;
    }

    public final SpannableString Y0(Z0.e eVar) {
        return b1(i1.a.b(eVar, this.d.getDensity(), this.d.getFontFamilyResolver(), this.K), 100000);
    }

    public final v Z() {
        if (this.g.isEnabled()) {
            return null;
        }
        return v.W();
    }

    public final boolean a1(t tVar, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int q = tVar.q();
        Integer num = this.z;
        if (num == null || q != num.intValue()) {
            this.y = -1;
            this.z = Integer.valueOf(tVar.q());
        }
        String i0 = i0(tVar);
        boolean z3 = false;
        if (i0 != null && i0.length() != 0) {
            P0.b j0 = j0(tVar, i2);
            if (j0 == null) {
                return false;
            }
            int b0 = b0(tVar);
            if (b0 == -1) {
                b0 = z ? 0 : i0.length();
            }
            int[] a2 = z ? j0.a(b0) : j0.b(b0);
            if (a2 == null) {
                return false;
            }
            int i5 = a2[0];
            z3 = true;
            int i6 = a2[1];
            if (z2 && o0(tVar)) {
                i3 = c0(tVar);
                if (i3 == -1) {
                    i3 = z ? i5 : i6;
                }
                i4 = z ? i6 : i5;
            } else {
                i3 = z ? i6 : i5;
                i4 = i3;
            }
            this.D = new f(tVar, z ? 256 : 512, i2, i5, i6, SystemClock.uptimeMillis());
            P0(tVar, i3, i4, true);
        }
        return z3;
    }

    public U1.w b(View view) {
        return this.o;
    }

    public final int b0(t tVar) {
        W0.m y = tVar.y();
        y yVar = y.a;
        return (y.e(yVar.d()) || !tVar.y().e(yVar.K())) ? this.y : W0.i(((W0) tVar.y().h(yVar.K())).r());
    }

    public final CharSequence b1(CharSequence charSequence, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        }
        if (charSequence == null || charSequence.length() == 0 || charSequence.length() <= i2) {
            return charSequence;
        }
        int i3 = i2 - 1;
        if (Character.isHighSurrogate(charSequence.charAt(i3)) && Character.isLowSurrogate(charSequence.charAt(i2))) {
            i2 = i3;
        }
        CharSequence subSequence = charSequence.subSequence(0, i2);
        kotlin.jvm.internal.t.e(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return subSequence;
    }

    public final int c0(t tVar) {
        W0.m y = tVar.y();
        y yVar = y.a;
        return (y.e(yVar.d()) || !tVar.y().e(yVar.K())) ? this.y : W0.n(((W0) tVar.y().h(yVar.K())).r());
    }

    public final void c1(int i2) {
        int i3 = this.e;
        if (i3 == i2) {
            return;
        }
        this.e = i2;
        J0(this, i2, 128, null, null, 12, null);
        J0(this, i3, 256, null, null, 12, null);
    }

    public final o d0() {
        if (this.C) {
            this.C = false;
            this.E = x.a(this.d.getSemanticsOwner(), -1);
            if (p0()) {
                s.k(this.E, this.G, this.H, this.d.getContext().getResources());
            }
        }
        return this.E;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d1() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.g.d1():void");
    }

    public final String e0() {
        return this.J;
    }

    public final String f0() {
        return this.I;
    }

    public final D g0() {
        return this.H;
    }

    public final D h0() {
        return this.G;
    }

    public final String i0(t tVar) {
        Z0.e eVar;
        if (tVar == null) {
            return null;
        }
        W0.m y = tVar.y();
        y yVar = y.a;
        if (y.e(yVar.d())) {
            return p1.a.e((List) tVar.y().h(yVar.d()), ",", null, null, 0, null, null, 62, null);
        }
        if (tVar.y().e(yVar.g())) {
            Z0.e k0 = k0(tVar.y());
            if (k0 != null) {
                return k0.j();
            }
            return null;
        }
        List list = (List) W0.n.a(tVar.y(), yVar.J());
        if (list == null || (eVar = (Z0.e) Da.D.h0(list)) == null) {
            return null;
        }
        return eVar.j();
    }

    public final P0.b j0(t tVar, int i2) {
        String i0;
        T0 c2;
        if (tVar == null || (i0 = i0(tVar)) == null || i0.length() == 0) {
            return null;
        }
        if (i2 == 1) {
            androidx.compose.ui.platform.b a2 = androidx.compose.ui.platform.b.d.a(this.d.getContext().getResources().getConfiguration().locale);
            a2.e(i0);
            return a2;
        }
        if (i2 == 2) {
            androidx.compose.ui.platform.f a3 = androidx.compose.ui.platform.f.d.a(this.d.getContext().getResources().getConfiguration().locale);
            a3.e(i0);
            return a3;
        }
        if (i2 != 4) {
            if (i2 == 8) {
                androidx.compose.ui.platform.e a4 = androidx.compose.ui.platform.e.c.a();
                a4.e(i0);
                return a4;
            }
            if (i2 != 16) {
                return null;
            }
        }
        if (!tVar.y().e(W0.l.a.i()) || (c2 = e1.c(tVar.y())) == null) {
            return null;
        }
        if (i2 == 4) {
            androidx.compose.ui.platform.c a5 = androidx.compose.ui.platform.c.d.a();
            a5.j(i0, c2);
            return a5;
        }
        androidx.compose.ui.platform.d a6 = androidx.compose.ui.platform.d.f.a();
        a6.j(i0, c2, tVar);
        return a6;
    }

    public final Z0.e k0(W0.m mVar) {
        return (Z0.e) W0.n.a(mVar, y.a.g());
    }

    public final AndroidComposeView l0() {
        return this.d;
    }

    public final int m0(float f2, float f3) {
        int i2;
        p0.p(this.d, false, 1, null);
        O0.w wVar = new O0.w();
        J.L0(this.d.getRoot(), u0.f.e((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32)), wVar, 0, false, 12, null);
        int p = Da.v.p(wVar);
        while (true) {
            i2 = Integer.MIN_VALUE;
            if (-1 >= p) {
                break;
            }
            J n = O0.k.n(wVar.m(p));
            if (((q1.b) this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(n)) != null) {
                return Integer.MIN_VALUE;
            }
            if (n.s0().p(g0.a(8))) {
                i2 = F0(n.y());
                t a2 = W0.u.a(n, false);
                if (x.d(a2) && !a2.p().e(y.a.x())) {
                    break;
                }
            }
            p--;
        }
        return i2;
    }

    public final boolean n0(int i2) {
        return this.p == i2;
    }

    public final boolean o0(t tVar) {
        W0.m y = tVar.y();
        y yVar = y.a;
        return !y.e(yVar.d()) && tVar.y().e(yVar.g());
    }

    public final boolean p0() {
        return this.h || (this.g.isEnabled() && !this.l.isEmpty());
    }

    public final boolean q0() {
        Boolean bool = this.m;
        if (kotlin.jvm.internal.t.c(bool, Boolean.TRUE)) {
            return true;
        }
        if (kotlin.jvm.internal.t.c(bool, Boolean.FALSE)) {
            return false;
        }
        return U1.c.a(this.g);
    }

    public final boolean r0() {
        return this.h || (this.g.isEnabled() && this.g.isTouchExplorationEnabled());
    }

    public final void s0(J j2) {
        if (this.A.add(j2)) {
            this.B.i(I.a);
        }
    }

    public final void t0(J j2) {
        this.C = true;
        if (p0()) {
            s0(j2);
        }
    }

    public final void u0() {
        this.C = true;
        if (!p0() || this.N) {
            return;
        }
        this.N = true;
        this.n.post(this.P);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01ad A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x01aa -> B:90:0x01ab). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v0(int r17, int r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 1958
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.g.v0(int, int, android.os.Bundle):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05e1 A[PHI: r4
      0x05e1: PHI (r4v49 int) = (r4v48 int), (r4v50 int) binds: [B:216:0x05a9, B:232:0x05df] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y0(int r22, U1.v r23, W0.t r24) {
        /*
            Method dump skipped, instructions count: 2353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.g.y0(int, U1.v, W0.t):void");
    }
}
