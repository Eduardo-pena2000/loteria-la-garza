package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzexo implements zzfav {
    private final String zza;
    private final String zzb;
    private final Bundle zzc;

    public /* synthetic */ zzexo(String str, String str2, Bundle bundle, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        bundle.putString("consent_string", this.zza);
        bundle.putString("fc_consent", this.zzb);
        Bundle bundle2 = this.zzc;
        if (bundle2 != null) {
            bundle.putBundle("iab_consent_info", bundle2);
        }
    }
}
