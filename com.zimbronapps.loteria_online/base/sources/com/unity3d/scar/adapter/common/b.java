package com.unity3d.scar.adapter.common;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class b extends m {
    public b(c cVar, Object... objArr) {
        super(cVar, null, objArr);
    }

    public static b a(v9.c cVar) {
        String format = String.format("Cannot show ad that is not loaded for placement %s", new Object[]{cVar.c()});
        return new b(c.t, format, cVar.c(), cVar.d(), format);
    }

    public static b b(String str) {
        return new b(c.g, str, new Object[0]);
    }

    public static b c(v9.c cVar, String str) {
        return new b(c.n, str, cVar.c(), cVar.d(), str);
    }

    public static b d(v9.c cVar, String str) {
        return new b(c.s, str, cVar.c(), cVar.d(), str);
    }

    public static b e(String str) {
        return new b(c.j, str, str);
    }

    public static b f(String str, String str2, String str3) {
        return new b(c.q, str3, str, str2, str3);
    }

    public String getDomain() {
        return "GMA";
    }

    public b(c cVar, String str, Object... objArr) {
        super(cVar, str, objArr);
    }
}
