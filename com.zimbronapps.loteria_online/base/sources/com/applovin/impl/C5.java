package com.applovin.impl;

import com.applovin.mediation.MaxError;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c5 {
    private final d5 a;
    private final String b;
    private final String c;
    private final String d;
    private final MaxError e;
    private final long f;
    private final long g;
    private final boolean h;

    public interface a {
        void a(c5 c5Var);
    }

    private c5(d5 d5Var, com.applovin.impl.mediation.h hVar, String str, MaxError maxError, long j, long j2) {
        this(d5Var, str, maxError, j, j2, hVar != null ? hVar.i() : null, hVar != null ? hVar.b() : null, false);
    }

    public static c5 a(d5 d5Var, com.applovin.impl.mediation.h hVar, String str, long j, long j2) {
        if (d5Var == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (hVar != null) {
            return new c5(d5Var, hVar, str, null, j, j2);
        }
        throw new IllegalArgumentException("No adapterWrapper specified");
    }

    public long b() {
        return this.g;
    }

    public MaxError c() {
        return this.e;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.d;
    }

    public d5 f() {
        return this.a;
    }

    public boolean g() {
        return this.h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SignalCollectionResult{mSignalProviderSpec=");
        sb.append(this.a);
        sb.append(", mSdkVersion='");
        sb.append(this.b);
        sb.append('\'');
        sb.append(", mAdapterVersion='");
        sb.append(this.c);
        sb.append('\'');
        sb.append(", mSignalDataLength='");
        String str = this.d;
        sb.append(str != null ? str.length() : 0);
        sb.append('\'');
        sb.append(", mErrorMessage=");
        MaxError maxError = this.e;
        sb.append(maxError != null ? maxError.getMessage() : "");
        sb.append('}');
        return sb.toString();
    }

    private c5(d5 d5Var, String str, MaxError maxError, long j, long j2, String str2, String str3, boolean z) {
        this.a = d5Var;
        this.d = str;
        this.e = maxError;
        this.f = j;
        this.g = j2;
        this.b = str2;
        this.c = str3;
        this.h = z;
    }

    public static c5 a(d5 d5Var, MaxError maxError) {
        return a(d5Var, (com.applovin.impl.mediation.h) null, maxError, -1L, -1L);
    }

    public static c5 a(d5 d5Var, com.applovin.impl.mediation.h hVar, MaxError maxError, long j, long j2) {
        if (d5Var != null) {
            return new c5(d5Var, hVar, null, maxError, j, j2);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public static c5 a(c5 c5Var) {
        return new c5(c5Var.f(), c5Var.e(), c5Var.c(), c5Var.f, c5Var.g, c5Var.d(), c5Var.a(), true);
    }

    public String a() {
        return this.c;
    }
}
