package com.google.android.gms.internal.drive;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
class zzmr extends AbstractSet {
    private final /* synthetic */ zzmi zzvk;

    private zzmr(zzmi zzmiVar) {
        this.zzvk = zzmiVar;
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zzvk.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.zzvk.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.zzvk.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator iterator() {
        return new zzmq(this.zzvk, null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zzvk.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.zzvk.size();
    }

    public /* synthetic */ zzmr(zzmi zzmiVar, zzmj zzmjVar) {
        this(zzmiVar);
    }
}
