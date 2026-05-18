package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzex {
    final /* synthetic */ zzfa zza;
    private final int zzb;
    private Object zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private boolean zzg;
    private long zzh;

    public zzex(zzfa zzfaVar, int i) {
        Objects.requireNonNull(zzfaVar);
        this.zza = zzfaVar;
        this.zzb = i;
    }

    public final void zza() {
        zzfa zzfaVar = this.zza;
        if (!zzfaVar.zzd().zza()) {
            if (this.zzg) {
                zzfaVar.zzg().zzk(2);
            }
            this.zzg = false;
            return;
        }
        zzbf zzq = zzfaVar.zzd().zzq();
        Object zzf = zzq.zzg() ? null : zzq.zzf(zzfaVar.zzd().zzr());
        zzbb zzd = zzfaVar.zzd();
        zzbb zzd2 = zzfaVar.zzd();
        zzbb zzd3 = zzfaVar.zzd();
        int zzy = zzd.zzy();
        int zzz = zzd2.zzz();
        long zzu = zzd3.zzu();
        if (zzf != null && zzy == -1) {
            zzq.zzo(zzf, zzfaVar.zzf());
            zzu -= zzfj.zzp(0L);
            zzy = -1;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzg && Objects.equals(zzf, this.zzc) && zzy == this.zzd && zzz == this.zze && zzu == this.zzf) {
            long j = elapsedRealtime - this.zzh;
            int i = this.zzb;
            if (j >= i) {
                zzfaVar.zze().zza(new zzfb(2, i));
                return;
            }
            return;
        }
        this.zzg = true;
        this.zzh = elapsedRealtime;
        this.zzc = zzf;
        this.zzd = zzy;
        this.zze = zzz;
        this.zzf = zzu;
        zzfaVar.zzg().zzk(2);
        zzfaVar.zzg().zzi(2, this.zzb);
    }
}
