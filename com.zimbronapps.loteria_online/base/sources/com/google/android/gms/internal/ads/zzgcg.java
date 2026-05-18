package com.google.android.gms.internal.ads;

import s1.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgcg implements Runnable {
    private final /* synthetic */ zzgck zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ c.a zzc;
    private final /* synthetic */ boolean zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ byte[] zzf;

    public /* synthetic */ zzgcg(zzgck zzgckVar, String str, c.a aVar, boolean z, String str2, byte[] bArr) {
        this.zza = zzgckVar;
        this.zzb = str;
        this.zzc = aVar;
        this.zzd = z;
        this.zze = str2;
        this.zzf = bArr;
    }

    public final /* synthetic */ void run() {
        this.zza.zzd(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
