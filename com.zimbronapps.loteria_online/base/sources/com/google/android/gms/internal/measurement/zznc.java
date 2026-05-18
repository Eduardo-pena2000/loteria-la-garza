package com.google.android.gms.internal.measurement;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zznc implements zznk {
    private final zznk[] zza;

    public zznc(zznk... zznkVarArr) {
        this.zza = zznkVarArr;
    }

    public final boolean zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    public final zznj zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            zznk zznkVar = this.zza[i];
            if (zznkVar.zzb(cls)) {
                return zznkVar.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
