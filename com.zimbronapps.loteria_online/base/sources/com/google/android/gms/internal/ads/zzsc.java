package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzsc {
    final /* synthetic */ zzsd zza;
    private final Handler zzb;
    private final AudioTrack.StreamEventCallback zzc;

    public /* synthetic */ zzsc(zzsd zzsdVar, byte[] bArr) {
        Objects.requireNonNull(zzsdVar);
        this.zza = zzsdVar;
        Handler zzc = zzfj.zzc(null);
        this.zzb = zzc;
        zzsa zzsaVar = new zzsa(this);
        this.zzc = zzsaVar;
        Objects.requireNonNull(zzc);
        V2.T.a(zzsdVar.zzr(), new zzsb(zzc), zzsaVar);
    }

    public final /* synthetic */ void zza() {
        V2.S.a(this.zza.zzr(), this.zzc);
        this.zzb.removeCallbacksAndMessages((Object) null);
    }
}
