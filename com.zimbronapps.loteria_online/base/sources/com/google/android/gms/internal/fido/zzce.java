package com.google.android.gms.internal.fido;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
abstract class zzce extends zzcf {
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = zzf().get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return zzcy.zza(zzf().entrySet());
    }

    public final int size() {
        return zzf().size();
    }

    public abstract zzcd zzf();

    public final boolean zzg() {
        return false;
    }
}
