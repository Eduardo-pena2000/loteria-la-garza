package w8;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import z.Y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class z implements z8.a {
    public static final E6.f j = E6.i.c();
    public static final Random k = new Random();
    public static final Map l = new HashMap();
    public final Map a;
    public final Context b;
    public final ScheduledExecutorService c;
    public final B7.g d;
    public final m8.h e;
    public final C7.c f;
    public final l8.b g;
    public final String h;
    public Map i;

    public static class a implements c.a {
        public static final AtomicReference a = new AtomicReference();

        public static /* synthetic */ void b(Context context) {
            c(context);
        }

        public static void c(Context context) {
            Application applicationContext = context.getApplicationContext();
            AtomicReference atomicReference = a;
            if (atomicReference.get() == null) {
                a aVar = new a();
                if (Y.a(atomicReference, (Object) null, aVar)) {
                    com.google.android.gms.common.api.internal.c.c(applicationContext);
                    com.google.android.gms.common.api.internal.c.b().a(aVar);
                }
            }
        }

        public void a(boolean z) {
            z.c(z);
        }
    }

    public z(Context context, ScheduledExecutorService scheduledExecutorService, B7.g gVar, m8.h hVar, C7.c cVar, l8.b bVar) {
        this(context, scheduledExecutorService, gVar, hVar, cVar, bVar, true);
    }

    public static /* synthetic */ F7.a b() {
        return q();
    }

    public static /* synthetic */ void c(boolean z) {
        r(z);
    }

    public static x8.r k(B7.g gVar, String str, l8.b bVar) {
        if (p(gVar) && str.equals("firebase")) {
            return new x8.r(bVar);
        }
        return null;
    }

    public static com.google.firebase.remoteconfig.internal.e n(Context context, String str, String str2) {
        return new com.google.firebase.remoteconfig.internal.e(context.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", str, str2, "settings"}), 0));
    }

    public static boolean o(B7.g gVar, String str) {
        return str.equals("firebase") && p(gVar);
    }

    public static boolean p(B7.g gVar) {
        return gVar.q().equals("[DEFAULT]");
    }

    public static /* synthetic */ F7.a q() {
        return null;
    }

    public static synchronized void r(boolean z) {
        synchronized (z.class) {
            Iterator it = l.values().iterator();
            while (it.hasNext()) {
                ((o) it.next()).B(z);
            }
        }
    }

    public void a(String str, A8.f fVar) {
        e(str).q().h(fVar);
    }

    public synchronized o d(B7.g gVar, String str, m8.h hVar, C7.c cVar, Executor executor, x8.e eVar, x8.e eVar2, x8.e eVar3, com.google.firebase.remoteconfig.internal.c cVar2, x8.l lVar, com.google.firebase.remoteconfig.internal.e eVar4, y8.e eVar5) {
        try {
            if (!this.a.containsKey(str)) {
                o oVar = new o(this.b, gVar, hVar, o(gVar, str) ? cVar : null, executor, eVar, eVar2, eVar3, cVar2, lVar, eVar4, l(gVar, hVar, cVar2, eVar2, this.b, str, eVar4), eVar5);
                oVar.F();
                this.a.put(str, oVar);
                l.put(str, oVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (o) this.a.get(str);
    }

    public synchronized o e(String str) {
        x8.e f;
        x8.e f2;
        x8.e f3;
        com.google.firebase.remoteconfig.internal.e n;
        x8.l j2;
        try {
            f = f(str, "fetch");
            f2 = f(str, "activate");
            f3 = f(str, "defaults");
            n = n(this.b, this.h, str);
            j2 = j(f2, f3);
            x8.r k2 = k(this.d, str, this.g);
            if (k2 != null) {
                j2.b(new x(k2));
            }
        } catch (Throwable th) {
            throw th;
        }
        return d(this.d, str, this.e, this.f, this.c, f, f2, f3, h(str, f, n), j2, n, m(f2, f3));
    }

    public final x8.e f(String str, String str2) {
        return x8.e.h(this.c, x8.p.c(this.b, String.format("%s_%s_%s_%s.json", new Object[]{"frc", this.h, str, str2})));
    }

    public o g() {
        return e("firebase");
    }

    public synchronized com.google.firebase.remoteconfig.internal.c h(String str, x8.e eVar, com.google.firebase.remoteconfig.internal.e eVar2) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new com.google.firebase.remoteconfig.internal.c(this.e, p(this.d) ? this.g : new y(), this.c, j, k, eVar, i(this.d.r().b(), str, eVar2), eVar2, this.i);
    }

    public ConfigFetchHttpClient i(String str, String str2, com.google.firebase.remoteconfig.internal.e eVar) {
        return new ConfigFetchHttpClient(this.b, this.d.r().c(), str, str2, eVar.c(), eVar.c());
    }

    public final x8.l j(x8.e eVar, x8.e eVar2) {
        return new x8.l(this.c, eVar, eVar2);
    }

    public synchronized x8.m l(B7.g gVar, m8.h hVar, com.google.firebase.remoteconfig.internal.c cVar, x8.e eVar, Context context, String str, com.google.firebase.remoteconfig.internal.e eVar2) {
        return new x8.m(gVar, hVar, cVar, eVar, context, str, eVar2, this.c);
    }

    public final y8.e m(x8.e eVar, x8.e eVar2) {
        return new y8.e(eVar, y8.a.a(eVar, eVar2), this.c);
    }

    public z(Context context, ScheduledExecutorService scheduledExecutorService, B7.g gVar, m8.h hVar, C7.c cVar, l8.b bVar, boolean z) {
        this.a = new HashMap();
        this.i = new HashMap();
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = gVar;
        this.e = hVar;
        this.f = cVar;
        this.g = bVar;
        this.h = gVar.r().c();
        a.b(context);
        if (z) {
            Tasks.call(scheduledExecutorService, new w(this));
        }
    }
}
