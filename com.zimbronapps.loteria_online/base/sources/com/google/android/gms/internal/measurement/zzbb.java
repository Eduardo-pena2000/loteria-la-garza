package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbb extends zzav {
    public zzbb() {
        this.zza.add(zzbk.zzb);
        this.zza.add(zzbk.zzV);
        this.zza.add(zzbk.zzY);
    }

    public final zzao zza(String str, zzg zzgVar, List list) {
        zzbk zzbkVar = zzbk.zza;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 1) {
            zzh.zza(zzbk.zzb.name(), 2, list);
            zzao zza = zzgVar.zza((zzao) list.get(0));
            return zza.zze().booleanValue() ? zzgVar.zza((zzao) list.get(1)) : zza;
        }
        if (ordinal == 47) {
            zzh.zza(zzbk.zzV.name(), 1, list);
            return new zzaf(Boolean.valueOf(!zzgVar.zza((zzao) list.get(0)).zze().booleanValue()));
        }
        if (ordinal != 50) {
            return super.zzb(str);
        }
        zzh.zza(zzbk.zzY.name(), 2, list);
        zzao zza2 = zzgVar.zza((zzao) list.get(0));
        return !zza2.zze().booleanValue() ? zzgVar.zza((zzao) list.get(1)) : zza2;
    }
}
