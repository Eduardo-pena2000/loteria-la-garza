package com.revenuecat.purchases.common;

import ab.b;
import ab.d;
import ab.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DispatcherConstants {
    public static final DispatcherConstants INSTANCE = new DispatcherConstants();
    private static final long jitterDelay;
    private static final long jitterLongDelay;

    static {
        b.a aVar = ab.b.b;
        e eVar = e.d;
        jitterDelay = d.t(5000L, eVar);
        jitterLongDelay = d.t(10000L, eVar);
    }

    private DispatcherConstants() {
    }

    public final long getJitterDelay-UwyO8pc() {
        return jitterDelay;
    }

    public final long getJitterLongDelay-UwyO8pc() {
        return jitterLongDelay;
    }
}
