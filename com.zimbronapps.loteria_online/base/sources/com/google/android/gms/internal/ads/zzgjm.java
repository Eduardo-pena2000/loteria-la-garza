package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgjm implements Callable {
    private final /* synthetic */ zzgjq zza;
    private final /* synthetic */ Context zzb;
    private final /* synthetic */ View zzc;
    private final /* synthetic */ Activity zzd;

    public /* synthetic */ zzgjm(zzgjq zzgjqVar, Context context, String str, View view, Activity activity) {
        this.zza = zzgjqVar;
        this.zzb = context;
        this.zzc = view;
        this.zzd = activity;
    }

    public final /* synthetic */ Object call() {
        return this.zza.zzl(this.zzb, null, this.zzc, this.zzd);
    }
}
