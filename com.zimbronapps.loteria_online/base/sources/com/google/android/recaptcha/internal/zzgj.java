package com.google.android.recaptcha.internal;

import java.util.Objects;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgj implements zzgx {
    public static final zzgj zza = new zzgj();

    private zzgj() {
    }

    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 3) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Integer)) {
            zza2 = null;
        }
        Integer num = (Integer) zza2;
        if (num == null) {
            throw new zzce(4, 5, null);
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            throw new zzce(4, 6, null);
        }
        Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != Objects.nonNull(zza3)) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzce(4, 5, null);
        }
        Object zza4 = zzgdVar.zzc().zza(zzueVarArr[2]);
        if (true != Objects.nonNull(zza4)) {
            zza4 = null;
        }
        if (zza4 == null) {
            throw new zzce(4, 5, null);
        }
        if (t.c(zza3, zza4)) {
            zzgdVar.zzg(zzgdVar.zza() + intValue);
        }
    }
}
