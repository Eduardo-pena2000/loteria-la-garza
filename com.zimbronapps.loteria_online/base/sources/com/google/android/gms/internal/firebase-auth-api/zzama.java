package com.google.android.gms.internal.firebase-auth-api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzama implements zzane {
    private static final zzamj zza = new zzalz();
    private final zzamj zzb;

    public zzama() {
        this(new zzamb(zzalg.zza(), zza));
    }

    public final zzanb zza(Class cls) {
        zzand.zza(cls);
        zzamk zza2 = this.zzb.zza(cls);
        if (zza2.zzc()) {
            return zzams.zza(zzand.zza(), zzaky.zza(), zza2.zza());
        }
        return zzamq.zza(cls, zza2, zzamw.zza(), zzaly.zza(), zzand.zza(), zzamc.zza[zza2.zzb().ordinal()] != 1 ? zzaky.zza() : null, zzamh.zza());
    }

    private zzama(zzamj zzamjVar) {
        this.zzb = (zzamj) zzalh.zza(zzamjVar, "messageInfoFactory");
    }
}
