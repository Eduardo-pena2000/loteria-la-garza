package com.applovin.impl.sdk;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ EventServiceImpl a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ Map d;

    public /* synthetic */ y(EventServiceImpl eventServiceImpl, String str, Map map, Map map2) {
        this.a = eventServiceImpl;
        this.b = str;
        this.c = map;
        this.d = map2;
    }

    public final void run() {
        EventServiceImpl.b(this.a, this.b, this.c, this.d);
    }
}
