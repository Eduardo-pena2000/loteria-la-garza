package b0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b1 extends D {
    public b1(Qa.a aVar) {
        super(aVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[PHI: r5
      0x0034: PHI (r5v2 b0.a0) = (r5v5 b0.a0), (r5v6 b0.a0) binds: [B:21:0x0044, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b0.n2 b(b0.c1 r4, b0.n2 r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof b0.a0
            r1 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r4.i()
            if (r0 == 0) goto L47
            r1 = r5
            b0.a0 r1 = (b0.a0) r1
            b0.C0 r5 = r1.b()
            java.lang.Object r0 = r4.d()
            r5.setValue(r0)
            goto L47
        L1a:
            boolean r0 = r5 instanceof b0.j2
            if (r0 == 0) goto L36
            boolean r0 = r4.j()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r4.d()
            b0.j2 r5 = (b0.j2) r5
            java.lang.Object r2 = r5.b()
            boolean r0 = kotlin.jvm.internal.t.c(r0, r2)
            if (r0 == 0) goto L47
        L34:
            r1 = r5
            goto L47
        L36:
            boolean r0 = r5 instanceof b0.P
            if (r0 == 0) goto L47
            Qa.l r0 = r4.c()
            b0.P r5 = (b0.P) r5
            Qa.l r2 = r5.b()
            if (r0 != r2) goto L47
            goto L34
        L47:
            if (r1 != 0) goto L4d
            b0.n2 r1 = r3.f(r4)
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.b1.b(b0.c1, b0.n2):b0.n2");
    }

    public abstract c1 c(Object obj);

    public final c1 d(Object obj) {
        return c(obj);
    }

    public final c1 e(Object obj) {
        return c(obj).h();
    }

    public final n2 f(c1 c1Var) {
        if (!c1Var.i()) {
            return c1Var.c() != null ? new P(c1Var.c()) : c1Var.f() != null ? new a0(c1Var.f()) : new j2(c1Var.d());
        }
        C0 f = c1Var.f();
        if (f == null) {
            Object g = c1Var.g();
            T1 e = c1Var.e();
            if (e == null) {
                e = U1.q();
            }
            f = U1.h(g, e);
        }
        return new a0(f);
    }
}
