package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzicv {
    private final zzicu zza;

    private zzicv(zzies zziesVar, Object obj, zzies zziesVar2, Object obj2) {
        this.zza = new zzicu(zziesVar, "", zziesVar2, obj2);
    }

    public static zzicv zza(zzies zziesVar, Object obj, zzies zziesVar2, Object obj2) {
        return new zzicv(zziesVar, "", zziesVar2, obj2);
    }

    public static void zzb(zziaw zziawVar, zzicu zzicuVar, Object obj, Object obj2) throws IOException {
        zzibg.zzf(zziawVar, zzicuVar.zza, 1, obj);
        zzibg.zzf(zziawVar, zzicuVar.zzc, 2, obj2);
    }

    public static int zzc(zzicu zzicuVar, Object obj, Object obj2) {
        return zzibg.zzh(zzicuVar.zza, 1, obj) + zzibg.zzh(zzicuVar.zzc, 2, obj2);
    }

    public final int zzd(int i, Object obj, Object obj2) {
        zzicu zzicuVar = this.zza;
        int zzA = zziaw.zzA(i << 3);
        int zzc = zzc(zzicuVar, obj, obj2);
        return zzA + zziaw.zzA(zzc) + zzc;
    }

    public final zzicu zze() {
        return this.zza;
    }
}
