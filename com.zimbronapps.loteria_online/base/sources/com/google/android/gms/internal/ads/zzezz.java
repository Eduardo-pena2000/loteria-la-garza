package com.google.android.gms.internal.ads;

import V5.o0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzezz implements zzgqt {
    private final /* synthetic */ String zza;

    public /* synthetic */ zzezz(String str) {
        this.zza = str;
    }

    public final /* synthetic */ Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        int i = zzfad.zzb;
        String str = this.zza;
        int i2 = o0.b;
        W5.p.c("Error calling adapter: ".concat(String.valueOf(str)));
        if (((Boolean) S5.D.c().zzd(zzbhe.zzoz)).booleanValue()) {
            R5.t.l().zzh(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str)));
            return null;
        }
        R5.t.l().zzg(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str)));
        return null;
    }
}
