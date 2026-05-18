package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbaw extends zzbby {
    public zzbaw(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2) {
        super(zzbakVar, "YcvOy2Y9scoLzd9aO/r1q51CuRDPgptfjUczBG/4u9TSMf5O8lCrtIMZ2+ctDcs+", "6V7/ExCl9vngHnxEtX1goXpmDP9bA02eRvmHfr0qsgM=", zzawgVar, i, 49);
    }

    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzawg zzawgVar = this.zzd;
        zzawgVar.zzaf(3);
        try {
            int i = 1;
            if (true == ((Boolean) this.zze.invoke((Object) null, new Object[]{this.zza.zzb()})).booleanValue()) {
                i = 2;
            }
            zzawgVar.zzaf(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
