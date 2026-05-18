package com.applovin.impl.mediation;

import com.applovin.impl.c3;
import com.applovin.impl.g0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c {
    private final com.applovin.impl.sdk.k a;
    private final com.applovin.impl.sdk.o b;
    private final a c;
    private g0 d;

    public interface a {
        void a(c3 c3Var);
    }

    public c(com.applovin.impl.sdk.k kVar, a aVar) {
        this.a = kVar;
        this.b = kVar.O();
        this.c = aVar;
    }

    public static /* synthetic */ void a(c cVar, c3 c3Var) {
        cVar.a(c3Var);
    }

    public void a(c3 c3Var, long j) {
        if (com.applovin.impl.sdk.o.a()) {
            this.b.a("AdHiddenCallbackTimeoutManager", "Scheduling in " + j + "ms...");
        }
        this.d = g0.a(j, this.a, new s(this, c3Var));
    }

    private /* synthetic */ void a(c3 c3Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.b.a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.c.a(c3Var);
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.b.a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        g0 g0Var = this.d;
        if (g0Var != null) {
            g0Var.a();
            this.d = null;
        }
    }
}
