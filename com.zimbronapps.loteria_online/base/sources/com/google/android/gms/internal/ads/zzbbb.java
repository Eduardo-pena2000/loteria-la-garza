package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbbb extends zzbby {
    private final long zzh;

    public zzbbb(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, long j, int i, int i2) {
        super(zzbakVar, "KS95o7MbZWIdKuBkGY5EucArwEmarpDzvrPJlr4r6NTEwXHZ52g0Gof8SUaYNmWh", "sZhcPfATNezp7ZcisFX7I2sqsKQPBRrUcm6y3tpw6ig=", zzawgVar, i, 25);
        this.zzh = j;
    }

    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zze.invoke((Object) null, (Object[]) null)).longValue();
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            try {
                zzawgVar.zzac(longValue);
                long j = this.zzh;
                if (j != 0) {
                    zzawgVar.zzk(longValue - j);
                    zzawgVar.zzn(j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
