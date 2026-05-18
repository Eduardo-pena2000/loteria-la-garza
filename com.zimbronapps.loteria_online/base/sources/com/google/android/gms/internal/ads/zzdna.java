package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzdna implements zzboh {
    private final WeakReference zza;
    private final zzfqk zzb;
    private final W5.w zzc;
    private final zzfoo zzd;

    public /* synthetic */ zzdna(zzdnb zzdnbVar, zzfqk zzfqkVar, W5.w wVar, zzfoo zzfooVar, byte[] bArr) {
        this.zza = new WeakReference(zzdnbVar);
        this.zzb = zzfqkVar;
        this.zzc = wVar;
        this.zzd = zzfooVar;
    }

    public final void zza(Object obj, Map map) {
        zzdnb zzdnbVar = (zzdnb) this.zza.get();
        String str = (String) map.get("u");
        if (zzdnbVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.zzb.zzb(str, this.zzc, this.zzd, zzdnbVar.zzF());
    }
}
