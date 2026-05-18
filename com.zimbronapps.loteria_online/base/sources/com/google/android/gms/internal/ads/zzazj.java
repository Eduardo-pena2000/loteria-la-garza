package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzazj implements Callable {
    private final /* synthetic */ Context zza;

    public /* synthetic */ zzazj(zzazk zzazkVar, Context context) {
        this.zza = context;
    }

    public final /* synthetic */ Object call() {
        Context context = this.zza;
        try {
            return zzfvo.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }
}
