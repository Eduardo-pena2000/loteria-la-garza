package com.revenuecat.purchases.ui.revenuecatui.icons;

import B0.d;
import B0.f;
import B0.o;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import n1.h;
import v0.F1;
import v0.G1;
import v0.H1;
import v0.h0;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CloseKt {
    private static d _close;

    public static final d getClose() {
        d dVar = _close;
        if (dVar != null) {
            t.d(dVar);
            return dVar;
        }
        d.a aVar = new d.a("Filled.Close", h.g(24.0f), h.g(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, (k) null);
        int a = o.a();
        F1 f1 = new F1(r0.b.a(), (k) null);
        int a2 = G1.a.a();
        int a3 = H1.a.a();
        f fVar = new f();
        fVar.i(19.0f, 6.41f);
        fVar.g(17.59f, 5.0f);
        fVar.g(12.0f, 10.59f);
        fVar.g(6.41f, 5.0f);
        fVar.g(5.0f, 6.41f);
        fVar.g(10.59f, 12.0f);
        fVar.g(5.0f, 17.59f);
        fVar.g(6.41f, 19.0f);
        fVar.g(12.0f, 13.41f);
        fVar.g(17.59f, 19.0f);
        fVar.g(19.0f, 17.59f);
        fVar.g(13.41f, 12.0f);
        fVar.a();
        d f = d.a.d(aVar, fVar.d(), a, "", f1, 1.0f, (h0) null, 1.0f, 1.0f, a2, a3, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).f();
        _close = f;
        t.d(f);
        return f;
    }
}
