package com.google.android.gms.internal.drive;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzix {
    private static final Class zzni = zzj("libcore.io.Memory");
    private static final boolean zznj;

    static {
        zznj = zzj("org.robolectric.Robolectric") != null;
    }

    public static boolean zzbr() {
        return (zzni == null || zznj) ? false : true;
    }

    public static Class zzbs() {
        return zzni;
    }

    private static Class zzj(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
