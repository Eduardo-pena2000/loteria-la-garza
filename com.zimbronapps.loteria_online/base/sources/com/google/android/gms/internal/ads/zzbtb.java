package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbtb implements zzcep {
    final /* synthetic */ zzcen zza;
    final /* synthetic */ zzbsf zzb;

    public zzbtb(zzbtd zzbtdVar, zzcen zzcenVar, zzbsf zzbsfVar) {
        this.zza = zzcenVar;
        this.zzb = zzbsfVar;
        Objects.requireNonNull(zzbtdVar);
    }

    public final void zza() {
        o0.k("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzbso("Unable to obtain a JavascriptEngine."));
        this.zzb.zza();
    }
}
