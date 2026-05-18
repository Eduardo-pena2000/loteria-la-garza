package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzevg implements zzfax {
    private final zzffr zza;

    public zzevg(zzffr zzffrVar) {
        this.zza = zzffrVar;
    }

    public final x7.e zza() {
        zzffr zzffrVar = this.zza;
        if (zzffrVar == null) {
            return zzgzo.zza(new zzevf(null));
        }
        String zza = zzffrVar.zza();
        return E6.v.b(zza) ? zzgzo.zza(new zzevf(null)) : zzgzo.zza(new zzevf(zza));
    }

    public final int zzb() {
        return 15;
    }
}
