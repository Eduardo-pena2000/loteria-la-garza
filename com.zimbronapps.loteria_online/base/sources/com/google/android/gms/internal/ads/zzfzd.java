package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfzd implements zzikg {
    private final zzikp zza;

    private zzfzd(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzfzd zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzfzd(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzcmh) this.zza).zza();
        zzfzh zzc = zzcml.zzc();
        kotlin.jvm.internal.t.g(zza, "context");
        kotlin.jvm.internal.t.g(zzc, "coroutineScopeProvider");
        o2.i c = o2.j.c(o2.j.a, zzfzb.zza, (p2.b) null, (List) null, zzc.zza(), new zzfzc(zza), 6, (Object) null);
        zziko.zzb(c);
        return c;
    }
}
