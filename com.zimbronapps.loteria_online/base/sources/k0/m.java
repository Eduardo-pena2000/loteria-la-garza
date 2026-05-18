package k0;

import Ca.I;
import b0.B1;
import b0.H;
import b0.X;
import b0.Y;
import b0.b0;
import b0.c1;
import b0.g1;
import b0.m;
import java.util.LinkedHashMap;
import java.util.Map;
import w.P;
import w.d0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m implements g {
    public static final a e = new a(null);
    public static final v f = y.e(new k(), new l());
    public final Map a;
    public final P b;
    public p c;
    public final Qa.l d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final v a() {
            return m.n();
        }

        public a() {
        }
    }

    public static final class b implements X {
        public final /* synthetic */ Object b;
        public final /* synthetic */ u c;

        public b(Object obj, u uVar) {
            this.b = obj;
            this.c = uVar;
        }

        public void dispose() {
            Object u = m.l(m.this).u(this.b);
            u uVar = this.c;
            if (u == uVar) {
                m mVar = m.this;
                m.o(mVar, uVar, m.m(mVar), this.b);
            }
        }
    }

    public m(Map map) {
        this.a = map;
        this.b = d0.b();
        this.d = new h(this);
    }

    public static /* synthetic */ m a(Map map) {
        return k(map);
    }

    public static /* synthetic */ Map b(z zVar, m mVar) {
        return j(zVar, mVar);
    }

    public static /* synthetic */ X e(m mVar, Object obj, u uVar, Y y) {
        return h(mVar, obj, uVar, y);
    }

    public static /* synthetic */ boolean f(m mVar, Object obj) {
        return p(mVar, obj);
    }

    public static /* synthetic */ I g(m mVar, Object obj, Qa.p pVar, int i, b0.m mVar2, int i2) {
        return i(mVar, obj, pVar, i, mVar2, i2);
    }

    public static final X h(m mVar, Object obj, u uVar, Y y) {
        if (!mVar.b.b(obj)) {
            mVar.a.remove(obj);
            mVar.b.x(obj, uVar);
            return mVar.new b(obj, uVar);
        }
        throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
    }

    public static final I i(m mVar, Object obj, Qa.p pVar, int i, b0.m mVar2, int i2) {
        mVar.d(obj, pVar, mVar2, g1.a(i | 1));
        return I.a;
    }

    public static final Map j(z zVar, m mVar) {
        return mVar.q();
    }

    public static final m k(Map map) {
        return new m(map);
    }

    public static final /* synthetic */ P l(m mVar) {
        return mVar.b;
    }

    public static final /* synthetic */ Map m(m mVar) {
        return mVar.a;
    }

    public static final /* synthetic */ v n() {
        return f;
    }

    public static final /* synthetic */ void o(m mVar, p pVar, Map map, Object obj) {
        mVar.r(pVar, map, obj);
    }

    public static final boolean p(m mVar, Object obj) {
        p pVar = mVar.c;
        if (pVar != null) {
            return pVar.a(obj);
        }
        return true;
    }

    public void c(Object obj) {
        if (this.b.u(obj) == null) {
            this.a.remove(obj);
        }
    }

    public void d(Object obj, Qa.p pVar, b0.m mVar, int i) {
        int i2;
        b0.m i3 = mVar.i(533563200);
        if ((i & 6) == 0) {
            i2 = (i3.E(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.E(pVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.E(this) ? 256 : 128;
        }
        if (i3.o((i2 & 147) != 146, i2 & 1)) {
            if (b0.w.L()) {
                b0.w.U(533563200, i2, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:70)");
            }
            i3.K(207, obj);
            Object C = i3.C();
            m.a aVar = b0.m.a;
            if (C == aVar.a()) {
                if (!((Boolean) this.d.invoke(obj)).booleanValue()) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                C = new u(s.c((Map) this.a.get(obj), this.d));
                i3.t(C);
            }
            u uVar = (u) C;
            H.d(new c1[]{s.g().d(uVar), k4.b.c().d(uVar)}, pVar, i3, (i2 & 112) | c1.i);
            I i4 = I.a;
            boolean E = i3.E(this) | i3.E(obj) | i3.E(uVar);
            Object C2 = i3.C();
            if (E || C2 == aVar.a()) {
                C2 = new i(this, obj, uVar);
                i3.t(C2);
            }
            b0.a(i4, (Qa.l) C2, i3, 6);
            i3.A();
            if (b0.w.L()) {
                b0.w.T();
            }
        } else {
            i3.M();
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new j(this, obj, pVar, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map q() {
        /*
            r17 = this;
            r0 = r17
            java.util.Map r1 = r0.a
            w.P r2 = r0.b
            java.lang.Object[] r3 = r2.b
            java.lang.Object[] r4 = r2.c
            long[] r2 = r2.a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L4f
            r6 = 0
            r7 = r6
        L13:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4a
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2d:
            if (r12 >= r10) goto L48
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L44
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            k0.p r13 = (k0.p) r13
            r0.r(r13, r1, r14)
        L44:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2d
        L48:
            if (r10 != r11) goto L4f
        L4a:
            if (r7 == r5) goto L4f
            int r7 = r7 + 1
            goto L13
        L4f:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L56
            r1 = 0
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.m.q():java.util.Map");
    }

    public final void r(p pVar, Map map, Object obj) {
        Map e2 = pVar.e();
        if (e2.isEmpty()) {
            map.remove(obj);
        } else {
            map.put(obj, e2);
        }
    }

    public final void s(p pVar) {
        this.c = pVar;
    }

    public /* synthetic */ m(Map map, int i, kotlin.jvm.internal.k kVar) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }
}
