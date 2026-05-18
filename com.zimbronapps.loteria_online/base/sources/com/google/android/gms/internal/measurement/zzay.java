package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzay extends zzav {
    public zzay() {
        this.zza.add(zzbk.zzc);
        this.zza.add(zzbk.zzl);
        this.zza.add(zzbk.zzm);
        this.zza.add(zzbk.zzn);
        this.zza.add(zzbk.zzt);
        this.zza.add(zzbk.zzp);
        this.zza.add(zzbk.zzu);
        this.zza.add(zzbk.zzz);
        this.zza.add(zzbk.zzP);
        this.zza.add(zzbk.zzac);
        this.zza.add(zzbk.zzaf);
        this.zza.add(zzbk.zzai);
        this.zza.add(zzbk.zzaj);
    }

    private static zzao zzc(zzg zzgVar, List list) {
        zzh.zzb(zzbk.zzz.name(), 2, list);
        zzao zza = zzgVar.zza((zzao) list.get(0));
        zzao zza2 = zzgVar.zza((zzao) list.get(1));
        if (!(zza2 instanceof zzae)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", new Object[]{zza2.getClass().getCanonicalName()}));
        }
        List zzb = ((zzae) zza2).zzb();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new zzan(zza.zzc(), zzb, arrayList, zzgVar);
    }

    public final zzao zza(String str, zzg zzgVar, List list) {
        zzbk zzbkVar = zzbk.zza;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 2) {
            zzh.zza(zzbk.zzc.name(), 3, list);
            zzao zza = zzgVar.zza((zzao) list.get(0));
            String zzc = zzgVar.zza((zzao) list.get(1)).zzc();
            zzao zza2 = zzgVar.zza((zzao) list.get(2));
            if (!(zza2 instanceof zzae)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", new Object[]{zza2.getClass().getCanonicalName()}));
            }
            if (zzc.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return zza.zzcA(zzc, zzgVar, ((zzae) zza2).zzb());
        }
        if (ordinal == 15) {
            zzh.zza(zzbk.zzm.name(), 0, list);
            return zzao.zzh;
        }
        if (ordinal == 25) {
            return zzc(zzgVar, list);
        }
        if (ordinal == 41) {
            zzh.zzb(zzbk.zzP.name(), 2, list);
            zzao zza3 = zzgVar.zza((zzao) list.get(0));
            zzao zza4 = zzgVar.zza((zzao) list.get(1));
            zzao zza5 = list.size() > 2 ? zzgVar.zza((zzao) list.get(2)) : null;
            zzao zzaoVar = zzao.zzf;
            zzao zzb = zza3.zze().booleanValue() ? zzgVar.zzb((zzae) zza4) : zza5 != null ? zzgVar.zzb((zzae) zza5) : zzaoVar;
            return true != (zzb instanceof zzag) ? zzaoVar : zzb;
        }
        if (ordinal == 54) {
            return new zzae(list);
        }
        if (ordinal == 57) {
            if (list.isEmpty()) {
                return zzao.zzj;
            }
            zzh.zza(zzbk.zzaf.name(), 1, list);
            return new zzag("return", zzgVar.zza((zzao) list.get(0)));
        }
        if (ordinal != 19) {
            if (ordinal == 20) {
                zzh.zzb(zzbk.zzu.name(), 2, list);
                zzan zzanVar = (zzan) zzc(zzgVar, list);
                if (zzanVar.zzg() == null) {
                    zzgVar.zze("", zzanVar);
                    return zzanVar;
                }
                zzgVar.zze(zzanVar.zzg(), zzanVar);
                return zzanVar;
            }
            if (ordinal == 60) {
                zzh.zza(zzbk.zzai.name(), 3, list);
                zzao zza6 = zzgVar.zza((zzao) list.get(0));
                zzao zza7 = zzgVar.zza((zzao) list.get(1));
                zzao zza8 = zzgVar.zza((zzao) list.get(2));
                if (!(zza7 instanceof zzae)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(zza8 instanceof zzae)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                zzae zzaeVar = (zzae) zza7;
                zzae zzaeVar2 = (zzae) zza8;
                boolean z = false;
                for (int i = 0; i < zzaeVar.zzh(); i++) {
                    if (z || zza6.equals(zzgVar.zza(zzaeVar.zzl(i)))) {
                        zzao zza9 = zzgVar.zza(zzaeVar2.zzl(i));
                        if (zza9 instanceof zzag) {
                            return ((zzag) zza9).zzg().equals("break") ? zzao.zzf : zza9;
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (zzaeVar.zzh() + 1 == zzaeVar2.zzh()) {
                    zzao zza10 = zzgVar.zza(zzaeVar2.zzl(zzaeVar.zzh()));
                    if (zza10 instanceof zzag) {
                        String zzg = ((zzag) zza10).zzg();
                        if (zzg.equals("return") || zzg.equals("continue")) {
                            return zza10;
                        }
                    }
                }
                return zzao.zzf;
            }
            if (ordinal == 61) {
                zzh.zza(zzbk.zzaj.name(), 3, list);
                return zzgVar.zza((zzao) list.get(0)).zze().booleanValue() ? zzgVar.zza((zzao) list.get(1)) : zzgVar.zza((zzao) list.get(2));
            }
            switch (ordinal) {
                case 11:
                    return zzgVar.zzc().zzb(new zzae(list));
                case 12:
                    zzh.zza(zzbk.zzm.name(), 0, list);
                    return zzao.zzi;
                case 13:
                    break;
                default:
                    return super.zzb(str);
            }
        }
        if (list.isEmpty()) {
            return zzao.zzf;
        }
        zzao zza11 = zzgVar.zza((zzao) list.get(0));
        return zza11 instanceof zzae ? zzgVar.zzb((zzae) zza11) : zzao.zzf;
    }
}
