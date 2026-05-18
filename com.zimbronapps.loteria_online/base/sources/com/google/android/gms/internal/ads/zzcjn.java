package com.google.android.gms.internal.ads;

import V5.o0;
import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcjn implements zzgzl {
    final /* synthetic */ List zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Uri zzc;
    final /* synthetic */ zzcjw zzd;

    public zzcjn(zzcjw zzcjwVar, List list, String str, Uri uri) {
        this.zza = list;
        this.zzb = str;
        this.zzc = uri;
        Objects.requireNonNull(zzcjwVar);
        this.zzd = zzcjwVar;
    }

    public final void zza(Throwable th) {
        String valueOf = String.valueOf(this.zzc);
        int i = o0.b;
        W5.p.f("Failed to parse gmsg params for: ".concat(valueOf));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list = this.zza;
        String str = this.zzb;
        this.zzd.zzaa((Map) obj, list, str);
    }
}
