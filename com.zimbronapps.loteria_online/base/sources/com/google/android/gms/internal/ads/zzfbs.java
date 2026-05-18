package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfbs implements zzfav {
    final String zza;
    final int zzb;

    public /* synthetic */ zzfbs(String str, int i, byte[] bArr) {
        this.zza = str;
        this.zzb = i;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzdah zzdahVar = (zzdah) obj;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzlR)).booleanValue()) {
            String str = this.zza;
            if (!TextUtils.isEmpty(str)) {
                zzdahVar.zza.putString("topics", str);
            }
            int i = this.zzb;
            if (i != -1) {
                zzdahVar.zza.putInt("atps", i);
            }
        }
    }
}
