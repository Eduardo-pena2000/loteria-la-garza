package com.google.android.recaptcha.internal;

import Da.r;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzhf implements zzgx {
    public static final zzhf zza = new zzhf();

    private zzhf() {
    }

    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length < 2) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Method)) {
            zza2 = null;
        }
        Method method = (Method) zza2;
        if (method == null) {
            throw new zzce(4, 5, null);
        }
        Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
        Object[] zzg = zzgdVar.zzc().zzg(r.S0(zzueVarArr).subList(2, length));
        try {
            zzgdVar.zzc().zze(i, method.invoke(zza3, Arrays.copyOf(zzg, zzg.length)));
        } catch (Exception e) {
            throw new zzce(6, 15, e);
        }
    }
}
