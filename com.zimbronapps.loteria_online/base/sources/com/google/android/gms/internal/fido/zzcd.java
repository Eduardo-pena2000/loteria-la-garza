package com.google.android.gms.internal.fido;

import java.io.Serializable;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzcd implements Map, Serializable {
    static final Map.Entry[] zza = new Map.Entry[0];
    private transient zzcf zzb;

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final boolean equals(Object obj) {
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

    public final int hashCode() {
        return zzcy.zza(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
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

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
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

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public zzby values() {
        throw null;
    }

    public abstract zzcf zzb();

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzcf entrySet() {
        zzcf zzcfVar = this.zzb;
        if (zzcfVar != null) {
            return zzcfVar;
        }
        zzcf zzb = zzb();
        this.zzb = zzb;
        return zzb;
    }

    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public zzcf keySet() {
        throw null;
    }
}
