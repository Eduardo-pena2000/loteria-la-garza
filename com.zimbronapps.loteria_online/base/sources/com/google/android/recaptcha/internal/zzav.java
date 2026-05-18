package com.google.android.recaptcha.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzav {
    public static final /* synthetic */ int zza = 0;
    private static zzav zzb;
    private static final Map zzc = new LinkedHashMap();
    private static final Qa.a zzd = zzat.zza;
    private final Map zze;

    public /* synthetic */ zzav(Map map, k kVar) {
        this.zze = map;
    }

    public static final /* synthetic */ zzav zza() {
        return zzb;
    }

    public static final /* synthetic */ Map zzc() {
        return zzc;
    }

    public static final /* synthetic */ Qa.a zzd() {
        return zzd;
    }

    public static final /* synthetic */ void zze(zzav zzavVar) {
        zzb = zzavVar;
    }

    public final Object zzb(int i) {
        return this.zze.get(Integer.valueOf(i));
    }
}
