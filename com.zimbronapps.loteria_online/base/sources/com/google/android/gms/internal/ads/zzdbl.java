package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzdbl implements zzdhc {
    private final /* synthetic */ zzdmb zza;

    public /* synthetic */ zzdbl(zzdmb zzdmbVar) {
        this.zza = zzdmbVar;
    }

    public final /* synthetic */ void zza(Object obj) {
        zzdbv zzdbvVar = (zzdbv) obj;
        String message = this.zza.getMessage();
        if (message == null) {
            message = "Internal show error.";
        }
        zzdbvVar.zzj(zzfkm.zzd(12, message, null));
    }
}
