package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgjy implements Runnable {
    private final /* synthetic */ zzgkc zza;
    private final /* synthetic */ Map zzb;
    private final /* synthetic */ Context zzc;
    private final /* synthetic */ View zzd;
    private final /* synthetic */ Activity zze;

    public /* synthetic */ zzgjy(zzgkc zzgkcVar, Map map, Context context, View view, Activity activity, String str) {
        this.zza = zzgkcVar;
        this.zzb = map;
        this.zzc = context;
        this.zzd = view;
        this.zze = activity;
    }

    public final /* synthetic */ void run() {
        this.zza.zzo(this.zzb, this.zzc, this.zzd, this.zze, null);
    }
}
