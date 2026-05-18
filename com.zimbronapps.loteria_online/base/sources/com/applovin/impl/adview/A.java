package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.k;
import com.applovin.impl.c2;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.e8;
import com.applovin.impl.f2;
import com.applovin.impl.f4;
import com.applovin.impl.h4;
import com.applovin.impl.l2;
import com.applovin.impl.n1;
import com.applovin.impl.n7;
import com.applovin.impl.o8;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t4;
import com.applovin.impl.v2;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class a implements AppLovinCommunicatorSubscriber, AppLovinBroadcastManager.Receiver {
    private volatile AppLovinAdLoadListener A;
    private volatile AppLovinAdDisplayListener B;
    private volatile AppLovinAdViewEventListener C;
    private volatile AppLovinAdClickListener D;
    private Context a;
    private ViewGroup b;
    private com.applovin.impl.sdk.k c;
    private AppLovinAdServiceImpl d;
    private com.applovin.impl.sdk.o e;
    private AppLovinCommunicator f;
    private b g;
    private AppLovinAdSize i;
    private String j;
    private v.f k;
    private com.applovin.impl.adview.c l;
    private e m;
    private com.applovin.impl.adview.b n;
    private WebView o;
    private k p;
    private Runnable q;
    private Runnable r;
    private final Map h = Collections.synchronizedMap(new HashMap());
    private volatile com.applovin.impl.sdk.ad.b s = null;
    private volatile AppLovinAd t = null;
    private f u = null;
    private f v = null;
    private final AtomicReference w = new AtomicReference();
    private final AtomicBoolean x = new AtomicBoolean();
    private volatile boolean y = false;
    private volatile boolean z = false;

    public class a extends t4 {
        public a() {
        }

        public Map a() {
            return CollectionUtils.hashMap("name", "AdViewController:GAWebView");
        }
    }

    public interface b {
        void a(a aVar);
    }

    public class c implements Runnable {
        private c() {
        }

        public void run() {
            if (a.f(a.this) != null) {
                a.f(a.this).setVisibility(8);
            }
        }

        public /* synthetic */ c(a aVar, a aVar2) {
            this();
        }
    }

    public class d implements Runnable {

        public class a implements k.a {
            public a() {
            }

            public void a() {
                a.f(a.this).addView(a.i(a.this), new ViewGroup.LayoutParams(-1, -1));
            }

            public void b() {
                a.h(a.this);
                if (com.applovin.impl.sdk.o.a()) {
                    a.h(a.this).b("AppLovinAdView", "Watermark failed to render.");
                }
            }
        }

        private d() {
        }

        public void run() {
            if (a.e(a.this) != null) {
                if (a.f(a.this) == null) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to render advertisement for ad #" + a.e(a.this).getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    t2.a(a.d(a.this), a.e(a.this), (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    Map hashMap = CollectionUtils.hashMap("source", "renderTask");
                    CollectionUtils.putStringIfValid("error_message", "Ad view failed to render due to null adView", hashMap);
                    a.a(a.this).g().a(d2.F, a.e(a.this), hashMap);
                    return;
                }
                a.g(a.this);
                a.h(a.this);
                if (com.applovin.impl.sdk.o.a()) {
                    a.h(a.this).a("AppLovinAdView", "Rendering advertisement ad for #" + a.e(a.this).getAdIdNumber() + "...");
                }
                a.a((View) a.f(a.this), a.e(a.this).getSize());
                if (a.i(a.this) != null) {
                    e8.c(a.i(a.this));
                    a.a(a.this, (k) null);
                }
                c2 c2Var = new c2(a.j(a.this), a.a(a.this));
                if (c2Var.c()) {
                    a.a(a.this, new k(c2Var, a.b(a.this)));
                    a.i(a.this).a(new a());
                }
                a.f(a.this).setAdHtmlLoaded(false);
                a.f(a.this).a(a.e(a.this));
                if (a.e(a.this).getSize() == AppLovinAdSize.INTERSTITIAL || a.c(a.this)) {
                    return;
                }
                a.e(a.this).setHasShown(true);
            }
        }

        public /* synthetic */ d(a aVar, a aVar2) {
            this();
        }
    }

    public static class e implements AppLovinAdLoadListener {
        private final a a;

        public e(a aVar, com.applovin.impl.sdk.k kVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (kVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.a = aVar;
        }

        private a a() {
            return this.a;
        }

        public void adReceived(AppLovinAd appLovinAd) {
            a a = a();
            if (a != null) {
                a.b(appLovinAd);
            } else {
                com.applovin.impl.sdk.o.h("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        public void failedToReceiveAd(int i) {
            a a = a();
            if (a != null) {
                a.a(a, i);
            }
        }
    }

    private void E() {
        if (this.e != null && com.applovin.impl.sdk.o.a() && com.applovin.impl.sdk.o.a()) {
            this.e.a("AppLovinAdView", "Destroying...");
        }
        o8.b(this.n);
        this.n = null;
        o8.b(this.o);
        this.o = null;
        this.k = null;
        this.A = null;
        this.B = null;
        this.D = null;
        this.C = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.z = true;
    }

    public static /* synthetic */ void a(a aVar, MotionEvent motionEvent) {
        aVar.b(motionEvent);
    }

    public static /* synthetic */ Context b(a aVar) {
        return aVar.a;
    }

    public static /* synthetic */ boolean c(a aVar) {
        return aVar.z;
    }

    public static /* synthetic */ void d(WebView webView) {
        a(webView);
    }

    public static /* synthetic */ com.applovin.impl.sdk.ad.b e(a aVar) {
        return aVar.s;
    }

    public static /* synthetic */ com.applovin.impl.adview.b f(a aVar) {
        return aVar.n;
    }

    public static /* synthetic */ void g(a aVar) {
        aVar.v();
    }

    public static /* synthetic */ com.applovin.impl.sdk.o h(a aVar) {
        return aVar.e;
    }

    public static /* synthetic */ k i(a aVar) {
        return aVar.p;
    }

    public static /* synthetic */ Map j(a aVar) {
        return aVar.h;
    }

    public static /* synthetic */ void k(a aVar) {
        aVar.t();
    }

    public static /* synthetic */ void l(a aVar) {
        aVar.s();
    }

    public static /* synthetic */ void m(a aVar) {
        aVar.o();
    }

    public static /* synthetic */ void n(a aVar) {
        aVar.r();
    }

    public static /* synthetic */ void o(a aVar, String str, String str2) {
        aVar.a(str, str2);
    }

    public static /* synthetic */ void p(a aVar, AppLovinAd appLovinAd) {
        aVar.a(appLovinAd);
    }

    public static /* synthetic */ void q(a aVar) {
        aVar.p();
    }

    public static /* synthetic */ void r(a aVar, int i) {
        aVar.a(i);
    }

    public static /* synthetic */ void s(a aVar, DialogInterface dialogInterface) {
        aVar.a(dialogInterface);
    }

    public static /* synthetic */ void t(a aVar, WebView webView) {
        aVar.b(webView);
    }

    public static /* synthetic */ void u(a aVar) {
        aVar.q();
    }

    private void v() {
        com.applovin.impl.sdk.ad.b bVar = this.s;
        v2 v2Var = new v2();
        v2Var.a().a(bVar).a(i());
        if (!n7.a(bVar.getSize())) {
            v2Var.a().a("Fullscreen Ad Properties").b(bVar);
        }
        v2Var.a(this.c);
        v2Var.a();
        if (com.applovin.impl.sdk.o.a()) {
            this.e.a("AppLovinAdView", v2Var.toString());
        }
    }

    private void x() {
        if (this.s.P0()) {
            int c2 = this.c.p().c();
            if (com.applovin.impl.sdk.i.a(c2)) {
                this.n.a("javascript:al_muteSwitchOn();");
            } else if (c2 == 2) {
                this.n.a("javascript:al_muteSwitchOff();");
            }
        }
    }

    private void y() {
        if (n7.a(this.i)) {
            if (((Boolean) this.c.a(x4.E1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
            }
            if (((Boolean) this.c.a(x4.F1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
            }
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
            if (((Boolean) this.c.a(x4.G1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
            }
            if (((Boolean) this.c.a(x4.H1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
            }
        }
    }

    public void A() {
        if (com.applovin.impl.sdk.o.a()) {
            this.e.a("AppLovinAdView", "AdView fully watched...");
        }
        b bVar = this.g;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void B() {
        y();
        if (this.s != null && this.s.r0()) {
            com.applovin.impl.g.a(this.n, this.c);
        }
        b("javascript:al_onAttachedToWindow();");
    }

    public void C() {
        if (this.y) {
            if (this.s == null || !this.s.Z0()) {
                t2.b(this.B, this.s);
            }
            if (this.s != null && this.s.isOpenMeasurementEnabled() && n7.a(this.s.getSize())) {
                this.s.getAdEventTracker().f();
            }
            if (this.n != null && this.u != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.e.a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                c();
            } else if (com.applovin.impl.sdk.o.a()) {
                this.e.a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            }
            b("javascript:al_onDetachedFromWindow();");
        }
    }

    public void D() {
        if (!this.y || this.z) {
            return;
        }
        this.z = true;
    }

    public void F() {
        if (this.y) {
            AppLovinAd appLovinAd = (AppLovinAd) this.w.getAndSet((Object) null);
            if (appLovinAd != null) {
                c(appLovinAd);
            }
            this.z = false;
        }
    }

    public String getCommunicatorId() {
        return a.class.getSimpleName();
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new x(this));
        }
    }

    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
        }
        switch (action) {
            case "com.applovin.custom_intent_launch_failure":
            case "com.applovin.custom_intent_launch_success":
                a(action, map);
                break;
            case "com.applovin.external_redirect_success":
            case "com.applovin.external_redirect_failure":
                c(action, map);
                break;
            case "com.applovin.custom_tabs_failure":
            case "com.applovin.custom_tabs_hidden":
            case "com.applovin.custom_tabs_shown":
                b(action, map);
                break;
            case "com.applovin.application_paused":
                m();
                break;
            case "com.applovin.application_resumed":
                n();
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                d(action, map);
                break;
        }
    }

    public void w() {
        if ((this.a instanceof n1) && this.s != null && this.s.K() == b.b.b) {
            this.a.dismiss("postitial_click");
        }
    }

    public void z() {
        if (this.u != null || this.v != null) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.e.a("AppLovinAdView", "Ad: " + this.s + " closed.");
        }
        a(this.r);
        t2.b(this.B, this.s);
        this.s = null;
    }

    public static /* synthetic */ com.applovin.impl.sdk.k a(a aVar) {
        return aVar.c;
    }

    private static void b(View view, AppLovinAdSize appLovinAdSize) {
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int i = -1;
        int applyDimension = (appLovinAdSize == appLovinAdSize2 || appLovinAdSize == AppLovinAdSize.BANNER) ? -1 : appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        if (appLovinAdSize != appLovinAdSize2 && appLovinAdSize != AppLovinAdSize.BANNER) {
            i = appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
        }
        RelativeLayout.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        ((ViewGroup.LayoutParams) layoutParams).width = applyDimension;
        ((ViewGroup.LayoutParams) layoutParams).height = i;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            layoutParams.addRule(13);
        }
        view.setLayoutParams(layoutParams);
    }

    private void c() {
        a(new u(this));
    }

    public static /* synthetic */ AppLovinAdViewEventListener d(a aVar) {
        return aVar.C;
    }

    private void m() {
        if (com.applovin.impl.sdk.o.a()) {
            this.e.a("AppLovinAdView", "handleApplicationPaused()");
        }
        b("javascript:al_onAppPaused();");
    }

    private void n() {
        if (com.applovin.impl.sdk.o.a()) {
            this.e.a("AppLovinAdView", "handleApplicationResumed()");
        }
        b("javascript:al_onAppResumed();");
    }

    private /* synthetic */ void o() {
        this.n.loadDataWithBaseURL("/", "<html></html>", "text/html", (String) null, "");
    }

    private /* synthetic */ void p() {
        com.applovin.impl.adview.b bVar;
        d();
        if (this.b == null || (bVar = this.n) == null || bVar.getParent() != null) {
            return;
        }
        this.b.addView(this.n);
        b((View) this.n, this.s.getSize());
        if (this.s.isOpenMeasurementEnabled()) {
            this.s.getAdEventTracker().a((View) this.n);
        }
    }

    private /* synthetic */ void q() {
        if (this.n != null && this.u != null) {
            a();
        }
        E();
    }

    private /* synthetic */ void r() {
        if (this.u != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.e.a("AppLovinAdView", "Detaching expanded ad: " + this.u.b());
            }
            this.v = this.u;
            this.u = null;
            a(this.i);
        }
    }

    private /* synthetic */ void s() {
        com.applovin.impl.sdk.ad.a b2;
        f fVar = this.v;
        if (fVar == null && this.u == null) {
            return;
        }
        if (fVar != null) {
            b2 = fVar.b();
            this.v.dismiss();
            this.v = null;
        } else {
            b2 = this.u.b();
            this.u.dismiss();
            this.u = null;
        }
        t2.a(this.C, b2, this.b);
    }

    private /* synthetic */ void t() {
        f().loadUrl("chrome://crash");
    }

    public AppLovinAdViewEventListener e() {
        return this.C;
    }

    public com.applovin.impl.adview.b f() {
        return this.n;
    }

    public com.applovin.impl.sdk.ad.b g() {
        return this.s;
    }

    public v.f h() {
        return this.k;
    }

    public AppLovinAdView i() {
        return this.b;
    }

    public com.applovin.impl.sdk.k j() {
        return this.c;
    }

    public AppLovinAdSize k() {
        return this.i;
    }

    public String l() {
        return this.j;
    }

    public void u() {
        if (this.c == null || this.m == null || this.a == null || !this.y) {
            com.applovin.impl.sdk.o.i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.d.loadNextAd(this.j, this.i, this.m);
        }
    }

    public static /* synthetic */ void a(a aVar, int i) {
        aVar.b(i);
    }

    private void d() {
        a(new q(this));
    }

    public void c(int i) {
        String a2 = e8.a(i);
        if (com.applovin.impl.sdk.o.a()) {
            this.e.a("AppLovinAdView", "onWindowVisibilityChanged( " + a2 + " )");
        }
        b("javascript:al_onWindowVisibilityChanged( " + a2 + " );");
    }

    public static /* synthetic */ void a(View view, AppLovinAdSize appLovinAdSize) {
        b(view, appLovinAdSize);
    }

    private void d(String str, Map map) {
        a(o8.d(str, map));
    }

    public static /* synthetic */ k a(a aVar, k kVar) {
        aVar.p = kVar;
        return kVar;
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.A = appLovinAdLoadListener;
    }

    public void c(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.B = appLovinAdDisplayListener;
    }

    public void c(WebView webView) {
        a(webView, (String) null);
    }

    private void c(String str, Map map) {
        a(o8.c(str, map));
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.C = appLovinAdViewEventListener;
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.D = appLovinAdClickListener;
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.k kVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize != null) {
            this.c = kVar;
            this.d = kVar.k();
            this.e = kVar.O();
            this.f = AppLovinCommunicator.getInstance(context);
            this.i = appLovinAdSize;
            this.j = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.a = context;
            this.b = appLovinAdView;
            this.l = new com.applovin.impl.adview.c(this, kVar);
            this.r = new c(this, null);
            this.q = new d(this, null);
            this.m = new e(this, kVar);
            a(appLovinAdSize);
            return;
        }
        throw new IllegalArgumentException("No ad size specified");
    }

    public void b() {
        a(new v(this));
    }

    private /* synthetic */ void b(WebView webView) {
        this.s.getAdEventTracker().c(webView);
        k kVar = this.p;
        if (kVar != null && kVar.a()) {
            f4 adEventTracker = this.s.getAdEventTracker();
            k kVar2 = this.p;
            adEventTracker.b((View) webView, Collections.singletonList(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier())));
        } else {
            this.s.getAdEventTracker().a((View) webView);
        }
        this.s.getAdEventTracker().h();
        this.s.getAdEventTracker().g();
    }

    public void a(AppLovinAdSize appLovinAdSize) {
        try {
            com.applovin.impl.adview.b bVar = new com.applovin.impl.adview.b(this.l, this.c, this.a);
            this.n = bVar;
            bVar.setBackgroundColor(0);
            this.n.setWillNotCacheDrawing(false);
            this.b.setBackgroundColor(0);
            this.b.addView(this.n);
            b((View) this.n, appLovinAdSize);
            if (!this.y) {
                a(this.r);
            }
            a(new A(this));
            this.y = true;
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("AppLovinAdView", "Failed to initialize AdWebView", th);
            this.c.D().c("AppLovinAdView", "initAdWebView", th);
            this.x.set(true);
        }
    }

    private /* synthetic */ void b(MotionEvent motionEvent) {
        if (this.u == null && (this.s instanceof com.applovin.impl.sdk.ad.a) && this.n != null) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.s;
            Activity activity = this.a;
            Activity b2 = activity instanceof Activity ? activity : e8.b(this.n, this.c);
            if (b2 != null && !b2.isFinishing()) {
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.removeView(this.n);
                }
                f fVar = new f(aVar, this.n, b2, this.c);
                this.u = fVar;
                fVar.setOnDismissListener(new z(this));
                this.u.show();
                t2.c(this.C, this.s, this.b);
                if (this.s.isOpenMeasurementEnabled()) {
                    this.s.getAdEventTracker().a((View) this.u.c());
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to expand ad. No Activity found.");
            Uri e1 = aVar.e1();
            if (e1 != null) {
                this.d.trackAndLaunchClick(aVar, i(), this, e1, motionEvent);
            }
            this.n.a("javascript:al_onFailedExpand();");
        }
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = com.applovin.impl.s.a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            a(appLovinAdView, appLovinSdk.a(), appLovinAdSize2, str, context);
            if (com.applovin.impl.s.b(attributeSet)) {
                u();
            }
        }
    }

    public void b(AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.z) {
                c(appLovinAd);
            } else {
                this.w.set(appLovinAd);
                if (com.applovin.impl.sdk.o.a()) {
                    this.e.a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            a(new B(this, appLovinAd));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.e.b("AppLovinAdView", "No provided when to the view controller");
        }
        b(-1);
    }

    public void a(String str, Object obj) {
        this.h.put(str, obj);
    }

    public void a(boolean z) {
        if (com.applovin.impl.sdk.o.a()) {
            this.e.a("AppLovinAdView", "onWindowFocusChanged( " + z + " )");
        }
        b("javascript:al_onWindowFocusChanged( " + z + " );");
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            n7.b(appLovinAd, this.c);
            if (this.y) {
                if (appLovinAd.getSize() != AppLovinAdSize.INTERSTITIAL) {
                    Map a2 = f2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid("source", "renderAd", a2);
                    this.c.g().d(d2.C, a2);
                }
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) n7.a(appLovinAd, this.c);
                if (bVar == null) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
                    t2.a(this.B, "Unable to retrieve the loaded ad");
                    Map a3 = f2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid("source", "noAdToRender", a3);
                    CollectionUtils.putStringIfValid("error_message", "Unable to retrieve the loaded ad", a3);
                    this.c.g().d(d2.F, a3);
                    return;
                }
                if (bVar == this.s) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Attempting to show ad again: " + bVar);
                    if (((Boolean) this.c.a(x4.I1)).booleanValue()) {
                        if (this.B instanceof l2) {
                            t2.a(this.B, "Attempting to show ad again");
                        } else if (!n7.c(this.c)) {
                            this.c.g().a(d2.S0, bVar, CollectionUtils.hashMap("source", "attemptingAdReRender"));
                        } else {
                            throw new IllegalStateException("Attempting to show ad again");
                        }
                    }
                    Map hashMap = CollectionUtils.hashMap("source", "attemptingAdReRender");
                    CollectionUtils.putStringIfValid("error_message", "Attempting to show ad again", hashMap);
                    this.c.g().a(d2.F, bVar, hashMap);
                    return;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.e.a("AppLovinAdView", "Rendering ad #" + bVar.getAdIdNumber() + " (" + bVar.getSize() + ")");
                }
                t2.b(this.B, this.s);
                if (this.s != null && this.s.isOpenMeasurementEnabled()) {
                    this.s.getAdEventTracker().f();
                }
                this.w.set((Object) null);
                this.t = null;
                this.s = bVar;
                if (this.s.isCustomTabsEnabled()) {
                    this.k = this.c.z().a(this);
                    this.c.z().b(this.s.getCustomTabsWarmupUrls(), this.k);
                }
                if (!this.z && n7.a(this.i)) {
                    this.c.k().trackImpression(bVar);
                }
                if (this.u != null) {
                    c();
                }
                a(this.q);
                return;
            }
            com.applovin.impl.sdk.o.i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    private void b(int i) {
        if (!this.z) {
            a(this.r);
        }
        a(new w(this, i));
    }

    private void b(String str) {
        if (((Boolean) this.c.a(x4.E1)).booleanValue()) {
            a(str);
        }
    }

    private void b(String str, Map map) {
        a(o8.b(str, map));
    }

    public void b(Uri uri) {
        if (this.s != null && this.s.w0() && this.o == null) {
            String queryParameter = uri.getQueryParameter("tracking_id");
            if (TextUtils.isEmpty(queryParameter)) {
                this.c.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.O().b("AppLovinAdView", "Invalid tracking id. Cannot initialize GA");
                    return;
                }
                return;
            }
            WebView webView = new WebView(this.a);
            this.o = webView;
            webView.setWebViewClient(new a());
            this.o.getSettings().setJavaScriptEnabled(true);
            this.o.loadDataWithBaseURL((String) this.c.a(x4.i7), "<html><head><link rel=\"icon\" href=\"data:,\"><G-SCRIPT_TAG></head><body></body></html>".replace("<G-SCRIPT_TAG>", "<script src='https://www.googletagmanager.com/gtag/js?id=<G-TRACKING_ID>'></script><script>window.dataLayer = window.dataLayer || [];function gtag(){dataLayer.push(arguments);}gtag('js', new Date());gtag('config', '<G-TRACKING_ID>')</script>".replace("<G-TRACKING_ID>", queryParameter)), "text/html", "UTF-8", (String) null);
        }
    }

    public void a(WebView webView, String str) {
        if (this.s == null) {
            return;
        }
        a(new p(webView));
        if (!((Boolean) this.c.a(x4.y6)).booleanValue() || (str != null && str.startsWith(this.s.k()))) {
            try {
                if (this.s != this.t) {
                    this.t = this.s;
                    x();
                    this.n.setAdHtmlLoaded(true);
                    if (this.B != null) {
                        this.c.y().d(this.s);
                        if (this.s.s0()) {
                            this.c.g().a(d2.E, this.s, CollectionUtils.hashMap("details", f2.b(this.s)));
                        } else {
                            this.c.g().a(d2.D, this.s, CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.s.z())));
                            t2.a(this.B, this.s);
                        }
                        if (this.s.Q0()) {
                            String str2 = (String) this.c.p0().a(z4.T, "");
                            JSONObject jSONObject = new JSONObject();
                            JsonUtils.putString(jSONObject, "template_browser_package_name", str2);
                            this.n.a("javascript:al_onAdViewRendered(" + jSONObject + ");");
                        } else {
                            this.n.a("javascript:al_onAdViewRendered();");
                        }
                        if (this.s.s0()) {
                            this.n.a("javascript:al_onAdRestored( '" + this.s.X() + "' );");
                        }
                    }
                    if ((this.s instanceof com.applovin.impl.sdk.ad.a) && this.s.isOpenMeasurementEnabled()) {
                        this.c.q0().a(new r6(this.c, "StartOMSDK", new t(this, webView)), d6.b.e, 500L);
                    }
                }
            } catch (Throwable th) {
                com.applovin.impl.sdk.o.c("AppLovinAdView", "Exception while notifying ad display listener", th);
                com.applovin.impl.sdk.k kVar = this.c;
                if (kVar != null) {
                    kVar.D().c("AppLovinAdView", "onAdHtmlLoaded", th);
                }
            }
        }
    }

    private static /* synthetic */ void a(WebView webView) {
        webView.setVisibility(0);
    }

    public void a(MotionEvent motionEvent) {
        a(new s(this, motionEvent));
    }

    private /* synthetic */ void a(DialogInterface dialogInterface) {
        a();
    }

    public void a() {
        a(new r(this));
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri, MotionEvent motionEvent) {
        if (appLovinAdView != null) {
            this.d.trackAndLaunchClick(bVar, appLovinAdView, this, uri, motionEvent);
        } else if (com.applovin.impl.sdk.o.a()) {
            this.e.b("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
        t2.a(this.D, bVar);
    }

    private /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.x.compareAndSet(true, false)) {
            a(this.i);
        }
        try {
            if (this.A != null) {
                this.A.adReceived(appLovinAd);
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
            com.applovin.impl.sdk.k kVar = this.c;
            if (kVar != null) {
                kVar.D().c("AppLovinAdView", "notifyAdLoadedCallback", th);
            }
        }
    }

    private /* synthetic */ void a(int i) {
        try {
            if (this.A != null) {
                this.A.failedToReceiveAd(i);
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("AppLovinAdView", "Exception while running app load callback", th);
            com.applovin.impl.sdk.k kVar = this.c;
            if (kVar != null) {
                kVar.D().c("AppLovinAdView", "notifyAdLoadFailedCallback", th);
            }
        }
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    public void a(b bVar) {
        this.g = bVar;
    }

    private void a(String str, Map map) {
        a(o8.a(str, map));
    }

    private void a(String str) {
        if (this.s == null || this.n == null || !n7.a(this.s.getSize()) || !StringUtils.isValidString(str)) {
            return;
        }
        this.n.a(str);
    }

    public void a(Uri uri) {
        if (this.s == null || !this.s.w0()) {
            return;
        }
        if (this.o == null) {
            this.c.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.c.O().a("AppLovinAdView", "GA is not initialized. Cannot fire GA event");
                return;
            }
            return;
        }
        String queryParameter = uri.getQueryParameter("event_name");
        String queryParameter2 = uri.getQueryParameter("event_params_json");
        if (TextUtils.isEmpty(queryParameter)) {
            this.c.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.c.O().a("AppLovinAdView", "Invalid GA event name. Cannot fire GA event");
                return;
            }
            return;
        }
        a(new y(this, queryParameter2, queryParameter));
    }

    private /* synthetic */ void a(String str, String str2) {
        String str3;
        if (StringUtils.isValidString(str)) {
            str3 = "gtag('event', '" + str2 + "', " + str + ");";
        } else {
            str3 = "gtag('event', '" + str2 + "')";
        }
        if (((Boolean) this.c.a(x4.Q2)).booleanValue()) {
            o8.a(this.o, str3, this.c);
        } else {
            o8.a(this.o, str3);
        }
    }
}
