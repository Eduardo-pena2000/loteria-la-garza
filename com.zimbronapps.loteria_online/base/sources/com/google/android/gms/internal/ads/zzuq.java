package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzuq extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzun zzc;
    public final String zzd;

    public zzuq(zzv zzvVar, Throwable th, boolean z, int i) {
        String obj = zzvVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 25 + obj.length());
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(obj);
        String sb2 = sb.toString();
        String str = zzvVar.zzo;
        int abs = Math.abs(i);
        StringBuilder sb3 = new StringBuilder(String.valueOf(abs).length() + 60);
        sb3.append("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_");
        sb3.append(abs);
        this(sb2, th, str, false, null, sb3.toString(), null);
    }

    public final /* synthetic */ zzuq zza(zzuq zzuqVar) {
        return new zzuq(getMessage(), getCause(), this.zza, false, this.zzc, this.zzd, zzuqVar);
    }

    public zzuq(zzv zzvVar, Throwable th, boolean z, zzun zzunVar) {
        String str = zzunVar.zza;
        int length = str.length();
        String obj = zzvVar.toString();
        StringBuilder sb = new StringBuilder(length + 23 + obj.length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(obj);
        this(sb.toString(), th, zzvVar.zzo, false, zzunVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private zzuq(String str, Throwable th, String str2, boolean z, zzun zzunVar, String str3, zzuq zzuqVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzunVar;
        this.zzd = str3;
    }
}
