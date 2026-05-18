package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.t;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzei extends zzeq {
    final /* synthetic */ zzco zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzei(zzfb zzfbVar, zzco zzcoVar, int i) {
        super(zzfbVar, true);
        this.zza = zzcoVar;
        this.zzb = i;
        Objects.requireNonNull(zzfbVar);
        this.zzc = zzfbVar;
    }

    public final void zza() throws RemoteException {
        ((zzcr) t.l(this.zzc.zzQ())).getTestFlag(this.zza, this.zzb);
    }

    public final void zzb() {
        this.zza.zzb(null);
    }
}
