package com.google.android.gms.internal.measurement;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zznd implements zzny {
    private static final zznk zzb = new zznb();
    private final zznk zza;

    public zznd() {
        zzma zza = zzma.zza();
        int i = zznu.zza;
        zznc zzncVar = new zznc(zza, zzb);
        byte[] bArr = zzmp.zzb;
        this.zza = zzncVar;
    }

    public final zznx zza(Class cls) {
        int i = zznz.zza;
        if (!zzmf.class.isAssignableFrom(cls)) {
            int i2 = zznu.zza;
        }
        zznj zzc = this.zza.zzc(cls);
        if (zzc.zza()) {
            int i3 = zznu.zza;
            return zznq.zzg(zznz.zzA(), zzlu.zza(), zzc.zzb());
        }
        int i4 = zznu.zza;
        return zznp.zzl(cls, zzc, zzns.zza(), zzmz.zza(), zznz.zzA(), zzc.zzc() + (-1) != 1 ? zzlu.zza() : null, zzni.zza());
    }
}
