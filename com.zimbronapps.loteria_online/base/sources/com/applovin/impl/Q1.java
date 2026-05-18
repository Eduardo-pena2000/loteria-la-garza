package com.applovin.impl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class q1 {
    private final long a;
    private String b;
    private y2 c;
    private com.applovin.impl.sdk.ad.b d;

    public q1(Object obj, long j) {
        this.a = j;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) obj;
            this.d = bVar;
            this.b = bVar.getAdZone().d() != null ? this.d.getAdZone().d().getLabel() : null;
        } else if (obj instanceof y2) {
            y2 y2Var = (y2) obj;
            this.c = y2Var;
            this.b = y2Var.getFormat().getLabel();
        }
    }

    public void a(Object obj) {
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            this.d = (com.applovin.impl.sdk.ad.b) obj;
        } else if (obj instanceof y2) {
            this.c = (y2) obj;
        }
    }

    public long b() {
        return this.a;
    }

    public com.applovin.impl.sdk.ad.b c() {
        return this.d;
    }

    public String d() {
        String str = this.b;
        return str != null ? str : "Unknown";
    }

    public y2 e() {
        return this.c;
    }

    public String f() {
        if (this.d != null) {
            return "AppLovin";
        }
        y2 y2Var = this.c;
        return y2Var != null ? y2Var.getNetworkName() : "Unknown";
    }

    public Object a() {
        com.applovin.impl.sdk.ad.b bVar = this.d;
        return bVar != null ? bVar : this.c;
    }
}
