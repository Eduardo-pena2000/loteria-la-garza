package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfgb implements zzgqt {
    final /* synthetic */ zzfgf zza;

    public zzfgb(zzfgf zzfgfVar) {
        Objects.requireNonNull(zzfgfVar);
        this.zza = zzfgfVar;
    }

    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        int i = o0.b;
        W5.p.d("", (zzeff) obj);
        o0.k("Failed to get a cache key, reverting to legacy flow.");
        zzfgf zzfgfVar = this.zza;
        zzfgfVar.zzd(new zzfgd(null, zzfgfVar.zzb(), null));
        return zzfgfVar.zzc();
    }
}
