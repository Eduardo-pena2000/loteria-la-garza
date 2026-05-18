package com.google.android.gms.internal.ads;

import android.util.Base64;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzfbq implements zzgyw {
    static final /* synthetic */ zzfbq zza = new zzfbq();

    private /* synthetic */ zzfbq() {
    }

    public final /* synthetic */ x7.e zza(Object obj) {
        d4.h hVar = (d4.h) obj;
        if (hVar == null) {
            return zzgzo.zza(new zzfbs("", 1, null));
        }
        zzifk zzc = zzifl.zzc();
        for (d4.t tVar : hVar.a()) {
            zzifi zzc2 = zzifj.zzc();
            zzc2.zza(tVar.c());
            zzc2.zzb(tVar.a());
            zzc2.zzc(tVar.b());
            zzc.zza((zzifj) zzc2.zzbm());
        }
        return zzgzo.zza(new zzfbs(Base64.encodeToString(((zzifl) zzc.zzbm()).zzaN(), 1), 1, null));
    }
}
