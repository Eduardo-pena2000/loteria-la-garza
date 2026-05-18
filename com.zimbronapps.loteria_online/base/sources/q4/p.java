package Q4;

import G4.v;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class p implements G4.g {
    public static final String d = G4.m.f("WMFgUpdater");
    public final S4.a a;
    public final O4.a b;
    public final P4.q c;

    public class a implements Runnable {
        public final /* synthetic */ R4.c a;
        public final /* synthetic */ UUID b;
        public final /* synthetic */ G4.f c;
        public final /* synthetic */ Context d;

        public a(R4.c cVar, UUID uuid, G4.f fVar, Context context) {
            this.a = cVar;
            this.b = uuid;
            this.c = fVar;
            this.d = context;
        }

        public void run() {
            try {
                if (!this.a.isCancelled()) {
                    String uuid = this.b.toString();
                    v g = p.this.c.g(uuid);
                    if (g == null || g.a()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    p.this.b.b(uuid, this.c);
                    this.d.startService(androidx.work.impl.foreground.a.a(this.d, uuid, this.c));
                }
                this.a.o(null);
            } catch (Throwable th) {
                this.a.p(th);
            }
        }
    }

    public p(WorkDatabase workDatabase, O4.a aVar, S4.a aVar2) {
        this.b = aVar;
        this.a = aVar2;
        this.c = workDatabase.B();
    }

    public x7.e a(Context context, UUID uuid, G4.f fVar) {
        R4.c s = R4.c.s();
        this.a.b(new a(s, uuid, fVar, context));
        return s;
    }
}
