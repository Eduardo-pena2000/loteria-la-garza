package com.applovin.impl;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class f4 {
    protected final AppLovinAdBase a;
    protected final com.applovin.impl.sdk.k b;
    protected final com.applovin.impl.sdk.o c;
    protected final String d;
    protected boolean e;
    protected AdSession f;
    protected AdEvents g;

    public f4(AppLovinAdBase appLovinAdBase) {
        this.a = appLovinAdBase;
        this.b = appLovinAdBase.getSdk();
        this.c = appLovinAdBase.getSdk().O();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            str = str + ":" + appLovinAdBase.getDspName();
        }
        this.d = str;
    }

    public static /* synthetic */ void a(f4 f4Var) {
        f4Var.d();
    }

    public static /* synthetic */ void b(f4 f4Var, String str) {
        f4Var.a(str);
    }

    public static /* synthetic */ void c(f4 f4Var) {
        f4Var.b();
    }

    public static /* synthetic */ void d(f4 f4Var, String str, Runnable runnable) {
        f4Var.a(str, runnable);
    }

    public static /* synthetic */ void e(f4 f4Var, WebView webView) {
        f4Var.b(webView);
    }

    public static /* synthetic */ void f(f4 f4Var, View view, List list) {
        f4Var.a(view, list);
    }

    public static /* synthetic */ void g(f4 f4Var) {
        f4Var.c();
    }

    public abstract AdSessionConfiguration a();

    public abstract AdSessionContext a(WebView webView);

    public void h() {
        b("track loaded", new Z0(this));
    }

    private /* synthetic */ void b(WebView webView) {
        AdSessionContext a;
        if (!this.a.isOpenMeasurementEnabled()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.d(this.d, "Skip starting session - Open Measurement disabled");
                return;
            }
            return;
        }
        if (this.f != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.k(this.d, "Attempting to start session again for ad: " + this.a);
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.d, "Starting session");
        }
        AdSessionConfiguration a2 = a();
        if (a2 == null || (a = a(webView)) == null) {
            return;
        }
        try {
            AdSession createAdSession = AdSession.createAdSession(a2, a);
            this.f = createAdSession;
            try {
                this.g = AdEvents.createAdEvents(createAdSession);
                a(this.f);
                this.f.start();
                this.e = true;
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.a(this.d, "Session started");
                }
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.a(this.d, "Failed to create ad events", th);
                }
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.d, "Failed to create session", th2);
            }
        }
    }

    private /* synthetic */ void d() {
        this.g.loaded();
    }

    public void a(AdSession adSession) {
    }

    public void c(WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new X0(this, webView));
    }

    public void e() {
        c((WebView) null);
    }

    public void f() {
        b("stop session", new B1(this));
    }

    public void g() {
        b("track impression event", new A1(this));
    }

    private /* synthetic */ void c() {
        this.g.impressionOccurred();
    }

    public void a(View view) {
        b(view, Collections.emptyList());
    }

    private /* synthetic */ void a(View view, List list) {
        this.f.registerAdView(view);
        this.f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h4 h4Var = (h4) it.next();
            if (h4Var.c() != null) {
                try {
                    this.f.addFriendlyObstruction(h4Var.c(), h4Var.b(), h4Var.a());
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.c.a(this.d, "Failed to add friendly obstruction (" + h4Var + ")", th);
                    }
                }
            }
        }
    }

    private /* synthetic */ void a(String str) {
        this.f.error(ErrorType.VIDEO, str);
    }

    private /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (this.e) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.a(this.d, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.d, "Failed to run operation: " + str, th);
            }
        }
    }

    public void b(View view, List list) {
        b("update main view: " + view, new Y0(this, view, list));
    }

    public void b(String str) {
        b("track error", new V0(this, str));
    }

    private /* synthetic */ void b() {
        this.e = false;
        this.f.finish();
        this.f = null;
        this.g = null;
    }

    public void b(String str, Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new W0(this, str, runnable));
    }
}
