package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzibk implements zzida {
    private static final zzibk zza = new zzibk();

    private zzibk() {
    }

    public static zzibk zza() {
        return zza;
    }

    public final boolean zzb(Class cls) {
        return zzibr.class.isAssignableFrom(cls);
    }

    public final zzicz zzc(Class cls) {
        if (!zzibr.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzicz) zzibr.zzbt(cls.asSubclass(zzibr.class)).zzbs();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}
