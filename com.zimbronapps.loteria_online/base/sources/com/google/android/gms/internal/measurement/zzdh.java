package com.google.android.gms.internal.measurement;

import N6.b;
import android.os.RemoteException;
import com.google.android.gms.common.internal.t;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdh extends zzeq {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzfb zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzfb zzfbVar, String str, String str2, Object obj, boolean z) {
        super(zzfbVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = z;
        Objects.requireNonNull(zzfbVar);
        this.zze = zzfbVar;
    }

    public final void zza() throws RemoteException {
        ((zzcr) t.l(this.zze.zzQ())).setUserProperty(this.zza, this.zzb, b.s1(this.zzc), this.zzd, this.zzh);
    }
}
