package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbx extends BroadcastReceiver {
    private final zzdx zza;

    public /* synthetic */ zzbx(zzbz zzbzVar, zzdx zzdxVar, zzby zzbyVar, byte[] bArr) {
        Objects.requireNonNull(zzbzVar);
        this.zza = zzdxVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zza.zzn(new zzbw(this));
        }
    }
}
