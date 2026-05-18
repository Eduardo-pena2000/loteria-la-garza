package com.amazon.a.b;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class g {
    private static final String a = "license";
    private static final String b = "customerId";
    private static final String c = "deviceId";
    private final String d;
    private final String e;
    private final String f;

    public g(Map map) throws com.amazon.a.a.n.a.a.g {
        if (map == null) {
            throw com.amazon.a.a.n.a.a.g.d();
        }
        this.d = a("license", map);
        this.e = a("customerId", map);
        this.f = a("deviceId", map);
    }

    private String a(String str, Map map) throws com.amazon.a.a.n.a.a.g {
        String str2 = (String) map.get(str);
        if (a(str2)) {
            throw com.amazon.a.a.n.a.a.g.a(str);
        }
        return str2;
    }

    public String b() {
        return this.f;
    }

    public String c() {
        return this.d;
    }

    private boolean a(String str) {
        return str == null || str.length() == 0;
    }

    public String a() {
        return this.e;
    }
}
