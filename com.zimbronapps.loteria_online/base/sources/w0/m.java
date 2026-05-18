package W0;

import java.util.Iterator;
import java.util.Map;
import w.P;
import w.Q;
import w.d0;
import w.e0;
import w.f0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m implements D, Iterable, Ra.a {
    public final P a = d0.b();
    public Map b;
    public Q c;
    public boolean d;
    public boolean e;

    public void a(C c, Object obj) {
        if ((obj instanceof a) && e(c)) {
            Object e = this.a.e(c);
            kotlin.jvm.internal.t.e(e, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            a aVar = (a) e;
            P p = this.a;
            a aVar2 = (a) obj;
            String b = aVar2.b();
            if (b == null) {
                b = aVar.b();
            }
            Ca.h a = aVar2.a();
            if (a == null) {
                a = aVar.a();
            }
            p.x(c, new a(b, a));
        } else {
            this.a.x(c, obj);
        }
        if (c.a() != null) {
            if (this.c == null) {
                this.c = f0.b();
            }
            Q q = this.c;
            if (q != null) {
                q.h(c);
            }
        }
    }

    public final void b(m mVar) {
        int i;
        if (mVar.d) {
            this.d = true;
        }
        if (mVar.e) {
            this.e = true;
        }
        P p = mVar.a;
        Object[] objArr = p.b;
        Object[] objArr2 = p.c;
        long[] jArr = p.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((255 & j) < 128) {
                        int i6 = (i2 << 3) + i5;
                        Object obj = objArr[i6];
                        Object obj2 = objArr2[i6];
                        C c = (C) obj;
                        if (!this.a.b(c)) {
                            this.a.x(c, obj2);
                        } else if (obj2 instanceof a) {
                            Object e = this.a.e(c);
                            kotlin.jvm.internal.t.e(e, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            a aVar = (a) e;
                            P p2 = this.a;
                            String b = aVar.b();
                            if (b == null) {
                                b = ((a) obj2).b();
                            }
                            String str = b;
                            Ca.h a = aVar.a();
                            if (a == null) {
                                a = ((a) obj2).a();
                            }
                            p2.x(c, new a(str, a));
                        }
                        i = 8;
                    } else {
                        i = i3;
                    }
                    j >>= i;
                    i5++;
                    i3 = i;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final boolean e(C c) {
        return this.a.c(c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.t.c(this.a, mVar.a) && this.d == mVar.d && this.e == mVar.e;
    }

    public final boolean f() {
        P p = this.a;
        Object[] objArr = p.b;
        Object[] objArr2 = p.c;
        long[] jArr = p.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        if (((C) obj).c()) {
                            return true;
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return false;
                }
            }
            if (i == length) {
                return false;
            }
            i++;
        }
    }

    public final m g() {
        m mVar = new m();
        mVar.d = this.d;
        mVar.e = this.e;
        mVar.a.t(this.a);
        return mVar;
    }

    public final Object h(C c) {
        Object e = this.a.e(c);
        if (e != null) {
            return e;
        }
        throw new IllegalStateException("Key not present: " + c + " - consider getOrElse or getOrNull");
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.e);
    }

    public Iterator iterator() {
        Map map = this.b;
        if (map == null) {
            map = this.a.a();
            this.b = map;
        }
        return map.entrySet().iterator();
    }

    public final e0 j() {
        return this.c;
    }

    public final Object k(C c, Qa.a aVar) {
        Object e = this.a.e(c);
        return e == null ? aVar.invoke() : e;
    }

    public final Object m(C c, Qa.a aVar) {
        Object e = this.a.e(c);
        return e == null ? aVar.invoke() : e;
    }

    public final P n() {
        return this.a;
    }

    public final boolean o() {
        return this.e;
    }

    public final boolean p() {
        return this.d;
    }

    public final void q(m mVar) {
        P p = mVar.a;
        Object[] objArr = p.b;
        Object[] objArr2 = p.c;
        long[] jArr = p.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        C c = (C) obj;
                        Object e = this.a.e(c);
                        kotlin.jvm.internal.t.e(c, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object d = c.d(e, obj2);
                        if (d != null) {
                            this.a.x(c, d);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void r(boolean z) {
        this.e = z;
    }

    public final void s(boolean z) {
        this.d = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b A[PHI: r4
      0x007b: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v5 java.lang.String) binds: [B:11:0x0042, B:21:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.d
            java.lang.String r3 = ", "
            java.lang.String r4 = ""
            if (r2 == 0) goto L18
            r1.append(r4)
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r4 = r3
        L18:
            boolean r2 = r0.e
            if (r2 == 0) goto L25
            r1.append(r4)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r4 = r3
        L25:
            w.P r2 = r0.a
            java.lang.Object[] r5 = r2.b
            java.lang.Object[] r6 = r2.c
            long[] r2 = r2.a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L80
            r8 = 0
            r9 = r8
        L34:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L7b
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L4e:
            if (r14 >= r12) goto L79
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L75
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            W0.C r16 = (W0.C) r16
            r1.append(r4)
            java.lang.String r4 = r16.b()
            r1.append(r4)
            java.lang.String r4 = " : "
            r1.append(r4)
            r1.append(r15)
            r4 = r3
        L75:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4e
        L79:
            if (r12 != r13) goto L80
        L7b:
            if (r9 == r7) goto L80
            int r9 = r9 + 1
            goto L34
        L80:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            java.lang.String r3 = P0.Q0.a(r0, r3)
            r2.append(r3)
            java.lang.String r3 = "{ "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " }"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.m.toString():java.lang.String");
    }
}
