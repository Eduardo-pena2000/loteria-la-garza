package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzenp implements zzgzl {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfiu zzb;
    final /* synthetic */ zzfir zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfqg zze;
    final /* synthetic */ zzfjc zzf;
    final /* synthetic */ zzenr zzg;

    public zzenp(zzenr zzenrVar, long j, zzfiu zzfiuVar, zzfir zzfirVar, String str, zzfqg zzfqgVar, zzfjc zzfjcVar) {
        this.zza = j;
        this.zzb = zzfiuVar;
        this.zzc = zzfirVar;
        this.zzd = str;
        this.zze = zzfqgVar;
        this.zzf = zzfjcVar;
        Objects.requireNonNull(zzenrVar);
        this.zzg = zzenrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0062 A[PHI: r8
      0x0062: PHI (r8v1 int) = (r8v0 int), (r8v3 int), (r8v3 int), (r8v3 int) binds: [B:47:0x002f, B:52:0x004a, B:54:0x004e, B:56:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.Throwable r17) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzenp.zza(java.lang.Throwable):void");
    }

    public final void zzb(Object obj) {
        zzenr zzenrVar = this.zzg;
        long b = zzenrVar.zzj().b() - this.zza;
        synchronized (zzenrVar) {
            try {
                if (zzenrVar.zzn()) {
                    zzenrVar.zzk().zza(this.zzb, this.zzc, 0, null, b);
                }
                if (zzenrVar.zzp()) {
                    return;
                }
                zzfir zzfirVar = this.zzc;
                if (zzenrVar.zzi(zzfirVar)) {
                    ((zzenq) zzenrVar.zzm().get(zzfirVar)).zzd = b;
                } else {
                    zzenrVar.zzm().put(zzfirVar, new zzenq(this.zzd, zzfirVar.zzaf, 0, b, null));
                }
                zzenrVar.zzo().zzd(zzfirVar, b, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
