package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class t0 {
    private final StringBuilder a = new StringBuilder();

    public void a(v0 v0Var, long j) {
        if (v0Var.d() == v0.b.g) {
            return;
        }
        a(a(v0Var), j);
    }

    public void b() {
        a("Invalid Activity");
    }

    public String toString() {
        return this.a.toString();
    }

    public void b(String str) {
        a("Invalid state: " + str);
    }

    public void a(v0 v0Var, boolean z, long j) {
        a(a(v0Var) + ": " + z, j);
    }

    public void a() {
        this.a.setLength(0);
    }

    private void a(String str, long j) {
        a(str + " after " + j + "ms");
    }

    private void a(String str) {
        StringBuilder sb = this.a;
        sb.append(str);
        sb.append("\n");
    }

    private String a(v0 v0Var) {
        v0.b d = v0Var.d();
        if (d == v0.b.c) {
            return ((y0) v0Var).g();
        }
        if (d == v0.b.g) {
            return StringUtils.emptyIfNull(v0Var.b());
        }
        return StringUtils.emptyIfNull(v0Var.e());
    }
}
