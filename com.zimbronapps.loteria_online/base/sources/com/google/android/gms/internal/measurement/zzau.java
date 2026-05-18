package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzau extends zzav {
    public zzau() {
        this.zza.add(zzbk.zze);
        this.zza.add(zzbk.zzf);
        this.zza.add(zzbk.zzg);
        this.zza.add(zzbk.zzh);
        this.zza.add(zzbk.zzi);
        this.zza.add(zzbk.zzj);
        this.zza.add(zzbk.zzk);
    }

    public final zzao zza(String str, zzg zzgVar, List list) {
        zzah zzahVar;
        zzbk zzbkVar = zzbk.zza;
        switch (zzh.zze(str).ordinal()) {
            case 4:
                zzh.zza(zzbk.zze.name(), 2, list);
                zzahVar = new zzah(Double.valueOf(zzh.zzg(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue()) & zzh.zzg(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue())));
                break;
            case 5:
                zzh.zza(zzbk.zzf.name(), 2, list);
                zzahVar = new zzah(Double.valueOf(zzh.zzg(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue()) << ((int) (zzh.zzh(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) & 31))));
                break;
            case 6:
                zzh.zza(zzbk.zzg.name(), 1, list);
                zzahVar = new zzah(Double.valueOf(~zzh.zzg(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue())));
                break;
            case 7:
                zzh.zza(zzbk.zzh.name(), 2, list);
                zzahVar = new zzah(Double.valueOf(zzh.zzg(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue()) | zzh.zzg(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue())));
                break;
            case 8:
                zzh.zza(zzbk.zzi.name(), 2, list);
                zzahVar = new zzah(Double.valueOf(zzh.zzg(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue()) >> ((int) (zzh.zzh(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) & 31))));
                break;
            case 9:
                zzh.zza(zzbk.zzj.name(), 2, list);
                zzahVar = new zzah(Double.valueOf(zzh.zzh(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue()) >>> ((int) (zzh.zzh(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) & 31))));
                break;
            case 10:
                zzh.zza(zzbk.zzk.name(), 2, list);
                zzahVar = new zzah(Double.valueOf(zzh.zzg(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue()) ^ zzh.zzg(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue())));
                break;
            default:
                return super.zzb(str);
        }
        return zzahVar;
    }
}
