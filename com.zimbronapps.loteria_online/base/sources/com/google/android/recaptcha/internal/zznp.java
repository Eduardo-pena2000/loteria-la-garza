package com.google.android.recaptcha.internal;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zznp implements Map.Entry {
    private final Map.Entry zza;

    public /* synthetic */ zznp(Map.Entry entry, zznr zznrVar) {
        this.zza = entry;
    }

    public final Object getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        if (((zzns) this.zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzoi) {
            return ((zzns) this.zza.getValue()).zzc((zzoi) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzns zza() {
        return (zzns) this.zza.getValue();
    }
}
