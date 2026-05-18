package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdqh implements zzdbz {
    private final zzdoh zza;
    private final zzdom zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdqh(zzdoh zzdohVar, zzdom zzdomVar, Executor executor, Executor executor2) {
        this.zza = zzdohVar;
        this.zzb = zzdomVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zza(zzcjl zzcjlVar) {
        this.zzc.execute(new zzdqg(zzcjlVar));
    }

    public final void zzdr() {
        if (this.zzb.zzd()) {
            zzdoh zzdohVar = this.zza;
            zzekb zzZ = zzdohVar.zzZ();
            if (zzZ == null && zzdohVar.zzX() != null && ((Boolean) S5.D.c().zzd(zzbhe.zzgq)).booleanValue()) {
                x7.e zzX = zzdohVar.zzX();
                zzcen zzY = zzdohVar.zzY();
                if (zzX == null || zzY == null) {
                    return;
                }
                zzgzo.zzr(zzgzo.zzq(zzX, zzY), new zzdqf(this), this.zzd);
                return;
            }
            if (zzZ != null) {
                zzcjl zzW = zzdohVar.zzW();
                zzcjl zzT = zzdohVar.zzT();
                if (zzW == null) {
                    zzW = zzT == null ? null : zzT;
                }
                if (zzW != null) {
                    zza(zzW);
                }
            }
        }
    }
}
