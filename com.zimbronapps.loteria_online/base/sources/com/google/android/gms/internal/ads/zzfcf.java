package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzfcf implements zzgyw {
    static final /* synthetic */ zzfcf zza = new zzfcf();

    private /* synthetic */ zzfcf() {
    }

    public final /* synthetic */ x7.e zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return appSetIdInfo == null ? zzgzo.zza(new zzfch(null, -1)) : zzgzo.zza(new zzfch(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
