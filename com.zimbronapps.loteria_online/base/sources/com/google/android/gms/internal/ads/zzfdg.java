package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfdg implements zzikg {
    private final zzfdc zza;

    private zzfdg(zzfdc zzfdcVar) {
        this.zza = zzfdcVar;
    }

    public static zzfdg zzc(zzfdc zzfdcVar) {
        return new zzfdg(zzfdcVar);
    }

    public static boolean zzd(zzfdc zzfdcVar) {
        return zzfdcVar.zzg();
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        return Boolean.valueOf(this.zza.zzg());
    }
}
