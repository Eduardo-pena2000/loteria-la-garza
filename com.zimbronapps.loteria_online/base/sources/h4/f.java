package H4;

import G4.m;
import P4.p;
import P4.q;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f {
    public static final String a = m.f("Schedulers");

    public static e a(Context context, i iVar) {
        K4.g gVar = new K4.g(context, iVar);
        Q4.g.a(context, SystemJobService.class, true);
        m.c().a(a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        return gVar;
    }

    public static void b(androidx.work.a aVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        q B = workDatabase.B();
        workDatabase.c();
        try {
            List o = B.o(aVar.h());
            List k = B.k(200);
            if (o != null && o.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = o.iterator();
                while (it.hasNext()) {
                    B.m(((p) it.next()).a, currentTimeMillis);
                }
            }
            workDatabase.r();
            workDatabase.g();
            if (o != null && o.size() > 0) {
                p[] pVarArr = (p[]) o.toArray(new p[o.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    e eVar = (e) it2.next();
                    if (eVar.d()) {
                        eVar.c(pVarArr);
                    }
                }
            }
            if (k == null || k.size() <= 0) {
                return;
            }
            p[] pVarArr2 = (p[]) k.toArray(new p[k.size()]);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (!eVar2.d()) {
                    eVar2.c(pVarArr2);
                }
            }
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
