package com.applovin.shadow.okio;

@Ca.e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class -DeprecatedUtf8 {
    public static final -DeprecatedUtf8 INSTANCE = new -DeprecatedUtf8();

    private -DeprecatedUtf8() {
    }

    @Ca.e
    public final long size(String str) {
        kotlin.jvm.internal.t.g(str, "string");
        return Utf8.size$default(str, 0, 0, 3, null);
    }

    @Ca.e
    public final long size(String str, int i, int i2) {
        kotlin.jvm.internal.t.g(str, "string");
        return Utf8.size(str, i, i2);
    }
}
