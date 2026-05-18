package com.google.android.recaptcha.internal;

import Da.r;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzhj implements zzgx {
    public static final zzhj zza = new zzhj();

    private zzhj() {
    }

    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length == 0) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(zza2)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        Constructor constructor = zza2 instanceof Constructor ? (Constructor) zza2 : zza2.getClass().getConstructor((Class[]) null);
        Object[] zzg = zzgdVar.zzc().zzg(r.S0(zzueVarArr).subList(1, length));
        try {
            zzgdVar.zzc().zze(i, constructor.newInstance(Arrays.copyOf(zzg, zzg.length)));
        } catch (Exception e) {
            throw new zzce(6, 14, e);
        }
    }
}
