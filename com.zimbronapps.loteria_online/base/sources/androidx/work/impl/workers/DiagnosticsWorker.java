package androidx.work.impl.workers;

import G4.m;
import H4.i;
import P4.g;
import P4.h;
import P4.k;
import P4.p;
import P4.q;
import P4.t;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class DiagnosticsWorker extends Worker {
    public static final String b = m.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", new Object[]{pVar.a, pVar.c, num, pVar.b.name(), str, str2});
    }

    public static String c(k kVar, t tVar, h hVar, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", new Object[]{"Job Id"}));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            g a = hVar.a(pVar.a);
            sb.append(a(pVar, TextUtils.join(",", kVar.a(pVar.a)), a != null ? Integer.valueOf(a.b) : null, TextUtils.join(",", tVar.b(pVar.a))));
        }
        return sb.toString();
    }

    public ListenableWorker.a doWork() {
        WorkDatabase o = i.k(getApplicationContext()).o();
        q B = o.B();
        k z = o.z();
        t C = o.C();
        h y = o.y();
        List c = B.c(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List q = B.q();
        List k = B.k(200);
        if (c != null && !c.isEmpty()) {
            m c2 = m.c();
            String str = b;
            c2.d(str, "Recently completed work:\n\n", new Throwable[0]);
            m.c().d(str, c(z, C, y, c), new Throwable[0]);
        }
        if (q != null && !q.isEmpty()) {
            m c3 = m.c();
            String str2 = b;
            c3.d(str2, "Running work:\n\n", new Throwable[0]);
            m.c().d(str2, c(z, C, y, q), new Throwable[0]);
        }
        if (k != null && !k.isEmpty()) {
            m c4 = m.c();
            String str3 = b;
            c4.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            m.c().d(str3, c(z, C, y, k), new Throwable[0]);
        }
        return ListenableWorker.a.c();
    }
}
