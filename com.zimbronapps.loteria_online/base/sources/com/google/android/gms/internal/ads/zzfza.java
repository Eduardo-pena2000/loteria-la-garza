package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfza {
    private final zzfyw zza;

    public /* synthetic */ zzfza(zzfyw zzfywVar, kotlin.jvm.internal.k kVar) {
        this.zza = zzfywVar;
    }

    public final /* synthetic */ zzfyy zza() {
        zzibr zzbm = this.zza.zzbm();
        kotlin.jvm.internal.t.f(zzbm, "build(...)");
        return (zzfyy) zzbm;
    }

    public final /* synthetic */ zziev zzb() {
        Map zzb = this.zza.zzb();
        kotlin.jvm.internal.t.f(zzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zziev(zzb);
    }

    public final void zzc(zziev zzievVar, String str, zzfyu zzfyuVar) {
        kotlin.jvm.internal.t.g(zzievVar, "<this>");
        kotlin.jvm.internal.t.g(str, "key");
        kotlin.jvm.internal.t.g(zzfyuVar, "value");
        this.zza.zzc(str, zzfyuVar);
    }

    public final /* synthetic */ void zzd(zziev zzievVar, String str) {
        kotlin.jvm.internal.t.g(zzievVar, "<this>");
        kotlin.jvm.internal.t.g(str, "key");
        this.zza.zza(str);
    }
}
