package com.google.android.gms.internal.ads;

import S5.l2;
import S5.w2;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzffq implements zzfgj {
    private final zzfgj zza;
    private final zzfgj zzb;
    private final zzflv zzc;
    private final String zzd;
    private zzdam zze;
    private final Executor zzf;

    public zzffq(zzfgj zzfgjVar, zzfgj zzfgjVar2, zzflv zzflvVar, String str, Executor executor) {
        this.zza = zzfgjVar;
        this.zzb = zzfgjVar2;
        this.zzc = zzflvVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final x7.e zzg(zzfli zzfliVar, zzfgk zzfgkVar) {
        zzdam zzdamVar = zzfliVar.zza;
        this.zze = zzdamVar;
        if (zzfliVar.zzc != null) {
            if (zzdamVar.zzc() != null) {
                zzfliVar.zzc.zzp().zzu(zzfliVar.zza.zzc());
            }
            return zzgzo.zza(zzfliVar.zzc);
        }
        zzdamVar.zza().zzh(zzfliVar.zzb);
        return ((zzfga) this.zza).zzb(zzfgkVar, null, zzfliVar.zza);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdam zzd() {
        return this.zze;
    }

    public final synchronized x7.e zzb(zzfgk zzfgkVar, zzfgi zzfgiVar, zzdam zzdamVar) {
        zzdal zza = zzfgiVar.zza(zzfgkVar.zzb);
        zza.zzi(new zzffr(this.zzd));
        zzdam zzdamVar2 = (zzdam) zza.zzh();
        zzdamVar2.zzb();
        zzdamVar2.zzb();
        l2 l2Var = zzdamVar2.zzb().zzd;
        if (l2Var.s == null && l2Var.x == null) {
            zzfjk zzb = zzdamVar2.zzb();
            l2 l2Var2 = zzb.zzd;
            String str = zzb.zzg;
            w2 w2Var = zzb.zzk;
            Executor executor = this.zzf;
            return (zzgzg) zzgzo.zzj(zzgzg.zzw(((zzffw) this.zzb).zza(zzfgkVar, zzfgiVar, zzdamVar2)), new zzffo(this, zzfgkVar, new zzffp(zzfgiVar, zzfgkVar, l2Var2, str, executor, w2Var, null), zzfgiVar, zzdamVar2), executor);
        }
        this.zze = zzdamVar2;
        return ((zzfga) this.zza).zzb(zzfgkVar, zzfgiVar, zzdamVar2);
    }

    public final /* bridge */ /* synthetic */ x7.e zzc(zzfgk zzfgkVar, zzfgi zzfgiVar, Object obj) {
        return zzb(zzfgkVar, zzfgiVar, null);
    }

    public final /* synthetic */ x7.e zze(zzfgk zzfgkVar, zzffp zzffpVar, zzfgi zzfgiVar, zzdam zzdamVar, zzffv zzffvVar) {
        if (zzffvVar != null) {
            zzffp zzffpVar2 = new zzffp(zzffpVar.zza, zzffpVar.zzb, zzffpVar.zzc, zzffpVar.zzd, zzffpVar.zze, zzffpVar.zzf, zzffvVar.zza);
            zzfli zzfliVar = zzffvVar.zzc;
            if (zzfliVar != null) {
                this.zze = null;
                this.zzc.zza(zzffpVar2);
                return zzg(zzfliVar, zzfgkVar);
            }
            zzflv zzflvVar = this.zzc;
            x7.e zzb = zzflvVar.zzb(zzffpVar2);
            if (zzb != null) {
                this.zze = null;
                return zzgzo.zzj(zzb, new zzffn(this), this.zzf);
            }
            zzflvVar.zza(zzffpVar2);
            zzfgkVar = new zzfgk(zzfgkVar.zzb, zzffvVar.zzb);
        }
        x7.e zzb2 = ((zzfga) this.zza).zzb(zzfgkVar, zzfgiVar, zzdamVar);
        this.zze = zzdamVar;
        return zzb2;
    }

    public final /* synthetic */ x7.e zzf(zzflr zzflrVar) {
        zzfli zzfliVar;
        zzflt zzfltVar;
        if (zzflrVar == null || (zzfliVar = zzflrVar.zza) == null || (zzfltVar = zzflrVar.zzb) == null) {
            throw new zzecr(1, "Empty prefetch");
        }
        zzbgj.zzb.zzc zzs = zzbgj.zzb.zzs();
        zzbgj.zzb.zza.zza zzs2 = zzbgj.zzb.zza.zzs();
        zzs2.zzc(zzbgj.zzb.zzd.zzb);
        zzs2.zzg(zzbgj.zzb.zze.zzs());
        zzs.zzh(zzs2);
        zzfliVar.zza.zza().zzd().zzl((zzbgj.zzb) zzs.zzbm());
        return zzg(zzfliVar, ((zzffp) zzfltVar).zzb);
    }
}
