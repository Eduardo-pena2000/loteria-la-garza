package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.t;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdv extends zzeq {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzfb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdv(zzfb zzfbVar, Runnable runnable) {
        super(zzfbVar, true);
        this.zza = runnable;
        Objects.requireNonNull(zzfbVar);
        this.zzb = zzfbVar;
    }

    public final void zza() throws RemoteException {
        ((zzcr) t.l(this.zzb.zzQ())).retrieveAndUploadBatches(new zzdu(this, this.zza));
    }
}
