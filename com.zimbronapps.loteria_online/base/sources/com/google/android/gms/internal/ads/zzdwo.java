package com.google.android.gms.internal.ads;

import S5.c1;
import com.google.android.gms.internal.ads.zzbgj;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdwo implements zzdel, zzdct, zzdbi, zzdbz, S5.a, zzdgw {
    private final zzbgd zza;
    private boolean zzb = false;

    public zzdwo(zzbgd zzbgdVar, zzfgn zzfgnVar) {
        this.zza = zzbgdVar;
        zzbgdVar.zzc(2);
        if (zzfgnVar != null) {
            zzbgdVar.zzc(1101);
        }
    }

    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
        } else {
            this.zza.zzc(7);
            this.zzb = true;
        }
    }

    public final void zzdI(c1 c1Var) {
        switch (c1Var.a) {
            case 1:
                this.zza.zzc(101);
                break;
            case 2:
                this.zza.zzc(102);
                break;
            case 3:
                this.zza.zzc(5);
                break;
            case 4:
                this.zza.zzc(103);
                break;
            case 5:
                this.zza.zzc(104);
                break;
            case 6:
                this.zza.zzc(105);
                break;
            case 7:
                this.zza.zzc(106);
                break;
            default:
                this.zza.zzc(4);
                break;
        }
    }

    public final void zzdO(zzbzu zzbzuVar) {
    }

    public final void zzdP(zzfjc zzfjcVar) {
        this.zza.zzb(new zzdwn(zzfjcVar));
    }

    public final synchronized void zzdr() {
        this.zza.zzc(6);
    }

    public final void zzg() {
        this.zza.zzc(3);
    }

    public final void zzj(zzbgj.zzb zzbVar) {
        zzdwk zzdwkVar = new zzdwk(zzbVar);
        zzbgd zzbgdVar = this.zza;
        zzbgdVar.zzb(zzdwkVar);
        zzbgdVar.zzc(1103);
    }

    public final void zzk(zzbgj.zzb zzbVar) {
        zzdwl zzdwlVar = new zzdwl(zzbVar);
        zzbgd zzbgdVar = this.zza;
        zzbgdVar.zzb(zzdwlVar);
        zzbgdVar.zzc(1102);
    }

    public final void zzl(zzbgj.zzb zzbVar) {
        zzdwm zzdwmVar = new zzdwm(zzbVar);
        zzbgd zzbgdVar = this.zza;
        zzbgdVar.zzb(zzdwmVar);
        zzbgdVar.zzc(1104);
    }

    public final void zzm(boolean z) {
        this.zza.zzc(true != z ? 1106 : 1105);
    }

    public final void zzn(boolean z) {
        this.zza.zzc(true != z ? 1108 : 1107);
    }

    public final void zzo() {
        this.zza.zzc(1109);
    }
}
