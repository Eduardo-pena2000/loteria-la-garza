package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class m7 {
    private final com.applovin.impl.sdk.k a;
    private String b;
    private final String c = a(z4.l);
    private final String d = a(z4.m);
    private String e = (String) a5.a(z4.n, (Object) null, com.applovin.impl.sdk.k.o());
    private String f = (String) a5.a(z4.o, (Object) null, com.applovin.impl.sdk.k.o());

    public m7(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        a(f());
    }

    private String f() {
        if (!((Boolean) this.a.a(x4.K3)).booleanValue()) {
            this.a.c(z4.k);
        }
        String str = (String) this.a.a(z4.k);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.f;
    }

    public String e() {
        return this.b;
    }

    private String a(z4 z4Var) {
        String str = (String) a5.a(z4Var, (Object) null, com.applovin.impl.sdk.k.o());
        if (StringUtils.isValidString(str)) {
            return str;
        }
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a5.b(z4Var, lowerCase, com.applovin.impl.sdk.k.o());
        return lowerCase;
    }

    public void b(String str) {
        this.e = str;
        a5.b(z4.n, str, com.applovin.impl.sdk.k.o());
    }

    public void c(String str) {
        this.f = str;
        a5.b(z4.o, str, com.applovin.impl.sdk.k.o());
    }

    public void a(String str) {
        if (((Boolean) this.a.a(x4.K3)).booleanValue()) {
            this.a.b(z4.k, str);
        }
        this.b = str;
        this.a.t().b(str, a());
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        z4 z4Var = z4.p;
        String str = (String) kVar.a(z4Var);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String valueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        kVar.b(z4Var, valueOf);
        return valueOf;
    }
}
