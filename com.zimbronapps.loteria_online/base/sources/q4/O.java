package Q4;

import android.content.Context;
import androidx.work.ListenableWorker;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class o implements Runnable {
    public static final String g = G4.m.f("WorkForegroundRunnable");
    public final R4.c a = R4.c.s();
    public final Context b;
    public final P4.p c;
    public final ListenableWorker d;
    public final G4.g e;
    public final S4.a f;

    public class a implements Runnable {
        public final /* synthetic */ R4.c a;

        public a(R4.c cVar) {
            this.a = cVar;
        }

        public void run() {
            this.a.q(o.this.d.getForegroundInfoAsync());
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ R4.c a;

        public b(R4.c cVar) {
            this.a = cVar;
        }

        public void run() {
            try {
                G4.f fVar = (G4.f) this.a.get();
                if (fVar == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", new Object[]{o.this.c.c}));
                }
                G4.m.c().a(o.g, String.format("Updating notification for %s", new Object[]{o.this.c.c}), new Throwable[0]);
                o.this.d.setRunInForeground(true);
                o oVar = o.this;
                oVar.a.q(oVar.e.a(oVar.b, oVar.d.getId(), fVar));
            } catch (Throwable th) {
                o.this.a.p(th);
            }
        }
    }

    public o(Context context, P4.p pVar, ListenableWorker listenableWorker, G4.g gVar, S4.a aVar) {
        this.b = context;
        this.c = pVar;
        this.d = listenableWorker;
        this.e = gVar;
        this.f = aVar;
    }

    public x7.e a() {
        return this.a;
    }

    public void run() {
        if (!this.c.q || P1.a.b()) {
            this.a.o(null);
            return;
        }
        R4.c s = R4.c.s();
        this.f.a().execute(new a(s));
        s.addListener(new b(s), this.f.a());
    }
}
