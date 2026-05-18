package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgcf implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzgcf(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzgcf zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzgcf(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        ExecutorService executorService = (ExecutorService) this.zza.zzb();
        zzgbf zzgbfVar = (zzgbf) this.zzb.zzb();
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
        sb.append("Mozilla/5.0 (Linux; Android ");
        sb.append(str);
        sb.append("; ");
        sb.append(str2);
        sb.append(")");
        return new zzgck(executorService, sb.toString(), zzgbfVar.zzl());
    }
}
