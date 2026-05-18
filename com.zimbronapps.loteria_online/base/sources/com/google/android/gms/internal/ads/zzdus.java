package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzdus implements zzclh {
    private final /* synthetic */ Bundle zza;
    private final /* synthetic */ zzcen zzb;

    public /* synthetic */ zzdus(Bundle bundle, zzcen zzcenVar) {
        this.zza = bundle;
        this.zzb = zzcenVar;
    }

    public final /* synthetic */ void zza(boolean z, int i, String str, String str2) {
        zzcen zzcenVar = this.zzb;
        if (z) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzcN)).booleanValue()) {
                this.zza.putLong(zzdxh.zzH.zza(), R5.t.o().a());
            }
            zzcenVar.zzc(null);
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 55 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Ad Web View failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        sb.append(", Failing URL: ");
        sb.append(str2);
        zzcenVar.zzd(new Exception(sb.toString()));
    }
}
