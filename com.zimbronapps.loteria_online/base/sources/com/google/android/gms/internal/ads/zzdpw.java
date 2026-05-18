package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzdpw implements zzboh {
    private final /* synthetic */ zzdqc zza;
    private final /* synthetic */ WindowManager zzb;
    private final /* synthetic */ View zzc;

    public /* synthetic */ zzdpw(zzdqc zzdqcVar, WindowManager windowManager, View view) {
        this.zza = zzdqcVar;
        this.zzb = windowManager;
        this.zzc = view;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        this.zza.zzc(this.zzb, this.zzc, (zzcjl) obj, map);
    }
}
