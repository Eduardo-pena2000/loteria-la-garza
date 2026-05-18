package L3;

import P2.K;
import t7.I;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g implements k {
    public static final I c = I.c().d(new f());
    public final t7.r a;
    public final long[] b;

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(java.util.List r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = 2
            r2 = 0
            r17.<init>()
            int r3 = r18.size()
            r4 = 1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != r4) goto L4c
            java.lang.Object r3 = t7.u.g(r18)
            L3.e r3 = (L3.e) r3
            long r7 = r3.b
            long r7 = h(r7)
            long r9 = r3.c
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L34
            t7.r r1 = r3.a
            t7.r r1 = t7.r.t(r1)
            r0.a = r1
            long[] r1 = new long[r4]
            r1[r2] = r7
            r0.b = r1
            goto L4b
        L34:
            t7.r r5 = r3.a
            t7.r r6 = t7.r.s()
            t7.r r5 = t7.r.u(r5, r6)
            r0.a = r5
            long r5 = r3.c
            long r5 = r5 + r7
            long[] r1 = new long[r1]
            r1[r2] = r7
            r1[r4] = r5
            r0.b = r1
        L4b:
            return
        L4c:
            int r3 = r18.size()
            int r3 = r3 * r1
            long[] r1 = new long[r3]
            r0.b = r1
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.Arrays.fill(r1, r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            t7.I r3 = L3.g.c
            r7 = r18
            t7.r r3 = t7.r.z(r3, r7)
            r7 = r2
        L6b:
            int r8 = r3.size()
            if (r2 >= r8) goto Ld6
            java.lang.Object r8 = r3.get(r2)
            L3.e r8 = (L3.e) r8
            long r9 = r8.b
            long r9 = h(r9)
            long r11 = r8.c
            long r11 = r11 + r9
            if (r7 == 0) goto Lb4
            long[] r13 = r0.b
            int r14 = r7 + (-1)
            r15 = r13[r14]
            int r13 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r13 >= 0) goto L8d
            goto Lb4
        L8d:
            int r13 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r13 != 0) goto La3
            java.lang.Object r13 = r1.get(r14)
            t7.r r13 = (t7.r) r13
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto La3
            t7.r r9 = r8.a
            r1.set(r14, r9)
            goto Lc0
        La3:
            java.lang.String r13 = "CuesWithTimingSubtitle"
            java.lang.String r15 = "Truncating unsupported overlapping cues."
            P2.o.h(r13, r15)
            long[] r13 = r0.b
            r13[r14] = r9
            t7.r r9 = r8.a
            r1.set(r14, r9)
            goto Lc0
        Lb4:
            long[] r13 = r0.b
            int r14 = r7 + 1
            r13[r7] = r9
            t7.r r7 = r8.a
            r1.add(r7)
            r7 = r14
        Lc0:
            long r8 = r8.c
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto Ld4
            long[] r8 = r0.b
            int r9 = r7 + 1
            r8[r7] = r11
            t7.r r7 = t7.r.s()
            r1.add(r7)
            r7 = r9
        Ld4:
            int r2 = r2 + r4
            goto L6b
        Ld6:
            t7.r r1 = t7.r.n(r1)
            r0.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.g.<init>(java.util.List):void");
    }

    public static /* synthetic */ Comparable e(e eVar) {
        return g(eVar);
    }

    public static /* synthetic */ Comparable g(e eVar) {
        return Long.valueOf(h(eVar.b));
    }

    public static long h(long j) {
        if (j == -9223372036854775807L) {
            return 0L;
        }
        return j;
    }

    public int a(long j) {
        int d = K.d(this.b, j, false, false);
        if (d < this.a.size()) {
            return d;
        }
        return -1;
    }

    public long c(int i) {
        P2.a.a(i < this.a.size());
        return this.b[i];
    }

    public int d() {
        return this.a.size();
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public t7.r b(long j) {
        int h = K.h(this.b, j, true, false);
        return h == -1 ? t7.r.s() : (t7.r) this.a.get(h);
    }
}
