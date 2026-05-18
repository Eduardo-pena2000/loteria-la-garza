package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzk extends zzai {
    private final zzab zza;

    public zzk(zzab zzabVar) {
        super("internal.eventLogger");
        this.zza = zzabVar;
    }

    public final zzao zza(zzg zzgVar, List list) {
        zzh.zza(this.zzd, 3, list);
        String zzc = zzgVar.zza((zzao) list.get(0)).zzc();
        long zzi = (long) zzh.zzi(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue());
        zzao zza = zzgVar.zza((zzao) list.get(2));
        this.zza.zze(zzc, zzi, zza instanceof zzal ? zzh.zzk((zzal) zza) : new HashMap());
        return zzao.zzf;
    }
}
