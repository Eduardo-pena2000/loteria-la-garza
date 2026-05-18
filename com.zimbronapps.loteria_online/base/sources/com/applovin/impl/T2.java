package com.applovin.impl;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class t2 {
    private static boolean a = true;
    private static boolean b = true;

    public static /* synthetic */ void A(AppLovinPostbackListener appLovinPostbackListener, String str) {
        b(appLovinPostbackListener, str);
    }

    public static /* synthetic */ void B(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        d(z, maxAdListener, maxAd);
    }

    public static /* synthetic */ void C(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        b(appLovinAdViewEventListener, appLovinAd, appLovinAdView, appLovinAdViewDisplayErrorCode);
    }

    public static /* synthetic */ void D(AppLovinAdClickListener appLovinAdClickListener, AppLovinAd appLovinAd) {
        b(appLovinAdClickListener, appLovinAd);
    }

    public static /* synthetic */ void E(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        a(maxAdReviewListener, str, maxAd);
    }

    public static /* synthetic */ void F(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        b(z, maxAdListener, maxAd);
    }

    public static /* synthetic */ void G(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        f(appLovinAdRewardListener, appLovinAd, map);
    }

    public static /* synthetic */ void H(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        d(appLovinAdDisplayListener, appLovinAd);
    }

    public static /* synthetic */ void I(AppLovinPostbackListener appLovinPostbackListener, String str, int i) {
        b(appLovinPostbackListener, str, i);
    }

    public static /* synthetic */ void J(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        a(z, maxAdListener, maxAd);
    }

    public static /* synthetic */ void K(AppLovinAdDisplayListener appLovinAdDisplayListener, String str) {
        b(appLovinAdDisplayListener, str);
    }

    public static /* synthetic */ void L(boolean z, MaxAdExpirationListener maxAdExpirationListener, MaxAd maxAd, MaxAd maxAd2) {
        a(z, maxAdExpirationListener, maxAd, maxAd2);
    }

    public static /* synthetic */ void M(boolean z, MaxAdListener maxAdListener, String str, MaxError maxError) {
        a(z, maxAdListener, str, maxError);
    }

    public static void a(boolean z) {
        b = z;
    }

    public static void b(boolean z) {
        a = z;
    }

    public static /* synthetic */ void c(AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, AppLovinError appLovinError) {
        a(appLovinNativeAdLoadListener, appLovinError);
    }

    public static /* synthetic */ void d(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, int i) {
        b(appLovinAdRewardListener, appLovinAd, i);
    }

    public static /* synthetic */ void e(boolean z, MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        a(z, maxAdListener, maxAd, maxReward);
    }

    public static /* synthetic */ void f(boolean z, MaxNativeAdListener maxNativeAdListener, String str, MaxError maxError) {
        a(z, maxNativeAdListener, str, maxError);
    }

    public static /* synthetic */ void g(boolean z, MaxNativeAdListener maxNativeAdListener, MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        a(z, maxNativeAdListener, maxNativeAdView, maxAd);
    }

    public static /* synthetic */ void h(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        d(appLovinAdViewEventListener, appLovinAd, appLovinAdView);
    }

    public static /* synthetic */ void i(AppLovinNativeAdEventListener appLovinNativeAdEventListener, AppLovinNativeAd appLovinNativeAd) {
        a(appLovinNativeAdEventListener, appLovinNativeAd);
    }

    public static /* synthetic */ void j(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        e(appLovinAdViewEventListener, appLovinAd, appLovinAdView);
    }

    public static /* synthetic */ void k(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        e(appLovinAdRewardListener, appLovinAd, map);
    }

    public static /* synthetic */ void l(boolean z, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd) {
        a(z, maxNativeAdListener, maxAd);
    }

    public static /* synthetic */ void m(boolean z, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd) {
        b(z, maxNativeAdListener, maxAd);
    }

    public static /* synthetic */ void n(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        f(z, maxAdListener, maxAd);
    }

    public static /* synthetic */ void o(boolean z, MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        a(z, maxAdListener, maxAd, maxError);
    }

    public static /* synthetic */ void p(boolean z, MaxAdRequestListener maxAdRequestListener, String str) {
        a(z, maxAdRequestListener, str);
    }

    public static /* synthetic */ void q(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        c(appLovinAdDisplayListener, appLovinAd);
    }

    public static /* synthetic */ void r(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        c(z, maxAdListener, maxAd);
    }

    public static /* synthetic */ void s(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        e(z, maxAdListener, maxAd);
    }

    public static /* synthetic */ void t(boolean z, MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        a(z, maxAdRevenueListener, maxAd);
    }

    public static /* synthetic */ void u(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        d(appLovinAdRewardListener, appLovinAd, map);
    }

    public static /* synthetic */ void v(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd, double d, boolean z) {
        b(appLovinAdVideoPlaybackListener, appLovinAd, d, z);
    }

    public static /* synthetic */ void w(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd) {
        b(appLovinAdVideoPlaybackListener, appLovinAd);
    }

    public static /* synthetic */ void x(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        c(appLovinBidTokenCollectionListener, str);
    }

    public static /* synthetic */ void y(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        d(appLovinBidTokenCollectionListener, str);
    }

    public static /* synthetic */ void z(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        f(appLovinAdViewEventListener, appLovinAd, appLovinAdView);
    }

    public static void a(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        if (appLovinBidTokenCollectionListener != null) {
            AppLovinSdkUtils.runOnUiThread(new V4(appLovinBidTokenCollectionListener, str));
        }
    }

    public static void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        if (appLovinBidTokenCollectionListener != null) {
            AppLovinSdkUtils.runOnUiThread(new N5(appLovinBidTokenCollectionListener, str));
        }
    }

    private static /* synthetic */ void c(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        try {
            appLovinBidTokenCollectionListener.onBidTokenCollected(str);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify bid token listener about successful bid token collection", th);
            c("onBidTokenCollected", th);
        }
    }

    private static /* synthetic */ void d(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        try {
            appLovinBidTokenCollectionListener.onBidTokenCollectionFailed(str);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify bid token listener about bid token collection failure", th);
            c("onBidTokenCollectionFailed", th);
        }
    }

    private static /* synthetic */ void e(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adLeftApplication(a(appLovinAd), appLovinAdView);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad event listener about application leave event", th);
        }
    }

    private static /* synthetic */ void f(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adOpenedFullscreen(a(appLovinAd), appLovinAdView);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen opened event", th);
        }
    }

    public static void a(AppLovinAdDisplayListener appLovinAdDisplayListener, String str) {
        if (appLovinAdDisplayListener instanceof l2) {
            AppLovinSdkUtils.runOnUiThread(new O5(appLovinAdDisplayListener, str));
        }
    }

    private static /* synthetic */ void b(AppLovinAdDisplayListener appLovinAdDisplayListener, String str) {
        ((l2) appLovinAdDisplayListener).onAdDisplayFailed(str);
    }

    public static void b(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new R5(appLovinAdDisplayListener, appLovinAd));
    }

    private static /* synthetic */ void e(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        try {
            appLovinAdRewardListener.userOverQuota(a(appLovinAd), map);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about exceeding quota", th);
        }
    }

    private static /* synthetic */ void f(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        try {
            appLovinAdRewardListener.userRewardVerified(a(appLovinAd), map);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about successful reward validation request", th);
        }
    }

    public static void a(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Y4(appLovinAdDisplayListener, appLovinAd));
    }

    private static /* synthetic */ void b(AppLovinAdClickListener appLovinAdClickListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdClickListener.adClicked(a(appLovinAd));
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being clicked", th);
            c("adClicked", th);
        }
    }

    private static /* synthetic */ void c(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdDisplayListener.adDisplayed(a(appLovinAd));
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being displayed", th);
            c("adDisplayed", th);
        }
    }

    private static /* synthetic */ void d(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdDisplayListener.adHidden(a(appLovinAd));
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being hidden", th);
            c("adHidden", th);
        }
    }

    public static void a(AppLovinAdClickListener appLovinAdClickListener, AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdClickListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new U5(appLovinAdClickListener, appLovinAd));
    }

    public static void e(MaxAdListener maxAdListener, MaxAd maxAd) {
        e(maxAdListener, maxAd, false);
    }

    public static void f(MaxAdListener maxAdListener, MaxAd maxAd) {
        f(maxAdListener, maxAd, false);
    }

    public static void a(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Z5(appLovinAdVideoPlaybackListener, appLovinAd));
    }

    public static void e(MaxAdListener maxAdListener, MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new X4(z, maxAdListener, maxAd));
    }

    public static void f(MaxAdListener maxAdListener, MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new V5(z, maxAdListener, maxAd));
    }

    public static void a(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd, double d, boolean z) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new J5(appLovinAdVideoPlaybackListener, appLovinAd, d, z));
    }

    private static /* synthetic */ void b(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdVideoPlaybackListener.videoPlaybackBegan(a(appLovinAd));
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback began", th);
        }
    }

    public static void c(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new L5(appLovinAdViewEventListener, appLovinAd, appLovinAdView));
    }

    private static /* synthetic */ void d(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adClosedFullscreen(a(appLovinAd), appLovinAdView);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen closed event", th);
        }
    }

    private static /* synthetic */ void e(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z)) {
            try {
                maxAdListener.onAdHidden(maxAd);
                return;
            } catch (Throwable th) {
                a("onAdHidden", th, z);
                b("maxAdHidden", th, z);
                return;
            }
        }
        maxAdListener.onAdHidden(maxAd);
    }

    private static /* synthetic */ void f(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z)) {
            try {
                maxAdListener.onAdLoaded(maxAd);
                return;
            } catch (Throwable th) {
                a("onAdLoaded", th, z);
                b("maxAdLoaded", th, z);
                return;
            }
        }
        maxAdListener.onAdLoaded(maxAd);
    }

    public static void a(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new E5(appLovinAdViewEventListener, appLovinAd, appLovinAdView));
    }

    public static void c(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new S5(appLovinAdRewardListener, appLovinAd, map));
    }

    public static void a(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Z4(appLovinAdViewEventListener, appLovinAd, appLovinAdView, appLovinAdViewDisplayErrorCode));
    }

    private static /* synthetic */ void b(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd, double d, boolean z) {
        try {
            appLovinAdVideoPlaybackListener.videoPlaybackEnded(a(appLovinAd), d, z);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback ended", th);
        }
    }

    public static void c(MaxAdListener maxAdListener, MaxAd maxAd) {
        c(maxAdListener, maxAd, false);
    }

    private static /* synthetic */ void d(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        try {
            appLovinAdRewardListener.userRewardRejected(a(appLovinAd), map);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request being rejected", th);
        }
    }

    public static void a(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new H5(appLovinAdRewardListener, appLovinAd, map));
    }

    public static void c(MaxAdListener maxAdListener, MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new G5(z, maxAdListener, maxAd));
    }

    public static void a(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, int i) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Q4(appLovinAdRewardListener, appLovinAd, i));
    }

    public static void b(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new W5(appLovinAdViewEventListener, appLovinAd, appLovinAdView));
    }

    private static /* synthetic */ void c(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z)) {
            try {
                maxAdListener.onAdDisplayed(maxAd);
                return;
            } catch (Throwable th) {
                a("onAdDisplayed", th, z);
                b("maxAdDisplayed", th, z);
                return;
            }
        }
        maxAdListener.onAdDisplayed(maxAd);
    }

    public static void d(MaxAdListener maxAdListener, MaxAd maxAd) {
        d(maxAdListener, maxAd, false);
    }

    public static void a(MaxAdListener maxAdListener, String str, MaxError maxError) {
        a(maxAdListener, str, maxError, false);
    }

    private static /* synthetic */ void b(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        try {
            appLovinAdViewEventListener.adFailedToDisplay(a(appLovinAd), appLovinAdView, appLovinAdViewDisplayErrorCode);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad event listener about display failed event", th);
        }
    }

    public static void d(MaxAdListener maxAdListener, MaxAd maxAd, boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxAdViewAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new B5(z, maxAdListener, maxAd));
    }

    public static void a(MaxAdListener maxAdListener, String str, MaxError maxError, boolean z) {
        if (str == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new R4(z, maxAdListener, str, maxError));
    }

    private static /* synthetic */ void a(boolean z, MaxAdListener maxAdListener, String str, MaxError maxError) {
        if (c(z)) {
            try {
                maxAdListener.onAdLoadFailed(str, maxError);
                return;
            } catch (Throwable th) {
                a("onAdLoadFailed", th, z);
                b("maxAdLoadFailed", th, z);
                return;
            }
        }
        maxAdListener.onAdLoadFailed(str, maxError);
    }

    public static void b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new M5(appLovinAdRewardListener, appLovinAd, map));
    }

    private static /* synthetic */ void d(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z)) {
            try {
                ((MaxAdViewAdListener) maxAdListener).onAdExpanded(maxAd);
                return;
            } catch (Throwable th) {
                a("onAdExpanded", th, z);
                b("maxAdExpanded", th, z);
                return;
            }
        }
        ((MaxAdViewAdListener) maxAdListener).onAdExpanded(maxAd);
    }

    private static /* synthetic */ void b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, int i) {
        try {
            appLovinAdRewardListener.validationRequestFailed(a(appLovinAd), i);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request failing", th);
        }
    }

    private static boolean c(boolean z) {
        return z ? a : b;
    }

    public static void b(MaxAdListener maxAdListener, MaxAd maxAd) {
        b(maxAdListener, maxAd, false);
    }

    private static void c(String str, Throwable th) {
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        if (kVar != null) {
            kVar.D().a("ListenerCallbackInvoker", str, th);
        }
    }

    public static void b(MaxAdListener maxAdListener, MaxAd maxAd, boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxAdViewAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new T4(z, maxAdListener, maxAd));
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd) {
        a(maxAdListener, maxAd, false);
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new U4(z, maxAdListener, maxAd));
    }

    private static /* synthetic */ void b(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z)) {
            try {
                ((MaxAdViewAdListener) maxAdListener).onAdCollapsed(maxAd);
                return;
            } catch (Throwable th) {
                a("onAdCollapsed", th, z);
                b("maxAdCollapsed", th, z);
                return;
            }
        }
        ((MaxAdViewAdListener) maxAdListener).onAdCollapsed(maxAd);
    }

    private static /* synthetic */ void a(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z)) {
            try {
                maxAdListener.onAdClicked(maxAd);
                return;
            } catch (Throwable th) {
                a("onAdClicked", th, z);
                b("maxAdClicked", th, z);
                return;
            }
        }
        maxAdListener.onAdClicked(maxAd);
    }

    public static void b(MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, boolean z) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new X5(z, maxNativeAdListener, maxAd));
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        a(maxAdListener, maxAd, maxError, false);
    }

    private static /* synthetic */ void b(boolean z, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd) {
        if (c(z)) {
            try {
                maxNativeAdListener.onNativeAdExpired(maxAd);
                return;
            } catch (Throwable th) {
                a("onNativeAdExpired", th, z);
                b("maxNativeAdExpired", th, z);
                return;
            }
        }
        maxNativeAdListener.onNativeAdExpired(maxAd);
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new A5(z, maxAdListener, maxAd, maxError));
    }

    private static /* synthetic */ void a(boolean z, MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        if (c(z)) {
            try {
                maxAdListener.onAdDisplayFailed(maxAd, maxError);
                return;
            } catch (Throwable th) {
                a("onAdDisplayFailed", th, z);
                b("maxAdDisplayFailed", th, z);
                return;
            }
        }
        maxAdListener.onAdDisplayFailed(maxAd, maxError);
    }

    private static /* synthetic */ void b(AppLovinPostbackListener appLovinPostbackListener, String str) {
        try {
            appLovinPostbackListener.onPostbackSuccess(str);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") executed", th);
        }
    }

    public static void a(MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        a(maxAdRevenueListener, maxAd, false);
    }

    private static /* synthetic */ void b(AppLovinPostbackListener appLovinPostbackListener, String str, int i) {
        try {
            appLovinPostbackListener.onPostbackFailure(str, i);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") failing to execute with error code (" + i + "):", th);
        }
    }

    public static void a(MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdRevenueListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new T5(z, maxAdRevenueListener, maxAd));
    }

    private static /* synthetic */ void a(boolean z, MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        if (c(z)) {
            try {
                maxAdRevenueListener.onAdRevenuePaid(maxAd);
                return;
            } catch (Throwable th) {
                a("onAdRevenuePaid", th, z);
                b("maxAdPaidRevenue", th, z);
                return;
            }
        }
        maxAdRevenueListener.onAdRevenuePaid(maxAd);
    }

    public static void b(AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, AppLovinError appLovinError) {
        if (appLovinNativeAdLoadListener != null) {
            AppLovinSdkUtils.runOnUiThread(new D5(appLovinNativeAdLoadListener, appLovinError));
        }
    }

    public static void b(AppLovinNativeAdEventListener appLovinNativeAdEventListener, AppLovinNativeAd appLovinNativeAd) {
        if (appLovinNativeAdEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new K5(appLovinNativeAdEventListener, appLovinNativeAd));
        }
    }

    public static void b(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        a(maxAdReviewListener, str, maxAd, false);
    }

    private static void b(String str, Throwable th) {
        com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Error in publisher callback '" + str + "'", th);
    }

    private static void b(String str, Throwable th, boolean z) {
        if (com.applovin.impl.sdk.k.C0 != null) {
            com.applovin.impl.sdk.k.C0.D().a("ListenerCallbackInvoker", str, th, CollectionUtils.hashMap("details", "isPublisherCallback=" + z));
        }
    }

    public static void a(MaxAdRequestListener maxAdRequestListener, String str) {
        a(maxAdRequestListener, str, false);
    }

    public static void a(MaxAdRequestListener maxAdRequestListener, String str, boolean z) {
        if (str == null || maxAdRequestListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new W4(z, maxAdRequestListener, str));
    }

    private static /* synthetic */ void a(boolean z, MaxAdRequestListener maxAdRequestListener, String str) {
        if (c(z)) {
            try {
                maxAdRequestListener.onAdRequestStarted(str);
                return;
            } catch (Throwable th) {
                a("onAdRequestStarted", th, z);
                b("maxAdRequestStarted", th, z);
                return;
            }
        }
        maxAdRequestListener.onAdRequestStarted(str);
    }

    public static void a(MaxAdExpirationListener maxAdExpirationListener, MaxAd maxAd, MaxAd maxAd2, boolean z) {
        if (maxAd == null || maxAd2 == null || maxAdExpirationListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new I5(z, maxAdExpirationListener, maxAd, maxAd2));
    }

    private static /* synthetic */ void a(boolean z, MaxAdExpirationListener maxAdExpirationListener, MaxAd maxAd, MaxAd maxAd2) {
        if (c(z)) {
            try {
                maxAdExpirationListener.onExpiredAdReloaded(maxAd, maxAd2);
                return;
            } catch (Throwable th) {
                a("onExpiredAdReloaded", th, z);
                b("maxExpiredAdReloaded", th, z);
                return;
            }
        }
        maxAdExpirationListener.onExpiredAdReloaded(maxAd, maxAd2);
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        a(maxAdListener, maxAd, maxReward, false);
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward, boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Q5(z, maxAdListener, maxAd, maxReward));
    }

    private static /* synthetic */ void a(boolean z, MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        if (c(z)) {
            try {
                ((MaxRewardedAdListener) maxAdListener).onUserRewarded(maxAd, maxReward);
                return;
            } catch (Throwable th) {
                a("onUserRewarded", th, z);
                b("maxRewardedUser", th, z);
                return;
            }
        }
        ((MaxRewardedAdListener) maxAdListener).onUserRewarded(maxAd, maxReward);
    }

    public static void a(MaxNativeAdListener maxNativeAdListener, MaxNativeAdView maxNativeAdView, MaxAd maxAd, boolean z) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new S4(z, maxNativeAdListener, maxNativeAdView, maxAd));
    }

    private static /* synthetic */ void a(boolean z, MaxNativeAdListener maxNativeAdListener, MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (c(z)) {
            try {
                maxNativeAdListener.onNativeAdLoaded(maxNativeAdView, maxAd);
                return;
            } catch (Throwable th) {
                a("onNativeAdLoaded", th, z);
                b("maxNativeAdLoaded", th, z);
                return;
            }
        }
        maxNativeAdListener.onNativeAdLoaded(maxNativeAdView, maxAd);
    }

    public static void a(MaxNativeAdListener maxNativeAdListener, String str, MaxError maxError, boolean z) {
        if (str == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new C5(z, maxNativeAdListener, str, maxError));
    }

    private static /* synthetic */ void a(boolean z, MaxNativeAdListener maxNativeAdListener, String str, MaxError maxError) {
        if (c(z)) {
            try {
                maxNativeAdListener.onNativeAdLoadFailed(str, maxError);
                return;
            } catch (Throwable th) {
                a("onNativeAdLoadFailed", th, z);
                b("maxNativeAdLoadFailed", th, z);
                return;
            }
        }
        maxNativeAdListener.onNativeAdLoadFailed(str, maxError);
    }

    public static void a(MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, boolean z) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new F5(z, maxNativeAdListener, maxAd));
    }

    private static /* synthetic */ void a(boolean z, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd) {
        if (c(z)) {
            try {
                maxNativeAdListener.onNativeAdClicked(maxAd);
                return;
            } catch (Throwable th) {
                a("onNativeAdClicked", th, z);
                b("maxNativeAdClicked", th, z);
                return;
            }
        }
        maxNativeAdListener.onNativeAdClicked(maxAd);
    }

    public static void a(AppLovinPostbackListener appLovinPostbackListener, String str) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new P4(appLovinPostbackListener, str));
        }
    }

    public static void a(AppLovinPostbackListener appLovinPostbackListener, String str, int i) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Y5(appLovinPostbackListener, str, i));
        }
    }

    private static /* synthetic */ void a(AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, AppLovinError appLovinError) {
        try {
            appLovinNativeAdLoadListener.onNativeAdLoadFailed(appLovinError);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad failing to load", th);
            c("nativeAdLoadFailed", th);
        }
    }

    private static /* synthetic */ void a(AppLovinNativeAdEventListener appLovinNativeAdEventListener, AppLovinNativeAd appLovinNativeAd) {
        try {
            appLovinNativeAdEventListener.onNativeAdClicked(appLovinNativeAd);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad click", th);
            c("nativeAdClicked", th);
        }
    }

    public static void a(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd, boolean z) {
        if (maxAdReviewListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new P5(maxAdReviewListener, str, maxAd));
        }
    }

    private static /* synthetic */ void a(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        try {
            maxAdReviewListener.onCreativeIdGenerated(str, maxAd);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ListenerCallbackInvoker", "Unable to notify Ad Review creative id generated", th);
            c("adReviewCreativeIdGenerated", th);
        }
    }

    private static AppLovinAd a(AppLovinAd appLovinAd) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        return appLovinAdImpl.getDummyAd() != null ? appLovinAdImpl.getDummyAd() : appLovinAd;
    }

    private static void a(String str, Throwable th, boolean z) {
        if (z) {
            b(str, th);
        } else {
            a(str, th);
        }
    }

    private static void a(String str, Throwable th) {
        com.applovin.impl.sdk.o.b("ListenerCallbackInvoker", "Error in internal callback '" + str + "'", th);
    }
}
