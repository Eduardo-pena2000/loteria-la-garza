package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgmb implements Callable {
    private final /* synthetic */ zzgme zza;
    private final /* synthetic */ zzgdu zzb;
    private final /* synthetic */ byte[] zzc;

    public /* synthetic */ zzgmb(zzgme zzgmeVar, zzgdu zzgduVar, byte[] bArr) {
        this.zza = zzgmeVar;
        this.zzb = zzgduVar;
        this.zzc = bArr;
    }

    public final /* synthetic */ Object call() {
        this.zza.zzh(this.zzb, this.zzc);
        return null;
    }
}
