package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzanu implements Comparable {
    public final int zza;
    public final zzanp zzb;

    public zzanu(int i, zzanp zzanpVar) {
        this.zza = i;
        this.zzb = zzanpVar;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzanu) obj).zza);
    }
}
