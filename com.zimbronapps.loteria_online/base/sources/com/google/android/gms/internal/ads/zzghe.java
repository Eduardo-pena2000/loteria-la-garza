package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzghe extends zzghb {
    private final Map zza;
    private final zzgfx zzb;
    private final DisplayMetrics zzc;

    public zzghe(zzawg zzawgVar, zzgfx zzgfxVar, Map map, DisplayMetrics displayMetrics, zzgoe zzgoeVar) {
        super("HAMf3XP8KIibPGIFc5yJF+oNVlSUbFLkUHSZdrZ2Dhl4Bh9ge4/6z6Usrb+mfprj", "vYv0JfNJ2rw4TIvbzqBhbKW0tXWLxxqXfI+gpZUSK1Y=", zzawgVar, zzgfxVar, zzgoeVar.zza(123));
        this.zzb = zzgfxVar;
        this.zza = map;
        this.zzc = displayMetrics;
    }

    private static long zzb(double d, DisplayMetrics displayMetrics) {
        return Math.round(d / displayMetrics.density);
    }

    private static boolean zzc(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        Map map = this.zza;
        MotionEvent motionEvent = (MotionEvent) map.get("nv");
        DisplayMetrics displayMetrics = this.zzc;
        Object[] objArr = (Object[]) method.invoke("", new Object[]{motionEvent, displayMetrics});
        objArr.getClass();
        zzaxc zza = zzaxd.zza();
        Object obj = objArr[0];
        if (obj != null && objArr[1] != null) {
            zza.zza(((Long) obj).longValue());
            zza.zzb(((Long) objArr[1]).longValue());
        }
        Object obj2 = objArr[2];
        if (obj2 != null) {
            zza.zzh(((Long) obj2).longValue());
        }
        Object obj3 = objArr[3];
        if (obj3 != null) {
            zza.zzf(((Long) obj3).longValue());
        }
        Object obj4 = objArr[4];
        if (obj4 != null) {
            zza.zzc(((Long) obj4).longValue());
        }
        Object obj5 = objArr[5];
        if (obj5 != null) {
            zza.zzs(((Long) obj5).longValue() != 0 ? 2 : 1);
        }
        Object obj6 = objArr[6];
        if (obj6 != null) {
            zza.zzj(((Long) obj6).longValue());
        }
        Object obj7 = objArr[7];
        if (obj7 != null) {
            zza.zzi(((Long) obj7).longValue());
        }
        Object obj8 = objArr[8];
        if (obj8 != null) {
            zza.zzt(((Long) obj8).longValue() != 0 ? 2 : 1);
        }
        synchronized (zzawgVar) {
            try {
                Method zzc = this.zzb.zzc("LTqeYOkKjRvgMVLXGWwl9QUpPl0hs86RILvnzsnpkgBkbbANt+0KM6wwB7tA8s8M", "qJFn6bhMeF50E1eku7tYH88ZkNeM8ctWC3me80VkO1s=");
                if (zzc == null) {
                    throw null;
                }
                Object[] objArr2 = (Object[]) zzc.invoke("", new Object[]{(MotionEvent) map.get("nv"), displayMetrics});
                if (objArr2 == null) {
                    throw null;
                }
                Object obj9 = objArr2[0];
                if (obj9 != null) {
                    zzawgVar.zzh(((Long) obj9).longValue());
                }
                Object obj10 = objArr2[1];
                if (obj10 != null) {
                    zzawgVar.zzi(((Long) obj10).longValue());
                }
                Object obj11 = objArr2[2];
                if (obj11 != null) {
                    zzawgVar.zzj(((Long) obj11).longValue());
                }
                Object obj12 = objArr2[3];
                if (obj12 != null) {
                    zzawgVar.zzv(((Long) obj12).longValue());
                }
                Object obj13 = objArr2[4];
                if (obj13 != null) {
                    zzawgVar.zzw(((Long) obj13).longValue());
                }
                zzger zzgerVar = (zzger) map.get("oe");
                if (zzgerVar != null) {
                    long j = zzgerVar.zza;
                    if (j > 0) {
                        zzawgVar.zzz(j);
                    }
                    long j2 = zzgerVar.zzb;
                    if (j2 > 0) {
                        zzawgVar.zzy(j2);
                    }
                    long j3 = zzgerVar.zzc;
                    if (j3 > 0) {
                        zzawgVar.zzx(j3);
                    }
                    long j4 = zzgerVar.zzd;
                    if (j4 > 0) {
                        zzawgVar.zzA(j4);
                    }
                }
                zzger zzgerVar2 = (zzger) map.get("oe");
                if (zzgerVar2 != null && zzgerVar2.zza != 0 && zzc(displayMetrics)) {
                    double d = zzgerVar2.zze;
                    if (displayMetrics == null) {
                        throw null;
                    }
                    zza.zzl(zzb(d, displayMetrics));
                    zza.zzm(zzb(zzgerVar2.zzh - zzgerVar2.zzf, displayMetrics));
                    zza.zzn(zzb(zzgerVar2.zzi - zzgerVar2.zzg, displayMetrics));
                    zza.zzq(zzb(zzgerVar2.zzf, displayMetrics));
                    zza.zzr(zzb(zzgerVar2.zzg, displayMetrics));
                    if (((MotionEvent) map.get("nv")) != null) {
                        long zzb = zzb(((zzgerVar2.zzf - zzgerVar2.zzh) + r4.getRawX()) - r4.getX(), displayMetrics);
                        if (zzb != 0) {
                            zza.zzo(zzb);
                        }
                        long zzb2 = zzb(((zzgerVar2.zzg - zzgerVar2.zzi) + r4.getRawY()) - r4.getY(), displayMetrics);
                        if (zzb2 != 0) {
                            zza.zzp(zzb2);
                        }
                    }
                }
                zzawgVar.zzJ(zza);
                zzges[] zzgesVarArr = (zzges[]) map.get("ro");
                if (zzgesVarArr != null && zzc(displayMetrics)) {
                    for (int i = 0; i <= zzgesVarArr.length - 2; i++) {
                        zzges zzgesVar = zzgesVarArr[i];
                        zzaxc zza2 = zzaxd.zza();
                        double d2 = zzgesVar.zza;
                        if (displayMetrics == null) {
                            throw null;
                        }
                        zza2.zza(zzb(d2, displayMetrics));
                        zza2.zzb(zzb(zzgesVar.zzb, displayMetrics));
                        zzawgVar.zzK((zzaxd) zza2.zzbu());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
