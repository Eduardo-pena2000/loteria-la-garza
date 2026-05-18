package com.applovin.impl;

import com.applovin.impl.d6;
import com.applovin.impl.o7;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class k6 extends i5 {
    private final s7 g;
    private final AppLovinAdLoadListener h;

    public k6(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderVastAd", kVar);
        this.h = appLovinAdLoadListener;
        this.g = s7Var;
    }

    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Rendering VAST ad...");
        }
        int size = this.g.a().size();
        Set hashSet = new HashSet(size);
        Set hashSet2 = new HashSet(size);
        String str = "";
        x7 x7Var = null;
        b8 b8Var = null;
        r7 r7Var = null;
        q7 q7Var = null;
        String str2 = "";
        for (p8 p8Var : this.g.a()) {
            p8 b = p8Var.b(a8.b(p8Var) ? "Wrapper" : "InLine");
            if (b != null) {
                p8 b2 = b.b("AdSystem");
                if (b2 != null) {
                    x7Var = x7.a(b2, x7Var, this.a);
                }
                str = a8.a(b, "AdTitle", str);
                str2 = a8.a(b, "Description", str2);
                a8.a(b.a("Impression"), hashSet, this.g, this.a);
                p8 c = b.c("ViewableImpression");
                if (c != null) {
                    a8.a(c.a("Viewable"), hashSet, this.g, this.a);
                }
                p8 b3 = b.b("AdVerifications");
                if (b3 != null) {
                    q7Var = q7.a(b3, q7Var, this.g, this.a);
                }
                a8.a(b.a("Error"), hashSet2, this.g, this.a);
                p8 c2 = b.c("Creatives");
                if (c2 != null) {
                    for (p8 p8Var2 : c2.b()) {
                        p8 c3 = p8Var2.c("Linear");
                        if (c3 != null) {
                            b8Var = b8.a(c3, b8Var, this.g, this.a);
                        } else {
                            p8 b4 = p8Var2.b("CompanionAds");
                            if (b4 != null) {
                                p8 b5 = b4.b("Companion");
                                if (b5 != null) {
                                    r7Var = r7.a(b5, r7Var, this.g, this.a);
                                }
                            } else if (com.applovin.impl.sdk.o.a()) {
                                this.c.b(this.b, "Received and will skip rendering for an unidentified creative: " + p8Var2);
                            }
                        }
                    }
                }
            } else if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Did not find wrapper or inline response for node: " + p8Var);
            }
        }
        o7 a = new o7.b().a(this.a).a(this.g.b()).b(this.g.e()).a(this.g.c()).b(str).a(str2).a(x7Var).a(b8Var).a(r7Var).a(q7Var).b(hashSet).a(q7Var).a(hashSet2).a();
        t7 c4 = a8.c(a);
        if (c4 != null) {
            a8.a(this.g, this.h, c4, -6, this.a);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Finished rendering VAST ad: " + a);
        }
        a.getAdEventTracker().e();
        this.a.q0().a((i5) new n5(a, this.a, this.h), d6.b.CACHING);
    }
}
