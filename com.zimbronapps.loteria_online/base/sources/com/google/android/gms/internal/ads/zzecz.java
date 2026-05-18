package com.google.android.gms.internal.ads;

import V5.F0;
import android.os.Binder;
import android.os.Bundle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzecz {
    private final zzgzy zza;
    private final zzgzy zzb;
    private final zzeej zzc;
    private final zzika zzd;

    public zzecz(zzgzy zzgzyVar, zzgzy zzgzyVar2, zzeej zzeejVar, zzika zzikaVar) {
        this.zza = zzgzyVar;
        this.zzb = zzgzyVar2;
        this.zzc = zzeejVar;
        this.zzd = zzikaVar;
    }

    public final x7.e zza(zzbzu zzbzuVar) {
        x7.e zzh;
        String str = zzbzuVar.zzd;
        R5.t.g();
        if (F0.h(str)) {
            zzh = zzgzo.zzc(new zzeff(1));
        } else {
            zzh = zzgzo.zzh(this.zza.submit(new zzecy(this, zzbzuVar)), ExecutionException.class, zzecv.zza, this.zzb);
        }
        return zzgzo.zzh(zzh, zzeff.class, new zzecw(this, zzbzuVar, Binder.getCallingUid()), this.zzb);
    }

    public final /* synthetic */ zzefg zzb(zzbzu zzbzuVar) {
        return (zzefg) this.zzc.zza(zzbzuVar).get(((Integer) S5.D.c().zzd(zzbhe.zzgC)).intValue(), TimeUnit.SECONDS);
    }

    public final /* synthetic */ x7.e zzc(zzbzu zzbzuVar, int i, zzeff zzeffVar) {
        Bundle bundle;
        if (zzbzuVar != null && (bundle = zzbzuVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgzo.zzj(((zzegw) this.zzd.zzb()).zzb(zzbzuVar, i), new zzecx(zzbzuVar), this.zzb);
    }
}
