package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbsh implements zzcep {
    final /* synthetic */ zzbsf zza;

    public zzbsh(zzbsk zzbskVar, zzbsf zzbsfVar) {
        this.zza = zzbsfVar;
        Objects.requireNonNull(zzbskVar);
    }

    public final void zza() {
        o0.k("Rejecting reference for JS Engine.");
        if (((Boolean) S5.D.c().zzd(zzbhe.zziK)).booleanValue()) {
            this.zza.zzh(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.zza.zzg();
        }
    }
}
