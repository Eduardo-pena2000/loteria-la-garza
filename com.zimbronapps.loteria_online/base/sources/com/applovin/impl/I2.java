package com.applovin.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class i2 {
    protected final com.applovin.impl.sdk.k b;
    protected final AppLovinAdServiceImpl c;
    private AppLovinAd d;
    private String e;
    private SoftReference f;
    private volatile String h;
    private volatile double j;
    public final Map a = Collections.synchronizedMap(new HashMap());
    private final Object g = new Object();
    private volatile boolean i = false;

    public class a implements AppLovinAdRewardListener {
        public a() {
        }

        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            i2.this.b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.b.O().b("IncentivizedAdController", "User over quota: " + map);
            }
        }

        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            i2.this.b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.b.O().b("IncentivizedAdController", "Reward rejected: " + map);
            }
        }

        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            i2.this.b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.b.O().a("IncentivizedAdController", "Reward validated: " + map);
            }
        }

        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            i2.this.b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.b.O().b("IncentivizedAdController", "Reward validation failed: " + i);
            }
        }
    }

    public class b implements AppLovinAdLoadListener {
        private final AppLovinAdLoadListener a;

        public b(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.a = appLovinAdLoadListener;
        }

        public static /* synthetic */ void a(b bVar, AppLovinAd appLovinAd) {
            bVar.a(appLovinAd);
        }

        public static /* synthetic */ void b(b bVar, int i) {
            bVar.a(i);
        }

        public void adReceived(AppLovinAd appLovinAd) {
            i2.b(i2.this, appLovinAd);
            if (this.a != null) {
                AppLovinSdkUtils.runOnUiThread(new N1(this, appLovinAd));
            }
        }

        public void failedToReceiveAd(int i) {
            if (this.a != null) {
                AppLovinSdkUtils.runOnUiThread(new O1(this, i));
            }
        }

        private /* synthetic */ void a(AppLovinAd appLovinAd) {
            try {
                this.a.adReceived(appLovinAd);
            } catch (Throwable th) {
                com.applovin.impl.sdk.o.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                i2.this.b.D().c("IncentivizedAdController", "adLoaded", th);
            }
        }

        private /* synthetic */ void a(int i) {
            try {
                this.a.failedToReceiveAd(i);
            } catch (Throwable th) {
                com.applovin.impl.sdk.o.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                i2.this.b.D().c("IncentivizedAdController", "adLoadFailed", th);
            }
        }
    }

    public class c implements l2, AppLovinAdVideoPlaybackListener, AppLovinAdRewardListener, AppLovinAdClickListener {
        private final AppLovinAd a;
        private final AppLovinAdDisplayListener b;
        private final AppLovinAdClickListener c;
        private final AppLovinAdVideoPlaybackListener d;
        private final AppLovinAdRewardListener e;

        public /* synthetic */ c(i2 i2Var, AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener, a aVar) {
            this(appLovinAd, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        }

        private void a(com.applovin.impl.sdk.ad.b bVar, String str) {
            int i;
            i2.this.b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.b.O().a("IncentivizedAdController", "Finishing direct ad...");
            }
            String a = i2.a(i2.this);
            if (!StringUtils.isValidString(a) || !i2.b(i2.this)) {
                i2.this.b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    i2.this.b.O().b("IncentivizedAdController", "Invalid reward state - result: " + a + " and wasFullyEngaged: " + i2.b(i2.this));
                }
                i2.this.b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    i2.this.b.O().a("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                bVar.d();
                if (i2.b(i2.this)) {
                    i2.this.b.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        i2.this.b.O().b("IncentivizedAdController", "User closed the ad after fully watching but reward validation task did not return on time");
                    }
                    str = "network_timeout";
                    i = -500;
                } else {
                    if (str == null) {
                        str = "unknown_early_dismissal_source";
                    }
                    i2.this.b.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        i2.this.b.O().b("IncentivizedAdController", "Ad closed prematurely from source: " + str);
                    }
                    i = -600;
                }
                bVar.a(o4.a(str));
                i2.this.b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    i2.this.b.O().a("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                t2.a(this.e, bVar, i);
                Map hashMap = CollectionUtils.hashMap("details", String.valueOf(i2.c(i2.this)));
                CollectionUtils.putStringIfValid("source", str, hashMap);
                i2.this.b.g().a(d2.J, bVar, hashMap);
            }
            if (bVar.z0().getAndSet(true)) {
                return;
            }
            i2.this.b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.b.O().a("IncentivizedAdController", "Scheduling report rewarded ad...");
            }
            i2.this.b.q0().a((i5) new m6(bVar, i2.this.b), d6.b.OTHER);
        }

        public void adClicked(AppLovinAd appLovinAd) {
            t2.a(this.c, appLovinAd);
        }

        public void adDisplayed(AppLovinAd appLovinAd) {
            t2.a(this.b, appLovinAd);
        }

        public void adHidden(AppLovinAd appLovinAd) {
            String str;
            AppLovinAd f = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            if (f instanceof com.applovin.impl.sdk.ad.b) {
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) f;
                a(bVar, a(bVar, false));
            } else {
                if (f == null) {
                    str = "null/expired ad";
                } else {
                    str = "invalid ad of type: " + f;
                }
                i2.this.b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    i2.this.b.O().b("IncentivizedAdController", "Received `adHidden` callback for " + str);
                }
            }
            i2.a(i2.this, f);
            i2.this.b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.b.O().a("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            t2.b(this.b, appLovinAd);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.applovin.sdk.AppLovinAd] */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.applovin.sdk.AppLovinAd] */
        public void onAdDisplayFailed(String str) {
            String str2;
            ?? r0 = this.a;
            boolean z = r0 instanceof com.applovin.impl.sdk.ad.c;
            com.applovin.impl.sdk.ad.b bVar = r0;
            if (z) {
                bVar = ((com.applovin.impl.sdk.ad.c) r0).f();
            }
            boolean z2 = this.b instanceof l2;
            if (bVar instanceof com.applovin.impl.sdk.ad.b) {
                com.applovin.impl.sdk.ad.b bVar2 = bVar;
                a(bVar2, a(bVar2, StringUtils.isValidString(str)));
            } else {
                if (bVar == null) {
                    str2 = "null/expired ad";
                } else {
                    str2 = "invalid ad of type: " + bVar;
                }
                i2.this.b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o O = i2.this.b.O();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Received `");
                    sb.append(z2 ? "adDisplayFailed" : "adHidden");
                    sb.append("` callback for ");
                    sb.append(str2);
                    O.b("IncentivizedAdController", sb.toString());
                }
            }
            i2.a(i2.this, bVar);
            if (z2) {
                t2.a(this.b, str);
            } else {
                t2.b(this.b, this.a);
            }
        }

        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            i2.a(i2.this, "quota_exceeded");
            t2.b(this.e, appLovinAd, map);
            i2.this.b.g().a(d2.I, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "quota_exceeded"));
        }

        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            i2.a(i2.this, "rejected");
            t2.a(this.e, appLovinAd, map);
            i2.this.b.g().a(d2.I, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "rejected"));
        }

        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            i2.a(i2.this, "accepted");
            t2.c(this.e, appLovinAd, map);
        }

        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            i2.a(i2.this, "network_timeout");
            t2.a(this.e, appLovinAd, i);
            i2.this.b.g().a(d2.I, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "network_timeout"));
        }

        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            t2.a(this.d, appLovinAd);
        }

        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            AppLovinAd f = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            boolean z2 = (f instanceof com.applovin.impl.sdk.ad.b) && ((com.applovin.impl.sdk.ad.b) f).G0();
            i2 i2Var = i2.this;
            if (z2) {
                d = 100.0d;
            }
            i2.a(i2Var, d);
            i2.a(i2.this, z || z2);
            t2.a(this.d, appLovinAd, i2.c(i2.this), i2.b(i2.this));
        }

        private c(AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.a = appLovinAd;
            this.b = appLovinAdDisplayListener;
            this.c = appLovinAdClickListener;
            this.d = appLovinAdVideoPlaybackListener;
            this.e = appLovinAdRewardListener;
        }

        private String a(com.applovin.impl.sdk.ad.b bVar, boolean z) {
            if (StringUtils.isValidString(bVar.v())) {
                return bVar.v();
            }
            if (z) {
                return "ad_display_failure";
            }
            return null;
        }
    }

    public i2(String str, AppLovinSdk appLovinSdk) {
        this.b = appLovinSdk.a();
        this.c = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.e = str;
    }

    public static /* synthetic */ void a(i2 i2Var, AppLovinAd appLovinAd) {
        i2Var.a(appLovinAd);
    }

    public static /* synthetic */ boolean b(i2 i2Var) {
        return i2Var.i;
    }

    public static /* synthetic */ double c(i2 i2Var) {
        return i2Var.j;
    }

    private void e() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference softReference = this.f;
        if (softReference == null || (appLovinAdLoadListener = (AppLovinAdLoadListener) softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(-300);
    }

    public boolean d() {
        return this.d != null;
    }

    public static /* synthetic */ String a(i2 i2Var) {
        return i2Var.b();
    }

    public static /* synthetic */ AppLovinAd b(i2 i2Var, AppLovinAd appLovinAd) {
        i2Var.d = appLovinAd;
        return appLovinAd;
    }

    public String c() {
        return this.e;
    }

    public static /* synthetic */ boolean a(i2 i2Var, boolean z) {
        i2Var.i = z;
        return z;
    }

    public void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.b.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.b.O().a("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f = new SoftReference(appLovinAdLoadListener);
        if (d()) {
            com.applovin.impl.sdk.o.h("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.d);
                return;
            }
            return;
        }
        a(new b(appLovinAdLoadListener));
    }

    public static /* synthetic */ double a(i2 i2Var, double d) {
        i2Var.j = d;
        return d;
    }

    public static /* synthetic */ void a(i2 i2Var, String str) {
        i2Var.a(str);
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.c.loadNextIncentivizedAd(this.e, appLovinAdLoadListener);
    }

    private void a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.o.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    public void b(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = a();
        }
        a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void b(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.k kVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        a(appLovinAd, viewGroup, kVar, context, appLovinAdRewardListener == null ? a() : appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    private void a(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.k kVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.d;
        }
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, viewGroup, kVar, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.o.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    private String b() {
        String str;
        synchronized (this.g) {
            str = this.h;
        }
        return str;
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.b.q0().a((i5) new t6(bVar, appLovinAdRewardListener, this.b), d6.b.OTHER);
    }

    private void a(String str) {
        synchronized (this.g) {
            this.h = str;
        }
    }

    public void a(String str, Object obj) {
        this.a.put(str, obj);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map a2 = f2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid("source", "showRewardedAd", a2);
        this.b.g().d(d2.C, a2);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd a3 = n7.a(appLovinAdImpl, this.b);
        String a4 = a(a3, appLovinAdImpl);
        if (StringUtils.isValidString(a4)) {
            a(appLovinAdImpl, a4, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.b.y0(), context);
        for (String str : this.a.keySet()) {
            create.setExtraInfo(str, this.a.get(str));
        }
        create.setAdDisplayListener(cVar);
        create.setAdVideoPlaybackListener(cVar);
        create.setAdClickListener(cVar);
        create.showAndRender(a3);
        a((com.applovin.impl.sdk.ad.b) a3, cVar);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, androidx.lifecycle.k kVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map a2 = f2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid("source", "showRewardedAdView", a2);
        this.b.g().d(d2.C, a2);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd a3 = n7.a(appLovinAdImpl, this.b);
        String a4 = a(a3, appLovinAdImpl);
        if (StringUtils.isValidString(a4)) {
            a(appLovinAdImpl, a4, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.b.y0(), context);
        for (String str : this.a.keySet()) {
            create.setExtraInfo(str, this.a.get(str));
        }
        create.setAdDisplayListener(cVar);
        create.setAdVideoPlaybackListener(cVar);
        create.setAdClickListener(cVar);
        create.showAndRender(a3, viewGroup, kVar);
        a((com.applovin.impl.sdk.ad.b) a3, cVar);
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2) {
        if (appLovinAd == null) {
            com.applovin.impl.sdk.o.h("IncentivizedAdController", "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.: " + appLovinAd2);
            return "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.";
        }
        if (appLovinAd2.getType() == AppLovinAdType.INCENTIVIZED) {
            return null;
        }
        com.applovin.impl.sdk.o.h("IncentivizedAdController", "Attempting to display ad with invalid ad type: " + appLovinAd2.getType());
        return "Attempting to display ad with invalid ad type";
    }

    private void a(AppLovinAd appLovinAd, String str, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, l2 l2Var) {
        t2.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        t2.a(l2Var, str);
        Map a2 = f2.a((AppLovinAdImpl) appLovinAd);
        CollectionUtils.putStringIfValid("source", "rewardedAdShowFailed", a2);
        CollectionUtils.putStringIfValid("error_message", str, a2);
        this.b.g().d(d2.F, a2);
    }

    private void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.d;
        if (appLovinAd2 == null) {
            return;
        }
        if (!(appLovinAd2 instanceof com.applovin.impl.sdk.ad.c)) {
            if (appLovinAd == appLovinAd2) {
                this.d = null;
            }
        } else {
            com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd2;
            if (cVar.f() == null || appLovinAd == cVar.f()) {
                this.d = null;
            }
        }
    }

    private AppLovinAdRewardListener a() {
        return new a();
    }
}
