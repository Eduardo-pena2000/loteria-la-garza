package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.d3;
import com.applovin.impl.f8;
import com.applovin.impl.g8;
import com.applovin.impl.mediation.ads.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b implements g8.a {
    private final com.applovin.impl.sdk.k a;
    private final d3 b;
    private final g8 c;
    private final f8 d;
    private final a.a e;

    public b(d3 d3Var, ViewGroup viewGroup, a.a aVar, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = d3Var;
        this.e = aVar;
        this.d = new f8(viewGroup, kVar);
        g8 g8Var = new g8(viewGroup, kVar, this);
        this.c = g8Var;
        g8Var.a(d3Var);
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    public void a() {
        this.c.b();
    }

    public d3 b() {
        return this.b;
    }

    public void c() {
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.b.u0().compareAndSet(false, true)) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.b.getNativeAd().isExpired()) {
                com.applovin.impl.sdk.o.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.a.f().a(this.b);
            }
            this.a.X().processRawAdImpression(this.b, this.e);
        }
    }

    public void onLogVisibilityImpression() {
        a(this.d.a(this.b));
    }

    private void a(long j) {
        if (this.b.v0().compareAndSet(false, true)) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.a.X().processViewabilityAdImpressionPostback(this.b, j, this.e);
        }
    }
}
