package com.amazon.a.a.o.d;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class c implements Iterable {
    private Map a = new HashMap();

    public c a(Object obj, Object obj2, b bVar) {
        if (!a(obj, obj2)) {
            this.a.put(bVar, new a(bVar, "'" + obj + "' != '" + obj2 + "'"));
        }
        return this;
    }

    public Iterator iterator() {
        return this.a.values().iterator();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Verifier:");
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            sb.append("\n\t" + ((a) it.next()));
        }
        return sb.toString();
    }

    private boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public c a(Comparable comparable, Comparable comparable2, b bVar) {
        if (comparable.compareTo(comparable2) <= 0) {
            this.a.put(bVar, new a(bVar, "'" + comparable + "' <= '" + comparable2 + "'"));
        }
        return this;
    }

    public c a(Exception exc, b bVar) {
        this.a.put(bVar, new a(bVar, "Exception: " + exc));
        return this;
    }

    public boolean a() {
        return !this.a.isEmpty();
    }

    public boolean a(b bVar) {
        return this.a.containsKey(bVar);
    }
}
