package com.google.android.gms.internal.ads;

import S5.c1;
import android.os.RemoteException;
import android.view.View;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzelo extends zzbvf {
    final /* synthetic */ zzelp zza;
    private final zzekj zzb;

    public /* synthetic */ zzelo(zzelp zzelpVar, zzekj zzekjVar, byte[] bArr) {
        Objects.requireNonNull(zzelpVar);
        this.zza = zzelpVar;
        this.zzb = zzekjVar;
    }

    public final void zze(N6.a aVar) throws RemoteException {
        this.zza.zzd((View) N6.b.r1(aVar));
        ((zzelv) this.zzb.zzc).zzj();
    }

    public final void zzf(String str) throws RemoteException {
        ((zzelv) this.zzb.zzc).zzw(0, str);
    }

    public final void zzg(c1 c1Var) throws RemoteException {
        ((zzelv) this.zzb.zzc).zzx(c1Var);
    }

    public final void zzh(zzbuc zzbucVar) throws RemoteException {
        this.zza.zze(zzbucVar);
        ((zzelv) this.zzb.zzc).zzj();
    }
}
