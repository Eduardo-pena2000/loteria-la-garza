package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzbsa implements Runnable {
    private final /* synthetic */ zzbsl zza;
    private final /* synthetic */ zzbsk zzb;
    private final /* synthetic */ zzbrg zzc;
    private final /* synthetic */ ArrayList zzd;
    private final /* synthetic */ long zze;

    public /* synthetic */ zzbsa(zzbsl zzbslVar, zzbsk zzbskVar, zzbrg zzbrgVar, ArrayList arrayList, long j) {
        this.zza = zzbslVar;
        this.zzb = zzbskVar;
        this.zzc = zzbrgVar;
        this.zzd = arrayList;
        this.zze = j;
    }

    public final /* synthetic */ void run() {
        this.zza.zzf(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
