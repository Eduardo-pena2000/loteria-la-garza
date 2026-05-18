package g0;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i implements Iterator, Ra.a {
    public final g a;

    public i(f fVar) {
        u[] uVarArr = new u[8];
        for (int i = 0; i < 8; i++) {
            uVarArr[i] = new y(this);
        }
        this.a = new g(fVar, uVarArr);
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        return (Map.Entry) this.a.next();
    }

    public final void b(Object obj, Object obj2) {
        this.a.n(obj, obj2);
    }

    public boolean hasNext() {
        return this.a.hasNext();
    }

    public void remove() {
        this.a.remove();
    }
}
