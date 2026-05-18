package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.d;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbqe implements d.b {
    final /* synthetic */ zzcen zza;

    public zzbqe(zzbqf zzbqfVar, zzcen zzcenVar) {
        this.zza = zzcenVar;
        Objects.requireNonNull(zzbqfVar);
    }

    public final void onConnectionFailed(v6.b bVar) {
        this.zza.zzd(new RuntimeException("Connection failed."));
    }
}
