package com.google.android.gms.internal.consent_sdk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzqj extends zzoz {
    protected zzqm zza;
    private final zzqm zzb;

    public zzqj(zzqm zzqmVar) {
        this.zzb = zzqmVar;
        if (zzqmVar.zzD()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = zzqmVar.zzr();
    }

    /* renamed from: zzh, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzqj zzg() {
        zzqj zzqjVar = (zzqj) this.zzb.zzb(5, null, null);
        zzqjVar.zza = zzk();
        return zzqjVar;
    }

    public final zzqm zzi() {
        zzqm zzk = zzk();
        if (zzk.zzo()) {
            return zzk;
        }
        throw new zzso(zzk);
    }

    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public zzqm zzk() {
        if (!this.zza.zzD()) {
            return this.zza;
        }
        this.zza.zzx();
        return this.zza;
    }

    public final /* bridge */ /* synthetic */ zzrq zzl() {
        throw null;
    }

    public final void zzm() {
        if (this.zza.zzD()) {
            return;
        }
        zzn();
    }

    public void zzn() {
        zzqm zzr = this.zzb.zzr();
        zzrx.zza().zzb(zzr.getClass()).zze(zzr, this.zza);
        this.zza = zzr;
    }

    public final boolean zzo() {
        return zzqm.zzC(this.zza, false);
    }
}
