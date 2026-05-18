package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzsn implements zzqa {
    final /* synthetic */ zzsw zza;
    private final zzql zzb;

    public /* synthetic */ zzsn(zzsw zzswVar, zzql zzqlVar, byte[] bArr) {
        Objects.requireNonNull(zzswVar);
        this.zza = zzswVar;
        this.zzb = zzqlVar;
    }

    public final void zza(long j) {
        zzsw zzswVar = this.zza;
        if (equals(zzswVar.zzI()) && zzswVar.zzJ() != null) {
            ((zzsz) zzswVar.zzJ()).zza.zzaw().zzd(j);
        }
    }

    public final void zzb() {
        zzmk zzat;
        zzsw zzswVar = this.zza;
        if (equals(zzswVar.zzI()) && zzswVar.zzJ() != null && zzswVar.zzN() && (zzat = zzta.zzat(((zzsz) zzswVar.zzJ()).zza)) != null) {
            zzat.zza();
        }
    }

    public final void zzc() {
        zzsw zzswVar = this.zza;
        if (equals(zzswVar.zzI())) {
            zzswVar.zzM(true);
        }
    }

    public final void zzd() {
        long j;
        zzsw zzswVar = this.zza;
        if (equals(zzswVar.zzI()) && zzswVar.zzJ() != null) {
            if (zzswVar.zzK().zzj() != -1) {
                long zzj = zzswVar.zzK().zzk().zze / zzswVar.zzK().zzj();
                zzqc zzL = zzswVar.zzL();
                zzL.getClass();
                j = zzfj.zzr(zzj, zzL.zzi());
            } else {
                j = -9223372036854775807L;
            }
            ((zzsz) zzswVar.zzJ()).zza.zzaw().zze(zzswVar.zzK().zzk().zze, zzfj.zzp(j), SystemClock.elapsedRealtime() - zzswVar.zzO());
        }
    }

    public final void zze() {
        zzsw.zzH().getAndDecrement();
        zzsw zzswVar = this.zza;
        if (zzswVar.zzJ() != null) {
            zzql zzqlVar = this.zzb;
            ((zzsz) zzswVar.zzJ()).zza.zzaw().zzl(new zzrd(zzqlVar.zza, zzqlVar.zzb, zzqlVar.zzc, false, false, zzqlVar.zze));
        }
    }
}
