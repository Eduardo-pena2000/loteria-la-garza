package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcsk implements zzboh {
    final /* synthetic */ zzcsn zza;

    public zzcsk(zzcsn zzcsnVar) {
        Objects.requireNonNull(zzcsnVar);
        this.zza = zzcsnVar;
    }

    public final void zza(Object obj, Map map) {
        zzcsn zzcsnVar = this.zza;
        if (zzcsnVar.zze(map)) {
            zzcsnVar.zzf().execute(new zzcsj(this));
        }
    }
}
