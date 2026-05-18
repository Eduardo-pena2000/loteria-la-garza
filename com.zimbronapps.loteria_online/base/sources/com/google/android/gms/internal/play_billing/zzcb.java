package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcb extends zzbt {
    final /* synthetic */ zzcc zza;

    public zzcb(zzcc zzccVar) {
        Objects.requireNonNull(zzccVar);
        this.zza = zzccVar;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzcc zzccVar = this.zza;
        zzbg.zza(i, zzcc.zzi(zzccVar), "index");
        int i2 = i + i;
        Object obj = zzcc.zzj(zzccVar)[i2];
        Objects.requireNonNull(obj);
        Object obj2 = zzcc.zzj(zzccVar)[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return zzcc.zzi(this.zza);
    }

    public final boolean zzf() {
        return true;
    }
}
