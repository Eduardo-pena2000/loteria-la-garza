package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgmj implements zzgmg {
    private final zzgct zza;
    private final zzgct zzb;
    private final zzika zzc;
    private final zzgoe zzd;

    public zzgmj(zzgct zzgctVar, zzgct zzgctVar2, zzika zzikaVar, zzgoe zzgoeVar) {
        this.zza = zzgctVar;
        this.zzb = zzgctVar2;
        this.zzc = zzikaVar;
        this.zzd = zzgoeVar;
    }

    private final x7.e zzh(zzgdu zzgduVar) {
        x7.e zzc = this.zza.zzc(zzgduVar);
        this.zzd.zze(20303, zzc);
        return zzc;
    }

    private final x7.e zzi(byte[] bArr) {
        x7.e zzc = this.zzb.zzc(bArr);
        this.zzd.zze(20305, zzc);
        return zzc;
    }

    public final x7.e zza() {
        return zzgzo.zza(Boolean.TRUE);
    }

    public final x7.e zzb() {
        x7.e zzb = this.zza.zzb();
        this.zzd.zze(20302, zzb);
        return zzb;
    }

    public final x7.e zzc(zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        x7.e zzc = ((zzgct) this.zzc.zzb()).zzc(bArr);
        this.zzd.zze(20307, zzc);
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzgzo.zzl(zzc, zzi(bArr2))), new zzgmh(this, zzgduVar), zzhaf.zza());
    }

    public final x7.e zzd(zzgdu zzgduVar, byte[] bArr) {
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzi(bArr)), new zzgmi(this, zzgduVar), zzhaf.zza());
    }

    public final x7.e zze() {
        x7.e zzb = this.zzb.zzb();
        this.zzd.zze(20304, zzb);
        return zzb;
    }

    public final /* synthetic */ x7.e zzf(zzgdu zzgduVar, Void r2) {
        return zzh(zzgduVar);
    }

    public final /* synthetic */ x7.e zzg(zzgdu zzgduVar, List list) {
        return zzh(zzgduVar);
    }
}
