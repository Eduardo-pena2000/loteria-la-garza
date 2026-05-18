package com.revenuecat.purchases.ui.revenuecatui.utils;

import java.net.URI;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class URIExtensionsKt {
    public static final /* synthetic */ URI appendQueryParameter(URI uri, String name, String value) {
        t.g(uri, "<this>");
        t.g(name, "name");
        t.g(value, "value");
        return new URI(uri + (uri.getQuery() == null ? "?" : "&") + name + '=' + value);
    }
}
