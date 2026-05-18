package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class x implements Iterator {
    public Iterator a;

    public x(Iterator it) {
        this.a = it;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        entry.getValue();
        return entry;
    }

    public boolean hasNext() {
        return this.a.hasNext();
    }

    public void remove() {
        this.a.remove();
    }
}
