package Ga;

import Ga.i;
import Qa.p;
import java.io.Serializable;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class d implements i, Serializable {
    public final i a;
    public final i.b b;

    public d(i left, i.b element) {
        t.g(left, "left");
        t.g(element, "element");
        this.a = left;
        this.b = element;
    }

    public static /* synthetic */ String c(String str, i.b bVar) {
        return i(str, bVar);
    }

    public static final String i(String acc, i.b element) {
        t.g(acc, "acc");
        t.g(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }

    private final int size() {
        int i = 2;
        d dVar = this;
        while (true) {
            i iVar = dVar.a;
            dVar = iVar instanceof d ? (d) iVar : null;
            if (dVar == null) {
                return i;
            }
            i++;
        }
    }

    public final boolean e(i.b bVar) {
        return t.c(get(bVar.getKey()), bVar);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (dVar.size() != size() || !dVar.g(this)) {
                }
            }
            return false;
        }
        return true;
    }

    public Object fold(Object obj, p operation) {
        t.g(operation, "operation");
        return operation.invoke(this.a.fold(obj, operation), this.b);
    }

    public final boolean g(d dVar) {
        while (e(dVar.b)) {
            i iVar = dVar.a;
            if (!(iVar instanceof d)) {
                t.e(iVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return e((i.b) iVar);
            }
            dVar = (d) iVar;
        }
        return false;
    }

    public i.b get(i.c key) {
        t.g(key, "key");
        d dVar = this;
        while (true) {
            i.b bVar = dVar.b.get(key);
            if (bVar != null) {
                return bVar;
            }
            i iVar = dVar.a;
            if (!(iVar instanceof d)) {
                return iVar.get(key);
            }
            dVar = (d) iVar;
        }
    }

    public int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    public i minusKey(i.c key) {
        t.g(key, "key");
        if (this.b.get(key) != null) {
            return this.a;
        }
        i minusKey = this.a.minusKey(key);
        return minusKey == this.a ? this : minusKey == j.a ? this.b : new d(minusKey, this.b);
    }

    public i plus(i iVar) {
        return i.a.b(this, iVar);
    }

    public String toString() {
        return '[' + ((String) fold("", new c())) + ']';
    }
}
