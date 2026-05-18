package N7;

import O7.l;
import R7.B;
import R7.H;
import R7.M;
import R7.m;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class h {
    public final B a;

    public h(B b) {
        this.a = b;
    }

    public static /* synthetic */ void a(Exception exc) {
        g(exc);
    }

    public static h e() {
        h hVar = (h) B7.g.o().k(h.class);
        if (hVar != null) {
            return hVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public static h f(B7.g gVar, m8.h hVar, l8.a aVar, l8.a aVar2, l8.a aVar3, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) {
        Context m = gVar.m();
        String packageName = m.getPackageName();
        O7.g.f().g("Initializing Firebase Crashlytics " + B.s() + " for " + packageName);
        S7.i iVar = new S7.i(executorService, executorService2);
        X7.g gVar2 = new X7.g(m);
        H h = new H(gVar);
        M m2 = new M(m, packageName, hVar, h);
        O7.d dVar = new O7.d(aVar);
        d dVar2 = new d(aVar2);
        m mVar = new m(h, gVar2);
        C8.b.e(mVar);
        B b = new B(gVar, m2, dVar, h, dVar2.e(), dVar2.d(), gVar2, mVar, new l(aVar3), iVar);
        String c = gVar.r().c();
        String m3 = R7.i.m(m);
        List<R7.f> j = R7.i.j(m);
        O7.g.f().b("Mapping file ID is: " + m3);
        for (R7.f fVar : j) {
            O7.g.f().b(String.format("Build id for %s on %s: %s", new Object[]{fVar.c(), fVar.a(), fVar.b()}));
        }
        try {
            R7.a a = R7.a.a(m, m2, c, m3, j, new O7.f(m));
            O7.g.f().i("Installer package name is: " + a.d);
            Z7.g l = Z7.g.l(m, c, m2, new W7.b(), a.f, a.g, gVar2, h);
            l.o(iVar).addOnFailureListener((Executor) executorService3, (OnFailureListener) new g());
            if (b.J(a, l)) {
                b.q(l);
            }
            return new h(b);
        } catch (PackageManager.NameNotFoundException e) {
            O7.g.f().e("Error retrieving app package info.", e);
            return null;
        }
    }

    public static /* synthetic */ void g(Exception exc) {
        O7.g.f().e("Error fetching settings.", exc);
    }

    public Task b() {
        return this.a.l();
    }

    public void c() {
        this.a.m();
    }

    public boolean d() {
        return this.a.n();
    }

    public void h(String str) {
        this.a.E(str);
    }

    public void i(Throwable th) {
        if (th == null) {
            O7.g.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.a.F(th, Collections.emptyMap());
        }
    }

    public void j() {
        this.a.K();
    }

    public void k(Boolean bool) {
        this.a.L(bool);
    }

    public void l(String str, String str2) {
        this.a.M(str, str2);
    }

    public void m(String str) {
        this.a.O(str);
    }
}
