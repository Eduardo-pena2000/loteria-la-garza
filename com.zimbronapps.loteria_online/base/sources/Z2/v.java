package Z2;

import P2.E;
import android.util.SparseArray;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class v {
    public final SparseArray a = new SparseArray();

    public E a(int i) {
        E e = (E) this.a.get(i);
        if (e != null) {
            return e;
        }
        E e2 = new E(9223372036854775806L);
        this.a.put(i, e2);
        return e2;
    }

    public void b() {
        this.a.clear();
    }
}
