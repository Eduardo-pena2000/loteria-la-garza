package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzeey implements zzdel {
    private final Context zza;
    private final zzccq zzb;

    public zzeey(Context context, zzccq zzccqVar) {
        this.zza = context;
        this.zzb = zzccqVar;
    }

    public final void zzdO(zzbzu zzbzuVar) {
    }

    public final void zzdP(zzfjc zzfjcVar) {
        String str = zzfjcVar.zzb.zzb.zze;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzccq zzccqVar = this.zzb;
        Context context = this.zza;
        zzccqVar.zzc(context, zzfjcVar.zza.zza.zzd);
        zzccqVar.zzm(context, str);
    }
}
