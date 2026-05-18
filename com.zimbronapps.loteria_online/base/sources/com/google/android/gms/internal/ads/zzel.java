package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzel {
    final /* synthetic */ zzep zza;
    private final WeakReference zzb;
    private final Executor zzc;

    public zzel(zzep zzepVar, zzej zzejVar, Executor executor) {
        Objects.requireNonNull(zzepVar);
        this.zza = zzepVar;
        this.zzb = new WeakReference(zzejVar);
        this.zzc = executor;
    }

    public final boolean zza() {
        return this.zzb.get() == null;
    }

    public final void zzb() {
        this.zzc.execute(new zzek(this));
    }

    public final /* synthetic */ void zzc() {
        zzej zzejVar = (zzej) this.zzb.get();
        if (zzejVar != null) {
            zzejVar.zza(this.zza.zzc());
        }
    }
}
