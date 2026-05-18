package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaku {
    static final zzaku zza = new zzaku(true);
    private static volatile boolean zzb = false;
    private final Map zzc;

    public zzaku() {
        this.zzc = new HashMap();
    }

    public static zzaku zza() {
        return zza;
    }

    public final zzalf.zzf zza(zzamm zzammVar, int i) {
        return (zzalf.zzf) this.zzc.get(new zzakt(zzammVar, i));
    }

    private zzaku(boolean z) {
        this.zzc = Collections.emptyMap();
    }
}
