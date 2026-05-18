package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzdrn implements zzclh {
    private final /* synthetic */ zzcem zza;

    public /* synthetic */ zzdrn(zzcem zzcemVar) {
        this.zza = zzcemVar;
    }

    public final /* synthetic */ void zza(boolean z, int i, String str, String str2) {
        zzcem zzcemVar = this.zza;
        if (z) {
            zzcemVar.zzb();
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Image Web View failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        sb.append(", Failing URL: ");
        sb.append(str2);
        zzcemVar.zzd(new zzenv(1, sb.toString()));
    }
}
