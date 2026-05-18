package com.google.android.gms.internal.firebase-auth-api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzamb implements zzamj {
    private zzamj[] zza;

    public zzamb(zzamj... zzamjVarArr) {
        this.zza = zzamjVarArr;
    }

    public final zzamk zza(Class cls) {
        for (zzamj zzamjVar : this.zza) {
            if (zzamjVar.zzb(cls)) {
                return zzamjVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    public final boolean zzb(Class cls) {
        for (zzamj zzamjVar : this.zza) {
            if (zzamjVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
