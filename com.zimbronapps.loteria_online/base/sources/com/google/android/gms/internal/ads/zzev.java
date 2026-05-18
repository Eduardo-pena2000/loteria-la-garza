package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzev {
    final /* synthetic */ zzfa zza;
    private final int zzb;
    private Object zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;

    public zzev(zzfa zzfaVar, int i) {
        Objects.requireNonNull(zzfaVar);
        this.zza = zzfaVar;
        this.zzb = i;
    }

    public final void zza() {
        zzfa zzfaVar = this.zza;
        if (zzfaVar.zzd().zzh() != 2 || !zzfaVar.zzd().zzk() || zzfaVar.zzd().zzi() != 0) {
            if (this.zzh) {
                zzfaVar.zzg().zzk(1);
            }
            this.zzh = false;
            return;
        }
        zzbf zzq = zzfaVar.zzd().zzq();
        Object zzf = zzq.zzg() ? null : zzq.zzf(zzfaVar.zzd().zzr());
        zzbb zzd = zzfaVar.zzd();
        zzbb zzd2 = zzfaVar.zzd();
        zzbb zzd3 = zzfaVar.zzd();
        zzbb zzd4 = zzfaVar.zzd();
        int zzy = zzd.zzy();
        int zzz = zzd2.zzz();
        long zzv = zzd3.zzv();
        long max = Math.max(0L, zzfaVar.zzd().zzw() - Math.max(0L, zzv - zzd4.zzu()));
        if (zzf != null && zzy == -1) {
            zzq.zzo(zzf, zzfaVar.zzf());
            zzv -= zzfj.zzp(0L);
            zzy = -1;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzh && Objects.equals(zzf, this.zzc) && zzy == this.zzd && zzz == this.zze && zzv == this.zzf && max == this.zzg) {
            long j = elapsedRealtime - this.zzi;
            int i = this.zzb;
            if (j >= i) {
                zzfaVar.zze().zza(new zzfb(1, i));
                return;
            }
            return;
        }
        this.zzh = true;
        this.zzi = elapsedRealtime;
        this.zzc = zzf;
        this.zzd = zzy;
        this.zze = zzz;
        this.zzf = zzv;
        this.zzg = max;
        zzfaVar.zzg().zzk(1);
        zzfaVar.zzg().zzi(1, this.zzb);
    }
}
