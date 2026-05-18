package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.t;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzee extends zzeq {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzco zzb;
    final /* synthetic */ zzfb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzee(zzfb zzfbVar, Bundle bundle, zzco zzcoVar) {
        super(zzfbVar, true);
        this.zza = bundle;
        this.zzb = zzcoVar;
        Objects.requireNonNull(zzfbVar);
        this.zzc = zzfbVar;
    }

    public final void zza() throws RemoteException {
        ((zzcr) t.l(this.zzc.zzQ())).performAction(this.zza, this.zzb, this.zzh);
    }

    public final void zzb() {
        this.zzb.zzb(null);
    }
}
