package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzazm extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzazn zza;

    public zzazm(zzazn zzaznVar) {
        Objects.requireNonNull(zzaznVar);
        this.zza = zzaznVar;
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzazn.class) {
            this.zza.zzd(networkCapabilities);
        }
    }

    public final void onLost(Network network) {
        synchronized (zzazn.class) {
            this.zza.zzd(null);
        }
    }
}
