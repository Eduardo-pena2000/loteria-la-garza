package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzefy implements zzeek {
    final /* synthetic */ zzegb zza;

    public zzefy(zzegb zzegbVar) {
        Objects.requireNonNull(zzegbVar);
        this.zza = zzegbVar;
    }

    public final void zza() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzpB)).booleanValue()) {
            zzdxy zza = this.zza.zzd().zza();
            zza.zzc("action", "ptard");
            zza.zzc("ptard", "r");
            zza.zzd();
        }
    }

    public final void zzb(RemoteException remoteException) {
        this.zza.zzc();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzpC)).booleanValue()) {
            R5.t.l().zzg(remoteException, "Preconnect Remote");
        }
    }
}
