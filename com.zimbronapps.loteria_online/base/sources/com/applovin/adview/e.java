package com.applovin.adview;

import com.applovin.impl.n2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ AppLovinFullscreenActivity a;
    public final /* synthetic */ n2 b;

    public /* synthetic */ e(AppLovinFullscreenActivity appLovinFullscreenActivity, n2 n2Var) {
        this.a = appLovinFullscreenActivity;
        this.b = n2Var;
    }

    public final void run() {
        AppLovinFullscreenActivity.a(this.a, this.b);
    }
}
