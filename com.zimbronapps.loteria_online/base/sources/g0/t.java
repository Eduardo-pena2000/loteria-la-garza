package g0;

import b0.V0;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class t {
    public static final a e = new a(null);
    public static final int f = 8;
    public static final t g = new t(0, 0, new Object[0]);
    public int a;
    public int b;
    public final i0.e c;
    public Object[] d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final t a() {
            return t.a();
        }

        public a() {
        }
    }

    public static final class b {
        public t a;
        public final int b;

        public b(t tVar, int i) {
            this.a = tVar;
            this.b = i;
        }

        public final t a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final void c(t tVar) {
            this.a = tVar;
        }
    }

    public t(int i, int i2, Object[] objArr, i0.e eVar) {
        this.a = i;
        this.b = i2;
        this.c = eVar;
        this.d = objArr;
    }

    public static final /* synthetic */ t a() {
        return g;
    }

    public final t A(int i, f fVar) {
        fVar.p(fVar.size() - 1);
        fVar.n(W(i));
        if (this.d.length == 2) {
            return null;
        }
        if (this.c != fVar.k()) {
            return new t(0, 0, x.b(this.d, i), fVar.k());
        }
        this.d = x.b(this.d, i);
        return this;
    }

    public final t B(int i, Object obj, Object obj2, i0.e eVar) {
        int n = n(i);
        if (this.c != eVar) {
            return new t(i | this.a, this.b, x.a(this.d, n, obj, obj2), eVar);
        }
        this.d = x.a(this.d, n, obj, obj2);
        this.a = i | this.a;
        return this;
    }

    public final t C(int i, int i2, int i3, Object obj, Object obj2, int i4, i0.e eVar) {
        if (this.c != eVar) {
            return new t(this.a ^ i2, i2 | this.b, d(i, i2, i3, obj, obj2, i4, eVar), eVar);
        }
        this.d = d(i, i2, i3, obj, obj2, i4, eVar);
        this.a ^= i2;
        this.b |= i2;
        return this;
    }

    public final t D(int i, Object obj, Object obj2, int i2, f fVar) {
        int f2 = 1 << x.f(i, i2);
        if (q(f2)) {
            int n = n(f2);
            if (kotlin.jvm.internal.t.c(obj, t(n))) {
                fVar.n(W(n));
                return W(n) == obj2 ? this : M(n, obj2, fVar);
            }
            fVar.p(fVar.size() + 1);
            return C(n, f2, i, obj, obj2, i2, fVar.k());
        }
        if (!r(f2)) {
            fVar.p(fVar.size() + 1);
            return B(f2, obj, obj2, fVar.k());
        }
        int O = O(f2);
        t N = N(O);
        t w = i2 == 30 ? N.w(obj, obj2, fVar) : N.D(i, obj, obj2, i2 + 5, fVar);
        return N == w ? this : L(O, w, fVar.k());
    }

    public final t E(t tVar, int i, i0.b bVar, f fVar) {
        if (this == tVar) {
            bVar.b(e());
            return this;
        }
        if (i > 30) {
            return x(tVar, bVar, fVar.k());
        }
        int i2 = this.b | tVar.b;
        int i3 = this.a;
        int i4 = tVar.a;
        int i5 = (i3 ^ i4) & (~i2);
        int i6 = i3 & i4;
        int i7 = i5;
        while (i6 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i6);
            if (kotlin.jvm.internal.t.c(t(n(lowestOneBit)), tVar.t(tVar.n(lowestOneBit)))) {
                i7 |= lowestOneBit;
            } else {
                i2 |= lowestOneBit;
            }
            i6 ^= lowestOneBit;
        }
        int i8 = 0;
        if (!((i2 & i7) == 0)) {
            V0.b("Check failed.");
        }
        t tVar2 = (kotlin.jvm.internal.t.c(this.c, fVar.k()) && this.a == i7 && this.b == i2) ? this : new t(i7, i2, new Object[(Integer.bitCount(i7) * 2) + Integer.bitCount(i2)]);
        int i9 = i2;
        int i10 = 0;
        while (i9 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i9);
            Object[] objArr = tVar2.d;
            objArr[(objArr.length - 1) - i10] = F(tVar, lowestOneBit2, i, bVar, fVar);
            i10++;
            i9 ^= lowestOneBit2;
        }
        while (i7 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i7);
            int i11 = i8 * 2;
            if (tVar.q(lowestOneBit3)) {
                int n = tVar.n(lowestOneBit3);
                tVar2.d[i11] = tVar.t(n);
                tVar2.d[i11 + 1] = tVar.W(n);
                if (q(lowestOneBit3)) {
                    bVar.c(bVar.a() + 1);
                }
            } else {
                int n2 = n(lowestOneBit3);
                tVar2.d[i11] = t(n2);
                tVar2.d[i11 + 1] = W(n2);
            }
            i8++;
            i7 ^= lowestOneBit3;
        }
        return l(tVar2) ? this : tVar.l(tVar2) ? tVar : tVar2;
    }

    public final t F(t tVar, int i, int i2, i0.b bVar, f fVar) {
        if (r(i)) {
            t N = N(O(i));
            if (tVar.r(i)) {
                return N.E(tVar.N(tVar.O(i)), i2 + 5, bVar, fVar);
            }
            if (!tVar.q(i)) {
                return N;
            }
            int n = tVar.n(i);
            Object t = tVar.t(n);
            Object W = tVar.W(n);
            int size = fVar.size();
            t D = N.D(t != null ? t.hashCode() : 0, t, W, i2 + 5, fVar);
            if (fVar.size() != size) {
                return D;
            }
            bVar.c(bVar.a() + 1);
            return D;
        }
        if (!tVar.r(i)) {
            int n2 = n(i);
            Object t2 = t(n2);
            Object W2 = W(n2);
            int n3 = tVar.n(i);
            Object t3 = tVar.t(n3);
            return u(t2 != null ? t2.hashCode() : 0, t2, W2, t3 != null ? t3.hashCode() : 0, t3, tVar.W(n3), i2 + 5, fVar.k());
        }
        t N2 = tVar.N(tVar.O(i));
        if (q(i)) {
            int n4 = n(i);
            Object t4 = t(n4);
            int i3 = i2 + 5;
            if (!N2.k(t4 != null ? t4.hashCode() : 0, t4, i3)) {
                return N2.D(t4 != null ? t4.hashCode() : 0, t4, W(n4), i3, fVar);
            }
            bVar.c(bVar.a() + 1);
        }
        return N2;
    }

    public final t G(int i, Object obj, int i2, f fVar) {
        int f2 = 1 << x.f(i, i2);
        if (q(f2)) {
            int n = n(f2);
            return kotlin.jvm.internal.t.c(obj, t(n)) ? I(n, f2, fVar) : this;
        }
        if (!r(f2)) {
            return this;
        }
        int O = O(f2);
        t N = N(O);
        return K(N, i2 == 30 ? N.y(obj, fVar) : N.G(i, obj, i2 + 5, fVar), O, f2, fVar.k());
    }

    public final t H(int i, Object obj, Object obj2, int i2, f fVar) {
        int f2 = 1 << x.f(i, i2);
        if (q(f2)) {
            int n = n(f2);
            return (kotlin.jvm.internal.t.c(obj, t(n)) && kotlin.jvm.internal.t.c(obj2, W(n))) ? I(n, f2, fVar) : this;
        }
        if (!r(f2)) {
            return this;
        }
        int O = O(f2);
        t N = N(O);
        return K(N, i2 == 30 ? N.z(obj, obj2, fVar) : N.H(i, obj, obj2, i2 + 5, fVar), O, f2, fVar.k());
    }

    public final t I(int i, int i2, f fVar) {
        fVar.p(fVar.size() - 1);
        fVar.n(W(i));
        if (this.d.length == 2) {
            return null;
        }
        if (this.c != fVar.k()) {
            return new t(i2 ^ this.a, this.b, x.b(this.d, i), fVar.k());
        }
        this.d = x.b(this.d, i);
        this.a ^= i2;
        return this;
    }

    public final t J(int i, int i2, i0.e eVar) {
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.c != eVar) {
            return new t(this.a, i2 ^ this.b, x.c(objArr, i), eVar);
        }
        this.d = x.c(objArr, i);
        this.b ^= i2;
        return this;
    }

    public final t K(t tVar, t tVar2, int i, int i2, i0.e eVar) {
        return tVar2 == null ? J(i, i2, eVar) : (this.c == eVar || tVar != tVar2) ? L(i, tVar2, eVar) : this;
    }

    public final t L(int i, t tVar, i0.e eVar) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && tVar.d.length == 2 && tVar.b == 0) {
            tVar.a = this.b;
            return tVar;
        }
        if (this.c == eVar) {
            objArr[i] = tVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
        copyOf[i] = tVar;
        return new t(this.a, this.b, copyOf, eVar);
    }

    public final t M(int i, Object obj, f fVar) {
        if (this.c == fVar.k()) {
            this.d[i + 1] = obj;
            return this;
        }
        fVar.m(fVar.h() + 1);
        Object[] objArr = this.d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
        copyOf[i + 1] = obj;
        return new t(this.a, this.b, copyOf, fVar.k());
    }

    public final t N(int i) {
        Object obj = this.d[i];
        kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (t) obj;
    }

    public final int O(int i) {
        return (this.d.length - 1) - Integer.bitCount((i - 1) & this.b);
    }

    public final b P(int i, Object obj, Object obj2, int i2) {
        b P;
        int f2 = 1 << x.f(i, i2);
        if (q(f2)) {
            int n = n(f2);
            if (!kotlin.jvm.internal.t.c(obj, t(n))) {
                return v(n, f2, i, obj, obj2, i2).b();
            }
            if (W(n) == obj2) {
                return null;
            }
            return V(n, obj2).c();
        }
        if (!r(f2)) {
            return s(f2, obj, obj2).b();
        }
        int O = O(f2);
        t N = N(O);
        if (i2 == 30) {
            P = N.h(obj, obj2);
            if (P == null) {
                return null;
            }
        } else {
            P = N.P(i, obj, obj2, i2 + 5);
            if (P == null) {
                return null;
            }
        }
        P.c(U(O, f2, P.a()));
        return P;
    }

    public final t Q(int i, Object obj, int i2) {
        int f2 = 1 << x.f(i, i2);
        if (q(f2)) {
            int n = n(f2);
            return kotlin.jvm.internal.t.c(obj, t(n)) ? R(n, f2) : this;
        }
        if (!r(f2)) {
            return this;
        }
        int O = O(f2);
        t N = N(O);
        return T(N, i2 == 30 ? N.i(obj) : N.Q(i, obj, i2 + 5), O, f2);
    }

    public final t R(int i, int i2) {
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        return new t(i2 ^ this.a, this.b, x.b(objArr, i));
    }

    public final t S(int i, int i2) {
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        return new t(this.a, i2 ^ this.b, x.c(objArr, i));
    }

    public final t T(t tVar, t tVar2, int i, int i2) {
        return tVar2 == null ? S(i, i2) : tVar != tVar2 ? U(i, i2, tVar2) : this;
    }

    public final t U(int i, int i2, t tVar) {
        Object[] objArr = tVar.d;
        if (objArr.length != 2 || tVar.b != 0) {
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
            copyOf[i] = tVar;
            return new t(this.a, this.b, copyOf);
        }
        if (this.d.length == 1) {
            tVar.a = this.b;
            return tVar;
        }
        return new t(this.a ^ i2, i2 ^ this.b, x.e(this.d, i, n(i2), objArr[0], objArr[1]));
    }

    public final t V(int i, Object obj) {
        Object[] objArr = this.d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
        copyOf[i + 1] = obj;
        return new t(this.a, this.b, copyOf);
    }

    public final Object W(int i) {
        return this.d[i + 1];
    }

    public final b b() {
        return new b(this, 1);
    }

    public final b c() {
        return new b(this, 0);
    }

    public final Object[] d(int i, int i2, int i3, Object obj, Object obj2, int i4, i0.e eVar) {
        Object t = t(i);
        return x.d(this.d, i, O(i2) + 1, u(t != null ? t.hashCode() : 0, t, W(i), i3, obj, obj2, i4 + 5, eVar));
    }

    public final int e() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int bitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += N(i).e();
        }
        return bitCount;
    }

    public final boolean f(Object obj) {
        Wa.g v = Wa.n.v(Wa.n.w(0, this.d.length), 2);
        int f2 = v.f();
        int g2 = v.g();
        int h = v.h();
        if ((h > 0 && f2 <= g2) || (h < 0 && g2 <= f2)) {
            while (!kotlin.jvm.internal.t.c(obj, this.d[f2])) {
                if (f2 != g2) {
                    f2 += h;
                }
            }
            return true;
        }
        return false;
    }

    public final Object g(Object obj) {
        Wa.g v = Wa.n.v(Wa.n.w(0, this.d.length), 2);
        int f2 = v.f();
        int g2 = v.g();
        int h = v.h();
        if ((h <= 0 || f2 > g2) && (h >= 0 || g2 > f2)) {
            return null;
        }
        while (!kotlin.jvm.internal.t.c(obj, t(f2))) {
            if (f2 == g2) {
                return null;
            }
            f2 += h;
        }
        return W(f2);
    }

    public final b h(Object obj, Object obj2) {
        Wa.g v = Wa.n.v(Wa.n.w(0, this.d.length), 2);
        int f2 = v.f();
        int g2 = v.g();
        int h = v.h();
        if ((h > 0 && f2 <= g2) || (h < 0 && g2 <= f2)) {
            while (!kotlin.jvm.internal.t.c(obj, t(f2))) {
                if (f2 != g2) {
                    f2 += h;
                }
            }
            if (obj2 == W(f2)) {
                return null;
            }
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
            copyOf[f2 + 1] = obj2;
            return new t(0, 0, copyOf).c();
        }
        return new t(0, 0, x.a(this.d, 0, obj, obj2)).b();
    }

    public final t i(Object obj) {
        Wa.g v = Wa.n.v(Wa.n.w(0, this.d.length), 2);
        int f2 = v.f();
        int g2 = v.g();
        int h = v.h();
        if ((h > 0 && f2 <= g2) || (h < 0 && g2 <= f2)) {
            while (!kotlin.jvm.internal.t.c(obj, t(f2))) {
                if (f2 != g2) {
                    f2 += h;
                }
            }
            return j(f2);
        }
        return this;
    }

    public final t j(int i) {
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        return new t(0, 0, x.b(objArr, i));
    }

    public final boolean k(int i, Object obj, int i2) {
        int f2 = 1 << x.f(i, i2);
        if (q(f2)) {
            return kotlin.jvm.internal.t.c(obj, t(n(f2)));
        }
        if (!r(f2)) {
            return false;
        }
        t N = N(O(f2));
        return i2 == 30 ? N.f(obj) : N.k(i, obj, i2 + 5);
    }

    public final boolean l(t tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.b != tVar.b || this.a != tVar.a) {
            return false;
        }
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            if (this.d[i] != tVar.d[i]) {
                return false;
            }
        }
        return true;
    }

    public final int m() {
        return Integer.bitCount(this.a);
    }

    public final int n(int i) {
        return Integer.bitCount((i - 1) & this.a) * 2;
    }

    public final Object o(int i, Object obj, int i2) {
        int f2 = 1 << x.f(i, i2);
        if (q(f2)) {
            int n = n(f2);
            if (kotlin.jvm.internal.t.c(obj, t(n))) {
                return W(n);
            }
            return null;
        }
        if (!r(f2)) {
            return null;
        }
        t N = N(O(f2));
        return i2 == 30 ? N.g(obj) : N.o(i, obj, i2 + 5);
    }

    public final Object[] p() {
        return this.d;
    }

    public final boolean q(int i) {
        return (i & this.a) != 0;
    }

    public final boolean r(int i) {
        return (i & this.b) != 0;
    }

    public final t s(int i, Object obj, Object obj2) {
        return new t(i | this.a, this.b, x.a(this.d, n(i), obj, obj2));
    }

    public final Object t(int i) {
        return this.d[i];
    }

    public final t u(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, i0.e eVar) {
        if (i3 > 30) {
            return new t(0, 0, new Object[]{obj, obj2, obj3, obj4}, eVar);
        }
        int f2 = x.f(i, i3);
        int f3 = x.f(i2, i3);
        if (f2 != f3) {
            return new t((1 << f2) | (1 << f3), 0, f2 < f3 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, eVar);
        }
        return new t(0, 1 << f2, new Object[]{u(i, obj, obj2, i2, obj3, obj4, i3 + 5, eVar)}, eVar);
    }

    public final t v(int i, int i2, int i3, Object obj, Object obj2, int i4) {
        return new t(this.a ^ i2, i2 | this.b, d(i, i2, i3, obj, obj2, i4, null));
    }

    public final t w(Object obj, Object obj2, f fVar) {
        Wa.g v = Wa.n.v(Wa.n.w(0, this.d.length), 2);
        int f2 = v.f();
        int g2 = v.g();
        int h = v.h();
        if ((h > 0 && f2 <= g2) || (h < 0 && g2 <= f2)) {
            while (!kotlin.jvm.internal.t.c(obj, t(f2))) {
                if (f2 != g2) {
                    f2 += h;
                }
            }
            fVar.n(W(f2));
            if (this.c == fVar.k()) {
                this.d[f2 + 1] = obj2;
                return this;
            }
            fVar.m(fVar.h() + 1);
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
            copyOf[f2 + 1] = obj2;
            return new t(0, 0, copyOf, fVar.k());
        }
        fVar.p(fVar.size() + 1);
        return new t(0, 0, x.a(this.d, 0, obj, obj2), fVar.k());
    }

    public final t x(t tVar, i0.b bVar, i0.e eVar) {
        i0.a.a(this.b == 0);
        i0.a.a(this.a == 0);
        i0.a.a(tVar.b == 0);
        i0.a.a(tVar.a == 0);
        Object[] objArr = this.d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + tVar.d.length);
        kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
        int length = this.d.length;
        Wa.g v = Wa.n.v(Wa.n.w(0, tVar.d.length), 2);
        int f2 = v.f();
        int g2 = v.g();
        int h = v.h();
        if ((h > 0 && f2 <= g2) || (h < 0 && g2 <= f2)) {
            while (true) {
                if (f(tVar.d[f2])) {
                    bVar.c(bVar.a() + 1);
                } else {
                    Object[] objArr2 = tVar.d;
                    copyOf[length] = objArr2[f2];
                    copyOf[length + 1] = objArr2[f2 + 1];
                    length += 2;
                }
                if (f2 == g2) {
                    break;
                }
                f2 += h;
            }
        }
        if (length == this.d.length) {
            return this;
        }
        if (length == tVar.d.length) {
            return tVar;
        }
        if (length == copyOf.length) {
            return new t(0, 0, copyOf, eVar);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        kotlin.jvm.internal.t.f(copyOf2, "copyOf(...)");
        return new t(0, 0, copyOf2, eVar);
    }

    public final t y(Object obj, f fVar) {
        Wa.g v = Wa.n.v(Wa.n.w(0, this.d.length), 2);
        int f2 = v.f();
        int g2 = v.g();
        int h = v.h();
        if ((h > 0 && f2 <= g2) || (h < 0 && g2 <= f2)) {
            while (!kotlin.jvm.internal.t.c(obj, t(f2))) {
                if (f2 != g2) {
                    f2 += h;
                }
            }
            return A(f2, fVar);
        }
        return this;
    }

    public final t z(Object obj, Object obj2, f fVar) {
        Wa.g v = Wa.n.v(Wa.n.w(0, this.d.length), 2);
        int f2 = v.f();
        int g2 = v.g();
        int h = v.h();
        if ((h > 0 && f2 <= g2) || (h < 0 && g2 <= f2)) {
            while (true) {
                if (!kotlin.jvm.internal.t.c(obj, t(f2)) || !kotlin.jvm.internal.t.c(obj2, W(f2))) {
                    if (f2 == g2) {
                        break;
                    }
                    f2 += h;
                } else {
                    return A(f2, fVar);
                }
            }
        }
        return this;
    }

    public t(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, null);
    }
}
