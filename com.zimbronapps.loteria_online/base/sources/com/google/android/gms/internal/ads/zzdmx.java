package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzdmx implements zzboh {
    private final WeakReference zza;

    public /* synthetic */ zzdmx(zzdnb zzdnbVar, byte[] bArr) {
        this.zza = new WeakReference(zzdnbVar);
    }

    public final void zza(Object obj, Map map) {
        zzdnb zzdnbVar = (zzdnb) this.zza.get();
        if (zzdnbVar != null && "_ac".equals((String) map.get("eventName"))) {
            zzdnbVar.zzD().onAdClicked();
            if (((Boolean) S5.D.c().zzd(zzbhe.zzmj)).booleanValue()) {
                zzdnbVar.zzE().zzdu();
                if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    return;
                }
                zzdnbVar.zzE().zzdQ();
            }
        }
    }
}
