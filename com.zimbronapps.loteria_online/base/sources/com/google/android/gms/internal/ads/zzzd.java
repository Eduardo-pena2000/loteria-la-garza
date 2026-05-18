package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzzd implements zzzr {
    private final /* synthetic */ zzzl zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;

    public /* synthetic */ zzzd(zzzl zzzlVar, String str, String str2) {
        this.zza = zzzlVar;
        this.zzb = str;
        this.zzc = str2;
    }

    public final /* synthetic */ List zza(int i, zzbg zzbgVar, int[] iArr) {
        int i2 = zzaaa.zzb;
        int i3 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        for (int i4 = 0; i4 < zzbgVar.zza; i4++) {
            String str = this.zzc;
            int i5 = i4;
            zzgucVar.zzf(new zzzq(i, zzbgVar, i5, this.zza, iArr[i4], this.zzb, str));
        }
        return zzgucVar.zzi();
    }
}
