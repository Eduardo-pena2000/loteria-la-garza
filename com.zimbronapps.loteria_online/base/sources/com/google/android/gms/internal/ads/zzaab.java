package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaab {
    public final zzbg zza;
    public final int[] zzb;

    public zzaab(zzbg zzbgVar, int[] iArr, int i) {
        if (iArr.length == 0) {
            zzee.zzf("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzbgVar;
        this.zzb = iArr;
    }
}
