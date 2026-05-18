package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzsz implements zzrg {
    final /* synthetic */ zzta zza;

    public /* synthetic */ zzsz(zzta zztaVar, byte[] bArr) {
        Objects.requireNonNull(zztaVar);
        this.zza = zztaVar;
    }

    public final void zza(Exception exc) {
        zzee.zzf("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzaw().zzi(exc);
    }
}
