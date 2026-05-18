package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzvb implements zzuz {
    private final int zza;
    private MediaCodecInfo[] zzb;

    public zzvb(boolean z, boolean z2, boolean z3) {
        int i = 1;
        if (!z && !z2 && !z3) {
            i = 0;
        }
        this.zza = i;
    }

    private final void zzf() {
        if (this.zzb == null) {
            this.zzb = new MediaCodecList(this.zza).getCodecInfos();
        }
    }

    public final int zza() {
        zzf();
        return this.zzb.length;
    }

    public final MediaCodecInfo zzb(int i) {
        zzf();
        return this.zzb[i];
    }

    public final boolean zzc() {
        return true;
    }

    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public final boolean zze(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }
}
