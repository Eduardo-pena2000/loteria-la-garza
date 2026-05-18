package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzelr implements zzdmc {
    final /* synthetic */ zzcen zza;
    final /* synthetic */ zzfir zzb;
    final /* synthetic */ zzelt zzc;

    public zzelr(zzelt zzeltVar, zzcen zzcenVar, zzfir zzfirVar) {
        this.zza = zzcenVar;
        this.zzb = zzfirVar;
        Objects.requireNonNull(zzeltVar);
        this.zzc = zzeltVar;
    }

    public final void zza(boolean z, Context context, zzdbs zzdbsVar) {
        try {
            R5.t.f();
            U5.A.a(context, (AdOverlayInfoParcel) this.zza.get(), true, this.zzc.zzd());
        } catch (Exception unused) {
        }
    }

    public final zzfir zzb() {
        return this.zzb;
    }
}
