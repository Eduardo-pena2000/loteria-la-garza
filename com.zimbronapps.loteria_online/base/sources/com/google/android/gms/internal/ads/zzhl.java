package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhl extends zzgtv {
    private final Map zza;

    public zzhl(Map map) {
        this.zza = map;
    }

    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return super.zzc(obj);
    }

    public final Set entrySet() {
        return zzgwp.zzb(this.zza.entrySet(), zzhj.zza);
    }

    public final boolean equals(Object obj) {
        return obj != null && super.zzd(obj);
    }

    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    public final int hashCode() {
        return super.zze();
    }

    public final boolean isEmpty() {
        if (this.zza.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    public final Set keySet() {
        return zzgwp.zzb(this.zza.keySet(), zzhk.zza);
    }

    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    public final Map zza() {
        return this.zza;
    }

    public final /* synthetic */ Object zzb() {
        return this.zza;
    }
}
