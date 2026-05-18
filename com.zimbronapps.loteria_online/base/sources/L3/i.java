package L3;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {
    public static int a(k kVar, long j) {
        if (j == -9223372036854775807L) {
            return 0;
        }
        int a = kVar.a(j);
        if (a == -1) {
            a = kVar.d();
        }
        return (a <= 0 || kVar.c(a + (-1)) != j) ? a : a - 1;
    }

    public static void b(k kVar, int i, P2.g gVar) {
        long c = kVar.c(i);
        List b = kVar.b(c);
        if (b.isEmpty()) {
            return;
        }
        if (i == kVar.d() - 1) {
            throw new IllegalStateException();
        }
        long c2 = kVar.c(i + 1) - kVar.c(i);
        if (c2 > 0) {
            gVar.accept(new e(b, c, c2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(L3.k r11, L3.s.b r12, P2.g r13) {
        /*
            long r0 = r12.a
            int r0 = a(r11, r0)
            long r1 = r12.a
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L3b
            int r1 = r11.d()
            if (r0 >= r1) goto L3b
            long r3 = r12.a
            java.util.List r6 = r11.b(r3)
            long r3 = r11.c(r0)
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L3b
            long r7 = r12.a
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 >= 0) goto L3b
            L3.e r1 = new L3.e
            long r9 = r3 - r7
            r5 = r1
            r5.<init>(r6, r7, r9)
            r13.accept(r1)
            r1 = 1
            goto L3c
        L3b:
            r1 = r2
        L3c:
            r3 = r0
        L3d:
            int r4 = r11.d()
            if (r3 >= r4) goto L49
            b(r11, r3, r13)
            int r3 = r3 + 1
            goto L3d
        L49:
            boolean r3 = r12.b
            if (r3 == 0) goto L76
            if (r1 == 0) goto L51
            int r0 = r0 + (-1)
        L51:
            if (r2 >= r0) goto L59
            b(r11, r2, r13)
            int r2 = r2 + 1
            goto L51
        L59:
            if (r1 == 0) goto L76
            L3.e r1 = new L3.e
            long r2 = r12.a
            java.util.List r4 = r11.b(r2)
            long r5 = r11.c(r0)
            long r2 = r12.a
            long r11 = r11.c(r0)
            long r7 = r2 - r11
            r3 = r1
            r3.<init>(r4, r5, r7)
            r13.accept(r1)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.i.c(L3.k, L3.s$b, P2.g):void");
    }
}
