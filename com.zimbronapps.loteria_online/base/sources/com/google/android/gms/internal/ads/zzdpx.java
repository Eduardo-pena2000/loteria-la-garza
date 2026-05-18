package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzdpx implements zzboh {
    private final /* synthetic */ zzdqc zza;
    private final /* synthetic */ View zzb;
    private final /* synthetic */ WindowManager zzc;

    public /* synthetic */ zzdpx(zzdqc zzdqcVar, View view, WindowManager windowManager) {
        this.zza = zzdqcVar;
        this.zzb = view;
        this.zzc = windowManager;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        this.zza.zzd(this.zzb, this.zzc, (zzcjl) obj, map);
    }
}
