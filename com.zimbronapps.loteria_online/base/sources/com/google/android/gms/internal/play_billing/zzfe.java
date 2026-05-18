package com.google.android.gms.internal.play_billing;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzfe extends zzdr {
    protected zzfi zza;
    private final zzfi zzb;

    public zzfe(zzfi zzfiVar) {
        this.zzb = zzfiVar;
        if (zzfiVar.zzz()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = zzfiVar.zzo();
    }

    private static void zza(Object obj, Object obj2) {
        zzgs.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzfe zzb() {
        zzfe zzfeVar = (zzfe) this.zzb.zzb(5, null, null);
        zzfeVar.zza = zzg();
        return zzfeVar;
    }

    public final zzfe zzd(zzfi zzfiVar) {
        if (!this.zzb.equals(zzfiVar)) {
            if (!this.zza.zzz()) {
                zzj();
            }
            zza(this.zza, zzfiVar);
        }
        return this;
    }

    public final zzfi zze() {
        zzfi zzg = zzg();
        if (zzg.zzk()) {
            return zzg;
        }
        throw new zzhg(zzg);
    }

    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public zzfi zzg() {
        if (!this.zza.zzz()) {
            return this.zza;
        }
        this.zza.zzu();
        return this.zza;
    }

    public final /* bridge */ /* synthetic */ zzgl zzh() {
        throw null;
    }

    public final void zzi() {
        if (this.zza.zzz()) {
            return;
        }
        zzj();
    }

    public void zzj() {
        zzfi zzo = this.zzb.zzo();
        zza(zzo, this.zza);
        this.zza = zzo;
    }

    public final boolean zzk() {
        return zzfi.zzy(this.zza, false);
    }
}
