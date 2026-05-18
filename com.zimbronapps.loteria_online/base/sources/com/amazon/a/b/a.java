package com.amazon.a.b;

import android.app.Application;
import android.os.RemoteException;
import com.amazon.d.a.j;
import java.security.PublicKey;
import java.util.Date;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a extends com.amazon.a.a.n.a.a {
    private static final com.amazon.a.a.o.c b = new com.amazon.a.a.o.c("VerifyApplicationEntitlmentTask");
    private f c = new f();

    @com.amazon.a.a.k.a
    private com.amazon.a.a.h.c d;

    @com.amazon.a.a.k.a
    private Application e;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c g;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.o.b.b h;

    public class 1 extends com.amazon.a.a.m.a {
        public 1(Object obj, Date date) {
            super(obj, date);
        }

        public void d() {
            this.a.a(com.amazon.a.a.n.b.d.COMMAND, new a());
        }
    }

    public void a(j jVar) throws RemoteException, com.amazon.a.a.d.b {
        g gVar = new g(jVar.b());
        b a = a(gVar, this.h.a());
        if (a == null) {
            return;
        }
        a(gVar, a);
        a(a);
        this.d.a(new com.amazon.a.b.b.a());
        this.f.a(com.amazon.a.a.n.b.d.BACKGROUND, new i());
    }

    public String a_() {
        return "get_license";
    }

    public Map b() {
        return null;
    }

    public String c() {
        return "1.0";
    }

    public boolean d() {
        return this.g.a("APPLICATION_LICENSE") == null;
    }

    public void b(com.amazon.a.a.d.b bVar) {
        com.amazon.a.a.i.c a = this.c.a(bVar);
        if (a == null && com.amazon.a.a.o.c.b) {
            b.b("No mapping specified for exception: " + bVar, bVar);
        }
        this.g.a("LICENSE_FAILURE_CONTENT", a);
        this.g.a("LICENSE_FAILURE_RAW_EXCEPTION", bVar.getClass().getName());
    }

    private b a(g gVar, PublicKey publicKey) throws com.amazon.a.a.o.b.a.b, com.amazon.a.a.o.b.a.c {
        return new b(new com.amazon.a.a.o.b.f(gVar.c(), publicKey));
    }

    private void a(b bVar) {
        b.a("License Verification succeeded!");
        this.g.a("APPLICATION_LICENSE", (com.amazon.a.a.m.a) new 1(bVar, bVar.d()));
    }

    private void a(g gVar, b bVar) throws com.amazon.a.b.a.a {
        com.amazon.a.a.o.d.c cVar = new com.amazon.a.a.o.d.c();
        cVar.a(gVar.a(), bVar.b(), h.CUSTOMER_ID);
        cVar.a(gVar.b(), bVar.c(), h.DEVICE_ID);
        cVar.a(bVar.e(), this.e.getPackageName(), h.PACKAGE_NAME);
        cVar.a((Comparable) bVar.d(), (Comparable) new Date(), (com.amazon.a.a.o.d.b) h.EXPIRATION);
        if (cVar.a()) {
            throw new com.amazon.a.b.a.a(cVar);
        }
    }

    public void a(com.amazon.d.a.h hVar) throws RemoteException, com.amazon.a.a.d.b {
        com.amazon.a.a.i.c cVar = new com.amazon.a.a.i.c(hVar.b(), hVar.c(), hVar.d(), hVar.e());
        b.a("onFailure: " + cVar);
        this.g.a("LICENSE_FAILURE_CONTENT", cVar);
    }
}
