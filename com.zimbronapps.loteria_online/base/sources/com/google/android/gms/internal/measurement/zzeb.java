package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.t;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzeb extends zzeq {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzco zzd;
    final /* synthetic */ zzfb zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzfb zzfbVar, String str, String str2, boolean z, zzco zzcoVar) {
        super(zzfbVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = z;
        this.zzd = zzcoVar;
        Objects.requireNonNull(zzfbVar);
        this.zze = zzfbVar;
    }

    public final void zza() throws RemoteException {
        ((zzcr) t.l(this.zze.zzQ())).getUserProperties(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final void zzb() {
        this.zzd.zzb(null);
    }
}
