package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzho implements zzgx {
    public static final zzho zza = new zzho();

    private zzho() {
    }

    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Field)) {
            zza2 = null;
        }
        Field field = (Field) zza2;
        if (field == null) {
            throw new zzce(4, 5, null);
        }
        try {
            field.set((Object) null, zzgdVar.zzc().zza(zzueVarArr[1]));
        } catch (Exception e) {
            throw new zzce(6, 11, e);
        }
    }
}
