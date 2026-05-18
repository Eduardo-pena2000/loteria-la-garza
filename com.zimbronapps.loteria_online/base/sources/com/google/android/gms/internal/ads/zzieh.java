package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzieh extends zzief {
    public final /* bridge */ /* synthetic */ void zza(Object obj, int i, long j) {
        ((zzieg) obj).zzk(i << 3, Long.valueOf(j));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj, int i, int i2) {
        ((zzieg) obj).zzk((i << 3) | 5, Integer.valueOf(i2));
    }

    public final /* bridge */ /* synthetic */ void zzc(Object obj, int i, long j) {
        ((zzieg) obj).zzk((i << 3) | 1, Long.valueOf(j));
    }

    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i, zzian zzianVar) {
        ((zzieg) obj).zzk((i << 3) | 2, zzianVar);
    }

    public final /* bridge */ /* synthetic */ void zze(Object obj, int i, Object obj2) {
        ((zzieg) obj).zzk((i << 3) | 3, (zzieg) obj2);
    }

    public final /* synthetic */ Object zzf() {
        return zzieg.zzb();
    }

    public final /* synthetic */ Object zzg(Object obj) {
        zzieg zziegVar = (zzieg) obj;
        zziegVar.zzd();
        return zziegVar;
    }

    public final /* bridge */ /* synthetic */ Object zzh(Object obj) {
        zzibr zzibrVar = (zzibr) obj;
        zzieg zziegVar = zzibrVar.zzt;
        if (zziegVar != zzieg.zza()) {
            return zziegVar;
        }
        zzieg zzb = zzieg.zzb();
        zzibrVar.zzt = zzb;
        return zzb;
    }

    public final /* synthetic */ void zzi(Object obj, Object obj2) {
        ((zzibr) obj).zzt = (zzieg) obj2;
    }

    public final void zzj(Object obj) {
        ((zzibr) obj).zzt.zzd();
    }
}
