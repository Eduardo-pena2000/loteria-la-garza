package com.google.android.gms.internal.ads;

import V5.o0;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzegh implements zzgzl {
    final /* synthetic */ zzbzu zza;
    final /* synthetic */ zzbzl zzb;

    public zzegh(zzegw zzegwVar, zzbzu zzbzuVar, zzbzl zzbzlVar) {
        this.zza = zzbzuVar;
        this.zzb = zzbzlVar;
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
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            if (!((Boolean) S5.D.c().zzd(zzbhe.zzcK)).booleanValue()) {
                this.zzb.zze(parcelFileDescriptor);
                return;
            }
            if (((Boolean) S5.D.c().zzd(zzbhe.zzcL)).booleanValue() && (bundle = this.zza.zzm) != null) {
                bundle.putLong(zzdxh.BINDER_CALL_START.zza(), R5.t.o().a());
            }
            this.zzb.zzg(parcelFileDescriptor, this.zza);
        } catch (RemoteException e) {
            o0.l("Service can't call client", e);
        }
    }
}
