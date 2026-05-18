package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbsd implements zzcer {
    final /* synthetic */ zzbsf zza;

    public zzbsd(zzbsf zzbsfVar) {
        Objects.requireNonNull(zzbsfVar);
        this.zza = zzbsfVar;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        o0.k("Releasing engine reference.");
        this.zza.zzb().zzb();
    }
}
