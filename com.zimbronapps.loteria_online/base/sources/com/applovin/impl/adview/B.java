package com.applovin.impl.adview;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.applovin.impl.f2;
import com.applovin.impl.j0;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.o7;
import com.applovin.impl.o8;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t4;
import com.applovin.impl.w7;
import com.applovin.impl.x4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b extends j0 {
    private static final Set j = Collections.newSetFromMap(new WeakHashMap());
    private static final Object k = new Object();
    private final com.applovin.impl.sdk.o c;
    private final com.applovin.impl.sdk.k d;
    private com.applovin.impl.sdk.ad.b e;
    private boolean f;
    private boolean g;
    private final List h;
    private final Object i;

    public class a extends t4 {
        public a() {
        }

        public Map a() {
            return CollectionUtils.hashMap("name", "AdWebView");
        }
    }

    public b(c cVar, com.applovin.impl.sdk.k kVar, Context context) {
        super(context);
        this.h = new ArrayList();
        this.i = new Object();
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.d = kVar;
        this.c = kVar.O();
        Integer num = (Integer) kVar.a(x4.G6);
        if (num.intValue() > 0) {
            synchronized (k) {
                Set set = j;
                set.add(this);
                n7.a("AdWebView", set.size(), num.intValue(), kVar.D());
            }
        }
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(cVar != null ? cVar : new a());
        setWebChromeClient(new com.applovin.impl.t(cVar != null ? cVar.d() : null, kVar));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (o0.i() && ((Boolean) kVar.a(x4.Z5)).booleanValue()) {
            C.a(this, new d(kVar).a());
        }
        setOnTouchListener(new D());
        setOnLongClickListener(new E(this));
    }

    private static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    public static /* synthetic */ boolean b(b bVar, View view) {
        return bVar.a(view);
    }

    public static /* synthetic */ boolean c(View view, MotionEvent motionEvent) {
        return a(view, motionEvent);
    }

    public void computeScroll() {
    }

    public void destroy() {
        this.f = true;
        this.g = false;
        super.destroy();
    }

    public com.applovin.impl.sdk.ad.b getCurrentAd() {
        return this.e;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    public void scrollTo(int i, int i2) {
    }

    public void setAdHtmlLoaded(boolean z) {
        this.g = z;
        if (z && ((Boolean) this.d.a(x4.y6)).booleanValue()) {
            b();
        }
    }

    private void b() {
        synchronized (this.i) {
            try {
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    o8.a(this, (String) it.next(), "AdWebView", this.d);
                }
                this.h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private /* synthetic */ boolean a(View view) {
        if (!com.applovin.impl.sdk.o.a()) {
            return true;
        }
        this.c.a("AdWebView", "Received a LongClick event.");
        return true;
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String str;
        if (!this.f) {
            this.e = bVar;
            try {
                applySettings(bVar);
                if (n7.a(bVar.getSize())) {
                    setVisibility(0);
                }
                bVar.a(SystemClock.elapsedRealtime());
                if (bVar instanceof com.applovin.impl.sdk.ad.a) {
                    loadDataWithBaseURL(bVar.k(), ((com.applovin.impl.sdk.ad.a) bVar).g1(), "text/html", (String) null, "");
                    if (com.applovin.impl.sdk.o.a()) {
                        this.c.a("AdWebView", "AppLovinAd rendered");
                        return;
                    }
                    return;
                }
                if (bVar instanceof o7) {
                    o7 o7Var = (o7) bVar;
                    r7 g1 = o7Var.g1();
                    if (g1 != null) {
                        w7 e = g1.e();
                        Uri c = e.c();
                        if (c != null) {
                            str = c.toString();
                        } else {
                            str = "";
                        }
                        String str2 = str;
                        String b = e.b();
                        String i1 = o7Var.i1();
                        if (!StringUtils.isValidString(str2) && !StringUtils.isValidString(b)) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.c.b("AdWebView", "Unable to load companion ad. No resources provided.");
                                return;
                            }
                            return;
                        }
                        if (e.d() == w7.a.b) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.c.a("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String a2 = a((String) this.d.a(x4.N4), str2);
                            if (o7Var.x1() && o7Var.isOpenMeasurementEnabled() && o7Var.y1()) {
                                a2 = this.d.e0().a(a2, f2.a((AppLovinAdImpl) bVar));
                            }
                            loadDataWithBaseURL(bVar.k(), a2, "text/html", (String) null, "");
                            return;
                        }
                        if (e.d() == w7.a.d) {
                            if (StringUtils.isValidString(b)) {
                                String a3 = a(i1, b);
                                String str3 = StringUtils.isValidString(a3) ? a3 : b;
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.c.a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str3);
                                }
                                loadDataWithBaseURL(bVar.k(), str3, "text/html", (String) null, "");
                                return;
                            }
                            if (StringUtils.isValidString(str2)) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.c.a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                a(str2, bVar.k(), i1, this.d, o7Var);
                                return;
                            }
                            return;
                        }
                        if (e.d() == w7.a.c) {
                            if (StringUtils.isValidString(str2)) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.c.a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                a(str2, bVar.k(), i1, this.d, o7Var);
                                return;
                            } else {
                                if (StringUtils.isValidString(b)) {
                                    String a4 = a(i1, b);
                                    String str4 = StringUtils.isValidString(a4) ? a4 : b;
                                    if (com.applovin.impl.sdk.o.a()) {
                                        this.c.a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str4);
                                    }
                                    loadDataWithBaseURL(bVar.k(), str4, "text/html", (String) null, "");
                                    return;
                                }
                                return;
                            }
                        }
                        if (com.applovin.impl.sdk.o.a()) {
                            this.c.b("AdWebView", "Failed to render VAST companion ad of invalid type");
                            return;
                        }
                        return;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.c.a("AdWebView", "No companion ad provided.");
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                throw new RuntimeException("Unable to render AppLovin ad (" + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : "null") + ") - " + th);
            }
        }
        com.applovin.impl.sdk.o.h("AdWebView", "Ad can not be loaded in a destroyed webview");
    }

    public void a(String str) {
        if (((Boolean) this.d.a(x4.y6)).booleanValue()) {
            if (this.g) {
                o8.a(this, str, "AdWebView", this.d);
                return;
            }
            synchronized (this.h) {
                this.h.add(str);
            }
            return;
        }
        o8.a(this, str, "AdWebView", this.d);
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.k kVar, o7 o7Var) {
        String a2 = a(str3, str);
        if (StringUtils.isValidString(a2)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + a2);
            }
            loadDataWithBaseURL(str2, a2, "text/html", (String) null, "");
            return;
        }
        String a3 = a((String) kVar.a(x4.O4), str);
        if (StringUtils.isValidString(a3)) {
            if (o7Var.x1() && o7Var.isOpenMeasurementEnabled()) {
                a3 = kVar.e0().a(a3, f2.a((AppLovinAdImpl) o7Var));
            }
            String str4 = a3;
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + str4);
            }
            loadDataWithBaseURL(str2, str4, "text/html", (String) null, "");
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
        }
        loadUrl(str);
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }
}
