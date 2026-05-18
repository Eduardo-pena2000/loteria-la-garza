package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeul implements zzfav {
    final String zza;
    final int zzb;

    public zzeul(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i;
        Bundle bundle = ((zzdah) obj).zza;
        String str = this.zza;
        if (TextUtils.isEmpty(str) || (i = this.zzb) == -1) {
            return;
        }
        Bundle zza = zzfjz.zza(bundle, "pii");
        bundle.putBundle("pii", zza);
        zza.putString("pvid", str);
        zza.putInt("pvid_s", i);
    }
}
