package com.google.android.gms.internal.ads;

import android.os.Build;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzvc implements zzvf {
    static final /* synthetic */ zzvc zza = new zzvc();

    private /* synthetic */ zzvc() {
    }

    public final /* synthetic */ int zza(Object obj) {
        int i = zzvg.zza;
        String str = ((zzun) obj).zza;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
