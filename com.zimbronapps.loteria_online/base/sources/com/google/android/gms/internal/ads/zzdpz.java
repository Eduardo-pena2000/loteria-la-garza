package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzdpz implements ViewTreeObserver.OnScrollChangedListener {
    private final /* synthetic */ View zza;
    private final /* synthetic */ zzcjl zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ WindowManager.LayoutParams zzd;
    private final /* synthetic */ int zze;
    private final /* synthetic */ WindowManager zzf;

    public /* synthetic */ zzdpz(View view, zzcjl zzcjlVar, String str, WindowManager.LayoutParams layoutParams, int i, WindowManager windowManager) {
        this.zza = view;
        this.zzb = zzcjlVar;
        this.zzc = str;
        this.zzd = layoutParams;
        this.zze = i;
        this.zzf = windowManager;
    }

    public final /* synthetic */ void onScrollChanged() {
        Rect rect = new Rect();
        if (this.zza.getGlobalVisibleRect(rect)) {
            zzcjl zzcjlVar = this.zzb;
            if (zzcjlVar.zzE().getWindowToken() == null) {
                return;
            }
            int i = this.zze;
            WindowManager.LayoutParams layoutParams = this.zzd;
            String str = this.zzc;
            if ("1".equals(str) || "2".equals(str)) {
                layoutParams.y = rect.bottom - i;
            } else {
                layoutParams.y = rect.top - i;
            }
            this.zzf.updateViewLayout(zzcjlVar.zzE(), layoutParams);
        }
    }
}
