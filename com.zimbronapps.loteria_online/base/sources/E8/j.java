package E8;

import ab.b;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class j {
    public static final a c = new a(null);
    public final o a;
    public final o b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends Ia.d {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public b(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return j.this.f(this);
        }
    }

    public j(o oVar, o oVar2) {
        t.g(oVar, "localOverrideSettings");
        t.g(oVar2, "remoteSettings");
        this.a = oVar;
        this.b = oVar2;
    }

    public final double a() {
        Double c2 = this.a.c();
        if (c2 != null) {
            double doubleValue = c2.doubleValue();
            if (d(doubleValue)) {
                return doubleValue;
            }
        }
        Double c3 = this.b.c();
        if (c3 == null) {
            return 1.0d;
        }
        double doubleValue2 = c3.doubleValue();
        if (d(doubleValue2)) {
            return doubleValue2;
        }
        return 1.0d;
    }

    public final long b() {
        ab.b b2 = this.a.b();
        if (b2 != null) {
            long M = b2.M();
            if (e(M)) {
                return M;
            }
        }
        ab.b b3 = this.b.b();
        if (b3 != null) {
            long M2 = b3.M();
            if (e(M2)) {
                return M2;
            }
        }
        b.a aVar = ab.b.b;
        return ab.d.s(30, ab.e.f);
    }

    public final boolean c() {
        Boolean a2 = this.a.a();
        if (a2 != null) {
            return a2.booleanValue();
        }
        Boolean a3 = this.b.a();
        if (a3 != null) {
            return a3.booleanValue();
        }
        return true;
    }

    public final boolean d(double d) {
        return 0.0d <= d && d <= 1.0d;
    }

    public final boolean e(long j) {
        return ab.b.E(j) && ab.b.z(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(Ga.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof E8.j.b
            if (r0 == 0) goto L13
            r0 = r6
            E8.j$b r0 = (E8.j.b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            E8.j$b r0 = new E8.j$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Ca.t.b(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.a
            E8.j r2 = (E8.j) r2
            Ca.t.b(r6)
            goto L4d
        L3c:
            Ca.t.b(r6)
            E8.o r6 = r5.a
            r0.a = r5
            r0.d = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            E8.o r6 = r2.b
            r2 = 0
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            Ca.I r6 = Ca.I.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: E8.j.f(Ga.e):java.lang.Object");
    }
}
