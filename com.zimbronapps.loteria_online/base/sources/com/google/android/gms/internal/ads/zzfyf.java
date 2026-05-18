package com.google.android.gms.internal.ads;

import android.net.Network;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzfyf implements zzfxz {
    private final /* synthetic */ Network zza;
    private final /* synthetic */ URL zzb;

    public /* synthetic */ zzfyf(Network network, URL url) {
        this.zza = network;
        this.zzb = url;
    }

    public final /* synthetic */ URLConnection zza() {
        return zzfyj.zzq(this.zza, this.zzb);
    }
}
