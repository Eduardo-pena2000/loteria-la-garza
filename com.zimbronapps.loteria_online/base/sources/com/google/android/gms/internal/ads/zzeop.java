package com.google.android.gms.internal.ads;

import V5.F0;
import V5.o0;
import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzeop implements zzdmc {
    private final Context zza;
    private final zzduv zzb;
    private final zzfjk zzc;
    private final W5.a zzd;
    private final zzfir zze;
    private final x7.e zzf;
    private final zzcjl zzg;
    private final zzbok zzh;
    private final boolean zzi;
    private final zzejf zzj;
    private final zzdxt zzk;
    private final zzdxz zzl;

    public zzeop(Context context, zzduv zzduvVar, zzfjk zzfjkVar, W5.a aVar, zzfir zzfirVar, x7.e eVar, zzcjl zzcjlVar, zzbok zzbokVar, boolean z, zzejf zzejfVar, zzdxt zzdxtVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzb = zzduvVar;
        this.zzc = zzfjkVar;
        this.zzd = aVar;
        this.zze = zzfirVar;
        this.zzf = eVar;
        this.zzg = zzcjlVar;
        this.zzh = zzbokVar;
        this.zzi = z;
        this.zzj = zzejfVar;
        this.zzk = zzdxtVar;
        this.zzl = zzdxzVar;
    }

    public final void zza(boolean z, Context context, zzdbs zzdbsVar) {
        zzdua zzduaVar = (zzdua) zzgzo.zzt(this.zzf);
        try {
            zzfir zzfirVar = this.zze;
            zzcjl zzcjlVar = this.zzg;
            if (zzcjlVar.zzaB()) {
                if (((Boolean) S5.D.c().zzd(zzbhe.zzbt)).booleanValue()) {
                    zzcjlVar = this.zzb.zza(this.zzc.zzf, null, null);
                    zzbpa.zzb(zzcjlVar, zzduaVar.zzk());
                    zzduz zzduzVar = new zzduz();
                    zzduaVar.zzl().zzi(zzcjlVar, true, this.zzi ? this.zzh : null, this.zzk.zze());
                    zzcjlVar.zzP().zzG(new zzeoo(zzduzVar, zzcjlVar));
                    zzcjlVar.zzP().zzH(new zzeon(zzcjlVar));
                    zzfiw zzfiwVar = zzfirVar.zzs;
                    zzcjlVar.zzau(zzfiwVar.zzb, zzfiwVar.zza, null);
                }
            }
            zzcjl zzcjlVar2 = zzcjlVar;
            zzcjlVar2.zzag(true);
            boolean z2 = this.zzi;
            boolean zzc = z2 ? this.zzh.zzc(false) : false;
            R5.t.g();
            boolean n = F0.n(this.zza);
            boolean z3 = z2 && this.zzh.zzd();
            float zze = z2 ? this.zzh.zze() : 0.0f;
            zzfir zzfirVar2 = this.zze;
            R5.l lVar = new R5.l(zzc, n, z3, zze, -1, z, zzfirVar2.zzO, zzfirVar2.zzP);
            if (zzdbsVar != null) {
                zzdbsVar.zzb();
            }
            R5.t.f();
            zzdlr zzj = zzduaVar.zzj();
            int i = zzfirVar2.zzQ;
            W5.a aVar = this.zzd;
            String str = zzfirVar2.zzB;
            zzfiw zzfiwVar2 = zzfirVar2.zzs;
            String str2 = zzfiwVar2.zzb;
            String str3 = zzfiwVar2.zza;
            zzfjk zzfjkVar = this.zzc;
            U5.A.a(context, new AdOverlayInfoParcel(null, zzj, null, zzcjlVar2, i, aVar, str, lVar, str2, str3, zzfjkVar.zzg, zzdbsVar, zzfirVar2.zzb() ? this.zzj : null, zzcjlVar2.zzn()), true, this.zzl);
        } catch (zzcka e) {
            int i2 = o0.b;
            W5.p.d("", e);
        }
    }

    public final zzfir zzb() {
        return this.zze;
    }
}
