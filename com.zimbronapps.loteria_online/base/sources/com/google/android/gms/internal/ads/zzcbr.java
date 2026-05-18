package com.google.android.gms.internal.ads;

import S5.c1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcbr extends zzcbb {
    private L5.m zza;
    private L5.u zzb;

    public final void zzb(L5.m mVar) {
        this.zza = mVar;
    }

    public final void zzc(L5.u uVar) {
        this.zzb = uVar;
    }

    public final void zze() {
        L5.m mVar = this.zza;
        if (mVar != null) {
            mVar.e();
        }
    }

    public final void zzf() {
        L5.m mVar = this.zza;
        if (mVar != null) {
            mVar.b();
        }
    }

    public final void zzg(zzcaw zzcawVar) {
        L5.u uVar = this.zzb;
        if (uVar != null) {
            uVar.onUserEarnedReward(new zzcbj(zzcawVar));
        }
    }

    public final void zzh(int i) {
    }

    public final void zzi(c1 c1Var) {
        L5.m mVar = this.zza;
        if (mVar != null) {
            mVar.c(c1Var.M1());
        }
    }

    public final void zzj() {
        L5.m mVar = this.zza;
        if (mVar != null) {
            mVar.d();
        }
    }

    public final void zzk() {
        L5.m mVar = this.zza;
        if (mVar != null) {
            mVar.a();
        }
    }
}
