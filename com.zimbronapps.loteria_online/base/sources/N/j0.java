package N;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j0 {
    public final int a;
    public a b;
    public a c;
    public int d;
    public Long e;
    public boolean f;

    public static final class a {
        public a a;
        public f1.U b;

        public a(a aVar, f1.U u) {
            this.a = aVar;
            this.b = u;
        }

        public final a a() {
            return this.a;
        }

        public final f1.U b() {
            return this.b;
        }

        public final void c(a aVar) {
            this.a = aVar;
        }

        public final void d(f1.U u) {
            this.b = u;
        }
    }

    public j0(int i) {
        this.a = i;
    }

    public static /* synthetic */ void f(j0 j0Var, f1.U u, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = l0.a();
        }
        j0Var.e(u, j);
    }

    public final void a() {
        this.f = true;
    }

    public final void b(f1.U u) {
        f1.U b;
        this.f = false;
        a aVar = this.b;
        if (kotlin.jvm.internal.t.c(u, aVar != null ? aVar.b() : null)) {
            return;
        }
        String l = u.l();
        a aVar2 = this.b;
        if (kotlin.jvm.internal.t.c(l, (aVar2 == null || (b = aVar2.b()) == null) ? null : b.l())) {
            a aVar3 = this.b;
            if (aVar3 == null) {
                return;
            }
            aVar3.d(u);
            return;
        }
        this.b = new a(this.b, u);
        this.c = null;
        int length = this.d + u.l().length();
        this.d = length;
        if (length > this.a) {
            d();
        }
    }

    public final f1.U c() {
        a aVar = this.c;
        if (aVar == null) {
            return null;
        }
        this.c = aVar.a();
        this.b = new a(this.b, aVar.b());
        this.d += aVar.b().l().length();
        return aVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r3 = this;
            N.j0$a r0 = r3.b
            r1 = 0
            if (r0 == 0) goto La
            N.j0$a r2 = r0.a()
            goto Lb
        La:
            r2 = r1
        Lb:
            if (r2 != 0) goto Le
            return
        Le:
            if (r0 == 0) goto L1b
            N.j0$a r2 = r0.a()
            if (r2 == 0) goto L1b
            N.j0$a r2 = r2.a()
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L23
            N.j0$a r0 = r0.a()
            goto Le
        L23:
            if (r0 != 0) goto L26
            goto L29
        L26:
            r0.c(r1)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N.j0.d():void");
    }

    public final void e(f1.U u, long j) {
        if (!this.f) {
            Long l = this.e;
            if (j <= (l != null ? l.longValue() : 0L) + k0.a()) {
                return;
            }
        }
        this.e = Long.valueOf(j);
        b(u);
    }

    public final f1.U g() {
        a a2;
        a aVar = this.b;
        if (aVar == null || (a2 = aVar.a()) == null) {
            return null;
        }
        this.b = a2;
        this.d -= aVar.b().l().length();
        this.c = new a(this.c, aVar.b());
        return a2.b();
    }

    public /* synthetic */ j0(int i, int i2, kotlin.jvm.internal.k kVar) {
        this((i2 & 1) != 0 ? 100000 : i);
    }
}
