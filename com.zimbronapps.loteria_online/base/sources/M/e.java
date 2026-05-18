package M;

import Qa.q;
import n1.t;
import u0.l;
import v0.E1;
import v0.V;
import v0.i1;
import v0.m1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e implements E1 {
    public final q a;

    public e(q qVar) {
        this.a = qVar;
    }

    public i1 createOutline-Pq9zytI(long j, t tVar, n1.d dVar) {
        m1 a = V.a();
        this.a.invoke(a, l.c(j), tVar);
        a.close();
        return new i1.a(a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        return (eVar != null ? eVar.a : null) == this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
