package com.google.android.gms.internal.ads;

import S5.c1;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzemi extends zzbvi {
    private final zzekj zza;

    public /* synthetic */ zzemi(zzemj zzemjVar, zzekj zzekjVar, byte[] bArr) {
        Objects.requireNonNull(zzemjVar);
        this.zza = zzekjVar;
    }

    public final void zze() throws RemoteException {
        ((zzelv) this.zza.zzc).zzj();
    }

    public final void zzf(String str) throws RemoteException {
        ((zzelv) this.zza.zzc).zzw(0, str);
    }

    public final void zzg(c1 c1Var) throws RemoteException {
        ((zzelv) this.zza.zzc).zzx(c1Var);
    }
}
