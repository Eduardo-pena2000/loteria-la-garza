package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbbm extends zzbby {
    public zzbbm(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2) {
        super(zzbakVar, "Vt16THtmezzLb1zgD4XzuhSMrHLGIQcDJNqtzF8G+1UgPRnrYaZemyLPsebqTPQi", "+oRdA7B1eJk1uXzj6xFlex4QQoiHLhoEiFmCoqVQP54=", zzawgVar, i, 3);
    }

    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool = (Boolean) S5.D.c().zzd(zzbhe.zzdI);
        bool.booleanValue();
        zzazq zzazqVar = new zzazq((String) this.zze.invoke((Object) null, new Object[]{this.zza.zzb(), bool}));
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zzc(zzazqVar.zza);
            zzawgVar.zzP(zzazqVar.zzb);
        }
    }
}
