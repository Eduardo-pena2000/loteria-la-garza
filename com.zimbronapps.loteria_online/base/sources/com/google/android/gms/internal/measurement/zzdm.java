package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.t;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdm extends zzeq {
    final /* synthetic */ zzdf zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzfb zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdm(zzfb zzfbVar, zzdf zzdfVar, String str, String str2) {
        super(zzfbVar, true);
        this.zza = zzdfVar;
        this.zzb = str;
        this.zzc = str2;
        Objects.requireNonNull(zzfbVar);
        this.zzd = zzfbVar;
    }

    public final void zza() throws RemoteException {
        ((zzcr) t.l(this.zzd.zzQ())).setCurrentScreenByScionActivityInfo(this.zza, this.zzb, this.zzc, this.zzh);
    }
}
