package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcez implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcfi zzb;

    public zzcez(zzcfi zzcfiVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        Objects.requireNonNull(zzcfiVar);
        this.zzb = zzcfiVar;
    }

    public final void run() {
        zzcfi zzcfiVar = this.zzb;
        zzcfiVar.zzs(this.zza);
        if (zzcfiVar.zzt() != null) {
            zzcfiVar.zzt().zzb();
        }
    }
}
