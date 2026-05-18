package com.google.android.gms.internal.ads;

import java.net.HttpURLConnection;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgci implements Runnable {
    private final /* synthetic */ HttpURLConnection zza;

    public /* synthetic */ zzgci(HttpURLConnection httpURLConnection) {
        this.zza = httpURLConnection;
    }

    public final /* synthetic */ void run() {
        this.zza.disconnect();
    }
}
