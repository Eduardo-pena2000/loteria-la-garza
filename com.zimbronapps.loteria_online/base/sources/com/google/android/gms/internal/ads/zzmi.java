package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzmi extends zzvy {
    private final zzbe zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmi(zzmj zzmjVar, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(zzmjVar);
        this.zzc = new zzbe();
    }

    public final zzbd zzd(int i, zzbd zzbdVar, boolean z) {
        zzbf zzbfVar = this.zzb;
        zzbd zzd = zzbfVar.zzd(i, zzbdVar, z);
        if (zzbfVar.zzb(zzd.zzc, this.zzc, 0L).zzb()) {
            zzd.zza(zzbdVar.zza, zzbdVar.zzb, zzbdVar.zzc, zzbdVar.zzd, 0L, zzc.zza, true);
        } else {
            zzd.zzf = true;
        }
        return zzd;
    }
}
