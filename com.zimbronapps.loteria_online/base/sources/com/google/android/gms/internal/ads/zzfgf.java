package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfgf {
    private final zzfkz zza;
    private final zzdam zzb;
    private final Executor zzc;
    private zzfgd zzd;

    public zzfgf(zzfkz zzfkzVar, zzdam zzdamVar, Executor executor) {
        this.zza = zzfkzVar;
        this.zzb = zzdamVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzflj zzb() {
        zzfjk zzb = this.zzb.zzb();
        return this.zza.zzd(zzb.zzd, zzb.zzg, zzb.zzk);
    }

    public final x7.e zza() {
        x7.e eVar;
        zzfgd zzfgdVar = this.zzd;
        if (zzfgdVar != null) {
            return zzgzo.zza(zzfgdVar);
        }
        if (((Boolean) zzbjl.zza.zze()).booleanValue()) {
            zzgzg zzw = zzgzg.zzw(this.zzb.zza().zze(this.zza.zze()));
            zzfgc zzfgcVar = new zzfgc(this);
            Executor executor = this.zzc;
            eVar = (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk(zzw, zzfgcVar, executor), zzeff.class, new zzfgb(this), executor);
        } else {
            zzfgd zzfgdVar2 = new zzfgd(null, zzb(), null);
            this.zzd = zzfgdVar2;
            eVar = zzgzo.zza(zzfgdVar2);
        }
        return zzgzo.zzk(eVar, zzfge.zza, this.zzc);
    }

    public final /* synthetic */ zzfgd zzc() {
        return this.zzd;
    }

    public final /* synthetic */ void zzd(zzfgd zzfgdVar) {
        this.zzd = zzfgdVar;
    }
}
