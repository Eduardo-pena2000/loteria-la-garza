package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfok implements zzgzl {
    final /* synthetic */ zzfoo zza;
    final /* synthetic */ zzfoe zzb;
    final /* synthetic */ boolean zzc;

    public zzfok(zzfoo zzfooVar, zzfoe zzfoeVar, boolean z) {
        this.zza = zzfooVar;
        this.zzb = zzfoeVar;
        this.zzc = z;
    }

    public final void zza(Throwable th) {
        zzfoe zzfoeVar = this.zzb;
        if (zzfoeVar.zzb()) {
            zzfoo zzfooVar = this.zza;
            zzfoeVar.zzj(th);
            zzfoeVar.zzd(false);
            zzfooVar.zza(zzfoeVar);
            if (this.zzc) {
                zzfooVar.zzh();
            }
        }
    }

    public final void zzb(Object obj) {
        zzfoe zzfoeVar = this.zzb;
        zzfoeVar.zzd(true);
        zzfoo zzfooVar = this.zza;
        zzfooVar.zza(zzfoeVar);
        if (this.zzc) {
            zzfooVar.zzh();
        }
    }
}
