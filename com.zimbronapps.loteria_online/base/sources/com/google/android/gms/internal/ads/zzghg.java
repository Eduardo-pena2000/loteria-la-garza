package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzghg extends zzghb {
    private final DisplayMetrics zza;
    private final View zzb;

    public zzghg(zzawg zzawgVar, zzgfx zzgfxVar, DisplayMetrics displayMetrics, View view, zzgoe zzgoeVar) {
        super("QtFUhprc0s9rDonjH5m4IrigIFuqmp02TDnBB8cCDzOGBvtX+nN2RsZyZRWOgPcG", "ANcskOtBFoz5qdvK1HjqJ5/70uPKH1zreYbosxrVnAY=", zzawgVar, zzgfxVar, zzgoeVar.zza(124));
        this.zza = displayMetrics;
        this.zzb = view;
    }

    public final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        View view = this.zzb;
        if (view == null) {
            return;
        }
        Object invoke = method.invoke("", new Object[]{this.zza, view});
        invoke.getClass();
        Long[] lArr = (Long[]) invoke;
        zzaxe zza = zzaxf.zza();
        zza.zzb(lArr[2].longValue());
        zza.zzc(lArr[1].longValue());
        zza.zzd(lArr[0].longValue());
        zza.zza(lArr[3].longValue());
        zza.zze(lArr[4].longValue());
        zzawgVar.zzM((zzaxf) zza.zzbu());
    }
}
