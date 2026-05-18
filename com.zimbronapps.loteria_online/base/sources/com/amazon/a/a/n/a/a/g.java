package com.amazon.a.a.n.a.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class g extends com.amazon.a.a.d.b {
    public static final String a = "EMPTY";
    public static final String b = "MISSING_FIELD";
    private static final long c = 1;

    private g(String str, String str2) {
        super("MALFORMED_RESPONSE", str, str2);
    }

    public static final g a(String str) {
        return new g("MISSING_FIELD", str);
    }

    public static final g d() {
        return new g("EMPTY", null);
    }
}
