package com.google.android.gms.internal.ads;

import V5.F0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfal implements zzfax {
    private final zzgzy zza;
    private final Context zzb;
    private final W5.a zzc;
    private final String zzd;

    public zzfal(zzgzy zzgzyVar, Context context, W5.a aVar, String str) {
        this.zza = zzgzyVar;
        this.zzb = context;
        this.zzc = aVar;
        this.zzd = str;
    }

    public final x7.e zza() {
        return this.zza.zzc(new zzfak(this));
    }

    public final int zzb() {
        return 35;
    }

    public final /* synthetic */ zzfam zzc() {
        Context context = this.zzb;
        boolean g = G6.e.a(context).g();
        R5.t.g();
        boolean j = F0.j(context);
        String str = this.zzc.a;
        R5.t.g();
        boolean k = F0.k();
        R5.t.g();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return new zzfam(g, j, str, k, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.c(context, "com.google.android.gms.ads.dynamite"), DynamiteModule.a(context, "com.google.android.gms.ads.dynamite"), this.zzd);
    }
}
