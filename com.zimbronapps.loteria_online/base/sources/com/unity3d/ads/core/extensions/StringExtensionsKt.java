package com.unity3d.ads.core.extensions;

import Za.c;
import java.net.URLConnection;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import xb.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StringExtensionsKt {
    public static final String getSHA256Hash(String str) {
        t.g(str, "<this>");
        byte[] bytes = str.getBytes(c.b);
        t.f(bytes, "this as java.lang.String).getBytes(charset)");
        String l = h.w(Arrays.copyOf(bytes, bytes.length)).C().l();
        t.f(l, "bytes.sha256().hex()");
        return l;
    }

    public static final String guessMimeType(String str) {
        t.g(str, "<this>");
        return URLConnection.guessContentTypeFromName(str);
    }
}
