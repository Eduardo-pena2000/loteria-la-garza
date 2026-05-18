package com.google.android.recaptcha.internal;

import Da.r;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzha implements zzgx {
    public static final zzha zza = new zzha();

    private zzha() {
    }

    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length == 0) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Class)) {
            zza2 = null;
        }
        Class cls = (Class) zza2;
        if (cls == null) {
            throw new zzce(4, 5, null);
        }
        Class[] zzf = zzgdVar.zzc().zzf(r.S0(zzueVarArr).subList(1, length));
        try {
            zzgdVar.zzc().zze(i, cls.getConstructor((Class[]) Arrays.copyOf(zzf, zzf.length)));
        } catch (Exception e) {
            throw new zzce(6, 9, e);
        }
    }
}
