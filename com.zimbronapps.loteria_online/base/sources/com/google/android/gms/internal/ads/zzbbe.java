package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbbe extends zzbby {
    private final zzbal zzh;

    public zzbbe(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2, zzbal zzbalVar) {
        super(zzbakVar, "uAqKAtpzCVdzsQfO3VsjAegcR1bzJIPV7WnBpdLTTlepVA45FMcx2CHHUDw9JuIC", "/PvocKqER/fglRgbozHO01MU+uyxr0WG8/b5JQrvhOY=", zzawgVar, i, 85);
        this.zzh = zzbalVar;
    }

    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Method method = this.zze;
        zzbal zzbalVar = this.zzh;
        long[] jArr = (long[]) method.invoke((Object) null, new Object[]{Long.valueOf(zzbalVar.zzf()), Long.valueOf(zzbalVar.zzg()), Long.valueOf(zzbalVar.zzi()), Long.valueOf(zzbalVar.zzh())});
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zzY(jArr[0]);
            zzawgVar.zzZ(jArr[1]);
        }
    }
}
