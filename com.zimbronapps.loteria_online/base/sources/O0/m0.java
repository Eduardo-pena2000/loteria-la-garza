package O0;

import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m0 {
    public static final a c = new a(null);
    public static final int d = 8;
    public final d0.c a = new d0.c(new J[16], 0);
    public J[] b;

    public static final class a {

        public static final class a implements Comparator {
            public static final a a = new a();

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(J j, J j2) {
                int h = kotlin.jvm.internal.t.h(j2.S(), j.S());
                return h != 0 ? h : kotlin.jvm.internal.t.h(j.hashCode(), j2.hashCode());
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r5 = this;
            d0.c r0 = r5.a
            O0.m0$a$a r1 = O0.m0.a.a.a
            r0.A(r1)
            d0.c r0 = r5.a
            int r0 = r0.m()
            O0.J[] r1 = r5.b
            if (r1 == 0) goto L14
            int r2 = r1.length
            if (r2 >= r0) goto L22
        L14:
            d0.c r1 = r5.a
            int r1 = r1.m()
            r2 = 16
            int r1 = java.lang.Math.max(r2, r1)
            O0.J[] r1 = new O0.J[r1]
        L22:
            r2 = 0
            r5.b = r2
            r3 = 0
        L26:
            if (r3 >= r0) goto L33
            d0.c r4 = r5.a
            java.lang.Object[] r4 = r4.a
            r4 = r4[r3]
            r1[r3] = r4
            int r3 = r3 + 1
            goto L26
        L33:
            d0.c r3 = r5.a
            r3.h()
            int r0 = r0 + (-1)
        L3a:
            r3 = -1
            if (r3 >= r0) goto L50
            r3 = r1[r0]
            kotlin.jvm.internal.t.d(r3)
            boolean r4 = r3.r0()
            if (r4 == 0) goto L4b
            r5.b(r3)
        L4b:
            r1[r0] = r2
            int r0 = r0 + (-1)
            goto L3a
        L50:
            r5.b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.m0.a():void");
    }

    public final void b(J j) {
        if (j.U() > 0) {
            j.H();
            j.T1(false);
            d0.c H0 = j.H0();
            Object[] objArr = H0.a;
            int m = H0.m();
            for (int i = 0; i < m; i++) {
                b((J) objArr[i]);
            }
        }
    }

    public final boolean c() {
        return this.a.m() != 0;
    }

    public final void d(J j) {
        if (j.U() > 0) {
            this.a.b(j);
            j.T1(true);
        }
    }

    public final void e(J j) {
        if (j.U() > 0) {
            this.a.h();
            this.a.b(j);
            j.T1(true);
        }
    }

    public final void f(J j) {
        this.a.s(j);
    }
}
