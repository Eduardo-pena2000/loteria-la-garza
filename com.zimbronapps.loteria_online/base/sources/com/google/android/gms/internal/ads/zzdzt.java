package com.google.android.gms.internal.ads;

import S5.l2;
import S5.q2;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdzt implements zzdzi {
    private final long zza;
    private final zzerx zzb;

    public zzdzt(long j, Context context, zzdzm zzdzmVar, zzcma zzcmaVar, String str) {
        this.zza = j;
        zzfgx zzn = zzcmaVar.zzn();
        zzn.zzd(context);
        zzn.zzb(new q2());
        zzn.zzc(str);
        zzerx zza = zzn.zza().zza();
        this.zzb = zza;
        zza.zzdR(new zzdzs(this, zzdzmVar));
    }

    public final void zza(l2 l2Var) {
        this.zzb.zze(l2Var);
    }

    public final void zzb() {
        this.zzb.zzR(N6.b.s1(null));
    }

    public final void zzc() {
        this.zzb.zzc();
    }

    public final /* synthetic */ long zzd() {
        return this.zza;
    }
}
