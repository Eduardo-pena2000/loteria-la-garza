package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbbu extends zzbby {
    public zzbbu(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2) {
        super(zzbakVar, "WAcniJw/GaiqIp9OLpCOBQZL84JUYDjTztoPXXS1J2Z88XAmBTXkRw892qBHqVl7", "XsRFkPGR/9DtQdRlTgBn2CYNiaiyrwSr5Bve6m5X61U=", zzawgVar, i, 48);
    }

    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzawg zzawgVar = this.zzd;
        zzawgVar.zzae(3);
        boolean booleanValue = ((Boolean) this.zze.invoke((Object) null, new Object[]{this.zza.zzb()})).booleanValue();
        synchronized (zzawgVar) {
            try {
                if (booleanValue) {
                    zzawgVar.zzae(2);
                } else {
                    zzawgVar.zzae(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
