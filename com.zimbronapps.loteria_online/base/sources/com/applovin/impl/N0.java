package com.applovin.impl;

import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class n0 extends i5 {
    private final String g;
    private final com.applovin.impl.sdk.network.a h;

    public n0(String str, com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        super("CommunicatorRequestTask", kVar, str);
        this.g = str;
        this.h = aVar;
    }

    public static /* synthetic */ String a(n0 n0Var) {
        return n0Var.g;
    }

    public static /* synthetic */ com.applovin.impl.sdk.network.a b(n0 n0Var) {
        return n0Var.h;
    }

    public void run() {
        this.a.q0().a(new a(this.h, this.a, d()));
    }

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z) {
            super(aVar, kVar, z);
        }

        public void a(String str, JSONObject jSONObject, int i) {
            this.a.t().a(n0.a(n0.this), n0.b(n0.this).f(), i, jSONObject, null, true);
        }

        public void a(String str, int i, String str2, JSONObject jSONObject) {
            this.a.t().a(n0.a(n0.this), n0.b(n0.this).f(), i, jSONObject, str2, false);
        }
    }
}
