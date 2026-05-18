package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzze implements zzzr {
    private final /* synthetic */ zzzl zza;

    public /* synthetic */ zzze(zzzl zzzlVar) {
        this.zza = zzzlVar;
    }

    public final /* synthetic */ List zza(int i, zzbg zzbgVar, int[] iArr) {
        int i2 = zzaaa.zzb;
        int i3 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        for (int i4 = 0; i4 < zzbgVar.zza; i4++) {
            zzgucVar.zzf(new zzzi(i, zzbgVar, i4, this.zza, iArr[i4]));
        }
        return zzgucVar.zzi();
    }
}
