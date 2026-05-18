package com.google.android.gms.internal.consent_sdk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zznx extends zzqm implements zzrr {
    private static final zznx zzb;
    private int zzd;
    private String zze = "";

    static {
        zznx zznxVar = new zznx();
        zzb = zznxVar;
        zzqm.zzz(zznx.class, zznxVar);
    }

    private zznx() {
    }

    public static /* bridge */ /* synthetic */ zznx zza() {
        return zzb;
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zznx();
        }
        if (i2 == 4) {
            return new zznw(null);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
