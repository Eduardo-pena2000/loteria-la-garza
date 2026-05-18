package com.applovin.impl;

import com.applovin.impl.d6;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class k2 {
    private static boolean a;

    private static /* synthetic */ void a(com.applovin.impl.sdk.k kVar) {
        if (a) {
            return;
        }
        kVar.D().a(d2.S0, "no_ads_loaded");
    }

    public static void b(com.applovin.impl.sdk.k kVar) {
        Long l = (Long) kVar.a(r3.n8);
        if (l.longValue() <= 0) {
            return;
        }
        kVar.q0().a(new r6(kVar, true, "submitIntegrationErrorReport", new U1(kVar)), d6.b.OTHER, TimeUnit.SECONDS.toMillis(l.longValue()));
    }

    public static /* synthetic */ void c(com.applovin.impl.sdk.k kVar) {
        a(kVar);
    }

    public static void a() {
        a = true;
    }
}
