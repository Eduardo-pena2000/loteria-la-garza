package com.unity3d.ads.core.domain;

import android.net.Uri;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidRemoveUrlQuery implements RemoveUrlQuery {
    public String invoke(String url) {
        t.g(url, "url");
        String uri = Uri.parse(url).buildUpon().clearQuery().build().toString();
        t.f(uri, "parse(url).buildUpon().c…uery().build().toString()");
        return uri;
    }
}
