package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzggs extends zzghb {
    private final Map zza;

    public zzggs(zzawg zzawgVar, zzgfx zzgfxVar, Map map, zzgoe zzgoeVar) {
        super("DoplGqb2T7yuEuU5Q/qB4xZESNb88h/QJW4dcmkvxhTQcQzfkR6CzgZ/7IxnBujg", "t9POLaVAVF/e8zEpIMQR1NYpTbKPa6FoDXMGzMPACVE=", zzawgVar, zzgfxVar, zzgoeVar.zza(118));
        this.zza = map;
    }

    public final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        Map map = this.zza;
        Object[] objArr = (Object[]) method.invoke("", new Object[]{(NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf")});
        objArr.getClass();
        synchronized (zzawgVar) {
            try {
                zzawgVar.zzf(((Long) objArr[0]).longValue());
                long longValue = ((Long) objArr[1]).longValue();
                if (longValue >= 0) {
                    zzawgVar.zzW(longValue);
                }
                long longValue2 = ((Long) objArr[2]).longValue();
                if (longValue2 >= 0) {
                    zzawgVar.zzX(longValue2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
