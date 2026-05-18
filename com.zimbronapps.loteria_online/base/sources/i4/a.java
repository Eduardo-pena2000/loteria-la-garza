package I4;

import G4.m;
import G4.t;
import P4.p;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a {
    public static final String d = m.f("DelayedWorkTracker");
    public final b a;
    public final t b;
    public final Map c = new HashMap();

    public class a implements Runnable {
        public final /* synthetic */ p a;

        public a(p pVar) {
            this.a = pVar;
        }

        public void run() {
            m.c().a(a.d, String.format("Scheduling work %s", new Object[]{this.a.a}), new Throwable[0]);
            a.this.a.c(this.a);
        }
    }

    public a(b bVar, t tVar) {
        this.a = bVar;
        this.b = tVar;
    }

    public void a(p pVar) {
        Runnable runnable = (Runnable) this.c.remove(pVar.a);
        if (runnable != null) {
            this.b.a(runnable);
        }
        a aVar = new a(pVar);
        this.c.put(pVar.a, aVar);
        this.b.b(pVar.a() - System.currentTimeMillis(), aVar);
    }

    public void b(String str) {
        Runnable runnable = (Runnable) this.c.remove(str);
        if (runnable != null) {
            this.b.a(runnable);
        }
    }
}
