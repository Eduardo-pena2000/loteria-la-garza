package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdvd implements zzdca {
    private final zzcjl zza;

    public zzdvd(zzcjl zzcjlVar) {
        this.zza = zzcjlVar;
    }

    public final void zza(Context context) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.onPause();
        }
    }

    public final void zzb(Context context) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.onResume();
        }
    }

    public final void zzc(Context context) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.destroy();
        }
    }
}
