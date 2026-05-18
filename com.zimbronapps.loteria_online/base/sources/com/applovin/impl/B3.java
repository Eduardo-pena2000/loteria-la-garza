package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b3 extends h3 {
    public b3(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(a3Var, jSONObject, jSONObject2, null, kVar);
    }

    public y2 a(com.applovin.impl.mediation.h hVar) {
        return new b3(this, hVar);
    }

    public long r0() {
        long a = a("ad_refresh_ms", -1L);
        return a >= 0 ? a : b("ad_refresh_ms", ((Long) this.a.a(r3.y7)).longValue());
    }

    public long s0() {
        return n7.e(a("bg_color", (String) null));
    }

    public int t0() {
        int a = a("ad_view_height", -2);
        if (a != -2) {
            return a;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getHeight();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public long u0() {
        return a("viewability_imp_delay_ms", ((Long) this.a.a(x4.n1)).longValue());
    }

    public int v0() {
        int a = a("ad_view_width", -2);
        if (a != -2) {
            return a;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getWidth();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public boolean w0() {
        return r0() >= 0;
    }

    public boolean x0() {
        return a("proe", (Boolean) this.a.a(r3.a8)).booleanValue();
    }

    private b3(b3 b3Var, com.applovin.impl.mediation.h hVar) {
        super(b3Var.N(), b3Var.a(), b3Var.g(), hVar, b3Var.a);
    }
}
