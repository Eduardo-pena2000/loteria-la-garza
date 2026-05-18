package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgfd implements zzikg {
    private final zzikp zza;

    private zzgfd(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzgfd zza(zzikp zzikpVar) {
        return new zzgfd(zzikpVar);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        DisplayMetrics displayMetrics = ((Context) this.zza.zzb()).getResources().getDisplayMetrics();
        zziko.zzb(displayMetrics);
        return displayMetrics;
    }
}
