package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzax extends zzav {
    public zzax() {
        this.zza.add(zzbk.zzx);
        this.zza.add(zzbk.zzL);
        this.zza.add(zzbk.zzM);
        this.zza.add(zzbk.zzN);
        this.zza.add(zzbk.zzO);
        this.zza.add(zzbk.zzQ);
        this.zza.add(zzbk.zzR);
        this.zza.add(zzbk.zzW);
    }

    private static boolean zzc(zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar instanceof zzak) {
            zzaoVar = new zzas(zzaoVar.zzc());
        }
        if (zzaoVar2 instanceof zzak) {
            zzaoVar2 = new zzas(zzaoVar2.zzc());
        }
        if ((zzaoVar instanceof zzas) && (zzaoVar2 instanceof zzas)) {
            return zzaoVar.zzc().compareTo(zzaoVar2.zzc()) < 0;
        }
        double doubleValue = zzaoVar.zzd().doubleValue();
        double doubleValue2 = zzaoVar2.zzd().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    private static boolean zzd(zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar.getClass().equals(zzaoVar2.getClass())) {
            if ((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) {
                return true;
            }
            return zzaoVar instanceof zzah ? (Double.isNaN(zzaoVar.zzd().doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue()) || zzaoVar.zzd().doubleValue() != zzaoVar2.zzd().doubleValue()) ? false : true : zzaoVar instanceof zzas ? zzaoVar.zzc().equals(zzaoVar2.zzc()) : zzaoVar instanceof zzaf ? zzaoVar.zze().equals(zzaoVar2.zze()) : zzaoVar == zzaoVar2;
        }
        if (((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) && ((zzaoVar2 instanceof zzat) || (zzaoVar2 instanceof zzam))) {
            return true;
        }
        boolean z = zzaoVar instanceof zzah;
        if (z && (zzaoVar2 instanceof zzas)) {
            return zzd(zzaoVar, new zzah(zzaoVar2.zzd()));
        }
        boolean z2 = zzaoVar instanceof zzas;
        if (z2 && (zzaoVar2 instanceof zzah)) {
            return zzd(new zzah(zzaoVar.zzd()), zzaoVar2);
        }
        if (zzaoVar instanceof zzaf) {
            return zzd(new zzah(zzaoVar.zzd()), zzaoVar2);
        }
        if (zzaoVar2 instanceof zzaf) {
            return zzd(zzaoVar, new zzah(zzaoVar2.zzd()));
        }
        if ((z2 || z) && (zzaoVar2 instanceof zzak)) {
            return zzd(zzaoVar, new zzas(zzaoVar2.zzc()));
        }
        if ((zzaoVar instanceof zzak) && ((zzaoVar2 instanceof zzas) || (zzaoVar2 instanceof zzah))) {
            return zzd(new zzas(zzaoVar.zzc()), zzaoVar2);
        }
        return false;
    }

    private static boolean zze(zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar instanceof zzak) {
            zzaoVar = new zzas(zzaoVar.zzc());
        }
        if (zzaoVar2 instanceof zzak) {
            zzaoVar2 = new zzas(zzaoVar2.zzc());
        }
        return (((zzaoVar instanceof zzas) && (zzaoVar2 instanceof zzas)) || !(Double.isNaN(zzaoVar.zzd().doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue()))) && !zzc(zzaoVar2, zzaoVar);
    }

    public final zzao zza(String str, zzg zzgVar, List list) {
        boolean zzd;
        boolean zzd2;
        zzh.zza(zzh.zze(str).name(), 2, list);
        zzao zza = zzgVar.zza((zzao) list.get(0));
        zzao zza2 = zzgVar.zza((zzao) list.get(1));
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                zzd2 = zzd(zza, zza2);
            } else if (ordinal == 42) {
                zzd = zzc(zza, zza2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        zzd = zzc(zza2, zza);
                        break;
                    case 38:
                        zzd = zze(zza2, zza);
                        break;
                    case 39:
                        zzd = zzh.zzf(zza, zza2);
                        break;
                    case 40:
                        zzd2 = zzh.zzf(zza, zza2);
                        break;
                    default:
                        return super.zzb(str);
                }
            } else {
                zzd = zze(zza, zza2);
            }
            zzd = !zzd2;
        } else {
            zzd = zzd(zza, zza2);
        }
        return zzd ? zzao.zzk : zzao.zzl;
    }
}
