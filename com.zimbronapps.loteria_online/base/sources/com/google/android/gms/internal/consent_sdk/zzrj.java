package com.google.android.gms.internal.consent_sdk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzrj {
    private final zzri zza;

    private zzrj(zzsz zzszVar, Object obj, zzsz zzszVar2, Object obj2) {
        this.zza = new zzri(zzszVar, "", zzszVar2, obj2);
    }

    public static int zzb(zzri zzriVar, Object obj, Object obj2) {
        return zzqf.zza(zzriVar.zza, 1, obj) + zzqf.zza(zzriVar.zzb, 2, obj2);
    }

    public static zzrj zzd(zzsz zzszVar, Object obj, zzsz zzszVar2, Object obj2) {
        return new zzrj(zzszVar, "", zzszVar2, obj2);
    }

    public final int zza(int i, Object obj, Object obj2) {
        zzri zzriVar = this.zza;
        int zzC = zzpv.zzC(i << 3);
        int zzb = zzb(zzriVar, obj, obj2);
        return zzC + zzpv.zzC(zzb) + zzb;
    }

    public final zzri zzc() {
        return this.zza;
    }
}
