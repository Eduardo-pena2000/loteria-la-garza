package com.google.android.recaptcha.internal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzmw implements zzog {
    private static final zzmw zza = new zzmw();

    private zzmw() {
    }

    public static zzmw zza() {
        return zza;
    }

    public final zzof zzb(Class cls) {
        if (!zznd.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzof) zznd.zzu(cls.asSubclass(zznd.class)).zzh(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    public final boolean zzc(Class cls) {
        return zznd.class.isAssignableFrom(cls);
    }
}
