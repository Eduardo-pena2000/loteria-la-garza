package com.applovin.adview;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ AppLovinFullscreenActivity a;
    public final /* synthetic */ Long b;

    public /* synthetic */ d(AppLovinFullscreenActivity appLovinFullscreenActivity, Long l) {
        this.a = appLovinFullscreenActivity;
        this.b = l;
    }

    public final void run() {
        AppLovinFullscreenActivity.c(this.a, this.b);
    }
}
