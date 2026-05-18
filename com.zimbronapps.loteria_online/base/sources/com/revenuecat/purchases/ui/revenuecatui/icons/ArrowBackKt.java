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
public final class ArrowBackKt {
    private static d _arrowBack;

    public static final d getArrowBack() {
        d dVar = _arrowBack;
        if (dVar != null) {
            t.d(dVar);
            return dVar;
        }
        d.a aVar = new d.a("AutoMirrored.Filled.ArrowBack", h.g(24.0f), h.g(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, (k) null);
        int a = o.a();
        F1 f1 = new F1(r0.b.a(), (k) null);
        int a2 = G1.a.a();
        int a3 = H1.a.a();
        f fVar = new f();
        fVar.i(20.0f, 11.0f);
        fVar.e(7.83f);
        fVar.h(5.59f, -5.59f);
        fVar.g(12.0f, 4.0f);
        fVar.h(-8.0f, 8.0f);
        fVar.h(8.0f, 8.0f);
        fVar.h(1.41f, -1.41f);
        fVar.g(7.83f, 13.0f);
        fVar.e(20.0f);
        fVar.p(-2.0f);
        fVar.a();
        d f = d.a.d(aVar, fVar.d(), a, "", f1, 1.0f, (h0) null, 1.0f, 1.0f, a2, a3, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).f();
        _arrowBack = f;
        t.d(f);
        return f;
    }
}
