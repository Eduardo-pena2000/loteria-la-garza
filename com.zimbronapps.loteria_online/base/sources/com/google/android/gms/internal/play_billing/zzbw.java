package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzbw implements Map, Serializable {
    private transient zzbx zza;
    private transient zzbx zzb;
    private transient zzbq zzc;

    public static zzbw zzc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        zzbo.zza("com.android.vending.billing.PURCHASES_UPDATED", obj2);
        zzbo.zza("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4);
        zzbo.zza("com.android.vending.billing.ALTERNATIVE_BILLING", obj6);
        return zzcf.zzg(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4, "com.android.vending.billing.ALTERNATIVE_BILLING", obj6}, null);
    }

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
        return zzcg.zza(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        zzbx zzbxVar = this.zzb;
        if (zzbxVar != null) {
            return zzbxVar;
        }
        zzbx zze = zze();
        this.zzb = zze;
        return zze;
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

    public abstract zzbq zza();

    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzbq values() {
        zzbq zzbqVar = this.zzc;
        if (zzbqVar != null) {
            return zzbqVar;
        }
        zzbq zza = zza();
        this.zzc = zza;
        return zza;
    }

    public abstract zzbx zzd();

    public abstract zzbx zze();

    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzbx entrySet() {
        zzbx zzbxVar = this.zza;
        if (zzbxVar != null) {
            return zzbxVar;
        }
        zzbx zzd = zzd();
        this.zza = zzd;
        return zzd;
    }
}
