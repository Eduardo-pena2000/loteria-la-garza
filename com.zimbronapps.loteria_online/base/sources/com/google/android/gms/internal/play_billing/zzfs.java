package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzfs implements Map.Entry {
    private final Map.Entry zza;

    public /* synthetic */ zzfs(Map.Entry entry, zzfu zzfuVar) {
        this.zza = entry;
    }

    public final Object getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        if (((zzfv) this.zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzgl) {
            return ((zzfv) this.zza.getValue()).zzc((zzgl) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzfv zza() {
        return (zzfv) this.zza.getValue();
    }
}
