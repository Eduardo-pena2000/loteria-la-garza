package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbms {
    private final O5.m zza;
    private final O5.l zzb;
    private zzbln zzc;

    public zzbms(O5.m mVar, O5.l lVar) {
        this.zza = mVar;
        this.zzb = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized zzbln zze(zzblm zzblmVar) {
        zzbln zzblnVar = this.zzc;
        if (zzblnVar != null) {
            return zzblnVar;
        }
        zzbln zzblnVar2 = new zzbln(zzblmVar);
        this.zzc = zzblnVar2;
        return zzblnVar2;
    }

    public final zzblz zza() {
        return new zzbmr(this, null);
    }

    public final zzblw zzb() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbmq(this, null);
    }

    public final /* synthetic */ O5.m zzc() {
        return this.zza;
    }

    public final /* synthetic */ O5.l zzd() {
        return this.zzb;
    }
}
