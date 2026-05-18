package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class n8 {
    private static String a;
    private static int d;
    private static String e;
    private static String f;
    private static final Object b = new Object();
    private static final AtomicBoolean c = new AtomicBoolean();
    private static final AtomicBoolean g = new AtomicBoolean();

    static {
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        if (kVar != null && ((Boolean) kVar.a(x4.d4)).booleanValue() && e()) {
            a = (String) a5.a(z4.M, "", com.applovin.impl.sdk.k.o());
        } else {
            a = "";
            a5.b(z4.M, (Object) null, com.applovin.impl.sdk.k.o());
        }
    }

    public static void a(com.applovin.impl.sdk.k kVar) {
        if (c.getAndSet(true)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new J3(kVar));
    }

    public static String b() {
        return f;
    }

    public static String c() {
        return e;
    }

    public static int d() {
        return d;
    }

    public static /* synthetic */ void e(com.applovin.impl.sdk.k kVar) {
        d(kVar);
    }

    public static void b(com.applovin.impl.sdk.k kVar) {
        if (g.getAndSet(true)) {
            return;
        }
        PackageInfo c2 = c(kVar);
        if (c2 != null) {
            d = c2.versionCode;
            e = c2.versionName;
            f = c2.packageName;
        } else {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("WebViewDataCollector", "Failed to get WebView package info");
            }
        }
    }

    private static PackageInfo c(com.applovin.impl.sdk.k kVar) {
        PackageManager packageManager = com.applovin.impl.sdk.k.o().getPackageManager();
        if (o0.g()) {
            return u4.b.a();
        }
        Iterator it = kVar.c(x4.o4).iterator();
        while (it.hasNext()) {
            try {
                return packageManager.getPackageInfo((String) it.next(), 0);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static /* synthetic */ void d(com.applovin.impl.sdk.k kVar) {
        try {
            synchronized (b) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(com.applovin.impl.sdk.k.o());
                    if (!TextUtils.isEmpty(defaultUserAgent)) {
                        a = defaultUserAgent;
                        a5.b(z4.M, a, com.applovin.impl.sdk.k.o());
                    } else {
                        kVar.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            kVar.O().b("WebViewDataCollector", "Collected invalid user agent");
                        }
                        kVar.D().a(d2.b1, "collectedInvalidUserAgent");
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("WebViewDataCollector", "Failed to collect user agent", th);
            }
            kVar.D().c("WebViewDataCollector", "collectUserAgent", th);
        }
    }

    private static boolean e() {
        boolean isValidString;
        synchronized (b) {
            isValidString = StringUtils.isValidString((String) a5.a(z4.M, "", com.applovin.impl.sdk.k.o()));
        }
        return isValidString;
    }

    public static String a() {
        String str;
        synchronized (b) {
            str = a;
        }
        return str;
    }
}
