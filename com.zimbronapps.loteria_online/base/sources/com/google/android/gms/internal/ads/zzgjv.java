package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgjv implements Callable {
    private final /* synthetic */ zzgkc zza;
    private final /* synthetic */ Context zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ View zzd;

    public /* synthetic */ zzgjv(zzgkc zzgkcVar, Context context, String str, View view, Activity activity) {
        this.zza = zzgkcVar;
        this.zzb = context;
        this.zzc = str;
        this.zzd = view;
    }

    public final /* synthetic */ Object call() {
        return this.zza.zzl(this.zzb, this.zzc, this.zzd, null);
    }
}
