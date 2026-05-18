package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgjz implements Runnable {
    private final /* synthetic */ zzgkc zza;
    private final /* synthetic */ Map zzb;
    private final /* synthetic */ Context zzc;
    private final /* synthetic */ View zzd;
    private final /* synthetic */ String zze;

    public /* synthetic */ zzgjz(zzgkc zzgkcVar, Map map, Context context, View view, Activity activity, String str) {
        this.zza = zzgkcVar;
        this.zzb = map;
        this.zzc = context;
        this.zzd = view;
        this.zze = str;
    }

    public final /* synthetic */ void run() {
        this.zza.zzp(this.zzb, this.zzc, this.zzd, null, this.zze);
    }
}
