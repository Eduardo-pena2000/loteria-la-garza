package j3;

import M2.G;
import M2.H;
import M2.I;
import P2.K;
import T2.W0;
import T2.X0;
import T2.Y0;
import V2.U;
import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import g3.Y;
import g3.w;
import j3.a;
import j3.x;
import j3.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import t7.I;
import t7.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class n extends z implements X0.a {
    public static final I k = I.b(new j3.d());
    public final Object d;
    public final Context e;
    public final x.b f;
    public final boolean g;
    public e h;
    public g i;
    public M2.b j;

    public static final class b extends i implements Comparable {
        public final int e;
        public final boolean f;
        public final String g;
        public final e h;
        public final boolean i;
        public final int j;
        public final int k;
        public final int l;
        public final boolean m;
        public final boolean n;
        public final int o;
        public final int p;
        public final boolean q;
        public final int r;
        public final int s;
        public final int t;
        public final int u;
        public final boolean v;
        public final boolean w;

        public b(int i, H h, int i2, e eVar, int i3, boolean z, s7.n nVar, int i4) {
            int i5;
            int i6;
            int i7;
            super(i, h, i2);
            this.h = eVar;
            int i8 = eVar.s0 ? 24 : 16;
            this.m = eVar.o0 && (i4 & i8) != 0;
            this.g = n.X(this.d.d);
            this.i = X0.m(i3, false);
            int i9 = 0;
            while (true) {
                i5 = Integer.MAX_VALUE;
                if (i9 >= eVar.n.size()) {
                    i6 = 0;
                    i9 = Integer.MAX_VALUE;
                    break;
                } else {
                    i6 = n.G(this.d, (String) eVar.n.get(i9), false);
                    if (i6 > 0) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.k = i9;
            this.j = i6;
            this.l = n.y(this.d.f, eVar.o);
            M2.q qVar = this.d;
            int i10 = qVar.f;
            this.n = i10 == 0 || (i10 & 1) != 0;
            this.q = (qVar.e & 1) != 0;
            int i11 = qVar.B;
            this.r = i11;
            this.s = qVar.C;
            int i12 = qVar.i;
            this.t = i12;
            this.f = (i12 == -1 || i12 <= eVar.q) && (i11 == -1 || i11 <= eVar.p) && nVar.apply(qVar);
            String[] l0 = K.l0();
            int i13 = 0;
            while (true) {
                if (i13 >= l0.length) {
                    i7 = 0;
                    i13 = Integer.MAX_VALUE;
                    break;
                } else {
                    i7 = n.G(this.d, l0[i13], false);
                    if (i7 > 0) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.o = i13;
            this.p = i7;
            int i14 = 0;
            while (true) {
                if (i14 < eVar.r.size()) {
                    String str = this.d.n;
                    if (str != null && str.equals(eVar.r.get(i14))) {
                        i5 = i14;
                        break;
                    }
                    i14++;
                } else {
                    break;
                }
            }
            this.u = i5;
            this.v = X0.l(i3) == 128;
            this.w = X0.F(i3) == 64;
            this.e = f(i3, z, i8);
        }

        public static int c(List list, List list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static t7.r e(int i, H h, e eVar, int[] iArr, boolean z, s7.n nVar, int i2) {
            r.a j = t7.r.j();
            for (int i3 = 0; i3 < h.a; i3++) {
                j.h(new b(i, h, i3, eVar, iArr[i3], z, nVar, i2));
            }
            return j.k();
        }

        public int a() {
            return this.e;
        }

        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            I A = (this.f && this.i) ? n.A() : n.A().e();
            t7.k f = t7.k.j().g(this.i, bVar.i).f(Integer.valueOf(this.k), Integer.valueOf(bVar.k), I.c().e()).d(this.j, bVar.j).d(this.l, bVar.l).g(this.q, bVar.q).g(this.n, bVar.n).f(Integer.valueOf(this.o), Integer.valueOf(bVar.o), I.c().e()).d(this.p, bVar.p).g(this.f, bVar.f).f(Integer.valueOf(this.u), Integer.valueOf(bVar.u), I.c().e());
            if (this.h.y) {
                f = f.f(Integer.valueOf(this.t), Integer.valueOf(bVar.t), n.A().e());
            }
            t7.k f2 = f.g(this.v, bVar.v).g(this.w, bVar.w).f(Integer.valueOf(this.r), Integer.valueOf(bVar.r), A).f(Integer.valueOf(this.s), Integer.valueOf(bVar.s), A);
            if (K.c(this.g, bVar.g)) {
                f2 = f2.f(Integer.valueOf(this.t), Integer.valueOf(bVar.t), A);
            }
            return f2.i();
        }

        public final int f(int i, boolean z, int i2) {
            if (!X0.m(i, this.h.u0)) {
                return 0;
            }
            if (!this.f && !this.h.n0) {
                return 0;
            }
            e eVar = this.h;
            if (eVar.s.a == 2 && !n.B(eVar, i, this.d)) {
                return 0;
            }
            if (X0.m(i, false) && this.f && this.d.i != -1) {
                e eVar2 = this.h;
                if (!eVar2.z && !eVar2.y && ((eVar2.w0 || !z) && eVar2.s.a != 2 && (i & i2) != 0)) {
                    return 2;
                }
            }
            return 1;
        }

        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean b(b bVar) {
            int i;
            String str;
            int i2;
            if ((this.h.q0 || ((i2 = this.d.B) != -1 && i2 == bVar.d.B)) && (this.m || ((str = this.d.n) != null && TextUtils.equals(str, bVar.d.n)))) {
                e eVar = this.h;
                if ((eVar.p0 || ((i = this.d.C) != -1 && i == bVar.d.C)) && (eVar.r0 || (this.v == bVar.v && this.w == bVar.w))) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class c extends i implements Comparable {
        public final int e;
        public final int f;

        public c(int i, H h, int i2, e eVar, int i3) {
            super(i, h, i2);
            this.e = X0.m(i3, eVar.u0) ? 1 : 0;
            this.f = this.d.d();
        }

        public static int c(List list, List list2) {
            return ((c) list.get(0)).compareTo((c) list2.get(0));
        }

        public static t7.r e(int i, H h, e eVar, int[] iArr) {
            r.a j = t7.r.j();
            for (int i2 = 0; i2 < h.a; i2++) {
                j.h(new c(i, h, i2, eVar, iArr[i2]));
            }
            return j.k();
        }

        public int a() {
            return this.e;
        }

        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return Integer.compare(this.f, cVar.f);
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public boolean b(c cVar) {
            return false;
        }
    }

    public static final class d implements Comparable {
        public final boolean a;
        public final boolean b;

        public d(M2.q qVar, int i) {
            this.a = (qVar.e & 1) != 0;
            this.b = X0.m(i, false);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return t7.k.j().g(this.b, dVar.b).g(this.a, dVar.a).i();
        }
    }

    public static final class e extends M2.I {
        public static final e A0;
        public static final e B0;
        public static final String C0;
        public static final String D0;
        public static final String E0;
        public static final String F0;
        public static final String G0;
        public static final String H0;
        public static final String I0;
        public static final String J0;
        public static final String K0;
        public static final String L0;
        public static final String M0;
        public static final String N0;
        public static final String O0;
        public static final String P0;
        public static final String Q0;
        public static final String R0;
        public static final String S0;
        public static final String T0;
        public static final String U0;
        public final boolean j0;
        public final boolean k0;
        public final boolean l0;
        public final boolean m0;
        public final boolean n0;
        public final boolean o0;
        public final boolean p0;
        public final boolean q0;
        public final boolean r0;
        public final boolean s0;
        public final boolean t0;
        public final boolean u0;
        public final boolean v0;
        public final boolean w0;
        public final boolean x0;
        public final SparseArray y0;
        public final SparseBooleanArray z0;

        public static final class a extends I.c {
            public boolean C;
            public boolean D;
            public boolean E;
            public boolean F;
            public boolean G;
            public boolean H;
            public boolean I;
            public boolean J;
            public boolean K;
            public boolean L;
            public boolean M;
            public boolean N;
            public boolean O;
            public boolean P;
            public boolean Q;
            public final SparseArray R;
            public final SparseBooleanArray S;

            public /* synthetic */ a(e eVar, a aVar) {
                this(eVar);
            }

            public static /* synthetic */ boolean J(a aVar) {
                return aVar.C;
            }

            public static /* synthetic */ boolean K(a aVar) {
                return aVar.D;
            }

            public static /* synthetic */ boolean L(a aVar) {
                return aVar.E;
            }

            public static /* synthetic */ boolean M(a aVar) {
                return aVar.F;
            }

            public static /* synthetic */ boolean N(a aVar) {
                return aVar.G;
            }

            public static /* synthetic */ boolean O(a aVar) {
                return aVar.H;
            }

            public static /* synthetic */ boolean P(a aVar) {
                return aVar.I;
            }

            public static /* synthetic */ boolean Q(a aVar) {
                return aVar.J;
            }

            public static /* synthetic */ boolean R(a aVar) {
                return aVar.K;
            }

            public static /* synthetic */ boolean S(a aVar) {
                return aVar.L;
            }

            public static /* synthetic */ boolean T(a aVar) {
                return aVar.M;
            }

            public static /* synthetic */ boolean U(a aVar) {
                return aVar.N;
            }

            public static /* synthetic */ boolean V(a aVar) {
                return aVar.O;
            }

            public static /* synthetic */ boolean W(a aVar) {
                return aVar.P;
            }

            public static /* synthetic */ boolean X(a aVar) {
                return aVar.Q;
            }

            public static /* synthetic */ SparseArray Y(a aVar) {
                return aVar.R;
            }

            public static /* synthetic */ SparseBooleanArray Z(a aVar) {
                return aVar.S;
            }

            public static SparseArray b0(SparseArray sparseArray) {
                SparseArray sparseArray2 = new SparseArray();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
                }
                return sparseArray2;
            }

            /* renamed from: a0, reason: merged with bridge method [inline-methods] */
            public e C() {
                return new e(this, null);
            }

            public final void c0() {
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = true;
                this.H = false;
                this.I = false;
                this.J = false;
                this.K = false;
                this.L = true;
                this.M = true;
                this.N = true;
                this.O = false;
                this.P = true;
                this.Q = false;
            }

            public a d0(M2.I i) {
                super.E(i);
                return this;
            }

            /* renamed from: e0, reason: merged with bridge method [inline-methods] */
            public a G(Context context) {
                super.G(context);
                return this;
            }

            /* renamed from: f0, reason: merged with bridge method [inline-methods] */
            public a H(int i, int i2, boolean z) {
                super.H(i, i2, z);
                return this;
            }

            /* renamed from: g0, reason: merged with bridge method [inline-methods] */
            public a I(Context context, boolean z) {
                super.I(context, z);
                return this;
            }

            public a() {
                this.R = new SparseArray();
                this.S = new SparseBooleanArray();
                c0();
            }

            public a(Context context) {
                super(context);
                this.R = new SparseArray();
                this.S = new SparseBooleanArray();
                c0();
            }

            public a(e eVar) {
                super(eVar);
                this.C = eVar.j0;
                this.D = eVar.k0;
                this.E = eVar.l0;
                this.F = eVar.m0;
                this.G = eVar.n0;
                this.H = eVar.o0;
                this.I = eVar.p0;
                this.J = eVar.q0;
                this.K = eVar.r0;
                this.L = eVar.s0;
                this.M = eVar.t0;
                this.N = eVar.u0;
                this.O = eVar.v0;
                this.P = eVar.w0;
                this.Q = eVar.x0;
                this.R = b0(e.b(eVar));
                this.S = e.c(eVar).clone();
            }
        }

        static {
            e C = new a().C();
            A0 = C;
            B0 = C;
            C0 = K.w0(1000);
            D0 = K.w0(1001);
            E0 = K.w0(1002);
            F0 = K.w0(1003);
            G0 = K.w0(1004);
            H0 = K.w0(1005);
            I0 = K.w0(1006);
            J0 = K.w0(1007);
            K0 = K.w0(1008);
            L0 = K.w0(1009);
            M0 = K.w0(1010);
            N0 = K.w0(1011);
            O0 = K.w0(1012);
            P0 = K.w0(1013);
            Q0 = K.w0(1014);
            R0 = K.w0(1015);
            S0 = K.w0(1016);
            T0 = K.w0(1017);
            U0 = K.w0(1018);
        }

        public /* synthetic */ e(a aVar, a aVar2) {
            this(aVar);
        }

        public static /* synthetic */ SparseArray b(e eVar) {
            return eVar.y0;
        }

        public static /* synthetic */ SparseBooleanArray c(e eVar) {
            return eVar.z0;
        }

        public static boolean d(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean e(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0 || !f((Map) sparseArray.valueAt(i), (Map) sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static boolean f(Map map, Map map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry entry : map.entrySet()) {
                Y y = (Y) entry.getKey();
                if (!map2.containsKey(y) || !K.c(entry.getValue(), map2.get(y))) {
                    return false;
                }
            }
            return true;
        }

        public static e h(Context context) {
            return new a(context).C();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return super.equals(eVar) && this.j0 == eVar.j0 && this.k0 == eVar.k0 && this.l0 == eVar.l0 && this.m0 == eVar.m0 && this.n0 == eVar.n0 && this.o0 == eVar.o0 && this.p0 == eVar.p0 && this.q0 == eVar.q0 && this.r0 == eVar.r0 && this.s0 == eVar.s0 && this.t0 == eVar.t0 && this.u0 == eVar.u0 && this.v0 == eVar.v0 && this.w0 == eVar.w0 && this.x0 == eVar.x0 && d(this.z0, eVar.z0) && e(this.y0, eVar.y0);
        }

        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this, null);
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.j0 ? 1 : 0)) * 31) + (this.k0 ? 1 : 0)) * 31) + (this.l0 ? 1 : 0)) * 31) + (this.m0 ? 1 : 0)) * 31) + (this.n0 ? 1 : 0)) * 31) + (this.o0 ? 1 : 0)) * 31) + (this.p0 ? 1 : 0)) * 31) + (this.q0 ? 1 : 0)) * 31) + (this.r0 ? 1 : 0)) * 31) + (this.s0 ? 1 : 0)) * 31) + (this.t0 ? 1 : 0)) * 31) + (this.u0 ? 1 : 0)) * 31) + (this.v0 ? 1 : 0)) * 31) + (this.w0 ? 1 : 0)) * 31) + (this.x0 ? 1 : 0);
        }

        public boolean i(int i) {
            return this.z0.get(i);
        }

        public f j(int i, Y y) {
            Map map = (Map) this.y0.get(i);
            if (map == null) {
                return null;
            }
            android.support.v4.media.session.b.a(map.get(y));
            return null;
        }

        public boolean k(int i, Y y) {
            Map map = (Map) this.y0.get(i);
            return map != null && map.containsKey(y);
        }

        public e(a aVar) {
            super(aVar);
            this.j0 = a.J(aVar);
            this.k0 = a.K(aVar);
            this.l0 = a.L(aVar);
            this.m0 = a.M(aVar);
            this.n0 = a.N(aVar);
            this.o0 = a.O(aVar);
            this.p0 = a.P(aVar);
            this.q0 = a.Q(aVar);
            this.r0 = a.R(aVar);
            this.s0 = a.S(aVar);
            this.t0 = a.T(aVar);
            this.u0 = a.U(aVar);
            this.v0 = a.V(aVar);
            this.w0 = a.W(aVar);
            this.x0 = a.X(aVar);
            this.y0 = a.Y(aVar);
            this.z0 = a.Z(aVar);
        }
    }

    public static final class f {
    }

    public static class g {
        public final Spatializer a;
        public final boolean b;
        public Handler c;
        public Spatializer$OnSpatializerStateChangedListener d;

        public class a implements Spatializer$OnSpatializerStateChangedListener {
            public final /* synthetic */ n a;

            public a(n nVar) {
                this.a = nVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
                n.C(this.a);
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
                n.C(this.a);
            }
        }

        public g(Spatializer spatializer) {
            this.a = spatializer;
            this.b = p.a(spatializer) != 0;
        }

        public static g g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new g(o.a(audioManager));
        }

        public boolean a(M2.b bVar, M2.q qVar) {
            int M = K.M(("audio/eac3-joc".equals(qVar.n) && qVar.B == 16) ? 12 : qVar.B);
            if (M == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(M);
            int i = qVar.C;
            if (i != -1) {
                channelMask.setSampleRate(i);
            }
            return u.a(this.a, bVar.a().a, channelMask.build());
        }

        public void b(n nVar, Looper looper) {
            if (this.d == null && this.c == null) {
                this.d = new a(nVar);
                Handler handler = new Handler(looper);
                this.c = handler;
                Spatializer spatializer = this.a;
                Objects.requireNonNull(handler);
                q.a(spatializer, new U(handler), this.d);
            }
        }

        public boolean c() {
            return s.a(this.a);
        }

        public boolean d() {
            return t.a(this.a);
        }

        public boolean e() {
            return this.b;
        }

        public void f() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.d;
            if (spatializer$OnSpatializerStateChangedListener == null || this.c == null) {
                return;
            }
            r.a(this.a, spatializer$OnSpatializerStateChangedListener);
            ((Handler) K.i(this.c)).removeCallbacksAndMessages((Object) null);
            this.c = null;
            this.d = null;
        }
    }

    public static final class h extends i implements Comparable {
        public final int e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final int i;
        public final int j;
        public final int k;
        public final int l;
        public final boolean m;

        public h(int i, H h, int i2, e eVar, int i3, String str) {
            int i4;
            super(i, h, i2);
            int i5 = 0;
            this.f = X0.m(i3, false);
            int i6 = this.d.e & (~eVar.v);
            this.g = (i6 & 1) != 0;
            this.h = (i6 & 2) != 0;
            t7.r t = eVar.t.isEmpty() ? t7.r.t("") : eVar.t;
            int i7 = 0;
            while (true) {
                if (i7 >= t.size()) {
                    i7 = Integer.MAX_VALUE;
                    i4 = 0;
                    break;
                } else {
                    i4 = n.G(this.d, (String) t.get(i7), eVar.w);
                    if (i4 > 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.i = i7;
            this.j = i4;
            int y = n.y(this.d.f, eVar.u);
            this.k = y;
            this.m = (this.d.f & 1088) != 0;
            int G = n.G(this.d, str, n.X(str) == null);
            this.l = G;
            boolean z = i4 > 0 || (eVar.t.isEmpty() && y > 0) || this.g || (this.h && G > 0);
            if (X0.m(i3, eVar.u0) && z) {
                i5 = 1;
            }
            this.e = i5;
        }

        public static int c(List list, List list2) {
            return ((h) list.get(0)).compareTo((h) list2.get(0));
        }

        public static t7.r e(int i, H h, e eVar, int[] iArr, String str) {
            r.a j = t7.r.j();
            for (int i2 = 0; i2 < h.a; i2++) {
                j.h(new h(i, h, i2, eVar, iArr[i2], str));
            }
            return j.k();
        }

        public int a() {
            return this.e;
        }

        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(h hVar) {
            t7.k d = t7.k.j().g(this.f, hVar.f).f(Integer.valueOf(this.i), Integer.valueOf(hVar.i), t7.I.c().e()).d(this.j, hVar.j).d(this.k, hVar.k).g(this.g, hVar.g).f(Boolean.valueOf(this.h), Boolean.valueOf(hVar.h), this.j == 0 ? t7.I.c() : t7.I.c().e()).d(this.l, hVar.l);
            if (this.k == 0) {
                d = d.h(this.m, hVar.m);
            }
            return d.i();
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public boolean b(h hVar) {
            return false;
        }
    }

    public static abstract class i {
        public final int a;
        public final H b;
        public final int c;
        public final M2.q d;

        public interface a {
            List a(int i, H h, int[] iArr);
        }

        public i(int i, H h, int i2) {
            this.a = i;
            this.b = h;
            this.c = i2;
            this.d = h.a(i2);
        }

        public abstract int a();

        public abstract boolean b(i iVar);
    }

    public static final class j extends i {
        public final boolean e;
        public final e f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final int j;
        public final int k;
        public final int l;
        public final int m;
        public final boolean n;
        public final boolean o;
        public final int p;
        public final boolean q;
        public final boolean r;
        public final int s;

        /* JADX WARN: Removed duplicated region for block: B:82:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x004b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public j(int r5, M2.H r6, int r7, j3.n.e r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j3.n.j.<init>(int, M2.H, int, j3.n$e, int, int, boolean):void");
        }

        public static /* synthetic */ int c(j jVar, j jVar2) {
            return f(jVar, jVar2);
        }

        public static /* synthetic */ int d(j jVar, j jVar2) {
            return e(jVar, jVar2);
        }

        public static int e(j jVar, j jVar2) {
            t7.k g = t7.k.j().g(jVar.h, jVar2.h).d(jVar.m, jVar2.m).g(jVar.n, jVar2.n).g(jVar.i, jVar2.i).g(jVar.e, jVar2.e).g(jVar.g, jVar2.g).f(Integer.valueOf(jVar.l), Integer.valueOf(jVar2.l), t7.I.c().e()).g(jVar.q, jVar2.q).g(jVar.r, jVar2.r);
            if (jVar.q && jVar.r) {
                g = g.d(jVar.s, jVar2.s);
            }
            return g.i();
        }

        public static int f(j jVar, j jVar2) {
            t7.I A = (jVar.e && jVar.h) ? n.A() : n.A().e();
            t7.k j = t7.k.j();
            if (jVar.f.y) {
                j = j.f(Integer.valueOf(jVar.j), Integer.valueOf(jVar2.j), n.A().e());
            }
            return j.f(Integer.valueOf(jVar.k), Integer.valueOf(jVar2.k), A).f(Integer.valueOf(jVar.j), Integer.valueOf(jVar2.j), A).i();
        }

        public static int g(List list, List list2) {
            return t7.k.j().f((j) Collections.max(list, new v()), (j) Collections.max(list2, new v()), new v()).d(list.size(), list2.size()).f((j) Collections.max(list, new w()), (j) Collections.max(list2, new w()), new w()).i();
        }

        public static t7.r h(int i, H h, e eVar, int[] iArr, int i2) {
            int x = n.x(h, eVar.i, eVar.j, eVar.k);
            r.a j = t7.r.j();
            for (int i3 = 0; i3 < h.a; i3++) {
                int d = h.a(i3).d();
                j.h(new j(i, h, i3, eVar, iArr[i3], i2, x == Integer.MAX_VALUE || (d != -1 && d <= x)));
            }
            return j.k();
        }

        public int a() {
            return this.p;
        }

        public final int i(int i, int i2) {
            if ((this.d.f & 16384) != 0 || !X0.m(i, this.f.u0)) {
                return 0;
            }
            if (!this.e && !this.f.j0) {
                return 0;
            }
            if (X0.m(i, false) && this.g && this.e && this.d.i != -1) {
                e eVar = this.f;
                if (!eVar.z && !eVar.y && (i & i2) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean b(j jVar) {
            return (this.o || K.c(this.d.n, jVar.d.n)) && (this.f.m0 || (this.q == jVar.q && this.r == jVar.r));
        }
    }

    public n(Context context) {
        this(context, new a.b());
    }

    public static /* synthetic */ t7.I A() {
        return k;
    }

    public static /* synthetic */ boolean B(e eVar, int i2, M2.q qVar) {
        return Y(eVar, i2, qVar);
    }

    public static /* synthetic */ void C(n nVar) {
        nVar.V();
    }

    public static void D(z.a aVar, e eVar, x.a[] aVarArr) {
        int d2 = aVar.d();
        for (int i2 = 0; i2 < d2; i2++) {
            Y f2 = aVar.f(i2);
            if (eVar.k(i2, f2)) {
                eVar.j(i2, f2);
                aVarArr[i2] = null;
            }
        }
    }

    public static void E(z.a aVar, M2.I i2, x.a[] aVarArr) {
        int d2 = aVar.d();
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < d2; i3++) {
            F(aVar.f(i3), i2, hashMap);
        }
        F(aVar.h(), i2, hashMap);
        for (int i4 = 0; i4 < d2; i4++) {
            android.support.v4.media.session.b.a(hashMap.get(Integer.valueOf(aVar.e(i4))));
        }
    }

    public static void F(Y y, M2.I i2, Map map) {
        for (int i3 = 0; i3 < y.a; i3++) {
            android.support.v4.media.session.b.a(i2.A.get(y.b(i3)));
        }
    }

    public static int G(M2.q qVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(qVar.d)) {
            return 4;
        }
        String X = X(str);
        String X2 = X(qVar.d);
        if (X2 == null || X == null) {
            return (z && X2 == null) ? 1 : 0;
        }
        if (X2.startsWith(X) || X.startsWith(X2)) {
            return 3;
        }
        return K.d1(X2, "-")[0].equals(K.d1(X, "-")[0]) ? 2 : 0;
    }

    public static int H(H h2, int i2, int i3, boolean z) {
        int i4;
        int i5 = Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
            for (int i6 = 0; i6 < h2.a; i6++) {
                M2.q a2 = h2.a(i6);
                int i7 = a2.t;
                if (i7 > 0 && (i4 = a2.u) > 0) {
                    Point I = I(z, i2, i3, i7, i4);
                    int i8 = a2.t;
                    int i9 = a2.u;
                    int i10 = i8 * i9;
                    if (i8 >= ((int) (I.x * 0.98f)) && i9 >= ((int) (I.y * 0.98f)) && i10 < i5) {
                        i5 = i10;
                    }
                }
            }
        }
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Point I(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r3
        L9:
            if (r4 <= r5) goto Lc
            r3 = r0
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = P2.K.k(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = P2.K.k(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.n.I(boolean, int, int, int, int):android.graphics.Point");
    }

    public static int K(int i2, int i3) {
        if (i2 == 0 || i2 != i3) {
            return Integer.bitCount(i2 & i3);
        }
        return Integer.MAX_VALUE;
    }

    public static int L(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public static boolean N(M2.q qVar) {
        String str = qVar.n;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
        }
        return false;
    }

    public static /* synthetic */ List P(e eVar, int i2, H h2, int[] iArr) {
        return c.e(i2, h2, eVar, iArr);
    }

    public static /* synthetic */ List Q(e eVar, String str, int i2, H h2, int[] iArr) {
        return h.e(i2, h2, eVar, iArr, str);
    }

    public static /* synthetic */ List R(e eVar, int[] iArr, int i2, H h2, int[] iArr2) {
        return j.h(i2, h2, eVar, iArr2, iArr[i2]);
    }

    public static /* synthetic */ int S(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public static void T(e eVar, z.a aVar, int[][][] iArr, Y0[] y0Arr, x[] xVarArr) {
        int i2 = -1;
        boolean z = false;
        int i3 = 0;
        for (int i4 = 0; i4 < aVar.d(); i4++) {
            int e2 = aVar.e(i4);
            x xVar = xVarArr[i4];
            if (e2 != 1 && xVar != null) {
                return;
            }
            if (e2 == 1 && xVar != null && xVar.length() == 1) {
                if (Y(eVar, iArr[i4][aVar.f(i4).d(xVar.k())][xVar.d(0)], xVar.r())) {
                    i3++;
                    i2 = i4;
                }
            }
        }
        if (i3 == 1) {
            int i5 = eVar.s.b ? 1 : 2;
            Y0 y0 = y0Arr[i2];
            if (y0 != null && y0.b) {
                z = true;
            }
            y0Arr[i2] = new Y0(i5, z);
        }
    }

    public static void U(z.a aVar, int[][][] iArr, Y0[] y0Arr, x[] xVarArr) {
        boolean z;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < aVar.d(); i4++) {
            int e2 = aVar.e(i4);
            x xVar = xVarArr[i4];
            if ((e2 == 1 || e2 == 2) && xVar != null && Z(iArr[i4], aVar.f(i4), xVar)) {
                if (e2 == 1) {
                    if (i3 != -1) {
                        z = false;
                        break;
                    }
                    i3 = i4;
                } else {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i4;
                }
            }
        }
        z = true;
        if (z && ((i3 == -1 || i2 == -1) ? false : true)) {
            Y0 y0 = new Y0(0, true);
            y0Arr[i3] = y0;
            y0Arr[i2] = y0;
        }
    }

    public static String X(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean Y(e eVar, int i2, M2.q qVar) {
        if (X0.x(i2) == 0) {
            return false;
        }
        if (eVar.s.c && (X0.x(i2) & 2048) == 0) {
            return false;
        }
        if (eVar.s.b) {
            return !(qVar.E != 0 || qVar.F != 0) || ((X0.x(i2) & 1024) != 0);
        }
        return true;
    }

    public static boolean Z(int[][] iArr, Y y, x xVar) {
        if (xVar == null) {
            return false;
        }
        int d2 = y.d(xVar.k());
        for (int i2 = 0; i2 < xVar.length(); i2++) {
            if (X0.r(iArr[d2][xVar.d(i2)]) != 32) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ List r(e eVar, int i2, H h2, int[] iArr) {
        return P(eVar, i2, h2, iArr);
    }

    public static /* synthetic */ List s(e eVar, String str, int i2, H h2, int[] iArr) {
        return Q(eVar, str, i2, h2, iArr);
    }

    public static /* synthetic */ List t(n nVar, e eVar, boolean z, int[] iArr, int i2, H h2, int[] iArr2) {
        return nVar.O(eVar, z, iArr, i2, h2, iArr2);
    }

    public static /* synthetic */ List u(e eVar, int[] iArr, int i2, H h2, int[] iArr2) {
        return R(eVar, iArr, i2, h2, iArr2);
    }

    public static /* synthetic */ int v(Integer num, Integer num2) {
        return S(num, num2);
    }

    public static /* synthetic */ boolean w(n nVar, M2.q qVar) {
        return nVar.M(qVar);
    }

    public static /* synthetic */ int x(H h2, int i2, int i3, boolean z) {
        return H(h2, i2, i3, z);
    }

    public static /* synthetic */ int y(int i2, int i3) {
        return K(i2, i3);
    }

    public static /* synthetic */ int z(String str) {
        return L(str);
    }

    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public e c() {
        e eVar;
        synchronized (this.d) {
            eVar = this.h;
        }
        return eVar;
    }

    public final boolean M(M2.q qVar) {
        boolean z;
        g gVar;
        g gVar2;
        synchronized (this.d) {
            try {
                if (this.h.t0 && !this.g && qVar.B > 2 && (!N(qVar) || (K.a >= 32 && (gVar2 = this.i) != null && gVar2.e()))) {
                    z = K.a >= 32 && (gVar = this.i) != null && gVar.e() && this.i.c() && this.i.d() && this.i.a(this.j, qVar);
                }
            } finally {
            }
        }
        return z;
    }

    public final /* synthetic */ List O(e eVar, boolean z, int[] iArr, int i2, H h2, int[] iArr2) {
        return b.e(i2, h2, eVar, iArr2, z, new m(this), iArr[i2]);
    }

    public final void V() {
        boolean z;
        g gVar;
        synchronized (this.d) {
            try {
                z = this.h.t0 && !this.g && K.a >= 32 && (gVar = this.i) != null && gVar.e();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            f();
        }
    }

    public final void W(W0 w0) {
        boolean z;
        synchronized (this.d) {
            z = this.h.x0;
        }
        if (z) {
            g(w0);
        }
    }

    public void a(W0 w0) {
        W(w0);
    }

    public x.a[] a0(z.a aVar, int[][][] iArr, int[] iArr2, e eVar) {
        int d2 = aVar.d();
        x.a[] aVarArr = new x.a[d2];
        Pair g0 = g0(aVar, iArr, iArr2, eVar);
        String str = null;
        Pair c0 = (eVar.x || g0 == null) ? c0(aVar, iArr, eVar) : null;
        if (c0 != null) {
            aVarArr[((Integer) c0.second).intValue()] = (x.a) c0.first;
        } else if (g0 != null) {
            aVarArr[((Integer) g0.second).intValue()] = (x.a) g0.first;
        }
        Pair b0 = b0(aVar, iArr, iArr2, eVar);
        if (b0 != null) {
            aVarArr[((Integer) b0.second).intValue()] = (x.a) b0.first;
        }
        if (b0 != null) {
            Object obj = b0.first;
            str = ((x.a) obj).a.a(((x.a) obj).b[0]).d;
        }
        Pair e0 = e0(aVar, iArr, eVar, str);
        if (e0 != null) {
            aVarArr[((Integer) e0.second).intValue()] = (x.a) e0.first;
        }
        for (int i2 = 0; i2 < d2; i2++) {
            int e2 = aVar.e(i2);
            if (e2 != 2 && e2 != 1 && e2 != 3 && e2 != 4) {
                aVarArr[i2] = d0(e2, aVar.f(i2), iArr[i2], eVar);
            }
        }
        return aVarArr;
    }

    public Pair b0(z.a aVar, int[][][] iArr, int[] iArr2, e eVar) {
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < aVar.d()) {
                if (2 == aVar.e(i2) && aVar.f(i2).a > 0) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return f0(1, aVar, iArr, new j3.g(this, eVar, z, iArr2), new j3.h());
    }

    public Pair c0(z.a aVar, int[][][] iArr, e eVar) {
        if (eVar.s.a == 2) {
            return null;
        }
        return f0(4, aVar, iArr, new j3.e(eVar), new j3.f());
    }

    public x.a d0(int i2, Y y, int[][] iArr, e eVar) {
        if (eVar.s.a == 2) {
            return null;
        }
        int i3 = 0;
        H h2 = null;
        d dVar = null;
        for (int i4 = 0; i4 < y.a; i4++) {
            H b2 = y.b(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < b2.a; i5++) {
                if (X0.m(iArr2[i5], eVar.u0)) {
                    d dVar2 = new d(b2.a(i5), iArr2[i5]);
                    if (dVar == null || dVar2.compareTo(dVar) > 0) {
                        h2 = b2;
                        i3 = i5;
                        dVar = dVar2;
                    }
                }
            }
        }
        if (h2 == null) {
            return null;
        }
        return new x.a(h2, i3);
    }

    public Pair e0(z.a aVar, int[][][] iArr, e eVar, String str) {
        if (eVar.s.a == 2) {
            return null;
        }
        return f0(3, aVar, iArr, new k(eVar, str), new l());
    }

    public final Pair f0(int i2, z.a aVar, int[][][] iArr, i.a aVar2, Comparator comparator) {
        int i3;
        t7.r rVar;
        z.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int d2 = aVar.d();
        int i4 = 0;
        while (i4 < d2) {
            if (i2 == aVar3.e(i4)) {
                Y f2 = aVar3.f(i4);
                for (int i5 = 0; i5 < f2.a; i5++) {
                    H b2 = f2.b(i5);
                    List a2 = aVar2.a(i4, b2, iArr[i4][i5]);
                    boolean[] zArr = new boolean[b2.a];
                    int i6 = 0;
                    while (i6 < b2.a) {
                        i iVar = (i) a2.get(i6);
                        int a3 = iVar.a();
                        if (zArr[i6] || a3 == 0) {
                            i3 = d2;
                        } else {
                            if (a3 == 1) {
                                rVar = t7.r.t(iVar);
                                i3 = d2;
                            } else {
                                t7.r arrayList2 = new ArrayList();
                                arrayList2.add(iVar);
                                int i7 = i6 + 1;
                                while (i7 < b2.a) {
                                    i iVar2 = (i) a2.get(i7);
                                    int i8 = d2;
                                    if (iVar2.a() == 2 && iVar.b(iVar2)) {
                                        arrayList2.add(iVar2);
                                        zArr[i7] = true;
                                    }
                                    i7++;
                                    d2 = i8;
                                }
                                i3 = d2;
                                rVar = arrayList2;
                            }
                            arrayList.add(rVar);
                        }
                        i6++;
                        d2 = i3;
                    }
                }
            }
            i4++;
            aVar3 = aVar;
            d2 = d2;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((i) list.get(i9)).c;
        }
        i iVar3 = (i) list.get(0);
        return Pair.create(new x.a(iVar3.b, iArr2), Integer.valueOf(iVar3.a));
    }

    public Pair g0(z.a aVar, int[][][] iArr, int[] iArr2, e eVar) {
        if (eVar.s.a == 2) {
            return null;
        }
        return f0(2, aVar, iArr, new j3.i(eVar, iArr2), new j3.j());
    }

    public boolean h() {
        return true;
    }

    public final void h0(e eVar) {
        boolean equals;
        P2.a.e(eVar);
        synchronized (this.d) {
            equals = this.h.equals(eVar);
            this.h = eVar;
        }
        if (equals) {
            return;
        }
        if (eVar.t0 && this.e == null) {
            P2.o.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        f();
    }

    public void j() {
        g gVar;
        synchronized (this.d) {
            try {
                if (K.a >= 32 && (gVar = this.i) != null) {
                    gVar.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.j();
    }

    public void l(M2.b bVar) {
        boolean equals;
        synchronized (this.d) {
            equals = this.j.equals(bVar);
            this.j = bVar;
        }
        if (equals) {
            return;
        }
        V();
    }

    public void m(M2.I i2) {
        if (i2 instanceof e) {
            h0((e) i2);
        }
        h0(new e.a(c(), null).d0(i2).C());
    }

    public final Pair q(z.a aVar, int[][][] iArr, int[] iArr2, w.b bVar, G g2) {
        e eVar;
        g gVar;
        synchronized (this.d) {
            try {
                eVar = this.h;
                if (eVar.t0 && K.a >= 32 && (gVar = this.i) != null) {
                    gVar.b(this, (Looper) P2.a.h(Looper.myLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int d2 = aVar.d();
        x.a[] a0 = a0(aVar, iArr, iArr2, eVar);
        E(aVar, eVar, a0);
        D(aVar, eVar, a0);
        for (int i2 = 0; i2 < d2; i2++) {
            int e2 = aVar.e(i2);
            if (eVar.i(i2) || eVar.B.contains(Integer.valueOf(e2))) {
                a0[i2] = null;
            }
        }
        x[] a2 = this.f.a(a0, b(), bVar, g2);
        Y0[] y0Arr = new Y0[d2];
        for (int i3 = 0; i3 < d2; i3++) {
            y0Arr[i3] = (eVar.i(i3) || eVar.B.contains(Integer.valueOf(aVar.e(i3))) || (aVar.e(i3) != -2 && a2[i3] == null)) ? null : Y0.c;
        }
        if (eVar.v0) {
            U(aVar, iArr, y0Arr, a2);
        }
        if (eVar.s.a != 0) {
            T(eVar, aVar, iArr, y0Arr, a2);
        }
        return Pair.create(y0Arr, a2);
    }

    public n(Context context, x.b bVar) {
        this(context, e.h(context), bVar);
    }

    public n(Context context, M2.I i2, x.b bVar) {
        this(i2, bVar, context);
    }

    public n(M2.I i2, x.b bVar, Context context) {
        this.d = new Object();
        this.e = context != null ? context.getApplicationContext() : null;
        this.f = bVar;
        if (i2 instanceof e) {
            this.h = (e) i2;
        } else {
            this.h = (context == null ? e.A0 : e.h(context)).a().d0(i2).C();
        }
        this.j = M2.b.g;
        boolean z = context != null && K.E0(context);
        this.g = z;
        if (!z && context != null && K.a >= 32) {
            this.i = g.g(context);
        }
        if (this.h.t0 && context == null) {
            P2.o.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public X0.a d() {
        return this;
    }
}
