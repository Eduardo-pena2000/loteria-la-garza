package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzanm implements zzamf {
    private final zzer zza = new zzer();
    private final zzer zzb = new zzer();
    private final zzanl zzc;
    private Inflater zzd;

    public zzanm(List list) {
        zzanl zzanlVar = new zzanl();
        this.zzc = zzanlVar;
        zzanlVar.zza(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    public final void zza(byte[] bArr, int i, int i2, zzame zzameVar, zzdr zzdrVar) {
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i2 + i);
        zzerVar.zzh(i);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        zzer zzerVar2 = this.zzb;
        if (zzfj.zzL(zzerVar, zzerVar2, this.zzd)) {
            zzerVar.zzb(zzerVar2.zzi(), zzerVar2.zze());
        }
        zzanl zzanlVar = this.zzc;
        zzanlVar.zzd();
        int zzd = zzerVar.zzd();
        zzcx zzcxVar = null;
        if (zzd >= 2 && zzerVar.zzt() == zzd) {
            zzanlVar.zzb(zzerVar);
            zzcxVar = zzanlVar.zzc(zzerVar);
        }
        zzdrVar.zza(new zzalx(zzcxVar != null ? zzguf.zzj(zzcxVar) : zzguf.zzi(), -9223372036854775807L, 5000000L));
    }
}
