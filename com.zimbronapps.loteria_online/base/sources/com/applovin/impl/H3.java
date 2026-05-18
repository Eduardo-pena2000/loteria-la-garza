package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class h3 extends y2 {
    public h3(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.h hVar, com.applovin.impl.sdk.k kVar) {
        super(a3Var, jSONObject, jSONObject2, hVar, kVar);
    }

    public float j0() {
        return a("viewability_min_alpha", ((Float) this.a.a(x4.w1)).floatValue() / 100.0f);
    }

    public int k0() {
        return a("viewability_min_pixels", -1);
    }

    public int l0() {
        MaxAdFormat format = getFormat();
        x4 x4Var = format == MaxAdFormat.BANNER ? x4.p1 : format == MaxAdFormat.MREC ? x4.r1 : format == MaxAdFormat.LEADER ? x4.t1 : format == MaxAdFormat.NATIVE ? x4.v1 : null;
        if (x4Var != null) {
            return a("viewability_min_height", ((Integer) this.a.a(x4Var)).intValue());
        }
        return 0;
    }

    public float m0() {
        return a("viewability_min_percentage_dp", -1.0f);
    }

    public float n0() {
        return a("viewability_min_percentage_pixels", -1.0f);
    }

    public long o0() {
        return a("viewability_timer_min_visible_ms", ((Long) this.a.a(x4.x1)).longValue());
    }

    public int p0() {
        MaxAdFormat format = getFormat();
        x4 x4Var = format == MaxAdFormat.BANNER ? x4.o1 : format == MaxAdFormat.MREC ? x4.q1 : format == MaxAdFormat.LEADER ? x4.s1 : format == MaxAdFormat.NATIVE ? x4.u1 : null;
        if (x4Var != null) {
            return a("viewability_min_width", ((Integer) this.a.a(x4Var)).intValue());
        }
        return 0;
    }

    public boolean q0() {
        return k0() >= 0 || m0() >= 0.0f || n0() >= 0.0f;
    }
}
