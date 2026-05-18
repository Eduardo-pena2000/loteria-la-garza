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
public final class CircleOutlinedKt {
    private static d _circleOutlined;

    public static final d getCircleOutlined() {
        d dVar = _circleOutlined;
        if (dVar != null) {
            t.d(dVar);
            return dVar;
        }
        d.a aVar = new d.a("Outlined.Circle", h.g(24.0f), h.g(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, (k) null);
        int a = o.a();
        F1 f1 = new F1(r0.b.a(), (k) null);
        int a2 = G1.a.a();
        int a3 = H1.a.a();
        f fVar = new f();
        fVar.i(12.0f, 2.0f);
        fVar.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        fVar.b(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f);
        fVar.b(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        fVar.b(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        fVar.a();
        fVar.i(12.0f, 20.0f);
        fVar.b(7.58f, 20.0f, 4.0f, 16.42f, 4.0f, 12.0f);
        fVar.b(4.0f, 7.58f, 7.58f, 4.0f, 12.0f, 4.0f);
        fVar.b(16.42f, 4.0f, 20.0f, 7.58f, 20.0f, 12.0f);
        fVar.b(20.0f, 16.42f, 16.42f, 20.0f, 12.0f, 20.0f);
        fVar.a();
        d f = d.a.d(aVar, fVar.d(), a, "", f1, 1.0f, (h0) null, 1.0f, 1.0f, a2, a3, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).f();
        _circleOutlined = f;
        t.d(f);
        return f;
    }
}
