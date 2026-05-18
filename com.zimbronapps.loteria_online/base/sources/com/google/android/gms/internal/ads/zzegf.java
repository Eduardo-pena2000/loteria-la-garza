package com.google.android.gms.internal.ads;

import V5.o0;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzegf implements zzgzl {
    final /* synthetic */ zzbzd zza;
    final /* synthetic */ zzbzm zzb;

    public zzegf(zzegw zzegwVar, zzbzm zzbzmVar, zzbzd zzbzdVar) {
        this.zzb = zzbzmVar;
        this.zza = zzbzdVar;
        Objects.requireNonNull(zzegwVar);
    }

    public final void zza(Throwable th) {
        try {
            this.zzb.zzf(V5.C.M1(th));
        } catch (RemoteException e) {
            o0.l("Service can't call client", e);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zzb.zze((String) obj, this.zza);
        } catch (RemoteException e) {
            o0.l("Service can't call client", e);
        }
    }
}
