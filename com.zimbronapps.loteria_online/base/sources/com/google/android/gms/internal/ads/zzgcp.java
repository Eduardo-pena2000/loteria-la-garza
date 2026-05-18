package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgcp implements Comparable {
    final Runnable zza;
    final long zzb;

    public zzgcp(Runnable runnable, long j) {
        this.zza = runnable;
        this.zzb = j;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.zzb, ((zzgcp) obj).zzb);
    }
}
