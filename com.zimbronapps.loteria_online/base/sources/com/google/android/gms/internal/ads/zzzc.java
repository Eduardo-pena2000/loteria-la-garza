package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzzc implements zzzr {
    private final /* synthetic */ zzaaa zza;
    private final /* synthetic */ zzzl zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ int[] zzd;

    public /* synthetic */ zzzc(zzaaa zzaaaVar, zzzl zzzlVar, boolean z, int[] iArr) {
        this.zza = zzaaaVar;
        this.zzb = zzzlVar;
        this.zzc = z;
        this.zzd = iArr;
    }

    public final /* synthetic */ List zza(int i, zzbg zzbgVar, int[] iArr) {
        zzzc zzzcVar = this;
        zzaaa zzaaaVar = zzzcVar.zza;
        zzzl zzzlVar = zzzcVar.zzb;
        zzzf zzzfVar = new zzzf(zzaaaVar, zzzlVar);
        int i2 = zzzcVar.zzd[i];
        int i3 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        int i4 = 0;
        while (i4 < zzbgVar.zza) {
            zzgucVar.zzf(new zzyx(i, zzbgVar, i4, zzzlVar, iArr[i4], zzzcVar.zzc, zzzfVar, i2));
            i4++;
            zzzcVar = this;
        }
        return zzgucVar.zzi();
    }
}
