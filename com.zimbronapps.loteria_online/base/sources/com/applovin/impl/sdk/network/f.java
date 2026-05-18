package com.applovin.impl.sdk.network;

import com.applovin.sdk.AppLovinPostbackListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ b a;
    public final /* synthetic */ d b;
    public final /* synthetic */ AppLovinPostbackListener c;

    public /* synthetic */ f(b bVar, d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        this.a = bVar;
        this.b = dVar;
        this.c = appLovinPostbackListener;
    }

    public final void run() {
        b.e(this.a, this.b, this.c);
    }
}
