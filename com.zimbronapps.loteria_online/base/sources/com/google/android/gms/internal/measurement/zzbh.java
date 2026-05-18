package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbh extends zzav {
    public zzbh() {
        this.zza.add(zzbk.zza);
        this.zza.add(zzbk.zzv);
        this.zza.add(zzbk.zzS);
        this.zza.add(zzbk.zzT);
        this.zza.add(zzbk.zzU);
        this.zza.add(zzbk.zzaa);
        this.zza.add(zzbk.zzab);
        this.zza.add(zzbk.zzad);
        this.zza.add(zzbk.zzae);
        this.zza.add(zzbk.zzah);
    }

    public final zzao zza(String str, zzg zzgVar, List list) {
        zzbk zzbkVar = zzbk.zza;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 0) {
            zzh.zza(zzbk.zza.name(), 2, list);
            zzao zza = zzgVar.zza((zzao) list.get(0));
            zzao zza2 = zzgVar.zza((zzao) list.get(1));
            if (!(zza instanceof zzak) && !(zza instanceof zzas) && !(zza2 instanceof zzak) && !(zza2 instanceof zzas)) {
                return new zzah(Double.valueOf(zza.zzd().doubleValue() + zza2.zzd().doubleValue()));
            }
            return new zzas(String.valueOf(zza.zzc()).concat(String.valueOf(zza2.zzc())));
        }
        if (ordinal == 21) {
            zzh.zza(zzbk.zzv.name(), 2, list);
            return new zzah(Double.valueOf(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue() / zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()));
        }
        if (ordinal == 59) {
            zzh.zza(zzbk.zzah.name(), 2, list);
            return new zzah(Double.valueOf(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue() + new zzah(Double.valueOf(-zzgVar.zza((zzao) list.get(1)).zzd().doubleValue())).zzd().doubleValue()));
        }
        if (ordinal == 52 || ordinal == 53) {
            zzh.zza(str, 2, list);
            zzao zza3 = zzgVar.zza((zzao) list.get(0));
            zzgVar.zza((zzao) list.get(1));
            return zza3;
        }
        if (ordinal == 55 || ordinal == 56) {
            zzh.zza(str, 1, list);
            return zzgVar.zza((zzao) list.get(0));
        }
        switch (ordinal) {
            case 44:
                zzh.zza(zzbk.zzS.name(), 2, list);
                return new zzah(Double.valueOf(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue() % zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()));
            case 45:
                zzh.zza(zzbk.zzT.name(), 2, list);
                return new zzah(Double.valueOf(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue() * zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()));
            case 46:
                zzh.zza(zzbk.zzU.name(), 1, list);
                return new zzah(Double.valueOf(-zzgVar.zza((zzao) list.get(0)).zzd().doubleValue()));
            default:
                return super.zzb(str);
        }
    }
}
