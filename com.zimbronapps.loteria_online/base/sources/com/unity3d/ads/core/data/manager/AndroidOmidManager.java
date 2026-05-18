package com.unity3d.ads.core.data.manager;

import Q8.c;
import Q8.d;
import Q8.f;
import Q8.h;
import Q8.j;
import Q8.k;
import android.content.Context;
import android.webkit.WebView;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidOmidManager implements OmidManager {
    public void activate(Context context) {
        t.g(context, "context");
        P8.a.a(context);
    }

    public Q8.a createAdEvents(Q8.b adSession) {
        t.g(adSession, "adSession");
        Q8.a a = Q8.a.a(adSession);
        t.f(a, "createAdEvents(adSession)");
        return a;
    }

    public Q8.b createAdSession(c adSessionConfiguration, d context) {
        t.g(adSessionConfiguration, "adSessionConfiguration");
        t.g(context, "context");
        Q8.b a = Q8.b.a(adSessionConfiguration, context);
        t.f(a, "createAdSession(adSessionConfiguration, context)");
        return a;
    }

    public c createAdSessionConfiguration(f creativeType, h impressionType, j owner, j mediaEventsOwner, boolean z) {
        t.g(creativeType, "creativeType");
        t.g(impressionType, "impressionType");
        t.g(owner, "owner");
        t.g(mediaEventsOwner, "mediaEventsOwner");
        c a = c.a(creativeType, impressionType, owner, mediaEventsOwner, z);
        t.f(a, "createAdSessionConfigura…VerificationScripts\n    )");
        return a;
    }

    public d createHtmlAdSessionContext(k kVar, WebView webView, String str, String str2) {
        d a = d.a(kVar, webView, str, str2);
        t.f(a, "createHtmlAdSessionConte…customReferenceData\n    )");
        return a;
    }

    public d createJavaScriptAdSessionContext(k kVar, WebView webView, String str, String str2) {
        d b = d.b(kVar, webView, str, str2);
        t.f(b, "createJavascriptAdSessio…customReferenceData\n    )");
        return b;
    }

    public String getVersion() {
        String b = P8.a.b();
        t.f(b, "getVersion()");
        return b;
    }

    public boolean isActive() {
        return P8.a.c();
    }
}
