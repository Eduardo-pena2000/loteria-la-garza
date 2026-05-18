package com.google.android.gms.internal.ads;

import S5.V0;
import S5.Y;
import S5.d1;
import V5.o0;
import android.app.Activity;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcts extends zzbew {
    private final zzctr zza;
    private final Y zzb;
    private final zzfer zzc;
    private boolean zzd = ((Boolean) S5.D.c().zzd(zzbhe.zzbn)).booleanValue();
    private final zzdxz zze;

    public zzcts(zzctr zzctrVar, Y y, zzfer zzferVar, zzdxz zzdxzVar) {
        this.zza = zzctrVar;
        this.zzb = y;
        this.zzc = zzferVar;
        this.zze = zzdxzVar;
    }

    public final Y zze() {
        return this.zzb;
    }

    public final void zzf(N6.a aVar, zzbfe zzbfeVar) {
        try {
            this.zzc.zzp(zzbfeVar);
            this.zza.zzb((Activity) N6.b.r1(aVar), zzbfeVar, this.zzd);
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final d1 zzg() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhG)).booleanValue()) {
            return this.zza.zzn();
        }
        return null;
    }

    public final void zzh(boolean z) {
        this.zzd = z;
    }

    public final void zzi(V0 v0) {
        com.google.android.gms.common.internal.t.e("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!v0.zzf()) {
                    this.zze.zzb();
                }
            } catch (RemoteException e) {
                int i = o0.b;
                W5.p.b("Error in making CSI ping for reporting paid event callback", e);
            }
            this.zzc.zzr(v0);
        }
    }

    public final String zzj() {
        try {
            return this.zzb.zzu();
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.i("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final long zzk() {
        zzctr zzctrVar = this.zza;
        if (zzctrVar == null || zzctrVar.zzo() == null) {
            return 0L;
        }
        return zzctrVar.zzo().zza();
    }

    public final void zzl(long j) {
        zzctr zzctrVar = this.zza;
        if (zzctrVar == null || zzctrVar.zzo() == null) {
            return;
        }
        zzctrVar.zzo().zzb(j);
    }
}
