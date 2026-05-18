package com.amazon.a.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class c extends com.amazon.a.a.n.c.a {
    private static final com.amazon.a.a.o.c a = new com.amazon.a.a.o.c("LicenseKillTask");

    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c b;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e c;

    private boolean b() {
        return this.b.b("APPLICATION_LICENSE");
    }

    private com.amazon.a.a.i.c c() {
        com.amazon.a.a.i.c cVar = (com.amazon.a.a.i.c) this.b.a("LICENSE_FAILURE_CONTENT");
        if (cVar == null) {
            return e.e;
        }
        if (com.amazon.a.a.o.c.a) {
            a.a("Fetched failure content from store: " + cVar);
        }
        this.b.c("LICENSE_FAILURE_CONTENT");
        return cVar;
    }

    public void a() {
        if (com.amazon.a.a.o.c.a) {
            a.a("License Kill Task Executing!!!");
        }
        if (b()) {
            a.c("license verification succeeded");
            return;
        }
        if (com.amazon.a.a.o.c.a) {
            a.a("License Kill Task determined app is not licensed, killing app");
        }
        if (m()) {
            n();
        }
        this.c.a((com.amazon.a.a.i.b) new com.amazon.a.a.i.g(c()));
    }
}
