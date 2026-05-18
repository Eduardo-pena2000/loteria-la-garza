package com.google.android.gms.internal.firebase-auth-api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzql extends RuntimeException {
    public zzql(String str) {
        super(str);
    }

    public static Object zza(zzqo zzqoVar) {
        try {
            return zzqoVar.zza();
        } catch (Exception e) {
            throw new zzql((Throwable) e);
        }
    }

    public zzql(Throwable th) {
        super(th);
    }

    public zzql(String str, Throwable th) {
        super(str, th);
    }
}
