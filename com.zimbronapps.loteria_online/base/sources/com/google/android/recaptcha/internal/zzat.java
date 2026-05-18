package com.google.android.recaptcha.internal;

import Da.Q;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzat extends u implements Qa.a {
    public static final zzat zza = new zzat();

    public zzat() {
        super(0);
    }

    public static final Map zza() {
        Map zzc = zzav.zzc();
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q.e(zzc.size()));
        for (Map.Entry entry : zzc.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((zzaw) entry.getValue()).zzb());
        }
        return linkedHashMap;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        return zza();
    }
}
