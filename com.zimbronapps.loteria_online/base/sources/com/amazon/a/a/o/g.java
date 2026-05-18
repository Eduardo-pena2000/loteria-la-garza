package com.amazon.a.a.o;

import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class g implements Iterable {
    private WeakHashMap a = new WeakHashMap();

    public void a(Object obj) {
        this.a.put(obj, (Object) null);
    }

    public void b(Object obj) {
        this.a.remove(obj);
    }

    public Iterator iterator() {
        return this.a.keySet().iterator();
    }

    public String toString() {
        return this.a.keySet().toString();
    }

    public boolean a() {
        return this.a.isEmpty();
    }

    public int b() {
        return this.a.size();
    }
}
