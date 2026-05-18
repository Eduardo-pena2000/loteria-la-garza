package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfmb {
    private final zzflt zza;
    private final x7.e zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfmb(zzfkz zzfkzVar, zzfls zzflsVar, zzflt zzfltVar) {
        this.zza = zzfltVar;
        this.zzb = zzgzo.zzh(zzgzo.zzj(zzflsVar.zza(zzfltVar), new zzfma(this, zzflsVar, zzfkzVar, zzfltVar), zzfltVar.zza()), Exception.class, new zzfly(this, zzflsVar), zzfltVar.zza());
    }

    public final synchronized void zza(zzgzl zzgzlVar) {
        zzflt zzfltVar = this.zza;
        zzgzo.zzr(zzgzo.zzj(this.zzb, zzflz.zza, zzfltVar.zza()), zzgzlVar, zzfltVar.zza());
    }

    public final synchronized x7.e zzb(zzflt zzfltVar) {
        if (!this.zzd && !this.zzc) {
            zzflt zzfltVar2 = this.zza;
            if (zzfltVar2.zzb() != null && zzfltVar.zzb() != null && zzfltVar2.zzb().equals(zzfltVar.zzb())) {
                this.zzc = true;
                return this.zzb;
            }
        }
        return null;
    }

    public final /* synthetic */ x7.e zzc(zzfls zzflsVar, zzfkz zzfkzVar, zzflt zzfltVar, zzfli zzfliVar) {
        x7.e zza;
        synchronized (this) {
            try {
                this.zzd = true;
                zzflsVar.zzb(zzfliVar);
                if (this.zzc) {
                    zza = zzgzo.zza(new zzflr(zzfliVar, zzfltVar));
                } else {
                    zzfkzVar.zzb(zzfltVar.zzb(), zzfliVar);
                    zza = zzgzo.zza(null);
                }
            } finally {
            }
        }
        return zza;
    }

    public final /* synthetic */ x7.e zzd(zzfls zzflsVar, Exception exc) {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }
}
