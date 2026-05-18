package g0;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class p extends Da.k implements e0.d {
    public final d b;

    public p(d dVar) {
        this.b = dVar;
    }

    public boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    public int getSize() {
        return this.b.size();
    }

    public Iterator iterator() {
        return new q(this.b.s());
    }
}
