package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcdn {
    final /* synthetic */ zzcdo zza;
    private long zzb;
    private long zzc;

    public zzcdn(zzcdo zzcdoVar) {
        Objects.requireNonNull(zzcdoVar);
        this.zza = zzcdoVar;
        this.zzb = -1L;
        this.zzc = -1L;
    }

    public final long zza() {
        return this.zzc;
    }

    public final void zzb() {
        this.zzc = this.zza.zzk().b();
    }

    public final void zzc() {
        this.zzb = this.zza.zzk().b();
    }

    public final Bundle zzd() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzb);
        bundle.putLong("tclose", this.zzc);
        return bundle;
    }
}
