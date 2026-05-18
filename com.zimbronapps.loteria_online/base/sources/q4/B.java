package Q4;

import G4.p;
import android.text.TextUtils;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class b implements Runnable {
    public static final String c = G4.m.f("EnqueueRunnable");
    public final H4.g a;
    public final H4.c b = new H4.c();

    public b(H4.g gVar) {
        this.a = gVar;
    }

    public static boolean b(H4.g gVar) {
        boolean c2 = c(gVar.g(), gVar.f(), (String[]) H4.g.l(gVar).toArray(new String[0]), gVar.d(), gVar.b());
        gVar.k();
        return c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0137 A[PHI: r0 r8 r11 r12 r13
      0x0137: PHI (r0v1 java.lang.String[]) = 
      (r0v0 java.lang.String[])
      (r0v0 java.lang.String[])
      (r0v0 java.lang.String[])
      (r0v13 java.lang.String[])
      (r0v13 java.lang.String[])
     binds: [B:31:0x0061, B:32:0x0063, B:34:0x0071, B:131:0x0136, B:130:0x0134] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r8v2 boolean) = (r8v1 boolean), (r8v1 boolean), (r8v1 boolean), (r8v5 boolean), (r8v6 boolean) binds: [B:31:0x0061, B:32:0x0063, B:34:0x0071, B:131:0x0136, B:130:0x0134] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r11v2 boolean) = (r11v1 boolean), (r11v1 boolean), (r11v1 boolean), (r11v4 boolean), (r11v4 boolean) binds: [B:31:0x0061, B:32:0x0063, B:34:0x0071, B:131:0x0136, B:130:0x0134] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r12v2 boolean) = (r12v1 boolean), (r12v1 boolean), (r12v1 boolean), (r12v5 boolean), (r12v5 boolean) binds: [B:31:0x0061, B:32:0x0063, B:34:0x0071, B:131:0x0136, B:130:0x0134] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r13v2 boolean) = (r13v1 boolean), (r13v1 boolean), (r13v1 boolean), (r13v5 boolean), (r13v5 boolean) binds: [B:31:0x0061, B:32:0x0063, B:34:0x0071, B:131:0x0136, B:130:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(H4.i r16, java.util.List r17, java.lang.String[] r18, java.lang.String r19, G4.e r20) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.b.c(H4.i, java.util.List, java.lang.String[], java.lang.String, G4.e):boolean");
    }

    public static boolean e(H4.g gVar) {
        List<H4.g> e = gVar.e();
        boolean z = false;
        if (e != null) {
            boolean z2 = false;
            for (H4.g gVar2 : e) {
                if (gVar2.j()) {
                    G4.m.c().h(c, String.format("Already enqueued work ids (%s).", new Object[]{TextUtils.join(", ", gVar2.c())}), new Throwable[0]);
                } else {
                    z2 |= e(gVar2);
                }
            }
            z = z2;
        }
        return b(gVar) | z;
    }

    public static void g(P4.p pVar) {
        G4.b bVar = pVar.j;
        String str = pVar.c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (bVar.f() || bVar.i()) {
            b.a aVar = new b.a();
            aVar.c(pVar.e).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.c = ConstraintTrackingWorker.class.getName();
            pVar.e = aVar.a();
        }
    }

    public boolean a() {
        WorkDatabase o = this.a.g().o();
        o.c();
        try {
            boolean e = e(this.a);
            o.r();
            return e;
        } finally {
            o.g();
        }
    }

    public G4.p d() {
        return this.b;
    }

    public void f() {
        H4.i g = this.a.g();
        H4.f.b(g.i(), g.o(), g.n());
    }

    public void run() {
        try {
            if (this.a.h()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.a}));
            }
            if (a()) {
                g.a(this.a.g().h(), RescheduleReceiver.class, true);
                f();
            }
            this.b.a(G4.p.a);
        } catch (Throwable th) {
            this.b.a(new p.b.a(th));
        }
    }
}
