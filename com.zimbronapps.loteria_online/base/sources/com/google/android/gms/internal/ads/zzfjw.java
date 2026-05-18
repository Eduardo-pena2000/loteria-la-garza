package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfjw implements zzgzl {
    final /* synthetic */ zzfjx zza;
    final /* synthetic */ int zzb;

    public zzfjw(zzfjx zzfjxVar, int i) {
        this.zzb = i;
        Objects.requireNonNull(zzfjxVar);
        this.zza = zzfjxVar;
    }

    public final void zza(Throwable th) {
        R5.t.l().zzg(th, "BufferingUrlPinger.attributionReportingManager");
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzc((String) obj, this.zzb, null);
    }
}
