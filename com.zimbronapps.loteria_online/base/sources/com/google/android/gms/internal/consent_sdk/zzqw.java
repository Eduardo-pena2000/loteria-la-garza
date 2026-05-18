package com.google.android.gms.internal.consent_sdk;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzqw implements Map.Entry {
    private final Map.Entry zza;

    public /* synthetic */ zzqw(Map.Entry entry, zzqy zzqyVar) {
        this.zza = entry;
    }

    public final Object getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        if (((zzqz) this.zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzrq) {
            return ((zzqz) this.zza.getValue()).zzc((zzrq) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzqz zza() {
        return (zzqz) this.zza.getValue();
    }
}
