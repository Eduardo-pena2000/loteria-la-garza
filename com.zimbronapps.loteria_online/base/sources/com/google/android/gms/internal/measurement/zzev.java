package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.t;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzev extends zzeq {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzfa zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzev(zzfa zzfaVar, Activity activity) {
        super(zzfaVar.zza, true);
        this.zza = activity;
        Objects.requireNonNull(zzfaVar);
        this.zzb = zzfaVar;
    }

    public final void zza() throws RemoteException {
        ((zzcr) t.l(this.zzb.zza.zzQ())).onActivityResumedByScionActivityInfo(zzdf.zza(this.zza), this.zzi);
    }
}
