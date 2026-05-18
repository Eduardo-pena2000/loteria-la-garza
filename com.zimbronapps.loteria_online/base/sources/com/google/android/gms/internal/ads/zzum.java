package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzum extends zzif {
    public final int zza;

    public zzum(Throwable th, zzun zzunVar) {
        int i;
        super("Decoder failed: ".concat(String.valueOf(zzunVar == null ? null : zzunVar.zza)), th);
        if (th instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            codecException.getDiagnosticInfo();
            i = codecException.getErrorCode();
        } else {
            i = 0;
        }
        this.zza = i;
    }
}
