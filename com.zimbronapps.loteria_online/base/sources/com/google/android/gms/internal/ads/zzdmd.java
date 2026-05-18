package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdmd implements zzdct, U5.E, zzdbz {
    zzekb zza;
    private final Context zzb;
    private final zzcjl zzc;
    private final zzfir zzd;
    private final W5.a zze;
    private final zzejz zzf;

    public zzdmd(Context context, zzcjl zzcjlVar, zzfir zzfirVar, W5.a aVar, zzejz zzejzVar) {
        this.zzb = context;
        this.zzc = zzcjlVar;
        this.zzd = zzfirVar;
        this.zze = aVar;
        this.zzf = zzejzVar;
    }

    private final boolean zzl() {
        return ((Boolean) S5.D.c().zzd(zzbhe.zzgm)).booleanValue() && this.zzf.zzb();
    }

    public final void zzdS() {
    }

    public final void zzdT(int i) {
        this.zza = null;
    }

    public final void zzdo() {
    }

    public final void zzdp() {
    }

    public final void zzdq() {
    }

    public final void zzdr() {
        zzcjl zzcjlVar;
        if (zzl()) {
            this.zzf.zzd();
        } else {
            if (this.zza == null || (zzcjlVar = this.zzc) == null) {
                return;
            }
            if (((Boolean) S5.D.c().zzd(zzbhe.zzgp)).booleanValue()) {
                zzcjlVar.zze("onSdkImpression", new w.a());
            }
        }
    }

    public final void zzdv() {
    }

    public final void zzdw() {
    }

    public final void zzdx() {
    }

    public final void zzdy() {
    }

    public final void zzdz() {
    }

    public final void zzg() {
        zzcjl zzcjlVar;
        zzejy zzejyVar;
        zzejx zzejxVar;
        zzfir zzfirVar = this.zzd;
        if (!zzfirVar.zzT || (zzcjlVar = this.zzc) == null) {
            return;
        }
        if (R5.t.y().zza(this.zzb)) {
            if (zzl()) {
                this.zzf.zzc();
                return;
            }
            W5.a aVar = this.zze;
            int i = aVar.b;
            int i2 = aVar.c;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            String sb2 = sb.toString();
            zzfjn zzfjnVar = zzfirVar.zzV;
            String zza = zzfjnVar.zza();
            if (zzfjnVar.zzc() == 1) {
                zzejxVar = zzejx.zzc;
                zzejyVar = zzejy.zzb;
            } else {
                zzejyVar = zzfirVar.zzY == 2 ? zzejy.zzd : zzejy.zza;
                zzejxVar = zzejx.zza;
            }
            zzekb zzc = R5.t.y().zzc(sb2, zzcjlVar.zzD(), "", "javascript", zza, zzejyVar, zzejxVar, zzfirVar.zzal);
            this.zza = zzc;
            if (zzc != null) {
                zzfsj zza2 = zzc.zza();
                if (((Boolean) S5.D.c().zzd(zzbhe.zzgl)).booleanValue()) {
                    R5.t.y().zzh(zza2, zzcjlVar.zzD());
                    Iterator it = zzcjlVar.zzF().iterator();
                    while (it.hasNext()) {
                        R5.t.y().zzg(zza2, (View) it.next());
                    }
                } else {
                    R5.t.y().zzh(zza2, zzcjlVar.zzE());
                }
                zzcjlVar.zzak(this.zza);
                R5.t.y().zze(zza2);
                zzcjlVar.zze("onSdkLoaded", new w.a());
            }
        }
    }

    public final void zzh() {
        zzcjl zzcjlVar;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgp)).booleanValue() || (zzcjlVar = this.zzc) == null) {
            return;
        }
        if (this.zza != null || zzl()) {
            if (this.zza != null) {
                zzcjlVar.zze("onSdkImpression", new w.a());
            } else {
                this.zzf.zzd();
            }
        }
    }
}
