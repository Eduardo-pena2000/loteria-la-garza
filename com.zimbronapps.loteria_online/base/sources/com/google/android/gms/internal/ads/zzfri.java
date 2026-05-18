package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfri extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzfrj zza;

    public zzfri(zzfrj zzfrjVar) {
        Objects.requireNonNull(zzfrjVar);
        this.zza = zzfrjVar;
    }

    public final void onAvailable(Network network) {
        this.zza.zzi(true);
    }

    public final void onLost(Network network) {
        this.zza.zzi(false);
    }
}
