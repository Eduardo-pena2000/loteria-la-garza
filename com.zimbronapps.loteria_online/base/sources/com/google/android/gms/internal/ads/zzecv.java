package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzecv implements zzgyw {
    static final /* synthetic */ zzecv zza = new zzecv();

    private /* synthetic */ zzecv() {
    }

    public final /* synthetic */ x7.e zza(Object obj) {
        Throwable th = (ExecutionException) obj;
        if (th.getCause() != null) {
            th = th.getCause();
        }
        return zzgzo.zzc(th);
    }
}
