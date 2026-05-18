package com.applovin.impl.sdk;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ EventServiceImpl a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ x(EventServiceImpl eventServiceImpl, String str, Map map, boolean z) {
        this.a = eventServiceImpl;
        this.b = str;
        this.c = map;
        this.d = z;
    }

    public final void run() {
        EventServiceImpl.a(this.a, this.b, this.c, this.d);
    }
}
