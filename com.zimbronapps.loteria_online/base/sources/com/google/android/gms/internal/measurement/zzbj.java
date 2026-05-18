package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbj extends zzav {
    public zzbj() {
        this.zza.add(zzbk.zzd);
        this.zza.add(zzbk.zzo);
        this.zza.add(zzbk.zzr);
        this.zza.add(zzbk.zzs);
        this.zza.add(zzbk.zzy);
        this.zza.add(zzbk.zzH);
        this.zza.add(zzbk.zzJ);
        this.zza.add(zzbk.zzK);
        this.zza.add(zzbk.zzX);
        this.zza.add(zzbk.zzag);
        this.zza.add(zzbk.zzak);
        this.zza.add(zzbk.zzal);
        this.zza.add(zzbk.zzam);
    }

    public final zzao zza(String str, zzg zzgVar, List list) {
        zzao zza;
        zzao zza2;
        String str2;
        zzbk zzbkVar = zzbk.zza;
        int ordinal = zzh.zze(str).ordinal();
        int i = 0;
        if (ordinal != 3) {
            if (ordinal == 14) {
                zzh.zzb(zzbk.zzo.name(), 2, list);
                if (list.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
                }
                while (i < list.size() - 1) {
                    zzao zza3 = zzgVar.zza((zzao) list.get(i));
                    if (!(zza3 instanceof zzas)) {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{zza3.getClass().getCanonicalName()}));
                    }
                    zzgVar.zzg(zza3.zzc(), zzgVar.zza((zzao) list.get(i + 1)));
                    i += 2;
                }
                return zzao.zzf;
            }
            if (ordinal == 24) {
                zzh.zzb(zzbk.zzy.name(), 1, list);
                zzao zzaoVar = zzao.zzf;
                while (i < list.size()) {
                    zzaoVar = zzgVar.zza((zzao) list.get(i));
                    if (zzaoVar instanceof zzag) {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    i++;
                }
                return zzaoVar;
            }
            if (ordinal == 33) {
                zzh.zza(zzbk.zzH.name(), 1, list);
                zzao zza4 = zzgVar.zza((zzao) list.get(0));
                if (zza4 instanceof zzas) {
                    return zzgVar.zzh(zza4.zzc());
                }
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{zza4.getClass().getCanonicalName()}));
            }
            if (ordinal == 49) {
                zzh.zza(zzbk.zzX.name(), 0, list);
                return zzao.zzg;
            }
            if (ordinal == 58) {
                zzh.zza(zzbk.zzag.name(), 3, list);
                zzao zza5 = zzgVar.zza((zzao) list.get(0));
                zzao zza6 = zzgVar.zza((zzao) list.get(1));
                zza2 = zzgVar.zza((zzao) list.get(2));
                if (zza5 == zzao.zzf || zza5 == zzao.zzg) {
                    throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{zza6.zzc(), zza5.zzc()}));
                }
                if ((zza5 instanceof zzae) && (zza6 instanceof zzah)) {
                    ((zzae) zza5).zzn(zza6.zzd().intValue(), zza2);
                } else if (zza5 instanceof zzak) {
                    ((zzak) zza5).zzm(zza6.zzc(), zza2);
                    return zza2;
                }
            } else {
                if (ordinal == 17) {
                    if (list.isEmpty()) {
                        return new zzae();
                    }
                    zzae zzaeVar = new zzae();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        zzao zza7 = zzgVar.zza((zzao) it.next());
                        if (zza7 instanceof zzag) {
                            throw new IllegalStateException("Failed to evaluate array element");
                        }
                        zzaeVar.zzn(i, zza7);
                        i++;
                    }
                    return zzaeVar;
                }
                if (ordinal == 18) {
                    if (list.isEmpty()) {
                        return new zzal();
                    }
                    if (list.size() % 2 != 0) {
                        throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
                    }
                    zzal zzalVar = new zzal();
                    while (i < list.size() - 1) {
                        zzao zza8 = zzgVar.zza((zzao) list.get(i));
                        zzao zza9 = zzgVar.zza((zzao) list.get(i + 1));
                        if ((zza8 instanceof zzag) || (zza9 instanceof zzag)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        zzalVar.zzm(zza8.zzc(), zza9);
                        i += 2;
                    }
                    return zzalVar;
                }
                if (ordinal == 35 || ordinal == 36) {
                    zzh.zza(zzbk.zzK.name(), 2, list);
                    zzao zza10 = zzgVar.zza((zzao) list.get(0));
                    zzao zza11 = zzgVar.zza((zzao) list.get(1));
                    if ((zza10 instanceof zzae) && zzh.zzd(zza11)) {
                        return ((zzae) zza10).zzl(zza11.zzd().intValue());
                    }
                    if (zza10 instanceof zzak) {
                        return ((zzak) zza10).zzk(zza11.zzc());
                    }
                    if (zza10 instanceof zzas) {
                        if ("length".equals(zza11.zzc())) {
                            zza2 = new zzah(Double.valueOf(zza10.zzc().length()));
                        } else if (zzh.zzd(zza11) && zza11.zzd().doubleValue() < zza10.zzc().length()) {
                            zza = new zzas(String.valueOf(zza10.zzc().charAt(zza11.zzd().intValue())));
                        }
                    }
                    return zzao.zzf;
                }
                switch (ordinal) {
                    case 62:
                        zzh.zza(zzbk.zzak.name(), 1, list);
                        zzao zza12 = zzgVar.zza((zzao) list.get(0));
                        if (zza12 instanceof zzat) {
                            str2 = "undefined";
                        } else if (zza12 instanceof zzaf) {
                            str2 = "boolean";
                        } else if (zza12 instanceof zzah) {
                            str2 = "number";
                        } else if (zza12 instanceof zzas) {
                            str2 = "string";
                        } else if (zza12 instanceof zzan) {
                            str2 = "function";
                        } else {
                            if ((zza12 instanceof zzap) || (zza12 instanceof zzag)) {
                                throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{zza12}));
                            }
                            str2 = "object";
                        }
                        zza2 = new zzas(str2);
                        break;
                    case 63:
                        zzh.zza(zzbk.zzal.name(), 0, list);
                        return zzao.zzf;
                    case 64:
                        zzh.zzb(zzbk.zzam.name(), 1, list);
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            zzao zza13 = zzgVar.zza((zzao) it2.next());
                            if (!(zza13 instanceof zzas)) {
                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{zza13.getClass().getCanonicalName()}));
                            }
                            zzgVar.zzf(zza13.zzc(), zzao.zzf);
                        }
                        return zzao.zzf;
                    default:
                        return super.zzb(str);
                }
            }
            return zza2;
        }
        zzh.zza(zzbk.zzd.name(), 2, list);
        zzao zza14 = zzgVar.zza((zzao) list.get(0));
        if (!(zza14 instanceof zzas)) {
            throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{zza14.getClass().getCanonicalName()}));
        }
        if (!zzgVar.zzd(zza14.zzc())) {
            throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{zza14.zzc()}));
        }
        zza = zzgVar.zza((zzao) list.get(1));
        zzgVar.zze(zza14.zzc(), zza);
        return zza;
    }
}
