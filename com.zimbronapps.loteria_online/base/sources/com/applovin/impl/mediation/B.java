package com.applovin.impl.mediation;

import com.applovin.impl.c3;
import com.applovin.impl.mediation.a;
import com.applovin.impl.mediation.c;
import com.applovin.impl.t2;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b implements a.a, c.a {
    private final com.applovin.impl.sdk.k a;
    private final a b;
    private final c c;

    public b(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = new a(kVar);
        this.c = new c(kVar, this);
    }

    public static /* synthetic */ void a(b bVar, c3 c3Var) {
        bVar.c(c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(c3 c3Var) {
        h A;
        if (c3Var == null || (A = c3Var.A()) == null || !c3Var.w().compareAndSet(false, true)) {
            return;
        }
        t2.e(A.c(), c3Var);
    }

    public void b(c3 c3Var) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new r(this, c3Var), c3Var.m0());
    }

    public void e(c3 c3Var) {
        long n0 = c3Var.n0();
        if (n0 >= 0) {
            this.c.a(c3Var, n0);
        }
        if (c3Var.x0() || c3Var.y0()) {
            this.b.a(c3Var, this);
        }
    }

    public void a() {
        this.c.a();
        this.b.a();
    }

    public void a(c3 c3Var) {
        c(c3Var);
    }
}
