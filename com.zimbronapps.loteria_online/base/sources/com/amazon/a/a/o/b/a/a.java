package com.amazon.a.a.o.b.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a extends com.amazon.a.a.d.b {
    public static final String a = "DATA_AUTH_KEY_LOAD_FAILURE";
    private static final long b = 1;

    private a(String str, Throwable th) {
        super("DATA_AUTH_KEY_LOAD_FAILURE", str, th);
    }

    public static a a(Throwable th) {
        return new a("CERT_FAILED_TO_LOAD", th);
    }

    public static a b(Throwable th) {
        return new a("FAILED_TO_ESTABLISH_TRUST", th);
    }

    public static a d() {
        return new a("CERT_NOT_FOUND", null);
    }

    public static a e() {
        return new a("CERT_INVALID", null);
    }

    public static a f() {
        return new a("VERIFICATION_FAILED", null);
    }
}
