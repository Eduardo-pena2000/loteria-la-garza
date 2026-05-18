package com.google.android.recaptcha.internal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzpn extends zzpl {
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar != zzpm.zzc()) {
            return zzpmVar;
        }
        zzpm zzf = zzpm.zzf();
        zzndVar.zzc = zzf;
        return zzf;
    }

    public final /* synthetic */ Object zzb() {
        return zzpm.zzf();
    }

    public final /* synthetic */ Object zzc(Object obj) {
        zzpm zzpmVar = (zzpm) obj;
        zzpmVar.zzh();
        return zzpmVar;
    }

    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i, int i2) {
        ((zzpm) obj).zzj((i << 3) | 5, Integer.valueOf(i2));
    }

    public final /* bridge */ /* synthetic */ void zze(Object obj, int i, long j) {
        ((zzpm) obj).zzj((i << 3) | 1, Long.valueOf(j));
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i, Object obj2) {
        ((zzpm) obj).zzj((i << 3) | 3, (zzpm) obj2);
    }

    public final /* bridge */ /* synthetic */ void zzg(Object obj, int i, zzle zzleVar) {
        ((zzpm) obj).zzj((i << 3) | 2, zzleVar);
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i, long j) {
        ((zzpm) obj).zzj(i << 3, Long.valueOf(j));
    }

    public final void zzi(Object obj) {
        ((zznd) obj).zzc.zzh();
    }

    public final /* synthetic */ void zzj(Object obj, Object obj2) {
        ((zznd) obj).zzc = (zzpm) obj2;
    }
}
