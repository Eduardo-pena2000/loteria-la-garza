package Q4;

import G4.v;
import androidx.work.impl.WorkDatabase;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class m implements Runnable {
    public static final String d = G4.m.f("StopWorkRunnable");
    public final H4.i a;
    public final String b;
    public final boolean c;

    public m(H4.i iVar, String str, boolean z) {
        this.a = iVar;
        this.b = str;
        this.c = z;
    }

    public void run() {
        boolean o;
        WorkDatabase o2 = this.a.o();
        H4.d m = this.a.m();
        P4.q B = o2.B();
        o2.c();
        try {
            boolean h = m.h(this.b);
            if (this.c) {
                o = this.a.m().n(this.b);
            } else {
                if (!h && B.g(this.b) == v.RUNNING) {
                    B.f(v.ENQUEUED, this.b);
                }
                o = this.a.m().o(this.b);
            }
            G4.m.c().a(d, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.b, Boolean.valueOf(o)}), new Throwable[0]);
            o2.r();
            o2.g();
        } catch (Throwable th) {
            o2.g();
            throw th;
        }
    }
}
