package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzans {
    private static final Comparator zza = zzanr.zza;
    private final zzant zzb;
    private final int zzc;

    public /* synthetic */ zzans(zzant zzantVar, int i, byte[] bArr) {
        this.zzb = zzantVar;
        this.zzc = i;
    }

    public static /* synthetic */ int zza(zzans zzansVar, zzans zzansVar2) {
        return Integer.compare(zzansVar.zzb.zzb, zzansVar2.zzb.zzb);
    }

    public static /* synthetic */ Comparator zzb() {
        return zza;
    }

    public final /* synthetic */ zzant zzc() {
        return this.zzb;
    }

    public final /* synthetic */ int zzd() {
        return this.zzc;
    }
}
