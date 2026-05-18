package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcdr extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzcdu zza;

    public zzcdr(zzcdu zzcduVar) {
        Objects.requireNonNull(zzcduVar);
        this.zza = zzcduVar;
    }

    public final void onAvailable(Network network) {
        this.zza.zzC().set(true);
    }

    public final void onLost(Network network) {
        this.zza.zzC().set(false);
    }
}
