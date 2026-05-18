package k7;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class p6 implements Runnable {
    public final /* synthetic */ q6 a;

    public /* synthetic */ p6(q6 q6Var) {
        this.a = q6Var;
    }

    public final /* synthetic */ void run() {
        q6 q6Var = this.a;
        w6 w6Var = q6Var.c.b;
        w6Var.h();
        q3 q3Var = w6Var.a;
        q3Var.a().v().a("Application going to the background");
        q3Var.x().t.b(true);
        w6Var.o(true);
        if (!q3Var.w().N()) {
            long j = q6Var.b;
            u6 u6Var = w6Var.f;
            u6Var.d(false, false, j);
            u6Var.b(j);
        }
        q3Var.a().u().b("Application backgrounded at: timestamp_millis", Long.valueOf(q6Var.a));
        q3 q3Var2 = w6Var.a;
        b5 B = q3Var2.B();
        B.h();
        q3 q3Var3 = B.a;
        B.j();
        e6 J = q3Var3.J();
        J.h();
        J.j();
        if (!J.y() || J.a.C().W() >= 242600) {
            q3Var3.J().t();
        }
        if (q3Var.w().H(null, f2.O0)) {
            long D = q3Var.C().P(q3Var.d().getPackageName(), q3Var.w().R()) ? 1000L : q3Var.w().D(q3Var.d().getPackageName(), f2.E);
            q3Var.a().w().b("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(D));
            q3Var2.N().o(D);
        }
    }
}
