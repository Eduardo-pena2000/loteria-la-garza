package com.unity3d.ads.core.data.manager;

import Q8.c;
import Q8.d;
import Q8.f;
import Q8.h;
import Q8.j;
import Q8.k;
import android.content.Context;
import android.webkit.WebView;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface OmidManager {
    void activate(Context context);

    Q8.a createAdEvents(Q8.b bVar);

    Q8.b createAdSession(c cVar, d dVar);

    c createAdSessionConfiguration(f fVar, h hVar, j jVar, j jVar2, boolean z);

    d createHtmlAdSessionContext(k kVar, WebView webView, String str, String str2);

    d createJavaScriptAdSessionContext(k kVar, WebView webView, String str, String str2);

    String getVersion();

    boolean isActive();
}
