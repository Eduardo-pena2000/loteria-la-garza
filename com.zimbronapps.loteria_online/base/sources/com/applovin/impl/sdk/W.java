package com.applovin.impl.sdk;

import com.applovin.impl.sdk.AppLovinAdServiceImpl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ AppLovinAdServiceImpl.b a;
    public final /* synthetic */ com.applovin.impl.sdk.ad.b b;

    public /* synthetic */ w(AppLovinAdServiceImpl.b bVar, com.applovin.impl.sdk.ad.b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    public final void run() {
        AppLovinAdServiceImpl.c(this.a, this.b);
    }
}
