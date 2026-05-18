package com.google.android.gms.internal.ads;

import T2.f0;
import android.media.metrics.LogSessionId;
import android.os.Build;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzpq {
    public static final zzpq zza;
    public final String zzb;
    private final zzpp zzc;

    static {
        new zzpq("");
        zza = new zzpq("preload");
    }

    public zzpq(String str) {
        this.zzb = str;
        this.zzc = Build.VERSION.SDK_INT >= 31 ? new zzpp() : null;
    }

    public final synchronized LogSessionId zza() {
        zzpp zzppVar;
        zzppVar = this.zzc;
        if (zzppVar == null) {
            throw null;
        }
        return zzppVar.zza;
    }

    public final synchronized void zzb(LogSessionId logSessionId) {
        zzpp zzppVar = this.zzc;
        if (zzppVar == null) {
            throw null;
        }
        zzgrc.zzi(V2.N.a(zzppVar.zza, f0.a()));
        zzppVar.zza = logSessionId;
    }
}
