package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbbt extends zzbby {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzbbt(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2) {
        super(zzbakVar, "R0KTYl+9Bi7RshEQmYhK/YeVyfjIkHliDPJVeC+XBbAz0q1EMlAcoZ8JeP0fdmTX", "AARE3CI7+7Fq5atzy8wcVAJTjdNJGGNM3rGztRoG23E=", zzawgVar, i, 33);
    }

    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (Long) this.zze.invoke((Object) null, (Object[]) null);
                    }
                } finally {
                }
            }
        }
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zzs(zzh.longValue());
        }
    }
}
