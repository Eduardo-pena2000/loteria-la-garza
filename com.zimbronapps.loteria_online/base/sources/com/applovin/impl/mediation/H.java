package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.c3;
import com.applovin.impl.d5;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.k3;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.r3;
import com.applovin.impl.r6;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class h {
    private final com.applovin.impl.sdk.k b;
    private final com.applovin.impl.sdk.o c;
    private final String d;
    private final k3 e;
    private final String f;
    private MaxAdapter g;
    private String h;
    private y2 i;
    private View j;
    private MaxNativeAd k;
    private MaxNativeAdView l;
    private ViewGroup m;
    private MaxAdapterResponseParameters o;
    private final boolean s;
    private final Handler a = new Handler(Looper.getMainLooper());
    private final b n = new b(this, null);
    private final AtomicBoolean p = new AtomicBoolean(true);
    private final AtomicBoolean q = new AtomicBoolean(false);
    private final AtomicBoolean r = new AtomicBoolean(false);

    public class a implements MaxSignalCollectionListener {
        final /* synthetic */ d5 a;
        final /* synthetic */ s4 b;

        public a(d5 d5Var, s4 s4Var) {
            this.a = d5Var;
            this.b = s4Var;
        }

        public void onSignalCollected(String str) {
            if (this.a.y() && TextUtils.isEmpty(str)) {
                this.b.a(new MaxErrorImpl("Signal is not a valid string"));
            } else {
                this.b.b(str);
            }
        }

        public void onSignalCollectionFailed(String str) {
            this.b.a(new MaxErrorImpl(str));
        }
    }

    public class b implements MaxInterstitialAdapterListener, MaxAppOpenAdapterListener, MaxRewardedAdapterListener, MaxAdViewAdapterListener, MaxNativeAdAdapterListener {
        private MediationServiceImpl.b a;

        private b() {
        }

        public static /* synthetic */ void a(b bVar, MaxError maxError, Bundle bundle) {
            bVar.a(maxError, bundle);
        }

        public static /* synthetic */ void b(b bVar, Bundle bundle) {
            bVar.c(bundle);
        }

        public static /* synthetic */ void c(b bVar, MaxError maxError) {
            bVar.a(maxError);
        }

        public static /* synthetic */ void d(b bVar, Bundle bundle) {
            bVar.i(bundle);
        }

        public static /* synthetic */ void e(b bVar, Bundle bundle) {
            bVar.d(bundle);
        }

        public static /* synthetic */ void f(b bVar, Bundle bundle) {
            bVar.h(bundle);
        }

        public static /* synthetic */ void g(b bVar, Bundle bundle) {
            bVar.j(bundle);
        }

        public static /* synthetic */ void h(b bVar) {
            bVar.a();
        }

        public static /* synthetic */ void i(b bVar, Bundle bundle) {
            bVar.a(bundle);
        }

        public static /* synthetic */ void j(b bVar, Runnable runnable, MaxAdListener maxAdListener, String str) {
            bVar.a(runnable, maxAdListener, str);
        }

        public static /* synthetic */ void k(b bVar, Bundle bundle) {
            bVar.e(bundle);
        }

        public static /* synthetic */ void l(b bVar, Bundle bundle) {
            bVar.f(bundle);
        }

        public static /* synthetic */ void m(b bVar, Bundle bundle) {
            bVar.b(bundle);
        }

        public static /* synthetic */ void n(b bVar, c3 c3Var, MaxReward maxReward, Bundle bundle) {
            bVar.a(c3Var, maxReward, bundle);
        }

        public static /* synthetic */ void o(b bVar, Bundle bundle) {
            bVar.g(bundle);
        }

        public void onAdViewAdClicked() {
            onAdViewAdClicked(null);
        }

        public void onAdViewAdCollapsed() {
            onAdViewAdCollapsed(null);
        }

        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAdViewAdDisplayFailed(maxAdapterError, null);
        }

        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        public void onAdViewAdExpanded() {
            onAdViewAdExpanded(null);
        }

        public void onAdViewAdHidden() {
            onAdViewAdHidden(null);
        }

        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).k("MediationAdapterWrapper", h.i(h.this) + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            a("onAdViewAdLoadFailed", maxAdapterError);
        }

        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, null);
        }

        public void onAppOpenAdClicked() {
            onAppOpenAdClicked(null);
        }

        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAppOpenAdDisplayFailed(maxAdapterError, null);
        }

        public void onAppOpenAdDisplayed() {
            onAppOpenAdDisplayed(null);
        }

        public void onAppOpenAdHidden() {
            onAppOpenAdHidden(null);
        }

        public void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).k("MediationAdapterWrapper", h.i(h.this) + ": app open ad failed to load with error: " + maxAdapterError);
            }
            a("onAppOpenAdLoadFailed", maxAdapterError);
        }

        public void onAppOpenAdLoaded() {
            onAppOpenAdLoaded(null);
        }

        public void onInterstitialAdClicked() {
            onInterstitialAdClicked(null);
        }

        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        public void onInterstitialAdHidden() {
            onInterstitialAdHidden(null);
        }

        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).k("MediationAdapterWrapper", h.i(h.this) + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        public void onNativeAdClicked() {
            onNativeAdClicked(null);
        }

        public void onNativeAdDisplayed(Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": native ad displayed with extra info: " + bundle);
            }
            a("onNativeAdDisplayed", bundle);
        }

        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).k("MediationAdapterWrapper", h.i(h.this) + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": native ad loaded with extra info: " + bundle);
            }
            h.a(h.this, maxNativeAd);
            c("onNativeAdLoaded", bundle);
        }

        public void onRewardedAdClicked() {
            onRewardedAdClicked(null);
        }

        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedAdDisplayFailed(maxAdapterError, null);
        }

        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        public void onRewardedAdHidden() {
            onRewardedAdHidden(null);
        }

        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).k("MediationAdapterWrapper", h.i(h.this) + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        public void onUserRewarded(MaxReward maxReward) {
            onUserRewarded(maxReward, null);
        }

        public /* synthetic */ b(h hVar, a aVar) {
            this();
        }

        public static /* synthetic */ MediationServiceImpl.b a(b bVar) {
            return bVar.a;
        }

        private void b(String str, Bundle bundle) {
            if (h.j(h.this).w().compareAndSet(false, true)) {
                a(str, this.a, new S(this, bundle));
            }
        }

        private void c(String str, Bundle bundle) {
            if (!h.j(h.this).w().get()) {
                h.b(h.this).set(true);
                a(str, this.a, new N(this, bundle));
                return;
            }
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).b("MediationAdapterWrapper", h.i(h.this) + ": blocking ad loaded callback for " + h.j(h.this) + " since onAdHidden() has been called");
            }
            h.g(h.this).t().a(h.j(h.this), str);
        }

        private /* synthetic */ void d(Bundle bundle) {
            this.a.a(h.j(h.this), bundle);
        }

        private /* synthetic */ void e(Bundle bundle) {
            this.a.a(h.j(h.this), bundle);
        }

        private /* synthetic */ void f(Bundle bundle) {
            this.a.a(h.j(h.this), bundle);
        }

        private /* synthetic */ void g(Bundle bundle) {
            this.a.c(h.j(h.this), bundle);
        }

        private /* synthetic */ void h(Bundle bundle) {
            this.a.c(h.j(h.this), bundle);
        }

        private /* synthetic */ void i(Bundle bundle) {
            this.a.e(h.j(h.this), bundle);
        }

        private /* synthetic */ void j(Bundle bundle) {
            if (h.h(h.this).compareAndSet(false, true)) {
                this.a.f(h.j(h.this), bundle);
            }
        }

        public void onAdViewAdClicked(Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": adview ad clicked with extra info: " + bundle);
            }
            a("onAdViewAdClicked", this.a, new T(this, bundle));
        }

        public void onAdViewAdCollapsed(Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", this.a, new P(this));
        }

        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).k("MediationAdapterWrapper", h.i(h.this) + ": adview ad failed to display with error: " + maxAdapterError);
            }
            a("onAdViewAdDisplayFailed", maxAdapterError, bundle);
        }

        public void onAdViewAdDisplayed(Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": adview ad displayed with extra info: " + bundle);
            }
            a("onAdViewAdDisplayed", bundle);
        }

        public void onAdViewAdExpanded(Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", this.a, new b0(this, bundle));
        }

        public void onAdViewAdHidden(Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": adview ad hidden with extra info: " + bundle);
            }
            b("onAdViewAdHidden", bundle);
        }

        public void onAdViewAdLoaded(View view, Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": adview ad loaded with extra info: " + bundle);
            }
            h.a(h.this, view);
            c("onAdViewAdLoaded", bundle);
        }

        public void onAppOpenAdClicked(Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": app open ad clicked with extra info: " + bundle);
            }
            a("onAppOpenAdClicked", this.a, new a0(this, bundle));
        }

        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).k("MediationAdapterWrapper", h.i(h.this) + ": app open ad display failed with error: " + maxAdapterError);
            }
            a("onAppOpenAdDisplayFailed", maxAdapterError, bundle);
        }

        public void onAppOpenAdDisplayed(Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": app open ad displayed with extra info: " + bundle);
            }
            a("onAppOpenAdDisplayed", bundle);
        }

        public void onAppOpenAdHidden(Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": app open ad hidden with extra info: " + bundle);
            }
            b("onAppOpenAdHidden", bundle);
        }

        public void onAppOpenAdLoaded(Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": app open ad loaded with extra info: " + bundle);
            }
            c("onAppOpenAdLoaded", bundle);
        }

        public void onInterstitialAdClicked(Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": interstitial ad clicked with extra info: " + bundle);
            }
            a("onInterstitialAdClicked", this.a, new Y(this, bundle));
        }

        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).k("MediationAdapterWrapper", h.i(h.this) + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            a("onInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        public void onInterstitialAdDisplayed(Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": interstitial ad displayed with extra info: " + bundle);
            }
            a("onInterstitialAdDisplayed", bundle);
        }

        public void onInterstitialAdHidden(Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": interstitial ad hidden with extra info " + bundle);
            }
            b("onInterstitialAdHidden", bundle);
        }

        public void onInterstitialAdLoaded(Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": interstitial ad loaded with extra info: " + bundle);
            }
            c("onInterstitialAdLoaded", bundle);
        }

        public void onNativeAdClicked(Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": native ad clicked");
            }
            a("onNativeAdClicked", this.a, new Q(this, bundle));
        }

        public void onRewardedAdClicked(Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": rewarded ad clicked with extra info: " + bundle);
            }
            a("onRewardedAdClicked", this.a, new V(this, bundle));
        }

        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).k("MediationAdapterWrapper", h.i(h.this) + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedAdDisplayFailed", maxAdapterError, bundle);
        }

        public void onRewardedAdDisplayed(Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": rewarded ad displayed with extra info: " + bundle);
            }
            a("onRewardedAdDisplayed", bundle);
        }

        public void onRewardedAdHidden(Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": rewarded ad hidden with extra info: " + bundle);
            }
            b("onRewardedAdHidden", bundle);
        }

        public void onRewardedAdLoaded(Bundle bundle) {
            h.a(h.this);
            if (com.applovin.impl.sdk.o.a()) {
                h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": rewarded ad loaded with extra info: " + bundle);
            }
            c("onRewardedAdLoaded", bundle);
        }

        public void onUserRewarded(MaxReward maxReward, Bundle bundle) {
            if (h.j(h.this) instanceof c3) {
                c3 c3Var = (c3) h.j(h.this);
                if (c3Var.t0().compareAndSet(false, true)) {
                    h.a(h.this);
                    if (com.applovin.impl.sdk.o.a()) {
                        h.a(h.this).d("MediationAdapterWrapper", h.i(h.this) + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", this.a, new U(this, c3Var, maxReward, bundle));
                }
            }
        }

        public static /* synthetic */ void a(b bVar, String str, MaxError maxError) {
            bVar.a(str, maxError);
        }

        public static /* synthetic */ void a(b bVar, MediationServiceImpl.b bVar2) {
            bVar.a(bVar2);
        }

        private /* synthetic */ void b(Bundle bundle) {
            this.a.d(h.j(h.this), bundle);
        }

        public static /* synthetic */ void a(b bVar, String str, MaxError maxError, Bundle bundle) {
            bVar.a(str, maxError, bundle);
        }

        private void a(MediationServiceImpl.b bVar) {
            if (bVar != null) {
                this.a = bVar;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        private /* synthetic */ void c(Bundle bundle) {
            this.a.a(h.j(h.this), bundle);
        }

        private void a(String str, MaxError maxError) {
            if (h.j(h.this).w().get()) {
                h.a(h.this);
                if (com.applovin.impl.sdk.o.a()) {
                    h.a(h.this).b("MediationAdapterWrapper", h.i(h.this) + ": blocking ad load failed callback for " + h.j(h.this) + " since onAdHidden() has been called");
                }
                h.g(h.this).t().a(h.j(h.this), str);
                return;
            }
            a(str, this.a, new M(this, maxError));
        }

        private /* synthetic */ void a(MaxError maxError) {
            if (h.h(h.this).compareAndSet(false, true)) {
                this.a.onAdLoadFailed(h.e(h.this), maxError);
            }
        }

        private void a(String str, Bundle bundle) {
            if (h.j(h.this).w().get()) {
                h.a(h.this);
                if (com.applovin.impl.sdk.o.a()) {
                    h.a(h.this).b("MediationAdapterWrapper", h.i(h.this) + ": blocking ad displayed callback for " + h.j(h.this) + " since onAdHidden() has been called");
                }
                h.g(h.this).t().a(h.j(h.this), str);
                return;
            }
            if (((Boolean) h.g(h.this).a(r3.w8)).booleanValue()) {
                a(str, this.a, new W(this, bundle));
            } else if (h.j(h.this).u().compareAndSet(false, true)) {
                a(str, this.a, new X(this, bundle));
            }
        }

        private void a(String str, MaxError maxError, Bundle bundle) {
            if (h.j(h.this).w().get()) {
                h.a(h.this);
                if (com.applovin.impl.sdk.o.a()) {
                    h.a(h.this).b("MediationAdapterWrapper", h.i(h.this) + ": blocking ad display failed callback for " + h.j(h.this) + " since onAdHidden() has been called");
                }
                h.g(h.this).t().a(h.j(h.this), str);
                return;
            }
            a(str, this.a, new O(this, maxError, bundle));
        }

        private /* synthetic */ void a(MaxError maxError, Bundle bundle) {
            this.a.a(h.j(h.this), maxError, bundle);
        }

        private /* synthetic */ void a(c3 c3Var, MaxReward maxReward, Bundle bundle) {
            this.a.a(c3Var, maxReward, bundle);
        }

        private /* synthetic */ void a(Bundle bundle) {
            this.a.a(h.j(h.this), bundle);
        }

        private /* synthetic */ void a() {
            this.a.onAdCollapsed(h.j(h.this));
        }

        private void a(String str, MaxAdListener maxAdListener, Runnable runnable) {
            h.c(h.this).post(new Z(this, runnable, maxAdListener, str));
        }

        private /* synthetic */ void a(Runnable runnable, MaxAdListener maxAdListener, String str) {
            try {
                runnable.run();
            } catch (Throwable th) {
                com.applovin.impl.sdk.o.c("MediationAdapterWrapper", "Failed to forward call (" + str + ") to " + (maxAdListener != null ? maxAdListener.getClass().getName() : null), th);
                h.g(h.this).D().a("MediationAdapterWrapper", str, th, CollectionUtils.hashMap("adapter_class", h.d(h.this).b()));
            }
        }
    }

    public static class c implements MaxAdapter.OnCompletionListener {
        private final com.applovin.impl.sdk.k a;
        private final k3 b;
        private final long c;
        private final MaxAdapter.OnCompletionListener d;

        public c(com.applovin.impl.sdk.k kVar, k3 k3Var, long j, MaxAdapter.OnCompletionListener onCompletionListener) {
            this.a = kVar;
            this.b = k3Var;
            this.c = j;
            this.d = onCompletionListener;
        }

        public static /* synthetic */ void a(c cVar, MaxAdapter.InitializationStatus initializationStatus, String str) {
            cVar.a(initializationStatus, str);
        }

        public void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new c0(this, initializationStatus, str), this.b.h());
        }

        private /* synthetic */ void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
            this.a.S().a(this.b, SystemClock.elapsedRealtime() - this.c, initializationStatus, str);
            MaxAdapter.OnCompletionListener onCompletionListener = this.d;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(initializationStatus, str);
            }
        }
    }

    public class d extends i5 {
        private final WeakReference g;

        public /* synthetic */ d(h hVar, a aVar) {
            this();
        }

        private void b(y2 y2Var) {
            if (y2Var != null) {
                this.a.Z().a(y2Var);
            }
        }

        public void run() {
            if (h.h(h.this).get()) {
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, h.i(h.this) + " is timing out " + h.j(h.this) + "...");
            }
            b(h.j(h.this));
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-5101, "Adapter timed out");
            b bVar = (b) this.g.get();
            if (bVar != null) {
                b.a(bVar, this.b, maxErrorImpl);
            }
        }

        private d() {
            super("TaskTimeoutMediatedAd", h.g(h.this));
            this.g = new WeakReference(h.f(h.this));
        }
    }

    public h(k3 k3Var, MaxAdapter maxAdapter, boolean z, com.applovin.impl.sdk.k kVar) {
        if (k3Var == null) {
            throw new IllegalArgumentException("No adapter name specified");
        }
        if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.d = k3Var.c();
        this.g = maxAdapter;
        this.b = kVar;
        this.c = kVar.O();
        this.e = k3Var;
        this.f = maxAdapter.getClass().getSimpleName();
        this.s = z;
    }

    public static /* synthetic */ void a(h hVar, ViewGroup viewGroup, androidx.lifecycle.k kVar, Activity activity) {
        hVar.b(viewGroup, kVar, activity);
    }

    public static /* synthetic */ void b(h hVar, MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        hVar.c(maxAdapterResponseParameters, activity);
    }

    public static /* synthetic */ void c(h hVar, y2 y2Var, Runnable runnable) {
        hVar.a(y2Var, runnable);
    }

    public static /* synthetic */ void d(h hVar, MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, d5 d5Var, s4 s4Var) {
        hVar.a(maxSignalProvider, maxAdapterSignalCollectionParameters, activity, d5Var, s4Var);
    }

    public static /* synthetic */ void e(h hVar, Activity activity) {
        hVar.a(activity);
    }

    public static /* synthetic */ void f(h hVar, Activity activity) {
        hVar.b(activity);
    }

    public static /* synthetic */ void g(h hVar, ViewGroup viewGroup, androidx.lifecycle.k kVar, Activity activity) {
        hVar.a(viewGroup, kVar, activity);
    }

    public static /* synthetic */ void h(h hVar, Runnable runnable) {
        hVar.a(runnable);
    }

    public static /* synthetic */ void i(h hVar, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity) {
        hVar.a(maxAdapterResponseParameters, maxAdFormat, activity);
    }

    public static /* synthetic */ y2 j(h hVar) {
        return hVar.i;
    }

    public static /* synthetic */ void k(h hVar) {
        hVar.l();
    }

    public static /* synthetic */ void l(h hVar, MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        hVar.b(maxAdapterResponseParameters, activity);
    }

    public static /* synthetic */ void m(h hVar, MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        hVar.d(maxAdapterResponseParameters, activity);
    }

    public static /* synthetic */ void n(h hVar, Activity activity) {
        hVar.c(activity);
    }

    public static /* synthetic */ void o(h hVar, MaxAdapter.OnCompletionListener onCompletionListener, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        hVar.a(onCompletionListener, maxAdapterInitializationParameters, activity);
    }

    public static /* synthetic */ void p(h hVar, String str, Runnable runnable) {
        hVar.a(str, runnable);
    }

    public static /* synthetic */ void q(h hVar, MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        hVar.a(maxAdapterResponseParameters, activity);
    }

    public String toString() {
        return "MediationAdapterWrapper{adapterTag='" + this.f + "'}";
    }

    public static /* synthetic */ com.applovin.impl.sdk.o a(h hVar) {
        return hVar.c;
    }

    public static /* synthetic */ AtomicBoolean b(h hVar) {
        return hVar.r;
    }

    public static /* synthetic */ Handler c(h hVar) {
        return hVar.a;
    }

    public static /* synthetic */ k3 d(h hVar) {
        return hVar.e;
    }

    public static /* synthetic */ String e(h hVar) {
        return hVar.h;
    }

    public static /* synthetic */ b f(h hVar) {
        return hVar.n;
    }

    public static /* synthetic */ com.applovin.impl.sdk.k g(h hVar) {
        return hVar.b;
    }

    public static /* synthetic */ AtomicBoolean h(h hVar) {
        return hVar.q;
    }

    public static /* synthetic */ String i(h hVar) {
        return hVar.f;
    }

    private /* synthetic */ void l() {
        a("destroy");
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter != null) {
            this.g = null;
            maxAdapter.onDestroy();
        } else if (com.applovin.impl.sdk.o.a()) {
            this.c.k("MediationAdapterWrapper", "Mediation adapter '" + this.f + "' is already destroyed");
        }
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
    }

    public boolean j() {
        return this.q.get() && this.r.get();
    }

    public boolean k() {
        return this.p.get();
    }

    public static /* synthetic */ View a(h hVar, View view) {
        hVar.j = view;
        return view;
    }

    private /* synthetic */ void b(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxAppOpenAdapter) this.g).loadAppOpenAd(maxAdapterResponseParameters, activity, this.n);
    }

    public MediationServiceImpl.b c() {
        return b.a(this.n);
    }

    public View d() {
        return this.j;
    }

    public MaxNativeAd e() {
        return this.k;
    }

    public MaxNativeAdView f() {
        return this.l;
    }

    public String g() {
        return this.d;
    }

    public ViewGroup h() {
        return this.m;
    }

    public String i() {
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.d, th);
            this.b.D().a("MediationAdapterWrapper", "sdk_version", th, CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("sdk_version");
            this.b.T().a(this.e.b(), "sdk_version", this.i);
            return null;
        }
    }

    public static /* synthetic */ MaxNativeAd a(h hVar, MaxNativeAd maxNativeAd) {
        hVar.k = maxNativeAd;
        return maxNativeAd;
    }

    private /* synthetic */ void c(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedAdapter) this.g).loadRewardedAd(maxAdapterResponseParameters, activity, this.n);
    }

    private /* synthetic */ void d(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MediationAdapterBase) this.g).loadNativeAd(maxAdapterResponseParameters, activity, this.n);
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        b("initialize", new z(this, onCompletionListener, maxAdapterInitializationParameters, activity));
    }

    public void b(y2 y2Var, Activity activity) {
        Runnable f;
        if (a(y2Var, activity)) {
            if (y2Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                f = new D(this, activity);
            } else if (y2Var.getFormat() == MaxAdFormat.APP_OPEN) {
                f = new E(this, activity);
            } else if (y2Var.getFormat() == MaxAdFormat.REWARDED) {
                f = new F(this, activity);
            } else {
                throw new IllegalStateException("Failed to show " + y2Var + ": " + y2Var.getFormat() + " is not a supported ad format");
            }
            a(f, y2Var);
        }
    }

    private /* synthetic */ void a(MaxAdapter.OnCompletionListener onCompletionListener, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a("MediationAdapterWrapper", "Initializing " + this.f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + this.e.r());
        }
        this.g.initialize(maxAdapterInitializationParameters, activity, new c(this.b, this.e, elapsedRealtime, onCompletionListener));
    }

    private /* synthetic */ void c(Activity activity) {
        ((MaxRewardedAdapter) this.g).showRewardedAd(this.o, activity, this.n);
    }

    public void a(String str, y2 y2Var) {
        this.h = str;
        this.i = y2Var;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.l = maxNativeAdView;
    }

    public void a(ViewGroup viewGroup) {
        this.m = viewGroup;
    }

    private /* synthetic */ void b(Activity activity) {
        ((MaxAppOpenAdapter) this.g).showAppOpenAd(this.o, activity, this.n);
    }

    public void a(String str, MaxAdapterResponseParameters maxAdapterResponseParameters, y2 y2Var, Activity activity, MediationServiceImpl.b bVar) {
        Runnable k;
        if (y2Var != null) {
            if (!this.p.get()) {
                String str2 = "Mediation adapter '" + this.f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
                com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str2);
                bVar.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
                return;
            }
            this.o = maxAdapterResponseParameters;
            b.a(this.n, bVar);
            MaxAdFormat format = y2Var.getFormat();
            if (format == MaxAdFormat.INTERSTITIAL) {
                k = new G(this, maxAdapterResponseParameters, activity);
            } else if (format == MaxAdFormat.APP_OPEN) {
                k = new H(this, maxAdapterResponseParameters, activity);
            } else if (format == MaxAdFormat.REWARDED) {
                k = new I(this, maxAdapterResponseParameters, activity);
            } else if (format == MaxAdFormat.NATIVE) {
                k = new J(this, maxAdapterResponseParameters, activity);
            } else if (format.isAdViewAd()) {
                k = new K(this, maxAdapterResponseParameters, format, activity);
            } else {
                throw new IllegalStateException("Failed to load " + y2Var + ": " + y2Var.getFormat() + " is not a supported ad format");
            }
            a("load_ad", format, new L(this, y2Var, k));
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    private /* synthetic */ void b(ViewGroup viewGroup, androidx.lifecycle.k kVar, Activity activity) {
        ((MaxRewardedAdViewAdapter) this.g).showRewardedAd(this.o, viewGroup, kVar, activity, this.n);
    }

    public String b() {
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("MediationAdapterWrapper", "Failed to get adapter version for " + this.d, th);
            this.b.D().a("MediationAdapterWrapper", "adapter_version", th, CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("adapter_version");
            this.b.T().a(this.e.b(), "adapter_version", this.i);
            return null;
        }
    }

    private void b(String str, Runnable runnable) {
        a(str, (MaxAdFormat) null, runnable);
    }

    private /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxInterstitialAdapter) this.g).loadInterstitialAd(maxAdapterResponseParameters, activity, this.n);
    }

    private /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity) {
        ((MaxAdViewAdapter) this.g).loadAdViewAd(maxAdapterResponseParameters, maxAdFormat, activity, this.n);
    }

    private /* synthetic */ void a(y2 y2Var, Runnable runnable) {
        a(this.e, y2Var);
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start loading ad for " + this.d + " due to: " + th;
            com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str);
            b.a(this.n, "load_ad", new MaxErrorImpl(-1, str));
            this.b.D().a("MediationAdapterWrapper", "load_ad", th, CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("load_ad");
            this.b.T().a(this.e.b(), "load_ad", this.i);
        }
    }

    private /* synthetic */ void a(Activity activity) {
        ((MaxInterstitialAdapter) this.g).showInterstitialAd(this.o, activity, this.n);
    }

    public void a(y2 y2Var, ViewGroup viewGroup, androidx.lifecycle.k kVar, Activity activity) {
        Runnable c2;
        if (a(y2Var, activity)) {
            if (y2Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                c2 = new B(this, viewGroup, kVar, activity);
            } else if (y2Var.getFormat() == MaxAdFormat.REWARDED) {
                c2 = new C(this, viewGroup, kVar, activity);
            } else {
                throw new IllegalStateException("Failed to show " + y2Var + ": " + y2Var.getFormat() + " is not a supported ad format");
            }
            a(c2, y2Var);
        }
    }

    private /* synthetic */ void a(ViewGroup viewGroup, androidx.lifecycle.k kVar, Activity activity) {
        ((MaxInterstitialAdViewAdapter) this.g).showInterstitialAd(this.o, viewGroup, kVar, activity, this.n);
    }

    private boolean a(y2 y2Var, Activity activity) {
        if (y2Var != null) {
            if (y2Var.A() == null) {
                com.applovin.impl.sdk.o.h("MediationAdapterWrapper", "Adapter has been garbage collected");
                b.a(this.n, "ad_show", new MaxErrorImpl(-1, "Adapter has been garbage collected"), null);
                return false;
            }
            if (y2Var.A() == this) {
                if (activity == null && MaxAdFormat.APP_OPEN != y2Var.getFormat()) {
                    throw new IllegalArgumentException("No activity specified");
                }
                if (!this.p.get()) {
                    String str = "Mediation adapter '" + this.f + "' is disabled. Showing ads with this adapter is disabled.";
                    com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str);
                    b.a(this.n, "ad_show", new MaxErrorImpl(-1, str), null);
                    return false;
                }
                if (j()) {
                    return true;
                }
                throw new IllegalStateException("Mediation adapter '" + this.f + "' does not have an ad loaded. Please load an ad first");
            }
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    private void a(Runnable runnable, y2 y2Var) {
        y2Var.d0();
        a("show_ad", y2Var.getFormat(), new w(this, runnable));
    }

    private /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start displaying ad for " + this.d + " due to: " + th;
            com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str);
            b.a(this.n, "show_ad", new MaxErrorImpl(-1, str), null);
            this.b.D().a("MediationAdapterWrapper", "show_ad", th, CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("show_ad");
            this.b.T().a(this.e.b(), "show_ad", this.i);
        }
    }

    public void a(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, d5 d5Var, Activity activity, s4 s4Var) {
        if (s4Var != null) {
            if (!this.p.get()) {
                com.applovin.impl.sdk.o.h("MediationAdapterWrapper", "Mediation adapter '" + this.f + "' is disabled. Signal collection ads with this adapter is disabled.");
                s4Var.a(new MaxErrorImpl("The adapter (" + this.f + ") is disabled"));
                return;
            }
            MaxAdapter maxAdapter = this.g;
            if (maxAdapter instanceof MaxSignalProvider) {
                b("collect_signal", new y(this, (MaxSignalProvider) maxAdapter, maxAdapterSignalCollectionParameters, activity, d5Var, s4Var));
                return;
            }
            s4Var.a(new MaxErrorImpl(-5211, "The adapter (" + this.f + ") does not support signal collection"));
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    private /* synthetic */ void a(MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, d5 d5Var, s4 s4Var) {
        try {
            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new a(d5Var, s4Var));
        } catch (Throwable th) {
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl("Failed signal collection for " + this.d + " due to: " + th);
            com.applovin.impl.sdk.o.h("MediationAdapterWrapper", maxErrorImpl.getMessage());
            s4Var.a(maxErrorImpl);
            this.b.D().a("MediationAdapterWrapper", "collect_signal", th, CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("collect_signal");
            this.b.T().a(this.e.b(), "collect_signal", this.i);
        }
        if (!s4Var.d() && d5Var.m() == 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a("MediationAdapterWrapper", "Failing signal collection " + d5Var + " since it has 0 timeout");
            }
            s4Var.a(new MaxErrorImpl(-5210, "The adapter (" + this.f + ") has 0 timeout"));
        }
    }

    public void a() {
        if (this.s) {
            return;
        }
        b("destroy", new A(this));
    }

    private void a(k3 k3Var, y2 y2Var) {
        a(new d(this, null), k3Var, y2Var);
    }

    private void a(i5 i5Var, k3 k3Var, y2 y2Var) {
        long m = k3Var.m();
        if (m <= 0) {
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.c;
                StringBuilder sb = new StringBuilder();
                sb.append("Non-positive timeout set for ");
                if (y2Var != null) {
                    k3Var = y2Var;
                }
                sb.append(k3Var);
                sb.append(", not scheduling a timeout");
                oVar.a("MediationAdapterWrapper", sb.toString());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar2 = this.c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Setting timeout ");
            sb2.append(m);
            sb2.append("ms for ");
            if (y2Var != null) {
                k3Var = y2Var;
            }
            sb2.append(k3Var);
            oVar2.a("MediationAdapterWrapper", sb2.toString());
        }
        this.b.q0().a(i5Var, d6.b.TIMEOUT, m);
    }

    private void a(String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.d("MediationAdapterWrapper", "Marking " + this.f + " as disabled due to: " + str);
        }
        this.p.set(false);
    }

    private void a(String str, MaxAdFormat maxAdFormat, Runnable runnable) {
        x xVar = new x(this, str, runnable);
        if (a(str, maxAdFormat)) {
            this.a.post(xVar);
            return;
        }
        r6 r6Var = new r6(this.b, str + ":" + this.e.c(), xVar);
        if (((Boolean) this.b.a(x4.Z)).booleanValue()) {
            this.b.q0().a(r6Var, this.e);
        } else {
            this.b.q0().a(r6Var);
        }
    }

    private /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a("MediationAdapterWrapper", this.f + ": running " + str + "...");
            }
            runnable.run();
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a("MediationAdapterWrapper", this.f + ": finished " + str + "");
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("MediationAdapterWrapper", "Failed operation " + str + " for " + this.d, th);
            StringBuilder sb = new StringBuilder();
            sb.append("fail_");
            sb.append(str);
            a(sb.toString());
            if (!str.equals("destroy")) {
                this.b.T().a(this.e.b(), str, this.i);
            }
            Map hashMap = CollectionUtils.hashMap("is_wrapper", "true");
            CollectionUtils.putStringIfValid("adapter_class", this.e.b(), hashMap);
            this.b.D().a("MediationAdapterWrapper", str, th, hashMap);
        }
    }

    private boolean a(String str, MaxAdFormat maxAdFormat) {
        Boolean g0;
        Boolean i0;
        Boolean h0;
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter == null) {
            return this.e.r();
        }
        if ("initialize".equals(str)) {
            Boolean shouldInitializeOnUiThread = maxAdapter.shouldInitializeOnUiThread();
            if (shouldInitializeOnUiThread != null) {
                return shouldInitializeOnUiThread.booleanValue();
            }
        } else if ("collect_signal".equals(str)) {
            Boolean shouldCollectSignalsOnUiThread = maxAdapter.shouldCollectSignalsOnUiThread();
            if (shouldCollectSignalsOnUiThread != null) {
                return shouldCollectSignalsOnUiThread.booleanValue();
            }
        } else if ("load_ad".equals(str) && maxAdFormat != null) {
            y2 y2Var = this.i;
            if (y2Var != null && (h0 = y2Var.h0()) != null) {
                return h0.booleanValue();
            }
            Boolean shouldLoadAdsOnUiThread = maxAdapter.shouldLoadAdsOnUiThread(maxAdFormat);
            if (shouldLoadAdsOnUiThread != null) {
                return shouldLoadAdsOnUiThread.booleanValue();
            }
        } else if ("show_ad".equals(str) && maxAdFormat != null) {
            y2 y2Var2 = this.i;
            if (y2Var2 != null && (i0 = y2Var2.i0()) != null) {
                return i0.booleanValue();
            }
            Boolean shouldShowAdsOnUiThread = maxAdapter.shouldShowAdsOnUiThread(maxAdFormat);
            if (shouldShowAdsOnUiThread != null) {
                return shouldShowAdsOnUiThread.booleanValue();
            }
        } else if ("destroy".equals(str)) {
            y2 y2Var3 = this.i;
            if (y2Var3 != null && (g0 = y2Var3.g0()) != null) {
                return g0.booleanValue();
            }
            Boolean shouldDestroyOnUiThread = maxAdapter.shouldDestroyOnUiThread();
            if (shouldDestroyOnUiThread != null) {
                return shouldDestroyOnUiThread.booleanValue();
            }
            return true;
        }
        return this.e.r();
    }
}
