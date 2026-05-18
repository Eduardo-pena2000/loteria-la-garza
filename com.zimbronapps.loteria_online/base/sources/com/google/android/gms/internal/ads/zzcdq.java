package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcdq extends V5.B {
    final /* synthetic */ zzcdu zza;

    public zzcdq(zzcdu zzcduVar) {
        Objects.requireNonNull(zzcduVar);
        this.zza = zzcduVar;
    }

    public final void zza() {
        zzcdu zzcduVar = this.zza;
        zzbhh zzbhhVar = new zzbhh(zzcduVar.zzz(), zzcduVar.zzA().a);
        synchronized (zzcduVar.zzy()) {
            try {
                R5.t.q();
                zzbhk.zza(zzcduVar.zzB(), zzbhhVar);
            } catch (IllegalArgumentException e) {
                int i = o0.b;
                W5.p.g("Cannot config CSI reporter.", e);
            }
        }
    }
}
