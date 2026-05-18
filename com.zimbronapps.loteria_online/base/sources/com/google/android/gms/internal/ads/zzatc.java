package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzatc implements zzast {
    final /* synthetic */ Context zza;
    private File zzb = null;

    public zzatc(Context context) {
        this.zza = context;
    }

    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
