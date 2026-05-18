package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzeuh implements zzgyw {
    static final /* synthetic */ zzeuh zza = new zzeuh();

    private /* synthetic */ zzeuh() {
    }

    public final /* synthetic */ x7.e zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return appSetIdInfo == null ? zzgzo.zza(new zzeul(null, -1)) : zzgzo.zza(new zzeul(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
