package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.applovin.impl.d3;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.j;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.r3;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.a;
import com.applovin.impl.t1;
import com.applovin.impl.t2;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class MaxNativeAdLoaderImpl extends com.applovin.impl.mediation.ads.a implements a.a, j.b {
    public static final String KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE = "ad_request_type";
    private final c a;
    private String b;
    private String c;
    private com.applovin.impl.i d;
    private final Object e;
    private MaxNativeAdListener f;
    private final Map g;
    private final Set h;

    public class a implements Runnable {
        final /* synthetic */ MaxNativeAd a;
        final /* synthetic */ List b;
        final /* synthetic */ ViewGroup c;

        public a(MaxNativeAd maxNativeAd, List list, ViewGroup viewGroup) {
            this.a = maxNativeAd;
            this.b = list;
            this.c = viewGroup;
        }

        public void run() {
            if (this.a.prepareForInteraction(this.b, this.c)) {
                return;
            }
            com.applovin.impl.sdk.o.h(MaxNativeAdLoaderImpl.this.tag, "Failed to prepare native ad for interaction...");
        }
    }

    public class b implements Runnable {
        final /* synthetic */ MaxNativeAdView a;
        final /* synthetic */ d3 b;
        final /* synthetic */ MaxNativeAd c;

        public b(MaxNativeAdView maxNativeAdView, d3 d3Var, MaxNativeAd maxNativeAd) {
            this.a = maxNativeAdView;
            this.b = d3Var;
            this.c = maxNativeAd;
        }

        public void run() {
            com.applovin.impl.sdk.o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Rendering native ad view: " + this.a);
            }
            MaxNativeAdLoaderImpl.this.sdk.y().d(this.b);
            this.a.render(this.b, MaxNativeAdLoaderImpl.a(MaxNativeAdLoaderImpl.this), MaxNativeAdLoaderImpl.this.sdk);
            this.c.setNativeAdView(this.a);
            if (this.c.prepareForInteraction(this.a.getClickableViews(), this.a)) {
                return;
            }
            this.c.prepareViewForInteraction(this.a);
        }
    }

    public class c implements a.a {
        private c() {
        }

        public static /* synthetic */ void a(c cVar, MaxAd maxAd) {
            cVar.a(maxAd);
        }

        public void onAdClicked(MaxAd maxAd) {
            com.applovin.impl.sdk.o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdClicked(nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.b(MaxNativeAdLoaderImpl.this));
            }
            t2.a(MaxNativeAdLoaderImpl.b(MaxNativeAdLoaderImpl.this), maxAd, true);
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        public void onAdDisplayed(MaxAd maxAd) {
        }

        public void onAdHidden(MaxAd maxAd) {
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdLoaderImpl.a(MaxNativeAdLoaderImpl.this, ((MaxErrorImpl) maxError).getLoadTag());
            com.applovin.impl.sdk.o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxNativeAdLoaderImpl.b(MaxNativeAdLoaderImpl.this));
            }
            t2.a(MaxNativeAdLoaderImpl.b(MaxNativeAdLoaderImpl.this), str, maxError, true);
        }

        public void onAdLoaded(MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new v(this, maxAd));
        }

        public void onAdRequestStarted(String str) {
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
            com.applovin.impl.sdk.o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.revenueListener);
            }
            t2.a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }

        public /* synthetic */ c(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl, a aVar) {
            this();
        }

        private /* synthetic */ void a(MaxAd maxAd) {
            com.applovin.impl.sdk.o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Native ad loaded");
            }
            d3 d3Var = (d3) maxAd;
            d3Var.g(MaxNativeAdLoaderImpl.c(MaxNativeAdLoaderImpl.this));
            d3Var.f(MaxNativeAdLoaderImpl.d(MaxNativeAdLoaderImpl.this));
            synchronized (MaxNativeAdLoaderImpl.e(MaxNativeAdLoaderImpl.this)) {
                MaxNativeAdLoaderImpl.f(MaxNativeAdLoaderImpl.this).add(d3Var);
            }
            MaxNativeAdView a = MaxNativeAdLoaderImpl.a(MaxNativeAdLoaderImpl.this, d3Var.K());
            if (a == null) {
                com.applovin.impl.sdk.o oVar2 = MaxNativeAdLoaderImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl2 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl2.logger.a(maxNativeAdLoaderImpl2.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                }
                com.applovin.impl.sdk.o oVar3 = MaxNativeAdLoaderImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl3 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl3.logger.a(maxNativeAdLoaderImpl3.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=null, nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.b(MaxNativeAdLoaderImpl.this));
                }
                t2.a(MaxNativeAdLoaderImpl.b(MaxNativeAdLoaderImpl.this), (MaxNativeAdView) null, maxAd, true);
                MaxNativeAdLoaderImpl.a(MaxNativeAdLoaderImpl.this, d3Var);
                return;
            }
            a(a);
            MaxNativeAdLoaderImpl.a(MaxNativeAdLoaderImpl.this, a, d3Var, d3Var.getNativeAd());
            com.applovin.impl.sdk.o oVar4 = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl4 = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl4.logger.a(maxNativeAdLoaderImpl4.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=" + a + ", nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.b(MaxNativeAdLoaderImpl.this));
            }
            t2.a(MaxNativeAdLoaderImpl.b(MaxNativeAdLoaderImpl.this), a, maxAd, true);
            MaxNativeAdLoaderImpl.a(MaxNativeAdLoaderImpl.this, d3Var);
            MaxNativeAdLoaderImpl.a(MaxNativeAdLoaderImpl.this, a);
        }

        private void a(MaxNativeAdView maxNativeAdView) {
            d3 b;
            com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker == null || (b = adViewTracker.b()) == null) {
                return;
            }
            com.applovin.impl.sdk.o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Destroying previous ad");
            }
            MaxNativeAdLoaderImpl.this.destroy(b);
        }
    }

    public MaxNativeAdLoaderImpl(String str, com.applovin.impl.sdk.k kVar) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", kVar);
        this.a = new c(this, null);
        this.d = com.applovin.impl.i.PUBLISHER_INITIATED;
        this.e = new Object();
        this.g = new HashMap();
        this.h = new HashSet();
        kVar.j().a(this);
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    public static /* synthetic */ c a(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl) {
        return maxNativeAdLoaderImpl.a;
    }

    public static /* synthetic */ MaxNativeAdListener b(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl) {
        return maxNativeAdLoaderImpl.f;
    }

    public static /* synthetic */ String c(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl) {
        return maxNativeAdLoaderImpl.b;
    }

    public static /* synthetic */ String d(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl) {
        return maxNativeAdLoaderImpl.c;
    }

    public static /* synthetic */ Object e(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl) {
        return maxNativeAdLoaderImpl.e;
    }

    public static /* synthetic */ Set f(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl) {
        return maxNativeAdLoaderImpl.h;
    }

    public void destroy() {
        this.f = null;
        this.sdk.j().b(this);
        synchronized (this.e) {
            this.g.clear();
            this.h.clear();
        }
        super.destroy();
    }

    public String getPlacement() {
        return this.b;
    }

    public void handleNativeAdViewRendered(MaxAd maxAd) {
        MaxNativeAd nativeAd = ((d3) maxAd).getNativeAd();
        if (nativeAd == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        com.applovin.impl.mediation.ads.b adViewTracker = nativeAd.getAdViewTracker();
        if (adViewTracker != null) {
            adViewTracker.c();
        } else if (com.applovin.impl.sdk.o.a()) {
            this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve tracker. Ad might not have been registered via MaxNativeAdLoader.a(...).");
        }
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Loading native ad for '" + this.adUnitId + "' into '" + maxNativeAdView + "' and notifying " + this.a + "...");
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a(lowerCase, maxNativeAdView);
        this.sdk.X().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.d, this.localExtraParameters, this.extraParameters, com.applovin.impl.sdk.k.o(), this.a);
    }

    public void onAdExpired(t1 t1Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Ad expired for ad unit id " + getAdUnitId());
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "MaxNativeAdListener.onNativeAdExpired(nativeAd=" + t1Var + "), listener=" + this.f);
        }
        t2.b(this.f, (MaxAd) t1Var, true);
    }

    public void onCreativeIdGenerated(String str, String str2) {
        d3 d3Var;
        Iterator it = this.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                d3Var = null;
                break;
            } else {
                d3Var = (d3) it.next();
                if (d3Var.Q().equalsIgnoreCase(str)) {
                    break;
                }
            }
        }
        if (d3Var != null) {
            d3Var.h(str2);
            t2.b(this.adReviewListener, str2, d3Var);
            synchronized (this.e) {
                this.h.remove(d3Var);
            }
        }
    }

    public void registerClickableViews(List list, ViewGroup viewGroup, MaxAd maxAd) {
        d3 d3Var = (d3) maxAd;
        MaxNativeAd nativeAd = d3Var.getNativeAd();
        if (nativeAd == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.b(this.tag, "Failed to register native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        d3Var.a(viewGroup);
        this.sdk.y().d(d3Var);
        a((y2) d3Var);
        nativeAd.setClickableViews(list);
        nativeAd.setAdViewTracker(new com.applovin.impl.mediation.ads.b(d3Var, viewGroup, this.a, this.sdk));
        a aVar = new a(nativeAd, list, viewGroup);
        if (nativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(aVar);
        } else {
            this.sdk.q0().a((i5) new r6(this.sdk, "renderMaxNativeAd", aVar), d6.b.MEDIATION);
        }
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (!(maxAd instanceof d3)) {
            com.applovin.impl.sdk.o.h(this.tag, "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.");
            return false;
        }
        if (maxNativeAdView == null) {
            com.applovin.impl.sdk.o.h(this.tag, "Failed to render native ad. `adView` to render cannot be null.");
            return false;
        }
        d3 d3Var = (d3) maxAd;
        MaxNativeAd nativeAd = d3Var.getNativeAd();
        if (nativeAd == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.b(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
            }
            return false;
        }
        if (nativeAd.isExpired() && !((Boolean) this.sdk.a(r3.T7)).booleanValue()) {
            com.applovin.impl.sdk.o.h(this.tag, "Cancelled rendering for expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            return false;
        }
        a(maxNativeAdView, d3Var, nativeAd);
        a(maxNativeAdView);
        return true;
    }

    public void setCustomData(String str) {
        n7.b(str, this.tag);
        this.c = str;
    }

    public void setLocalExtraParameter(String str, Object obj) {
        super.setLocalExtraParameter(str, obj);
        if ("ad_request_type".equalsIgnoreCase(str) && (obj instanceof com.applovin.impl.i)) {
            this.d = (com.applovin.impl.i) obj;
        }
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.b = str;
    }

    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + "', nativeAdListener=" + this.f + ", revenueListener=" + this.revenueListener + '}';
    }

    public static /* synthetic */ void a(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl, MaxNativeAdView maxNativeAdView) {
        maxNativeAdLoaderImpl.a(maxNativeAdView);
    }

    public static /* synthetic */ MaxNativeAdView a(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl, String str) {
        return maxNativeAdLoaderImpl.a(str);
    }

    public static /* synthetic */ void a(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl, d3 d3Var) {
        maxNativeAdLoaderImpl.a(d3Var);
    }

    public static /* synthetic */ void a(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl, MaxNativeAdView maxNativeAdView, d3 d3Var, MaxNativeAd maxNativeAd) {
        maxNativeAdLoaderImpl.a(maxNativeAdView, d3Var, maxNativeAd);
    }

    private void a(d3 d3Var) {
        if (d3Var.u0().get()) {
            return;
        }
        this.sdk.f().a(d3Var, this);
    }

    private void a(String str, MaxNativeAdView maxNativeAdView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.e) {
            this.g.put(str, maxNativeAdView);
        }
    }

    public void destroy(MaxAd maxAd) {
        com.applovin.impl.mediation.ads.b adViewTracker;
        if (maxAd instanceof d3) {
            d3 d3Var = (d3) maxAd;
            if (d3Var.x0()) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.logger.a(this.tag, "Native ad (" + d3Var + ") has already been destroyed");
                    return;
                }
                return;
            }
            synchronized (this.e) {
                this.h.remove(d3Var);
            }
            MaxNativeAdView s0 = d3Var.s0();
            if (s0 != null && (adViewTracker = s0.getAdViewTracker()) != null && maxAd.equals(adViewTracker.b())) {
                s0.recycle();
            }
            MaxNativeAd nativeAd = d3Var.getNativeAd();
            if (nativeAd != null && nativeAd.getAdViewTracker() != null) {
                nativeAd.getAdViewTracker().a();
            }
            this.sdk.f().a(d3Var);
            this.sdk.X().destroyAd(d3Var);
            if (this.sdk.R() != null) {
                this.sdk.R().c(this.adUnitId, d3Var.K());
                return;
            } else {
                this.sdk.Q().c(this.adUnitId, d3Var.K());
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Destroy failed on non-native ad(" + maxAd + ")");
        }
    }

    private MaxNativeAdView a(String str) {
        MaxNativeAdView maxNativeAdView;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.e) {
            maxNativeAdView = (MaxNativeAdView) this.g.remove(str);
        }
        return maxNativeAdView;
    }

    private void a(MaxNativeAdView maxNativeAdView, d3 d3Var, MaxNativeAd maxNativeAd) {
        d3Var.a(maxNativeAdView);
        a((y2) d3Var);
        b bVar = new b(maxNativeAdView, d3Var, maxNativeAd);
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            this.sdk.q0().a((i5) new r6(this.sdk, "renderMaxNativeAd", bVar), d6.b.MEDIATION);
        }
    }

    private void a(MaxNativeAdView maxNativeAdView) {
        com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker == null || !maxNativeAdView.isAttachedToWindow()) {
            return;
        }
        adViewTracker.c();
    }
}
