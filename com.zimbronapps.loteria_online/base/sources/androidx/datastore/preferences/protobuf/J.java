package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.m0;
import androidx.datastore.preferences.protobuf.n0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j implements n0 {
    public final i a;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[m0.b.values().length];
            a = iArr;
            try {
                iArr[m0.b.j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[m0.b.i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[m0.b.g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[m0.b.q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[m0.b.s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[m0.b.o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[m0.b.h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[m0.b.e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[m0.b.r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[m0.b.t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[m0.b.f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[m0.b.k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public j(i iVar) {
        i iVar2 = (i) u.b(iVar, "output");
        this.a = iVar2;
        iVar2.a = this;
    }

    public static j P(i iVar) {
        j jVar = iVar.a;
        return jVar != null ? jVar : new j(iVar);
    }

    public void A(int i, List list, boolean z) {
        Q(i, list, z);
    }

    public void B(int i, float f) {
        this.a.o0(i, f);
    }

    public void C(int i) {
        this.a.M0(i, 4);
    }

    public void D(int i, List list, boolean z) {
        f0(i, list, z);
    }

    public void E(int i, int i2) {
        this.a.i0(i, i2);
    }

    public void F(int i, List list, boolean z) {
        c0(i, list, z);
    }

    public void G(int i, List list, boolean z) {
        W(i, list, z);
    }

    public void H(int i, int i2) {
        this.a.G0(i, i2);
    }

    public void I(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.e0(i, (f) list.get(i2));
        }
    }

    public void J(int i, List list, a0 a0Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            N(i, list.get(i2), a0Var);
        }
    }

    public void K(int i, f fVar) {
        this.a.e0(i, fVar);
    }

    public void L(int i, Object obj, a0 a0Var) {
        this.a.y0(i, (K) obj, a0Var);
    }

    public void M(int i, D.a aVar, Map map) {
        if (this.a.X()) {
            U(i, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.a.M0(i, 2);
            this.a.O0(D.b(aVar, entry.getKey(), entry.getValue()));
            D.e(this.a, aVar, entry.getKey(), entry.getValue());
        }
    }

    public void N(int i, Object obj, a0 a0Var) {
        this.a.r0(i, (K) obj, a0Var);
    }

    public void O(int i, List list, a0 a0Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            L(i, list.get(i2), a0Var);
        }
    }

    public final void Q(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.a0(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.a.M0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i.d(((Boolean) list.get(i4)).booleanValue());
        }
        this.a.O0(i3);
        while (i2 < list.size()) {
            this.a.b0(((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    public final void R(int i, boolean z, Object obj, D.a aVar) {
        this.a.M0(i, 2);
        this.a.O0(D.b(aVar, Boolean.valueOf(z), obj));
        D.e(this.a, aVar, Boolean.valueOf(z), obj);
    }

    public final void S(int i, D.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Integer) it.next()).intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            Object obj = map.get(Integer.valueOf(i4));
            this.a.M0(i, 2);
            this.a.O0(D.b(aVar, Integer.valueOf(i4), obj));
            D.e(this.a, aVar, Integer.valueOf(i4), obj);
        }
    }

    public final void T(int i, D.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = ((Long) it.next()).longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            Object obj = map.get(Long.valueOf(j));
            this.a.M0(i, 2);
            this.a.O0(D.b(aVar, Long.valueOf(j), obj));
            D.e(this.a, aVar, Long.valueOf(j), obj);
        }
    }

    public final void U(int i, D.a aVar, Map map) {
        switch (a.a[aVar.a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    R(i, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    R(i, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                S(i, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                T(i, aVar, map);
                return;
            case 12:
                V(i, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.a);
        }
    }

    public final void V(int i, D.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            strArr[i2] = (String) it.next();
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str = strArr[i3];
            Object obj = map.get(str);
            this.a.M0(i, 2);
            this.a.O0(D.b(aVar, str, obj));
            D.e(this.a, aVar, str, obj);
        }
    }

    public final void W(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.g0(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        this.a.M0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i.i(((Double) list.get(i4)).doubleValue());
        }
        this.a.O0(i3);
        while (i2 < list.size()) {
            this.a.h0(((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    public final void X(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.i0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.M0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i.k(((Integer) list.get(i4)).intValue());
        }
        this.a.O0(i3);
        while (i2 < list.size()) {
            this.a.j0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void Y(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.k0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.M0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i.m(((Integer) list.get(i4)).intValue());
        }
        this.a.O0(i3);
        while (i2 < list.size()) {
            this.a.l0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void Z(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.m0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.M0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i.o(((Long) list.get(i4)).longValue());
        }
        this.a.O0(i3);
        while (i2 < list.size()) {
            this.a.n0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public void a(int i, List list, boolean z) {
        a0(i, list, z);
    }

    public final void a0(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.o0(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        this.a.M0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i.q(((Float) list.get(i4)).floatValue());
        }
        this.a.O0(i3);
        while (i2 < list.size()) {
            this.a.p0(((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    public final void b(int i, Object obj) {
        if (obj instanceof f) {
            this.a.B0(i, (f) obj);
        } else {
            this.a.A0(i, (K) obj);
        }
    }

    public final void b0(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.u0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.M0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i.v(((Integer) list.get(i4)).intValue());
        }
        this.a.O0(i3);
        while (i2 < list.size()) {
            this.a.v0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public void c(int i, int i2) {
        this.a.k0(i, i2);
    }

    public final void c0(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.w0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.M0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i.x(((Long) list.get(i4)).longValue());
        }
        this.a.O0(i3);
        while (i2 < list.size()) {
            this.a.x0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public void d(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.K0(i, (String) list.get(i2));
        }
    }

    public final void d0(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.C0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.M0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i.F(((Integer) list.get(i4)).intValue());
        }
        this.a.O0(i3);
        while (i2 < list.size()) {
            this.a.D0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public void e(int i, String str) {
        this.a.K0(i, str);
    }

    public final void e0(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.E0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.M0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i.H(((Long) list.get(i4)).longValue());
        }
        this.a.O0(i3);
        while (i2 < list.size()) {
            this.a.F0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public void f(int i, long j) {
        this.a.P0(i, j);
    }

    public void f0(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.G0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.M0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i.J(((Integer) list.get(i4)).intValue());
        }
        this.a.O0(i3);
        while (i2 < list.size()) {
            this.a.H0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public void g(int i, List list, boolean z) {
        b0(i, list, z);
    }

    public final void g0(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.I0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.M0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i.L(((Long) list.get(i4)).longValue());
        }
        this.a.O0(i3);
        while (i2 < list.size()) {
            this.a.J0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public void h(int i, int i2) {
        this.a.u0(i, i2);
    }

    public void h0(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.N0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.M0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i.Q(((Integer) list.get(i4)).intValue());
        }
        this.a.O0(i3);
        while (i2 < list.size()) {
            this.a.O0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public void i(int i, long j) {
        this.a.E0(i, j);
    }

    public final void i0(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.P0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.M0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i.S(((Long) list.get(i4)).longValue());
        }
        this.a.O0(i3);
        while (i2 < list.size()) {
            this.a.Q0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public void j(int i, List list, boolean z) {
        Y(i, list, z);
    }

    public void k(int i, List list, boolean z) {
        h0(i, list, z);
    }

    public void l(int i, List list, boolean z) {
        g0(i, list, z);
    }

    public void m(int i, long j) {
        this.a.I0(i, j);
    }

    public void n(int i, List list, boolean z) {
        X(i, list, z);
    }

    public void o(int i, int i2) {
        this.a.N0(i, i2);
    }

    public void p(int i, double d) {
        this.a.g0(i, d);
    }

    public void q(int i, List list, boolean z) {
        e0(i, list, z);
    }

    public void r(int i, List list, boolean z) {
        i0(i, list, z);
    }

    public void s(int i, long j) {
        this.a.m0(i, j);
    }

    public n0.a t() {
        return n0.a.a;
    }

    public void u(int i, long j) {
        this.a.w0(i, j);
    }

    public void v(int i, boolean z) {
        this.a.a0(i, z);
    }

    public void w(int i, int i2) {
        this.a.C0(i, i2);
    }

    public void x(int i) {
        this.a.M0(i, 3);
    }

    public void y(int i, List list, boolean z) {
        Z(i, list, z);
    }

    public void z(int i, List list, boolean z) {
        d0(i, list, z);
    }
}
