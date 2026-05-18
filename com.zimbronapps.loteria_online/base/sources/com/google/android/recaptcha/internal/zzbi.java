package com.google.android.recaptcha.internal;

import cb.O;
import cb.P;
import cb.Q;
import cb.e0;
import cb.i;
import cb.t0;
import java.util.concurrent.Executors;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbi {
    private final O zza = P.b();
    private final O zzb;
    private final O zzc;
    private final O zzd;

    public zzbi() {
        O a = P.a(t0.c(Executors.newSingleThreadExecutor()));
        i.d(a, (Ga.i) null, (Q) null, new zzbh(null), 3, (Object) null);
        this.zzb = a;
        this.zzc = P.a(e0.b());
        O a2 = P.a(t0.c(Executors.newSingleThreadExecutor()));
        i.d(a2, (Ga.i) null, (Q) null, new zzbg(null), 3, (Object) null);
        this.zzd = a2;
    }

    public final O zza() {
        return this.zzc;
    }

    public final O zzb() {
        return this.zza;
    }

    public final O zzc() {
        return this.zzd;
    }

    public final O zzd() {
        return this.zzb;
    }
}
