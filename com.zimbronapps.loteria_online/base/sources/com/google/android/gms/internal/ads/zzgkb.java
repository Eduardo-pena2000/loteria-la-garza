package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgkb {
    private final zzatr zza;
    private final long zzb;
    private final long zzc;
    private final String zzd;

    private zzgkb(zzatr zzatrVar, long j, long j2, String str) {
        this.zza = zzatrVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = str;
    }

    public static /* synthetic */ zzgkb zza(zzatr zzatrVar, byte[] bArr) {
        zzatrVar.zza();
        zzatrVar.zzb(bArr);
        List list = (List) zzatrVar.zzc(Optional.empty());
        long longValue = ((Long) list.get(0)).longValue();
        long longValue2 = ((Long) list.get(1)).longValue();
        long longValue3 = ((Long) list.get(2)).longValue();
        zzatrVar.zzd(longValue, Optional.empty());
        return new zzgkb(zzatrVar, longValue2, longValue3, "3.825731049.".concat(zzgca.zza(zzatu.zza(), false)));
    }

    public final /* synthetic */ String zzb(Map map) {
        return zzgca.zza((byte[]) this.zza.zzd(this.zzb, Optional.of(map)), true);
    }

    public final /* synthetic */ void zzc(Map map) {
        this.zza.zzd(this.zzc, Optional.of(map));
    }

    public final /* synthetic */ String zzd() {
        return this.zzd;
    }
}
