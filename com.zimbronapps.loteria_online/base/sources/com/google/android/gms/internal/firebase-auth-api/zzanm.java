package com.google.android.gms.internal.firebase-auth-api;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
class zzanm extends AbstractSet {
    private final /* synthetic */ zzang zza;

    public /* synthetic */ zzanm(zzang zzangVar, zzanl zzanlVar) {
        this(zzangVar);
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zza.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.zza.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.zza.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator iterator() {
        return new zzanj(this.zza, null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zza.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.zza.size();
    }

    private zzanm(zzang zzangVar) {
        Objects.requireNonNull(zzangVar);
        this.zza = zzangVar;
    }
}
