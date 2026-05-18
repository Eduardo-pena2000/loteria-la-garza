package com.revenuecat.purchases.ui.revenuecatui.utils;

import java.net.URL;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class URLExtensionsKt {
    public static final /* synthetic */ URL appendQueryParameter(URL url, String name, String value) {
        t.g(url, "<this>");
        t.g(name, "name");
        t.g(value, "value");
        return new URL(url + (url.getQuery() == null ? "?" : "&") + name + '=' + value);
    }
}
