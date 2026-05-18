package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcdl implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcen zzb;

    public zzcdl(zzcdm zzcdmVar, Context context, zzcen zzcenVar) {
        this.zza = context;
        this.zzb = zzcenVar;
        Objects.requireNonNull(zzcdmVar);
    }

    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (IllegalStateException | IOException | v6.i | v6.j e) {
            this.zzb.zzd(e);
            W5.p.d("Exception while getting advertising Id info", e);
        }
    }
}
