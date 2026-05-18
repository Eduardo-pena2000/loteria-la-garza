package Q4;

import G4.v;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class q implements G4.r {
    public static final String c = G4.m.f("WorkProgressUpdater");
    public final WorkDatabase a;
    public final S4.a b;

    public class a implements Runnable {
        public final /* synthetic */ UUID a;
        public final /* synthetic */ androidx.work.b b;
        public final /* synthetic */ R4.c c;

        public a(UUID uuid, androidx.work.b bVar, R4.c cVar) {
            this.a = uuid;
            this.b = bVar;
            this.c = cVar;
        }

        public void run() {
            P4.p h;
            String uuid = this.a.toString();
            G4.m c = G4.m.c();
            String str = q.c;
            c.a(str, String.format("Updating progress for %s (%s)", new Object[]{this.a, this.b}), new Throwable[0]);
            q.this.a.c();
            try {
                h = q.this.a.B().h(uuid);
            } finally {
                try {
                } finally {
                }
            }
            if (h == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (h.b == v.RUNNING) {
                q.this.a.A().b(new P4.m(uuid, this.b));
            } else {
                G4.m.c().h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", new Object[]{uuid}), new Throwable[0]);
            }
            this.c.o(null);
            q.this.a.r();
        }
    }

    public q(WorkDatabase workDatabase, S4.a aVar) {
        this.a = workDatabase;
        this.b = aVar;
    }

    public x7.e a(Context context, UUID uuid, androidx.work.b bVar) {
        R4.c s = R4.c.s();
        this.b.b(new a(uuid, bVar, s));
        return s;
    }
}
