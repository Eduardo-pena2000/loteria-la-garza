package com.amazon.a.a.o.b.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class b extends com.amazon.a.a.d.b {
    private static final long a = 1;

    private b(String str, String str2) {
        super("SIGNED_TOKEN_PARSE_FAILURE", str, str2);
    }

    public static b a(Throwable th) {
        return new b("DECODE", th.getMessage());
    }

    public static b d() {
        return new b("INVALID_FORMAT", null);
    }

    public static b a(String str) {
        return new b("MISSING_FIELD", str);
    }

    public static b a(String str, String str2) {
        return new b("INVALID_FIELD_VALUE", str + ":" + str2);
    }
}
