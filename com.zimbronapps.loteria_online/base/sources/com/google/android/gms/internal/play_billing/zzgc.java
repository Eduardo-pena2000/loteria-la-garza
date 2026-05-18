package com.google.android.gms.internal.play_billing;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzgc implements zzgj {
    private final zzgj[] zza;

    public zzgc(zzgj... zzgjVarArr) {
        this.zza = zzgjVarArr;
    }

    public final zzgi zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzgj zzgjVar = this.zza[i];
            if (zzgjVar.zzc(cls)) {
                return zzgjVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
