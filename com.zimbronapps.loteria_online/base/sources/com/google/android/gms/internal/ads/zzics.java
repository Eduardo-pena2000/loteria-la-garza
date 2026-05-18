package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzics implements zzida {
    private final zzida[] zza;

    public zzics(zzida... zzidaVarArr) {
        this.zza = zzidaVarArr;
    }

    public final boolean zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    public final zzicz zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzida zzidaVar = this.zza[i];
            if (zzidaVar.zzb(cls)) {
                return zzidaVar.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
