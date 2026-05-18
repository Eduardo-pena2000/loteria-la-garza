package com.google.android.recaptcha.internal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzmx extends zzkn {
    protected zznd zza;
    private final zznd zzb;

    public zzmx(zznd zzndVar) {
        this.zzb = zzndVar;
        if (zzndVar.zzL()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = zzndVar.zzv();
    }

    private static void zze(Object obj, Object obj2) {
        zzos.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    public final /* synthetic */ zzkn zzb(zzko zzkoVar) {
        zzh((zznd) zzkoVar);
        return this;
    }

    /* renamed from: zzg, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzmx zza() {
        zzmx zzmxVar = (zzmx) this.zzb.zzh(5, null, null);
        zzmxVar.zza = zzl();
        return zzmxVar;
    }

    public final zzmx zzh(zznd zzndVar) {
        if (!this.zzb.equals(zzndVar)) {
            if (!this.zza.zzL()) {
                zzo();
            }
            zze(this.zza, zzndVar);
        }
        return this;
    }

    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zznd zzk() {
        zznd zzl = zzl();
        if (zznd.zzK(zzl, true)) {
            return zzl;
        }
        throw new zzpk(zzl);
    }

    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public zznd zzl() {
        if (!this.zza.zzL()) {
            return this.zza;
        }
        this.zza.zzG();
        return this.zza;
    }

    public final /* synthetic */ zzoi zzm() {
        return this.zzb;
    }

    public final void zzn() {
        if (this.zza.zzL()) {
            return;
        }
        zzo();
    }

    public void zzo() {
        zznd zzv = this.zzb.zzv();
        zze(zzv, this.zza);
        this.zza = zzv;
    }

    public final boolean zzp() {
        return zznd.zzK(this.zza, false);
    }
}
