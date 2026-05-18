package k0;

import Da.S;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import k0.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class u implements p, j4.i {
    public final /* synthetic */ p a;
    public final j4.h b;
    public final androidx.lifecycle.t c;
    public final j4.f d;

    public u(p pVar) {
        this.a = pVar;
        j4.h b = j4.h.c.b(this);
        this.b = b;
        this.c = androidx.lifecycle.t.j.a(this);
        this.d = b.b();
        Object f = f("androidx.savedstate.SavedStateRegistry");
        b.d(f instanceof Bundle ? (Bundle) f : null);
        b("androidx.savedstate.SavedStateRegistry", new t(this));
    }

    public static /* synthetic */ Object c(u uVar) {
        return d(uVar);
    }

    public static final Object d(u uVar) {
        Ca.q[] qVarArr;
        Map h = S.h();
        if (h.isEmpty()) {
            qVarArr = new Ca.q[0];
        } else {
            ArrayList arrayList = new ArrayList(h.size());
            for (Map.Entry entry : h.entrySet()) {
                arrayList.add(Ca.x.a((String) entry.getKey(), entry.getValue()));
            }
            qVarArr = (Ca.q[]) arrayList.toArray(new Ca.q[0]);
        }
        Bundle a = P1.d.a((Ca.q[]) Arrays.copyOf(qVarArr, qVarArr.length));
        j4.j.a(a);
        uVar.b.e(a);
        if (j4.c.f(j4.c.a(a))) {
            return null;
        }
        return a;
    }

    public boolean a(Object obj) {
        return this.a.a(obj);
    }

    public p.a b(String str, Qa.a aVar) {
        return this.a.b(str, aVar);
    }

    public Map e() {
        return this.a.e();
    }

    public Object f(String str) {
        return this.a.f(str);
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public androidx.lifecycle.t getLifecycle() {
        return this.c;
    }

    public j4.f getSavedStateRegistry() {
        return this.d;
    }
}
