package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class p6 extends i5 {
    private final s7 g;
    private final AppLovinAdLoadListener h;

    public p6(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskResolveVastWrapper", kVar);
        this.h = appLovinAdLoadListener;
        this.g = s7Var;
    }

    public static /* synthetic */ s7 a(p6 p6Var) {
        return p6Var.g;
    }

    public static /* synthetic */ AppLovinAdLoadListener b(p6 p6Var) {
        return p6Var.h;
    }

    public void run() {
        String a2 = a8.a(this.g);
        if (!StringUtils.isValidString(a2)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Resolving VAST failed. Could not find resolution URL");
            }
            a(-1);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Resolving VAST ad with depth " + this.g.d() + " at " + a2);
        }
        try {
            this.a.q0().a(new a(com.applovin.impl.sdk.network.a.a(this.a).b(a2).c("GET").a(p8.f).a(((Integer) this.a.a(x4.U4)).intValue()).c(((Integer) this.a.a(x4.V4)).intValue()).a(false).a(), this.a));
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Unable to resolve VAST wrapper", th);
            }
            a(-1);
        }
    }

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        public void a(String str, p8 p8Var, int i) {
            this.a.q0().a(h6.a(p8Var, p6.a(p6.this), p6.b(p6.this), p6.this.a));
        }

        public void a(String str, int i, String str2, p8 p8Var) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Unable to resolve VAST wrapper. Server returned " + i);
            }
            p6.a(p6.this, i);
        }
    }

    public static /* synthetic */ void a(p6 p6Var, int i) {
        p6Var.a(i);
    }

    private void a(int i) {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.b(this.b, "Failed to resolve VAST wrapper due to error code " + i);
        }
        if (i == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.h;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i);
                return;
            }
            return;
        }
        a8.a(this.g, this.h, i == -1001 ? t7.h : t7.g, i, this.a);
    }
}
