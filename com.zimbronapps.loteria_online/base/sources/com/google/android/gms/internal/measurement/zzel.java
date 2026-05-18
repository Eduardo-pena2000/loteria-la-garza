package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.t;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzel extends zzeq {
    final /* synthetic */ zzer zza;
    final /* synthetic */ zzfb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzel(zzfb zzfbVar, zzer zzerVar) {
        super(zzfbVar, true);
        this.zza = zzerVar;
        Objects.requireNonNull(zzfbVar);
        this.zzb = zzfbVar;
    }

    public final void zza() throws RemoteException {
        ((zzcr) t.l(this.zzb.zzQ())).setEventInterceptor(this.zza);
    }
}
