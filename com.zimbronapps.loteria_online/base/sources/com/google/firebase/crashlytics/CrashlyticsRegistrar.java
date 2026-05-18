package com.google.firebase.crashlytics;

import B7.g;
import C8.c;
import H7.a;
import H7.b;
import H7.c;
import L7.E;
import L7.d;
import L7.q;
import N7.f;
import N7.h;
import S7.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public final E a = E.a(a.class, ExecutorService.class);
    public final E b = E.a(b.class, ExecutorService.class);
    public final E c = E.a(c.class, ExecutorService.class);

    static {
        C8.b.a(c.a.a);
    }

    public static /* synthetic */ h a(CrashlyticsRegistrar crashlyticsRegistrar, d dVar) {
        return crashlyticsRegistrar.b(dVar);
    }

    public final h b(d dVar) {
        i.f(false);
        long currentTimeMillis = System.currentTimeMillis();
        h f = h.f((g) dVar.a(g.class), (m8.h) dVar.a(m8.h.class), dVar.i(O7.a.class), dVar.i(F7.a.class), dVar.i(z8.a.class), (ExecutorService) dVar.f(this.a), (ExecutorService) dVar.f(this.b), (ExecutorService) dVar.f(this.c));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 16) {
            O7.g.f().b("Initializing Crashlytics blocked main for " + currentTimeMillis2 + " ms");
        }
        return f;
    }

    public List getComponents() {
        return Arrays.asList(new L7.c[]{L7.c.e(h.class).h("fire-cls").b(q.l(g.class)).b(q.l(m8.h.class)).b(q.k(this.a)).b(q.k(this.b)).b(q.k(this.c)).b(q.a(O7.a.class)).b(q.a(F7.a.class)).b(q.a(z8.a.class)).f(new f(this)).e().d(), v8.h.b("fire-cls", "20.0.4")});
    }
}
