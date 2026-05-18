package com.google.android.gms.internal.firebase-auth-api;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzal implements Serializable, Map {
    private transient zzaq zza;
    private transient zzaq zzb;
    private transient zzag zzc;

    public static zzal zza(Map map) {
        if ((map instanceof zzal) && !(map instanceof SortedMap)) {
            zzal zzalVar = (zzal) map;
            zzalVar.zzd();
            return zzalVar;
        }
        Collection entrySet = map.entrySet();
        zzao zzaoVar = new zzao(entrySet instanceof Collection ? entrySet.size() : 4);
        zzaoVar.zza((Iterable) entrySet);
        return zzaoVar.zza();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public /* synthetic */ Set entrySet() {
        zzaq zzaqVar = this.zza;
        if (zzaqVar != null) {
            return zzaqVar;
        }
        zzaq zzb = zzb();
        this.zza = zzb;
        return zzb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public int hashCode() {
        return zzav.zza((zzaq) entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public /* synthetic */ Set keySet() {
        zzaq zzaqVar = this.zzb;
        if (zzaqVar != null) {
            return zzaqVar;
        }
        zzaq zzc = zzc();
        this.zzb = zzc;
        return zzc;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        zzae.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size << 3, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ Collection values() {
        zzag zzagVar = this.zzc;
        if (zzagVar != null) {
            return zzagVar;
        }
        zzag zza = zza();
        this.zzc = zza;
        return zza;
    }

    public abstract zzag zza();

    public abstract zzaq zzb();

    public abstract zzaq zzc();

    public abstract boolean zzd();
}
