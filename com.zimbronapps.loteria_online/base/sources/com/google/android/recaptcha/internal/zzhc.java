package com.google.android.recaptcha.internal;

import Da.r;
import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzhc implements zzgx {
    public static final zzhc zza = new zzhc();

    private zzhc() {
    }

    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length < 2) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(zza2)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        Class cls = zza2 instanceof Class ? (Class) zza2 : zza2.getClass();
        Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (zza3 instanceof String)) {
            zza3 = null;
        }
        String str = (String) zza3;
        if (str == null) {
            throw new zzce(4, 5, null);
        }
        String zza4 = zzgdVar.zzh().zza(str);
        if (t.c(zza4, "forName")) {
            throw new zzce(6, 48, null);
        }
        Class[] zzf = zzgdVar.zzc().zzf(r.S0(zzueVarArr).subList(2, length));
        try {
            zzgdVar.zzc().zze(i, cls.getMethod(zza4, (Class[]) Arrays.copyOf(zzf, zzf.length)));
        } catch (Exception e) {
            throw new zzce(6, 13, e);
        }
    }
}
