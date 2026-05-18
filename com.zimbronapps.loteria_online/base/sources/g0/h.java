package g0;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h extends a {
    public final f a;

    public h(f fVar) {
        this.a = fVar;
    }

    public int a() {
        return this.a.size();
    }

    public void clear() {
        this.a.clear();
    }

    public boolean e(Map.Entry entry) {
        Object obj = this.a.get(entry.getKey());
        return obj != null ? kotlin.jvm.internal.t.c(obj, entry.getValue()) : entry.getValue() == null && this.a.containsKey(entry.getKey());
    }

    public boolean g(Map.Entry entry) {
        return this.a.remove(entry.getKey(), entry.getValue());
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        throw new UnsupportedOperationException();
    }

    public Iterator iterator() {
        return new i(this.a);
    }
}
