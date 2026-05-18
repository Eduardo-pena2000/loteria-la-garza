package com.amazon.a.a.h;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class b implements Serializable, Iterable {
    private static final long a = 1;
    private final List b = new ArrayList();

    public boolean a() {
        return this.b.isEmpty();
    }

    public Collection b() {
        return this.b;
    }

    public int c() {
        return this.b.size();
    }

    public Iterator iterator() {
        return this.b.iterator();
    }

    public String toString() {
        return "MetricBatch: [" + this.b + "]";
    }

    public void a(a aVar) {
        this.b.add(aVar);
    }
}
