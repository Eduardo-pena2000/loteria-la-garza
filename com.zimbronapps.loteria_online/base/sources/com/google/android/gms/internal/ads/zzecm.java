package com.google.android.gms.internal.ads;

import V5.q0;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzecm {
    zzbyr zza;
    zzbyr zzb;
    private final Context zzc;
    private final zzecj zzd;
    private final zzdxz zze;
    private final q0 zzf;

    public zzecm(zzecj zzecjVar, zzdxz zzdxzVar, Context context, q0 q0Var) {
        this.zzd = zzecjVar;
        this.zze = zzdxzVar;
        this.zzc = context;
        this.zzf = q0Var;
    }

    public final void zza() {
        try {
            if (this.zzf.zzP()) {
                return;
            }
            zzecj zzecjVar = this.zzd;
            zzecjVar.zza();
            zzecjVar.zzb(new zzecl(this));
        } catch (Exception e) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzfP)).booleanValue()) {
                if (this.zzb == null) {
                    this.zzb = zzbyp.zzc(this.zzc);
                }
                this.zzb.zzh(e, "InstallReferrerUnsampled.initializeAndReport");
            } else {
                if (this.zza == null) {
                    this.zza = zzbyp.zza(this.zzc);
                }
                this.zza.zzh(e, "InstallReferrer.initializeAndReport");
            }
        }
    }

    public final /* synthetic */ Context zzb() {
        return this.zzc;
    }

    public final /* synthetic */ zzecj zzc() {
        return this.zzd;
    }

    public final /* synthetic */ zzdxz zzd() {
        return this.zze;
    }

    public final /* synthetic */ q0 zze() {
        return this.zzf;
    }
}
