package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfvr {
    private final Context zza;
    private final Looper zzb;

    public zzfvr(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfwb zza = zzfwd.zza();
        Context context = this.zza;
        zza.zza(context.getPackageName());
        zza.zzc(2);
        zzfvz zza2 = zzfwa.zza();
        zza2.zza(str);
        zza2.zzb(2);
        zza.zzb(zza2);
        new zzfvs(context, this.zzb, (zzfwd) zza.zzbm()).zza();
    }
}
