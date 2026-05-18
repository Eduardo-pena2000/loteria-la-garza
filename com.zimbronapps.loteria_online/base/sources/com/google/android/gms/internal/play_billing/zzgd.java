package com.google.android.gms.internal.play_billing;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzgd implements zzgw {
    private static final zzgj zza = new zzgb();
    private final zzgj zzb;

    public zzgd() {
        zzfd zza2 = zzfd.zza();
        int i = zzgs.zza;
        zzgc zzgcVar = new zzgc(zza2, zza);
        byte[] bArr = zzfo.zzb;
        this.zzb = zzgcVar;
    }

    public final zzgv zza(Class cls) {
        int i = zzgx.zza;
        if (!zzfi.class.isAssignableFrom(cls)) {
            int i2 = zzgs.zza;
        }
        zzgi zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            int i3 = zzgs.zza;
            return zzgp.zzc(zzgx.zzm(), zzex.zza(), zzb.zza());
        }
        int i4 = zzgs.zza;
        return zzgo.zzl(cls, zzb, zzgr.zza(), zzfz.zza(), zzgx.zzm(), zzb.zzc() + (-1) != 1 ? zzex.zza() : null, zzgh.zza());
    }
}
