package g0;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class r extends Da.b implements e0.b {
    public final d a;

    public r(d dVar) {
        this.a = dVar;
    }

    public boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    public int getSize() {
        return this.a.size();
    }

    public Iterator iterator() {
        return new s(this.a.s());
    }
}
