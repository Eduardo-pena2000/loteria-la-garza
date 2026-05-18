package com.google.android.gms.internal.ads;

import V5.F0;
import android.os.Binder;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzefr {
    private final zzgzy zza;
    private final zzeew zzb;
    private final zzika zzc;

    public zzefr(zzgzy zzgzyVar, zzeew zzeewVar, zzika zzikaVar) {
        this.zza = zzgzyVar;
        this.zzb = zzeewVar;
        this.zzc = zzikaVar;
    }

    private final x7.e zzg(zzbzu zzbzuVar, zzefh zzefhVar, zzefh zzefhVar2, zzgyw zzgywVar) {
        x7.e zzh;
        String str = zzbzuVar.zzd;
        R5.t.g();
        if (F0.h(str)) {
            zzh = zzgzo.zzc(new zzeff(1));
        } else {
            zzh = zzgzo.zzh(zzefhVar.zza(zzbzuVar), ExecutionException.class, zzefq.zza, this.zza);
        }
        zzgzy zzgzyVar = this.zza;
        return (zzgzg) zzgzo.zzh((zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzj(zzgzg.zzw(zzh), zzefj.zza, zzgzyVar), zzgywVar, zzgzyVar), zzeff.class, new zzefk(this, zzefhVar2, zzbzuVar, zzgywVar), zzgzyVar);
    }

    public final x7.e zza(zzbzu zzbzuVar) {
        zzefl zzeflVar = new zzefl(zzbzuVar);
        zzeew zzeewVar = this.zzb;
        Objects.requireNonNull(zzeewVar);
        return zzg(zzbzuVar, new zzefi(zzeewVar), new zzefm(this), zzeflVar);
    }

    public final x7.e zzb(zzbzu zzbzuVar) {
        return zzg(zzbzuVar, new zzefo(this), new zzefp(this), zzefn.zza);
    }

    public final /* synthetic */ x7.e zzc(zzefh zzefhVar, zzbzu zzbzuVar, zzgyw zzgywVar, zzeff zzeffVar) {
        return zzgzo.zzj(zzefhVar.zza(zzbzuVar), zzgywVar, this.zza);
    }

    public final /* synthetic */ x7.e zzd(zzbzu zzbzuVar) {
        return ((zzegw) this.zzc.zzb()).zzc(zzbzuVar, Binder.getCallingUid());
    }

    public final /* synthetic */ x7.e zze(zzbzu zzbzuVar) {
        return this.zzb.zzd(zzbzuVar.zzh);
    }

    public final /* synthetic */ x7.e zzf(zzbzu zzbzuVar) {
        return ((zzegw) this.zzc.zzb()).zzd(zzbzuVar.zzh);
    }
}
