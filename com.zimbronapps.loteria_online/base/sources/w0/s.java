package W0;

import Da.Q;
import P0.N0;
import P0.o1;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class s {
    public static AtomicInteger a = new AtomicInteger(0);

    public static final /* synthetic */ void a(N0 n0, m mVar) {
        b(n0, mVar);
    }

    public static final void b(N0 n0, m mVar) {
        o1 b = n0.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(Wa.n.e(Q.e(Da.w.y(mVar, 10)), 16));
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C c = (C) entry.getKey();
            Ca.q a2 = Ca.x.a(c.b(), entry.getValue());
            linkedHashMap.put(a2.c(), a2.d());
        }
        b.c("properties", linkedHashMap);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, Qa.l lVar) {
        return eVar.then(new ClearAndSetSemanticsElement(lVar));
    }

    public static final int d() {
        return a.addAndGet(1);
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, boolean z, Qa.l lVar) {
        return eVar.then(new AppendedSemanticsElement(z, lVar));
    }

    public static /* synthetic */ androidx.compose.ui.e f(androidx.compose.ui.e eVar, boolean z, Qa.l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return e(eVar, z, lVar);
    }
}
