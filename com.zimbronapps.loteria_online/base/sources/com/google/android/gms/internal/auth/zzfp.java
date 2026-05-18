package com.google.android.gms.internal.auth;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfp implements zzgj {
    private static final zzfv zza = new zzfn();
    private final zzfv zzb;

    public zzfp() {
        zzfv zzfvVar;
        zzes zza2 = zzes.zza();
        try {
            zzfvVar = (zzfv) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            zzfvVar = zza;
        }
        zzfo zzfoVar = new zzfo(zza2, zzfvVar);
        byte[] bArr = zzfa.zzd;
        this.zzb = zzfoVar;
    }

    private static boolean zzb(zzfu zzfuVar) {
        return zzfuVar.zzc() + (-1) != 1;
    }

    public final zzgi zza(Class cls) {
        zzgk.zze(cls);
        zzfu zzb = this.zzb.zzb(cls);
        return zzb.zzb() ? zzev.class.isAssignableFrom(cls) ? zzgb.zzb(zzgk.zzb(), zzeo.zzb(), zzb.zza()) : zzgb.zzb(zzgk.zza(), zzeo.zza(), zzb.zza()) : zzev.class.isAssignableFrom(cls) ? zzb(zzb) ? zzga.zzj(cls, zzb, zzgd.zzb(), zzfl.zzd(), zzgk.zzb(), zzeo.zzb(), zzft.zzb()) : zzga.zzj(cls, zzb, zzgd.zzb(), zzfl.zzd(), zzgk.zzb(), null, zzft.zzb()) : zzb(zzb) ? zzga.zzj(cls, zzb, zzgd.zza(), zzfl.zzc(), zzgk.zza(), zzeo.zza(), zzft.zza()) : zzga.zzj(cls, zzb, zzgd.zza(), zzfl.zzc(), zzgk.zza(), null, zzft.zza());
    }
}
