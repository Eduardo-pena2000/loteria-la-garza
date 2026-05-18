package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgmc implements Callable {
    private final /* synthetic */ zzgme zza;
    private final /* synthetic */ zzgdu zzb;
    private final /* synthetic */ byte[] zzc;
    private final /* synthetic */ byte[] zzd;

    public /* synthetic */ zzgmc(zzgme zzgmeVar, zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        this.zza = zzgmeVar;
        this.zzb = zzgduVar;
        this.zzc = bArr;
        this.zzd = bArr2;
    }

    public final /* synthetic */ Object call() {
        this.zza.zzi(this.zzb, this.zzc, this.zzd);
        return null;
    }
}
