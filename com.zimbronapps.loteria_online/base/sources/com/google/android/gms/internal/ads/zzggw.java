package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzggw extends zzghb {
    private final Context zza;
    private final Map zzb;

    public zzggw(zzawg zzawgVar, zzgfx zzgfxVar, Map map, Context context, zzgoe zzgoeVar) {
        super("4E5LGVIWQ1GEduvP5TN/xg9UMJg1ApPRTsJapm6hD1tpcLj2ORRJ8msrY4RVPfxM", "Dj3g22+8PSWa8Tetil7hQ1gD69SNesarbyARD9M1zvc=", zzawgVar, zzgfxVar, zzgoeVar.zza(120));
        this.zza = context;
        this.zzb = map;
    }

    public final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        Long l = -1L;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Long l2 = (Long) method.invoke("", new Object[]{this.zza});
                if (l2 == null) {
                    throw null;
                }
                l = l2;
            } else {
                x7.e eVar = (x7.e) this.zzb.get("gs");
                if (eVar != null && eVar.isDone()) {
                    l = Long.valueOf(((zzaxg) eVar.get()).zze());
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        synchronized (zzawgVar) {
            zzawgVar.zzR(l.longValue());
        }
    }
}
