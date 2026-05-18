package com.google.android.gms.internal.drive;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzli {
    public static void zza(zzjr zzjrVar, zzlj zzljVar, Object obj, Object obj2) throws IOException {
        zzkb.zza(zzjrVar, zzljVar.zztu, 1, obj);
        zzkb.zza(zzjrVar, zzljVar.zztw, 2, obj2);
    }

    public static int zza(zzlj zzljVar, Object obj, Object obj2) {
        return zzkb.zza(zzljVar.zztu, 1, obj) + zzkb.zza(zzljVar.zztw, 2, obj2);
    }
}
