package com.google.android.gms.internal.consent_sdk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzha extends zzqm implements zzrr {
    private static final zzha zzb;
    private int zzd;
    private String zze = "";

    static {
        zzha zzhaVar = new zzha();
        zzb = zzhaVar;
        zzqm.zzz(zzha.class, zzhaVar);
    }

    private zzha() {
    }

    public static zzgz zza() {
        return (zzgz) zzb.zzp();
    }

    public static /* bridge */ /* synthetic */ zzha zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzha zzhaVar, String str) {
        zzhaVar.zzd |= 1;
        zzhaVar.zze = "4.0.0";
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzha();
        }
        if (i2 == 4) {
            return new zzgz(null);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
