package com.google.android.gms.internal.consent_sdk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzqi implements zzro {
    private static final zzqi zza = new zzqi();

    private zzqi() {
    }

    public static zzqi zza() {
        return zza;
    }

    public final zzrn zzb(Class cls) {
        if (!zzqm.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzrn) zzqm.zzq(cls.asSubclass(zzqm.class)).zzb(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    public final boolean zzc(Class cls) {
        return zzqm.class.isAssignableFrom(cls);
    }
}
