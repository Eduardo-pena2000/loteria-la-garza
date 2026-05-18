package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zztu implements zzui {
    private final zzgru zza;
    private final zzgru zzb;

    public zztu(int i) {
        zztt zzttVar = new zztt(i);
        zzts zztsVar = new zzts(i);
        this.zza = zzttVar;
        this.zzb = zztsVar;
    }

    public final zztv zza(zzuh zzuhVar) throws IOException {
        MediaCodec mediaCodec;
        zzun zzunVar = zzuhVar.zza;
        String str = zzunVar.zza;
        zztv zztvVar = null;
        try {
            StringBuilder sb = new StringBuilder(str.length() + 12);
            sb.append("createCodec:");
            sb.append(str);
            Trace.beginSection(sb.toString());
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                zztv zztvVar2 = new zztv(mediaCodec, (HandlerThread) this.zza.zza(), new zzty(mediaCodec, (HandlerThread) this.zzb.zza()), zzuhVar.zzf, null);
                try {
                    Trace.endSection();
                    Surface surface = zzuhVar.zzd;
                    int i = 0;
                    if (surface == null && zzunVar.zzh && Build.VERSION.SDK_INT >= 35) {
                        i = 8;
                    }
                    zztvVar2.zzt(zzuhVar.zzb, surface, null, i);
                    return zztvVar2;
                } catch (Exception e) {
                    e = e;
                    zztvVar = zztvVar2;
                    if (zztvVar != null) {
                        zztvVar.zzl();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodec = null;
        }
    }

    public final /* bridge */ /* synthetic */ zzuk zzb(zzuh zzuhVar) throws IOException {
        throw null;
    }
}
