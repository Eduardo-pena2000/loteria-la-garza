package com.google.android.gms.internal.ads;

import S5.g1;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzeln implements zzcwd {
    private final /* synthetic */ zzekj zza;

    public /* synthetic */ zzeln(zzekj zzekjVar) {
        this.zza = zzekjVar;
    }

    public final /* synthetic */ g1 zza() {
        try {
            return ((zzbvs) this.zza.zzb).zzh();
        } catch (RemoteException e) {
            throw new zzfjr(e);
        }
    }
}
