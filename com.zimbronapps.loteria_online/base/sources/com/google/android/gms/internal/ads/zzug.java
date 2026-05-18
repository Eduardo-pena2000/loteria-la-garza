package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzug {
    private final HashSet zza;
    private LoudnessCodecController zzb;

    public zzug() {
        throw null;
    }

    public final void zza(int i) {
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            O.a(loudnessCodecController);
            this.zzb = null;
        }
        LoudnessCodecController a = S.a(i, zzhaf.zza(), new zzud(this));
        this.zzb = a;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            if (!Q.a(a, (MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public final void zzb(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController == null || Q.a(loudnessCodecController, mediaCodec)) {
            zzgrc.zzi(this.zza.add(mediaCodec));
        }
    }

    public final void zzc(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.zza.remove(mediaCodec) || (loudnessCodecController = this.zzb) == null) {
            return;
        }
        P.a(loudnessCodecController, mediaCodec);
    }

    public final void zzd() {
        this.zza.clear();
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            O.a(loudnessCodecController);
        }
    }

    public zzug(zzuf zzufVar) {
        this.zza = new HashSet();
    }
}
