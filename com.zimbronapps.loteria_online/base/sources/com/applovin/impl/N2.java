package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinFullscreenImmersiveActivity;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w1;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class n2 implements AppLovinInterstitialAdDialog {
    protected final com.applovin.impl.sdk.k a;
    private final WeakReference b;
    private final Map c = Collections.synchronizedMap(new HashMap());
    private volatile AppLovinAdLoadListener d;
    private volatile AppLovinAdDisplayListener e;
    private volatile AppLovinAdVideoPlaybackListener f;
    private volatile AppLovinAdClickListener g;
    private volatile com.applovin.impl.sdk.ad.b h;

    public class a implements AppLovinAdLoadListener {
        public a() {
        }

        public void adReceived(AppLovinAd appLovinAd) {
            n2.a(n2.this, appLovinAd);
            n2.this.showAndRender(appLovinAd);
        }

        public void failedToReceiveAd(int i) {
            n2.a(n2.this, i);
        }
    }

    public n2(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.a = appLovinSdk.a();
        this.b = new WeakReference(context);
    }

    public static /* synthetic */ void a(n2 n2Var, androidx.lifecycle.k kVar, AppLovinAd appLovinAd, ViewGroup viewGroup, Activity activity) {
        n2Var.a(kVar, appLovinAd, viewGroup, activity);
    }

    public static /* synthetic */ void b(n2 n2Var, int i) {
        n2Var.a(i);
    }

    public static /* synthetic */ void c(n2 n2Var, ViewGroup viewGroup, Activity activity, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        n2Var.a(viewGroup, activity, appLovinFullscreenAdViewObserver);
    }

    public static /* synthetic */ void d(n2 n2Var, AppLovinAd appLovinAd) {
        n2Var.a(appLovinAd);
    }

    public static /* synthetic */ void e(n2 n2Var, Context context) {
        n2Var.a(context);
    }

    public static /* synthetic */ void f(n2 n2Var, com.applovin.impl.sdk.ad.b bVar) {
        n2Var.b(bVar);
    }

    private long g() {
        String str = (String) this.a.n0().getExtraParameters().get("fullscreen_ad_display_delay_enabled");
        if (str == null || Boolean.parseBoolean(str)) {
            return Math.max(0L, ((Long) this.a.a(x4.V1)).longValue());
        }
        return 0L;
    }

    public Map h() {
        return this.c;
    }

    public boolean i() {
        com.applovin.impl.sdk.ad.b bVar = this.h;
        if (bVar == null) {
            return false;
        }
        bVar.q0();
        bVar.setHasShown(false);
        AppLovinSdkUtils.runOnUiThread(true, new D3(this, bVar));
        return true;
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.g = appLovinAdClickListener;
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.e = appLovinAdDisplayListener;
    }

    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.d = appLovinAdLoadListener;
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f = appLovinAdVideoPlaybackListener;
    }

    public void setExtraInfo(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        this.c.put(str, obj);
    }

    public void show() {
        a(new a());
    }

    public void showAndRender(AppLovinAd appLovinAd) {
        if (appLovinAd.getType() != AppLovinAdType.INCENTIVIZED) {
            Map a2 = f2.a((AppLovinAdImpl) appLovinAd);
            CollectionUtils.putStringIfValid("source", "showInterstitialAd", a2);
            this.a.g().d(d2.C, a2);
        }
        AppLovinAd a3 = n7.a(appLovinAd, this.a);
        Context e = e();
        String a4 = a(a3, appLovinAd, e);
        if (StringUtils.isValidString(a4)) {
            a("interstitialAdShowFailed", a4, appLovinAd);
        } else {
            if (((Boolean) this.a.a(x4.X5)).booleanValue() && a((com.applovin.impl.sdk.ad.b) a3)) {
                return;
            }
            a((com.applovin.impl.sdk.ad.b) a3, e);
        }
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }

    public static /* synthetic */ void a(n2 n2Var, AppLovinAd appLovinAd) {
        n2Var.b(appLovinAd);
    }

    public static /* synthetic */ AppLovinAdDisplayListener b(n2 n2Var) {
        return n2Var.e;
    }

    private Context e() {
        return (Context) this.b.get();
    }

    public AppLovinAdDisplayListener c() {
        return this.e;
    }

    public AppLovinAdVideoPlaybackListener d() {
        return this.f;
    }

    public com.applovin.impl.sdk.ad.b f() {
        return this.h;
    }

    public static /* synthetic */ void a(n2 n2Var, int i) {
        n2Var.b(i);
    }

    public AppLovinAdClickListener b() {
        return this.g;
    }

    public static /* synthetic */ com.applovin.impl.sdk.ad.b a(n2 n2Var) {
        return n2Var.h;
    }

    private /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar) {
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("InterstitialAdDialogWrapper", "Re-showing the current ad after app launch.");
        }
        showAndRender(bVar);
    }

    public static /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        b(bVar, appLovinAdDisplayListener, str, th, appLovinFullscreenAdViewObserver);
    }

    private /* synthetic */ void a(androidx.lifecycle.k kVar, AppLovinAd appLovinAd, ViewGroup viewGroup, Activity activity) {
        a((com.applovin.impl.sdk.ad.b) appLovinAd, viewGroup, new AppLovinFullscreenAdViewObserver(kVar, this), activity);
    }

    private static void b(com.applovin.impl.sdk.ad.b bVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        appLovinFullscreenAdViewObserver.onDestroy();
        a(bVar, appLovinAdDisplayListener, str, th, (AppLovinFullscreenActivity) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(Context context) {
        Intent intent = new Intent(context, this.h.L0() ? AppLovinFullscreenImmersiveActivity.class : AppLovinFullscreenActivity.class);
        intent.putExtra("com.applovin.interstitial.sdk_key", this.a.i0());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        if (this.a.e().a() == null && ((Boolean) this.a.a(x4.o2)).booleanValue()) {
            intent.addFlags(8388608);
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public boolean a(com.applovin.impl.sdk.ad.b bVar) {
        List a2 = n7.a(!bVar.C0(), bVar, this.a, com.applovin.impl.sdk.k.o());
        if (a2.isEmpty()) {
            return false;
        }
        if (((Boolean) this.a.a(x4.W0)).booleanValue() && !n7.a(a2, bVar)) {
            a(a2, (com.applovin.impl.sdk.ad.a) bVar);
            return false;
        }
        String str = "Missing ad resources: " + a2;
        if (((Boolean) this.a.a(x4.T5)).booleanValue()) {
            com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Failing ad display due to missing resources: " + a2);
            a("missingCachedAdResources", str, bVar);
            Map hashMap = CollectionUtils.hashMap("error_message", str);
            CollectionUtils.putStringIfValid("details", "Failing ad display", hashMap);
            this.a.D().a(d2.M0, "missingCachedAdResources", hashMap);
            return true;
        }
        com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Streaming ad due to missing ad resources: " + a2);
        bVar.E0();
        Map hashMap2 = CollectionUtils.hashMap("error_message", str);
        CollectionUtils.putStringIfValid("details", "Streaming ad", hashMap2);
        this.a.D().a(d2.M0, "missingCachedAdResources", hashMap2);
        return false;
    }

    public void showAndRender(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.k kVar) {
        if (appLovinAd.getType() != AppLovinAdType.INCENTIVIZED) {
            Map a2 = f2.a((AppLovinAdImpl) appLovinAd);
            CollectionUtils.putStringIfValid("source", "showInterstitialAdView", a2);
            this.a.g().d(d2.C, a2);
        }
        if (viewGroup != null && kVar != null) {
            AppLovinAd a3 = n7.a(appLovinAd, this.a);
            Activity u0 = this.a.u0();
            String a4 = a(a3, appLovinAd, (Context) u0);
            if (StringUtils.isValidString(a4)) {
                a("interstitialAdShowFailed", a4, appLovinAd);
                return;
            } else {
                if (((Boolean) this.a.a(x4.X5)).booleanValue() && a((com.applovin.impl.sdk.ad.b) a3)) {
                    return;
                }
                AppLovinSdkUtils.runOnUiThread(new Y2(this, kVar, a3, viewGroup, u0));
                return;
            }
        }
        com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
        a("interstitialAdShowFailed", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object", appLovinAd);
    }

    public class b implements w1.g {
        final /* synthetic */ Activity a;
        final /* synthetic */ AppLovinFullscreenAdViewObserver b;
        final /* synthetic */ ViewGroup c;

        public b(Activity activity, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, ViewGroup viewGroup) {
            this.a = activity;
            this.b = appLovinFullscreenAdViewObserver;
            this.c = viewGroup;
        }

        public void a(w1 w1Var) {
            if (d.d(this.a)) {
                com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad when parent activity is finishing");
                n2.a(n2.a(n2.this), n2.b(n2.this), "Failed to show interstitial: attempting to show ad when parent activity is finishing", (Throwable) null, this.b);
                Map hashMap = CollectionUtils.hashMap("source", "invalidActivity");
                CollectionUtils.putStringIfValid("error_message", "Failed to show interstitial: attempting to show ad when parent activity is finishing", hashMap);
                n2.this.a.g().a(d2.F, n2.a(n2.this), hashMap);
                return;
            }
            this.b.setPresenter(w1Var);
            try {
                w1Var.a(this.c);
            } catch (Throwable th) {
                String str = "Failed to show interstitial: presenter threw exception " + th;
                com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", str);
                n2.a(n2.a(n2.this), n2.b(n2.this), str, th, this.b);
                Map hashMap2 = CollectionUtils.hashMap("source", "presentContainerView");
                CollectionUtils.putStringIfValid("error_message", str, hashMap2);
                CollectionUtils.putStringIfValid("top_main_method", th.toString(), hashMap2);
                n2.this.a.g().a(d2.F, n2.a(n2.this), hashMap2);
            }
        }

        public void a(String str, Throwable th) {
            n2.a(n2.a(n2.this), n2.b(n2.this), str, th, this.b);
            Map hashMap = CollectionUtils.hashMap("source", "renderInterstitialAdView");
            CollectionUtils.putStringIfValid("error_message", str, hashMap);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), hashMap);
            n2.this.a.g().a(d2.F, n2.a(n2.this), hashMap);
        }
    }

    private void b(AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new C3(this, appLovinAd));
    }

    private void b(int i) {
        AppLovinSdkUtils.runOnUiThread(new Z2(this, i));
    }

    private void a(List list, com.applovin.impl.sdk.ad.a aVar) {
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("InterstitialAdDialogWrapper", "Restoring original URLs for missing non-required cached resources: " + list);
        }
        long currentTimeMillis = System.currentTimeMillis();
        aVar.a(list);
        Map hashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
        CollectionUtils.putStringIfValid("details", list.toString(), hashMap);
        this.a.g().a(d2.K, aVar, hashMap);
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        com.applovin.impl.sdk.o.c("InterstitialAdDialogWrapper", str, th);
        if (appLovinAdDisplayListener instanceof l2) {
            t2.a(appLovinAdDisplayListener, str);
        } else {
            t2.b(appLovinAdDisplayListener, bVar);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss("failed_to_display_ad");
        }
    }

    public void a() {
        this.g = null;
        this.d = null;
        this.f = null;
        this.e = null;
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.a.k().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Failed to show interstitial: stale activity reference provided");
            return "Failed to show interstitial: stale activity reference provided";
        }
        if (appLovinAd == null) {
            com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Unable to retrieve the loaded ad: " + appLovinAd2);
            return "Unable to retrieve the loaded ad";
        }
        if (!((AppLovinAdImpl) appLovinAd).hasShown() || !((Boolean) this.a.a(x4.I1)).booleanValue()) {
            return null;
        }
        com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Attempting to show ad again: " + appLovinAd);
        return "Attempting to show ad again";
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.a.f().a(bVar);
        this.h = bVar;
        long g = g();
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("InterstitialAdDialogWrapper", "Presenting ad with delay " + g + "ms...");
        }
        if (((Boolean) this.a.a(x4.X0)).booleanValue()) {
            this.a.h().a(this.h);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new A3(this, context), g);
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, ViewGroup viewGroup, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, Activity activity) {
        this.a.f().a(bVar);
        this.h = bVar;
        long g = g();
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("InterstitialAdDialogWrapper", "Presenting ad with delay " + g + "ms...");
        }
        if (((Boolean) this.a.a(x4.X0)).booleanValue()) {
            this.a.h().a(this.h);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new B3(this, viewGroup, activity, appLovinFullscreenAdViewObserver), g);
    }

    private /* synthetic */ void a(ViewGroup viewGroup, Activity activity, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + viewGroup + ")");
        }
        viewGroup.setBackgroundColor(-16777216);
        w1.a(this.h, this.g, this.e, this.f, this.c, this.a, activity, new b(activity, appLovinFullscreenAdViewObserver, viewGroup));
    }

    private void a(String str, String str2, AppLovinAd appLovinAd) {
        if (this.e != null) {
            if (this.e instanceof l2) {
                ((l2) this.e).onAdDisplayFailed(str2);
            } else {
                this.e.adHidden(appLovinAd);
            }
        }
        Map a2 = f2.a((AppLovinAdImpl) appLovinAd);
        CollectionUtils.putStringIfValid("source", str, a2);
        CollectionUtils.putStringIfValid("error_message", str2, a2);
        this.a.g().d(d2.F, a2);
    }

    private /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.d != null) {
            this.d.adReceived(appLovinAd);
        }
    }

    private /* synthetic */ void a(int i) {
        if (this.d != null) {
            this.d.failedToReceiveAd(i);
        }
    }
}
