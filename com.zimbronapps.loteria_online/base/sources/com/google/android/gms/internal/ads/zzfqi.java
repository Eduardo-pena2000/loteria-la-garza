package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfqi implements zzgzl {
    final /* synthetic */ zzfoe zza;
    final /* synthetic */ zzfoo zzb;
    final /* synthetic */ zzddu zzc;
    final /* synthetic */ zzfqk zzd;

    public zzfqi(zzfqk zzfqkVar, zzfoe zzfoeVar, zzfoo zzfooVar, zzddu zzdduVar) {
        this.zza = zzfoeVar;
        this.zzb = zzfooVar;
        this.zzc = zzdduVar;
        Objects.requireNonNull(zzfqkVar);
        this.zzd = zzfqkVar;
    }

    public final void zza(Throwable th) {
        zzfoe zzfoeVar = this.zza;
        if (zzfoeVar == null) {
            return;
        }
        zzfoeVar.zzd(false);
        zzfoo zzfooVar = this.zzb;
        if (zzfooVar != null) {
            zzfooVar.zza(zzfoeVar);
            zzfooVar.zzh();
        } else {
            zzfqk zzfqkVar = this.zzd;
            zzfqkVar.zze().zzb(zzfoeVar.zzm());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfqi.zzb(java.lang.Object):void");
    }
}
