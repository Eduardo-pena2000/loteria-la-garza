package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfnf {
    public static final zzfnl zza(x7.e eVar, Object obj, zzfnm zzfnmVar) {
        return new zzfnl(zzfnmVar, obj, null, zzfnm.zzd(), Collections.emptyList(), eVar, null);
    }

    public static final zzfnl zzb(Callable callable, Object obj, zzfnm zzfnmVar) {
        return zzc(callable, zzfnmVar.zze(), obj, zzfnmVar);
    }

    public static final zzfnl zzc(Callable callable, zzgzy zzgzyVar, Object obj, zzfnm zzfnmVar) {
        return new zzfnl(zzfnmVar, obj, null, zzfnm.zzd(), Collections.emptyList(), zzgzyVar.submit(callable), null);
    }

    public static final zzfnl zzd(zzfna zzfnaVar, zzgzy zzgzyVar, Object obj, zzfnm zzfnmVar) {
        return zzc(new zzfne(zzfnaVar), zzgzyVar, obj, zzfnmVar);
    }
}
