package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbbn extends zzbby {
    public zzbbn(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2) {
        super(zzbakVar, "EHHl2bnow3CY535hCiXXbLjuydxFlVXitu9AIkBq9ZFdEOrgtrbiSayxFpjmKRmo", "ioEU79oGVeaIBBGOjKcBP85gZ/aumGq7/t+0LJZeQ5M=", zzawgVar, i, 73);
    }

    public final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            boolean booleanValue = ((Boolean) this.zze.invoke((Object) null, new Object[]{this.zza.zzb()})).booleanValue();
            zzawg zzawgVar = this.zzd;
            int i = 1;
            if (true == booleanValue) {
                i = 2;
            }
            zzawgVar.zzah(i);
        } catch (InvocationTargetException unused) {
            this.zzd.zzah(3);
        }
    }
}
