package com.google.android.recaptcha.internal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzoa implements zzox {
    private static final zzog zza = new zzny();
    private final zzog zzb;

    public zzoa() {
        zzmw zza2 = zzmw.zza();
        int i = zzos.zza;
        zznz zznzVar = new zznz(zza2, zza);
        byte[] bArr = zznl.zzb;
        this.zzb = zznzVar;
    }

    public final zzow zza(Class cls) {
        int i = zzoy.zza;
        if (!zznd.class.isAssignableFrom(cls)) {
            int i2 = zzos.zza;
        }
        zzof zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            int i3 = zzos.zza;
            return zzom.zzc(zzoy.zzm(), zzmr.zza(), zzb.zza());
        }
        int i4 = zzos.zza;
        return zzol.zzm(cls, zzb, zzop.zza(), zznw.zza(), zzoy.zzm(), zzb.zzc() + (-1) != 1 ? zzmr.zza() : null, zzoe.zza());
    }
}
