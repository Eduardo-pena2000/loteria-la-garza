package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzede implements Callable {
    private final /* synthetic */ CookieManager zza;

    public /* synthetic */ zzede(CookieManager cookieManager) {
        this.zza = cookieManager;
    }

    public final /* synthetic */ Object call() {
        CookieManager cookieManager = this.zza;
        if (cookieManager == null) {
            return "";
        }
        return cookieManager.getCookie((String) S5.D.c().zzd(zzbhe.zzbu));
    }
}
