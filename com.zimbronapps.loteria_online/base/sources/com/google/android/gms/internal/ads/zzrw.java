package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzrw implements zzsj {
    final /* synthetic */ zzsd zza;

    public /* synthetic */ zzrw(zzsd zzsdVar, byte[] bArr) {
        Objects.requireNonNull(zzsdVar);
        this.zza = zzsdVar;
    }

    public final void zza(long j) {
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 41);
        sb.append("Ignoring impossibly large audio latency: ");
        sb.append(j);
        zzee.zzc("AudioTrackAudioOutput", sb.toString());
    }

    public final void zzb(long j) {
        zzrv zzrvVar = new zzrv(j);
        zzed zzs = this.zza.zzs();
        zzs.zzd(-1, zzrvVar);
        zzs.zze();
    }
}
