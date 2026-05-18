package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class zzgsi extends zzgvl {
    final transient Map zza;
    final /* synthetic */ zzgsv zzb;

    public zzgsi(zzgsv zzgsvVar, Map map) {
        Objects.requireNonNull(zzgsvVar);
        this.zzb = zzgsvVar;
        this.zza = map;
    }

    public final void clear() {
        zzgsv zzgsvVar = this.zzb;
        if (this.zza == zzgsvVar.zzo()) {
            zzgsvVar.zzf();
        } else {
            zzguy.zzb(new zzgsh(this));
        }
    }

    public final boolean containsKey(Object obj) {
        Map map = this.zza;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || this.zza.equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) zzgvm.zza(this.zza, obj);
        if (collection == null) {
            return null;
        }
        return this.zzb.zzb(obj, collection);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public Set keySet() {
        return this.zzb.zzs();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.zza.remove(obj);
        if (collection == null) {
            return null;
        }
        zzgsv zzgsvVar = this.zzb;
        Collection zzc = zzgsvVar.zzc();
        zzc.addAll(collection);
        zzgsvVar.zzq(zzgsvVar.zzp() - collection.size());
        collection.clear();
        return zzc;
    }

    public final int size() {
        return this.zza.size();
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final Set zza() {
        return new zzgsg(this);
    }

    public final Map.Entry zzb(Map.Entry entry) {
        Object key = entry.getKey();
        return new AbstractMap.SimpleImmutableEntry(key, this.zzb.zzb(key, (Collection) entry.getValue()));
    }
}
