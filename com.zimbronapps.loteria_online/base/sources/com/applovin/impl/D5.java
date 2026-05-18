package com.applovin.impl;

import com.applovin.impl.b5;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class d5 extends k3 {
    private final a3 k;

    public d5(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(a3Var.e(), jSONObject, jSONObject2, kVar);
        this.k = a3Var;
    }

    public boolean A() {
        return a("use_cached_adapter", Boolean.TRUE).booleanValue();
    }

    public b5.b t() {
        return b5.b.values()[a("signal_cache_level", ((Integer) this.a.a(r3.Q7)).intValue())];
    }

    public String toString() {
        return "SignalProviderSpec{adObject=" + a() + '}';
    }

    public a3 u() {
        return this.k;
    }

    public long v() {
        return a("signal_expiration_ms", ((Long) this.a.a(r3.P7)).longValue());
    }

    public boolean w() {
        return a("only_collect_signal_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean x() {
        return a("prefer_collect_signal_when_initialized", Boolean.TRUE).booleanValue();
    }

    public boolean y() {
        return a("fail_collection_for_empty_signal", (Boolean) this.a.a(r3.x8)).booleanValue();
    }

    public boolean z() {
        return a("ignore_init_failure", Boolean.FALSE).booleanValue();
    }
}
