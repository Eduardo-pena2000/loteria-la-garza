package com.google.android.gms.internal.ads;

import S5.c1;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzemw extends zzbvl {
    final /* synthetic */ zzemx zza;
    private final zzekj zzb;

    public /* synthetic */ zzemw(zzemx zzemxVar, zzekj zzekjVar, byte[] bArr) {
        Objects.requireNonNull(zzemxVar);
        this.zza = zzemxVar;
        this.zzb = zzekjVar;
    }

    public final void zze(zzbui zzbuiVar) throws RemoteException {
        this.zza.zzc(zzbuiVar);
        ((zzelv) this.zzb.zzc).zzj();
    }

    public final void zzf(String str) throws RemoteException {
        ((zzelv) this.zzb.zzc).zzw(0, str);
    }

    public final void zzg(c1 c1Var) throws RemoteException {
        ((zzelv) this.zzb.zzc).zzx(c1Var);
    }
}
