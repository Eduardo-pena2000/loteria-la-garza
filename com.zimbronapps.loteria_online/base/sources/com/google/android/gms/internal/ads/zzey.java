package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzey {
    final /* synthetic */ zzfa zza;
    private final int zzb;
    private Object zzc;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;

    public zzey(zzfa zzfaVar, int i) {
        Objects.requireNonNull(zzfaVar);
        this.zza = zzfaVar;
        this.zzb = i;
    }

    public final void zza() {
        long zzt;
        zzfa zzfaVar = this.zza;
        zzbf zzq = zzfaVar.zzd().zzq();
        Object zzf = zzq.zzg() ? null : zzq.zzf(zzfaVar.zzd().zzr());
        zzbb zzd = zzfaVar.zzd();
        zzbb zzd2 = zzfaVar.zzd();
        zzbb zzd3 = zzfaVar.zzd();
        int zzy = zzd.zzy();
        int zzz = zzd2.zzz();
        long zzu = zzd3.zzu();
        if (zzf == null || zzy != -1) {
            zzt = zzy != -1 ? zzfaVar.zzd().zzt() : -9223372036854775807L;
        } else {
            zzq.zzo(zzf, zzfaVar.zzf());
            zzu -= zzfj.zzp(0L);
            zzt = zzfj.zzp(zzfaVar.zzf().zzd);
            zzy = -1;
        }
        boolean zza = zzfaVar.zzd().zza();
        if (!zza || zzt == -9223372036854775807L || zzu < zzt) {
            zzfaVar.zzg().zzk(3);
            if (zza && zzt != -9223372036854775807L) {
                zzfaVar.zzg().zzi(3, (int) Math.ceil((zzt - zzu) / zzfaVar.zzd().zzn().zzb));
            }
            this.zzf = false;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzf && Objects.equals(zzf, this.zzc) && zzy == this.zzd && zzz == this.zze) {
            long j = elapsedRealtime - this.zzg;
            int i = this.zzb;
            if (j >= i) {
                zzfaVar.zze().zza(new zzfb(3, i));
                return;
            }
            return;
        }
        this.zzf = true;
        this.zzg = elapsedRealtime;
        this.zzc = zzf;
        this.zzd = zzy;
        this.zze = zzz;
        zzfaVar.zzg().zzk(3);
        zzfaVar.zzg().zzi(3, this.zzb);
    }
}
