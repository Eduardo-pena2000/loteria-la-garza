package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhlm extends RuntimeException {
    public zzhlm(String str) {
        super(str);
    }

    public static Object zza(zzhll zzhllVar) {
        try {
            return zzhllVar.zza();
        } catch (Exception e) {
            throw new zzhlm((Throwable) e);
        }
    }

    public zzhlm(String str, Throwable th) {
        super(str, th);
    }

    public zzhlm(Throwable th) {
        super(th);
    }
}
