package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzeah implements Runnable {
    private final /* synthetic */ zzeak zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzbqk zzc;
    private final /* synthetic */ zzfki zzd;
    private final /* synthetic */ List zze;

    public /* synthetic */ zzeah(zzeak zzeakVar, String str, zzbqk zzbqkVar, zzfki zzfkiVar, List list) {
        this.zza = zzeakVar;
        this.zzb = str;
        this.zzc = zzbqkVar;
        this.zzd = zzfkiVar;
        this.zze = list;
    }

    public final /* synthetic */ void run() {
        this.zza.zzk(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
