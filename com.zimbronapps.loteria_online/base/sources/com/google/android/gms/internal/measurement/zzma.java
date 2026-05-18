package com.google.android.gms.internal.measurement;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzma implements zznk {
    private static final zzma zza = new zzma();

    private zzma() {
    }

    public static zzma zza() {
        return zza;
    }

    public final boolean zzb(Class cls) {
        return zzmf.class.isAssignableFrom(cls);
    }

    public final zznj zzc(Class cls) {
        if (!zzmf.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zznj) zzmf.zzco(cls.asSubclass(zzmf.class)).zzl(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}
