package com.applovin.impl;

import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class d3 extends h3 implements t1 {
    private final AtomicBoolean A;
    private final AtomicBoolean z;

    public d3(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(a3Var, jSONObject, jSONObject2, null, kVar);
        this.z = new AtomicBoolean();
        this.A = new AtomicBoolean();
    }

    private long r0() {
        long a = a("ad_expiration_ms", -1L);
        return a < 0 ? b("ad_expiration_ms", ((Long) this.a.a(r3.S7)).longValue()) : a;
    }

    public y2 a(com.applovin.impl.mediation.h hVar) {
        return new d3(this, hVar);
    }

    public long getTimeToLiveMillis() {
        return r0() - (SystemClock.elapsedRealtime() - I());
    }

    public MaxNativeAdView s0() {
        return this.n.f();
    }

    public void setExpired() {
        MaxNativeAd nativeAd = getNativeAd();
        if (nativeAd != null) {
            nativeAd.setExpired();
        }
    }

    public ViewGroup t0() {
        return this.n.h();
    }

    public AtomicBoolean u0() {
        return this.z;
    }

    public AtomicBoolean v0() {
        return this.A;
    }

    public boolean w0() {
        return a("inacc", (Boolean) this.a.a(r3.m8)).booleanValue();
    }

    public boolean x0() {
        return this.n == null;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.n.a(maxNativeAdView);
    }

    public void a(ViewGroup viewGroup) {
        this.n.a(viewGroup);
    }

    private d3(d3 d3Var, com.applovin.impl.mediation.h hVar) {
        super(d3Var.N(), d3Var.a(), d3Var.g(), hVar, d3Var.a);
        this.z = new AtomicBoolean();
        this.A = new AtomicBoolean();
    }
}
