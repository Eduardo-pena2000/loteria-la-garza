package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfqu extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzfqw zza;

    public zzfqu(zzfqw zzfqwVar) {
        Objects.requireNonNull(zzfqwVar);
        this.zza = zzfqwVar;
    }

    public final void onAvailable(Network network) {
        this.zza.zzk(true);
    }

    public final void onLost(Network network) {
        this.zza.zzk(false);
    }
}
