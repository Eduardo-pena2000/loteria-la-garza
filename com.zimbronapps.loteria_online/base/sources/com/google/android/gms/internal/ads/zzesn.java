package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzesn implements zzfax {
    private final Context zza;

    public zzesn(Context context) {
        this.zza = context;
    }

    public final x7.e zza() {
        return zzgzo.zza(new zzeso(H1.a.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }

    public final int zzb() {
        return 2;
    }
}
