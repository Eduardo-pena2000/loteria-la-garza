package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.d;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbfy implements d.b {
    final /* synthetic */ zzcen zza;
    final /* synthetic */ zzbfz zzb;

    public zzbfy(zzbfz zzbfzVar, zzcen zzcenVar) {
        this.zza = zzcenVar;
        Objects.requireNonNull(zzbfzVar);
        this.zzb = zzbfzVar;
    }

    public final void onConnectionFailed(v6.b bVar) {
        synchronized (this.zzb.zzf()) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
