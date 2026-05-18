package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.b3;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.e8;
import com.applovin.impl.f8;
import com.applovin.impl.g8;
import com.applovin.impl.i5;
import com.applovin.impl.j;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.r3;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.f;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements f.a, g8.a, j.b {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private final Context a;
    private final MaxAdView b;
    private final String c;
    private final View d;
    private long e;
    private b3 f;
    private String g;
    private String h;
    private final MaxAdViewConfiguration i;
    private final b j;
    private final d k;
    private final com.applovin.impl.sdk.f l;
    private final f8 m;
    private final g8 n;
    private final Object o;
    private final Object p;
    private b3 q;
    private MaxAd r;
    private boolean s;
    private boolean t;
    private boolean u;
    private final AtomicBoolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public class b extends c {
        private b() {
            super(MaxAdViewImpl.this, null);
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
            }
            t2.a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.a(MaxAdViewImpl.this, maxError);
        }

        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.i(MaxAdViewImpl.this)) {
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.X().destroyAd(maxAd);
                return;
            }
            b3 b3Var = (b3) maxAd;
            b3Var.g(MaxAdViewImpl.j(MaxAdViewImpl.this));
            b3Var.f(MaxAdViewImpl.a(MaxAdViewImpl.this));
            if (b3Var.y() == null) {
                MaxAdViewImpl.this.sdk.X().destroyAd(b3Var);
                onAdLoadFailed(b3Var.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
                return;
            }
            if (b3Var.w0()) {
                long r0 = b3Var.r0();
                MaxAdViewImpl.this.sdk.O();
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl.this.sdk.O().a(MaxAdViewImpl.this.tag, "Scheduling banner ad refresh " + r0 + " milliseconds from now for '" + MaxAdViewImpl.this.adUnitId + "'...");
                }
                MaxAdViewImpl.g(MaxAdViewImpl.this).a(r0);
                if (MaxAdViewImpl.g(MaxAdViewImpl.this).g() || MaxAdViewImpl.b(MaxAdViewImpl.this)) {
                    com.applovin.impl.sdk.o oVar2 = MaxAdViewImpl.this.logger;
                    if (com.applovin.impl.sdk.o.a()) {
                        MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                        maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                    }
                    MaxAdViewImpl.g(MaxAdViewImpl.this).j();
                }
            }
            com.applovin.impl.sdk.o oVar3 = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                maxAdViewImpl3.logger.a(maxAdViewImpl3.tag, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
            }
            t2.f(MaxAdViewImpl.this.adListener, maxAd, true);
            MaxAdViewImpl.a(MaxAdViewImpl.this, b3Var);
        }

        public /* synthetic */ b(MaxAdViewImpl maxAdViewImpl, a aVar) {
            this();
        }
    }

    public abstract class c implements MaxAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.a {
        private c() {
        }

        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.d(MaxAdViewImpl.this))) {
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.a(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.e(MaxAdViewImpl.this))) {
                MaxAdViewImpl.c(MaxAdViewImpl.this, null);
                if ((MaxAdViewImpl.d(MaxAdViewImpl.this).x0() || MaxAdViewImpl.f(MaxAdViewImpl.this)) && MaxAdViewImpl.h(MaxAdViewImpl.this)) {
                    MaxAdViewImpl.a(MaxAdViewImpl.this, false);
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdViewAdListener.onAdCollapsed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.d(MaxAdViewImpl.this))) {
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.d(MaxAdViewImpl.this))) {
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.d(MaxAdViewImpl.this))) {
                MaxAdViewImpl.c(MaxAdViewImpl.this, maxAd);
                if ((MaxAdViewImpl.d(MaxAdViewImpl.this).x0() || MaxAdViewImpl.f(MaxAdViewImpl.this)) && !MaxAdViewImpl.g(MaxAdViewImpl.this).g()) {
                    MaxAdViewImpl.a(MaxAdViewImpl.this, true);
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdViewAdListener.onAdExpanded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.d(MaxAdViewImpl.this))) {
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.e(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdRequestStarted(String str) {
            com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxAdViewImpl.this.requestListener);
            }
            t2.a(MaxAdViewImpl.this.requestListener, str, true);
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
            com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.revenueListener);
            }
            t2.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }

        public /* synthetic */ c(MaxAdViewImpl maxAdViewImpl, a aVar) {
            this();
        }
    }

    public class d extends c {
        private d() {
            super(MaxAdViewImpl.this, null);
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.a(MaxAdViewImpl.this, maxError);
        }

        public void onAdLoaded(MaxAd maxAd) {
            if (!MaxAdViewImpl.c(MaxAdViewImpl.this)) {
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Successfully precached ad for refresh");
                }
                if (((Boolean) MaxAdViewImpl.this.sdk.a(r3.H7)).booleanValue()) {
                    MaxAdViewImpl.a(MaxAdViewImpl.this, maxAd);
                    return;
                } else {
                    MaxAdViewImpl.b(MaxAdViewImpl.this, maxAd);
                    return;
                }
            }
            com.applovin.impl.sdk.o oVar2 = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
            }
            MaxAdViewImpl.this.sdk.X().destroyAd(maxAd);
        }

        public /* synthetic */ d(MaxAdViewImpl maxAdViewImpl, a aVar) {
            this();
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, MaxAdView maxAdView, View view, Context context) {
        super(str, maxAdFormat, "MaxAdView", AppLovinSdk.getInstance(context).a());
        this.c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.e = Long.MAX_VALUE;
        this.o = new Object();
        this.p = new Object();
        this.q = null;
        this.r = null;
        this.v = new AtomicBoolean();
        this.x = false;
        this.a = context.getApplicationContext();
        this.b = maxAdView;
        this.d = view;
        this.j = new b(this, null);
        this.k = new d(this, null);
        this.l = new com.applovin.impl.sdk.f(this.sdk, this);
        this.m = new f8(maxAdView, this.sdk);
        this.n = new g8(maxAdView, this.sdk, this);
        this.i = maxAdViewConfiguration;
        this.sdk.j().a(this);
        if (maxAdViewConfiguration != null && maxAdViewConfiguration.getAdaptiveType() != MaxAdViewConfiguration.AdaptiveType.NONE) {
            setExtraParameter("adaptive_banner", Boolean.toString(true));
            setLocalExtraParameter("adaptive_banner_type", maxAdViewConfiguration.getAdaptiveType().toString());
            int adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth();
            if (adaptiveWidth > 0) {
                setLocalExtraParameter("adaptive_banner_width", Integer.valueOf(adaptiveWidth));
            }
            int inlineMaximumHeight = maxAdViewConfiguration.getInlineMaximumHeight();
            if (inlineMaximumHeight > 0) {
                setLocalExtraParameter("inline_adaptive_banner_max_height", Integer.valueOf(inlineMaximumHeight));
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Created new MaxAdView (" + this + ")");
        }
    }

    public static /* synthetic */ String a(MaxAdViewImpl maxAdViewImpl) {
        return maxAdViewImpl.h;
    }

    public static /* synthetic */ boolean b(MaxAdViewImpl maxAdViewImpl) {
        return maxAdViewImpl.u;
    }

    public static /* synthetic */ boolean c(MaxAdViewImpl maxAdViewImpl) {
        return maxAdViewImpl.x;
    }

    public static /* synthetic */ b3 d(MaxAdViewImpl maxAdViewImpl) {
        return maxAdViewImpl.q;
    }

    public static /* synthetic */ MaxAd e(MaxAdViewImpl maxAdViewImpl) {
        return maxAdViewImpl.r;
    }

    public static /* synthetic */ boolean f(MaxAdViewImpl maxAdViewImpl) {
        return maxAdViewImpl.B;
    }

    public static /* synthetic */ com.applovin.impl.sdk.f g(MaxAdViewImpl maxAdViewImpl) {
        return maxAdViewImpl.l;
    }

    public static /* synthetic */ boolean h(MaxAdViewImpl maxAdViewImpl) {
        return maxAdViewImpl.s;
    }

    public static /* synthetic */ boolean i(MaxAdViewImpl maxAdViewImpl) {
        return maxAdViewImpl.a();
    }

    public static /* synthetic */ String j(MaxAdViewImpl maxAdViewImpl) {
        return maxAdViewImpl.g;
    }

    public static /* synthetic */ void k(MaxAdViewImpl maxAdViewImpl) {
        maxAdViewImpl.g();
    }

    public static /* synthetic */ void l(MaxAdViewImpl maxAdViewImpl, b3 b3Var) {
        maxAdViewImpl.a(b3Var);
    }

    public static /* synthetic */ void m(MaxAdViewImpl maxAdViewImpl, a.a aVar, com.applovin.impl.i iVar) {
        maxAdViewImpl.a(aVar, iVar);
    }

    public static /* synthetic */ void n(MaxAdViewImpl maxAdViewImpl, b3 b3Var) {
        maxAdViewImpl.b(b3Var);
    }

    public static /* synthetic */ void o(MaxAdViewImpl maxAdViewImpl) {
        maxAdViewImpl.c();
    }

    public void destroy() {
        if (((Boolean) this.sdk.a(r3.I7)).booleanValue()) {
            AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.mediation.ads.c(this));
        } else {
            g();
        }
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.g;
    }

    public void loadAd() {
        loadAd(com.applovin.impl.i.PUBLISHER_INITIATED);
    }

    public void onAdRefresh() {
        if (((Boolean) this.sdk.a(r3.H7)).booleanValue()) {
            f();
        } else {
            e();
        }
    }

    public void onCreativeIdGenerated(String str, String str2) {
        b3 b3Var = this.q;
        if (b3Var != null && b3Var.Q().equalsIgnoreCase(str)) {
            this.q.h(str2);
            t2.b(this.adReviewListener, str2, this.q);
            return;
        }
        b3 b3Var2 = this.f;
        if (b3Var2 == null || !b3Var2.Q().equalsIgnoreCase(str)) {
            return;
        }
        this.f.h(str2);
    }

    public void onLogVisibilityImpression() {
        a(this.q, this.m.a(this.q));
    }

    public void onWindowVisibilityChanged(int i) {
        if (((Boolean) this.sdk.a(r3.E7)).booleanValue() && this.l.h()) {
            if (e8.b(i)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.logger.a(this.tag, "Ad view visible");
                }
                this.l.d();
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.logger.a(this.tag, "Ad view hidden");
                }
                this.l.c();
            }
        }
    }

    public void setCustomData(String str) {
        if (this.q != null && com.applovin.impl.sdk.o.a()) {
            this.logger.k(this.tag, "Setting custom data (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        n7.b(str, this.tag);
        this.h = str;
    }

    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    public void setPlacement(String str) {
        if (this.q != null && com.applovin.impl.sdk.o.a()) {
            this.logger.k(this.tag, "Setting placement (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        this.g = str;
    }

    public void setPublisherBackgroundColor(int i) {
        this.e = i;
    }

    public void startAutoRefresh() {
        this.u = false;
        if (!this.l.g()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
                return;
            }
            return;
        }
        this.l.m();
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Resumed auto-refresh with remaining time: " + this.l.b() + "ms");
        }
    }

    public void stopAutoRefresh() {
        if (this.q == null) {
            if (this.y || ((Boolean) this.sdk.a(r3.G7)).booleanValue()) {
                this.u = true;
                return;
            } else {
                com.applovin.impl.sdk.o.j(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Pausing auto-refresh with remaining time: " + this.l.b() + "ms");
        }
        this.l.j();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MaxAdView{adUnitId='");
        sb.append(this.adUnitId);
        sb.append('\'');
        sb.append(", adListener=");
        String str = this.adListener;
        if (str == this.b) {
            str = "this";
        }
        sb.append(str);
        sb.append(", isDestroyed=");
        sb.append(a());
        sb.append('}');
        return sb.toString();
    }

    public static /* synthetic */ void a(MaxAdViewImpl maxAdViewImpl, b3 b3Var) {
        maxAdViewImpl.d(b3Var);
    }

    public static /* synthetic */ void b(MaxAdViewImpl maxAdViewImpl, MaxAd maxAd) {
        maxAdViewImpl.a(maxAd);
    }

    public static /* synthetic */ MaxAd c(MaxAdViewImpl maxAdViewImpl, MaxAd maxAd) {
        maxAdViewImpl.r = maxAd;
        return maxAd;
    }

    private void d(b3 b3Var) {
        AppLovinSdkUtils.runOnUiThread(new e(this, b3Var));
    }

    private void e() {
        this.v.set(false);
        if (this.f != null) {
            i();
            return;
        }
        if (!b()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Refreshing ad from network...");
            }
            loadAd(com.applovin.impl.i.REFRESH);
        } else if (this.t) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
            }
            loadAd(com.applovin.impl.i.REFRESH);
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.v.set(true);
        }
    }

    private void f() {
        boolean z;
        boolean z2;
        synchronized (this.p) {
            try {
                z = false;
                this.v.set(false);
                z2 = this.f != null;
                if (!z2) {
                    if (b()) {
                        if (!this.t) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
                            }
                            this.v.set(true);
                        } else if (com.applovin.impl.sdk.o.a()) {
                            this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
                        }
                    } else if (com.applovin.impl.sdk.o.a()) {
                        this.logger.a(this.tag, "Refreshing ad from network...");
                    }
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            i();
        } else if (z) {
            loadAd(com.applovin.impl.i.REFRESH);
        }
    }

    private void g() {
        h();
        if (this.f != null) {
            this.sdk.X().destroyAd(this.f);
        }
        synchronized (this.o) {
            this.x = true;
        }
        this.l.a();
        this.sdk.j().b(this);
        if (this.sdk.R() != null) {
            this.sdk.R().c(this.adUnitId, this.c);
        } else {
            this.sdk.Q().c(this.adUnitId, this.c);
        }
        super.destroy();
    }

    private void h() {
        b3 b3Var;
        MaxAdView maxAdView = this.b;
        if (maxAdView != null) {
            com.applovin.impl.s.a(maxAdView, this.d);
        }
        this.n.b();
        synchronized (this.o) {
            b3Var = this.q;
        }
        MaxAd maxAd = this.r;
        if (maxAd != null && maxAd.equals(b3Var)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Collapsing ad manually for removed ad.");
            }
            t2.b(this.j, maxAd);
        }
        if (b3Var != null) {
            this.sdk.X().destroyAd(b3Var);
        }
    }

    private void i() {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Rendering for cached ad: " + this.f + "...");
        }
        this.j.onAdLoaded(this.f);
        this.f = null;
    }

    public void loadAd(com.applovin.impl.i iVar) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "" + this + " Loading ad for " + this.adUnitId + "...");
        }
        boolean z = this.y || ((Boolean) this.sdk.a(r3.G7)).booleanValue();
        if (z && !this.l.g() && this.l.h()) {
            com.applovin.impl.sdk.o.h(this.tag, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.l.b()) + " seconds.");
            return;
        }
        if (!z) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(iVar, this.j);
        } else if (this.f != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Rendering cached ad");
            }
            i();
        } else if (this.w) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Waiting for precache ad to load to render");
            }
            this.v.set(true);
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(iVar, this.j);
        }
    }

    public static /* synthetic */ void a(MaxAdViewImpl maxAdViewImpl, MaxError maxError) {
        maxAdViewImpl.a(maxError);
    }

    private /* synthetic */ void b(b3 b3Var) {
        View y = b3Var.y();
        String str = y == null ? "MaxAdView does not have a loaded ad view" : null;
        MaxAdView maxAdView = this.b;
        if (maxAdView == null) {
            str = "MaxAdView does not have a parent view";
        }
        if (str != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.b(this.tag, str);
            }
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, str);
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + b3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            t2.a(this.adListener, (MaxAd) b3Var, (MaxError) maxErrorImpl, true);
            this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, b3Var);
            return;
        }
        h();
        a((y2) b3Var);
        if (b3Var.q0()) {
            this.n.a(b3Var);
        }
        maxAdView.setDescendantFocusability(393216);
        if (b3Var.s0() != Long.MAX_VALUE) {
            this.d.setBackgroundColor((int) b3Var.s0());
        } else {
            long j = this.e;
            if (j != Long.MAX_VALUE) {
                this.d.setBackgroundColor((int) j);
            } else {
                this.d.setBackgroundColor(0);
            }
        }
        maxAdView.addView(y);
        a(y, b3Var);
        this.sdk.y().d(b3Var);
        c(b3Var);
        synchronized (this.o) {
            this.q = b3Var;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Scheduling impression for ad manually...");
        }
        this.sdk.X().processRawAdImpression(b3Var, this.j);
        if (StringUtils.isValidString(this.q.getAdReviewCreativeId())) {
            t2.a(this.adReviewListener, this.q.getAdReviewCreativeId(), (MaxAd) this.q, true);
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new com.applovin.impl.mediation.ads.d(this, b3Var), b3Var.u0());
    }

    private /* synthetic */ void c() {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Loading ad for precache request...");
        }
        a(com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE, this.k);
    }

    private void d() {
        if (b()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Scheduling refresh precache request now");
            }
            this.w = true;
            this.sdk.q0().a((i5) new r6(this.sdk, "loadMaxAdForPrecacheRequest", new g(this)), d6.b.MEDIATION);
        }
    }

    public static /* synthetic */ void a(MaxAdViewImpl maxAdViewImpl, MaxAd maxAd) {
        maxAdViewImpl.b(maxAd);
    }

    public static /* synthetic */ boolean a(MaxAdViewImpl maxAdViewImpl, boolean z) {
        maxAdViewImpl.s = z;
        return z;
    }

    private void c(b3 b3Var) {
        int height = this.b.getHeight();
        int width = this.b.getWidth();
        if (height > 0 || width > 0) {
            int pxToDp = AppLovinSdkUtils.pxToDp(this.a, height);
            int pxToDp2 = AppLovinSdkUtils.pxToDp(this.a, width);
            MaxAdFormat format = b3Var.getFormat();
            int height2 = (this.D ? format.getAdaptiveSize(pxToDp2, this.b.getContext()) : format.getSize()).getHeight();
            int min = Math.min(format.getSize().getWidth(), o0.b(this.a).x);
            if (pxToDp < height2 || pxToDp2 < min) {
                StringBuilder sb = new StringBuilder();
                sb.append("\n**************************************************\n`MaxAdView` size ");
                sb.append(pxToDp2);
                sb.append("x");
                sb.append(pxToDp);
                sb.append(" dp smaller than required ");
                sb.append(this.D ? "adaptive " : "");
                sb.append("size: ");
                sb.append(min);
                sb.append("x");
                sb.append(height2);
                sb.append(" dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                String sb2 = sb.toString();
                if (com.applovin.impl.sdk.o.a()) {
                    this.logger.b("AppLovinSdk", sb2);
                }
            }
        }
    }

    private void a(com.applovin.impl.i iVar, a.a aVar) {
        if (a()) {
            boolean c2 = n7.c(this.sdk);
            this.sdk.D().a(d2.S0, "attemptingToLoadDestroyedAdView", CollectionUtils.hashMap("details", "debug=" + c2));
            if (!c2) {
                com.applovin.impl.sdk.o.h(this.tag, "Failed to load new ad - this instance is already destroyed");
                return;
            }
            throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
        }
        AppLovinSdkUtils.runOnUiThread(true, new f(this, aVar, iVar));
    }

    private /* synthetic */ void a(a.a aVar, com.applovin.impl.i iVar) {
        int adaptiveWidth;
        b3 b3Var = this.q;
        if (b3Var != null) {
            long a2 = this.m.a(b3Var);
            this.extraParameters.put("visible_ad_ad_unit_id", this.q.getAdUnitId());
            this.extraParameters.put("viewability_flags", Long.valueOf(a2));
        } else {
            this.extraParameters.remove("visible_ad_ad_unit_id");
            this.extraParameters.remove("viewability_flags");
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.b.getContext(), this.b.getWidth());
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.b.getContext(), this.b.getHeight());
        this.extraParameters.put("viewport_width", Integer.valueOf(pxToDp));
        this.extraParameters.put("viewport_height", Integer.valueOf(pxToDp2));
        this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(this.l.g() || this.u));
        this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(this.z));
        MaxAdViewConfiguration maxAdViewConfiguration = this.i;
        if (maxAdViewConfiguration != null && (adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth()) > 0 && pxToDp != adaptiveWidth) {
            com.applovin.impl.sdk.o.j(this.tag, "The requested adaptive ad view width (" + adaptiveWidth + " dp) is different from the MaxAdView width (" + pxToDp + " dp).");
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Loading " + this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + this.adUnitId + "' and notifying " + aVar + "...");
        }
        this.sdk.X().loadAd(this.adUnitId, this.c, this.adFormat, iVar, this.localExtraParameters, this.extraParameters, this.a, aVar);
    }

    private void a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Updated allow immediate auto-refresh pause and ad load to: " + str2);
            }
            this.y = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Updated disable auto-retries to: " + str2);
            }
            this.z = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_precache".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Updated precached disabled to: " + str2);
            }
            this.A = Boolean.parseBoolean(str2);
            return;
        }
        if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Updated should stop auto-refresh on ad expand to: " + str2);
            }
            this.B = Boolean.parseBoolean(str2);
            return;
        }
        if ("force_precache".equals(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Updated force precache to: " + str2);
            }
            this.C = Boolean.parseBoolean(str2);
            return;
        }
        if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Updated is adaptive banner to: " + str2);
            }
            if (this.i == null) {
                com.applovin.impl.sdk.o.h(this.tag, "You configured adaptive banners incorrectly by setting extra parameters to the MaxAdView! Please configure adaptive banners via MaxAdViewConfiguration instead. Learn more: https://support.axon.ai/en/max/android/ad-formats/banner-and-mrec-ads#adaptive-banners");
            }
            this.D = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    private void b(MaxAd maxAd) {
        boolean compareAndSet;
        this.w = false;
        synchronized (this.p) {
            try {
                compareAndSet = this.v.compareAndSet(true, false);
                if (!compareAndSet) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.logger.a(this.tag, "Saving precache ad...");
                    }
                    b3 b3Var = (b3) maxAd;
                    this.f = b3Var;
                    b3Var.g(this.g);
                    this.f.f(this.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (compareAndSet) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.j.onAdLoaded(maxAd);
        }
    }

    private boolean b() {
        if (this.A) {
            return false;
        }
        return ((Boolean) this.sdk.a(r3.N7)).booleanValue();
    }

    private /* synthetic */ void a(b3 b3Var) {
        long a2 = this.m.a(b3Var);
        if (!b3Var.q0()) {
            a(b3Var, a2);
        }
        a(a2);
    }

    private void a(MaxError maxError) {
        if (a()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Ad load failure with ad unit ID '" + this.adUnitId + "' occured after MaxAdView was destroyed.");
                return;
            }
            return;
        }
        if (this.sdk.c(r3.A7).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.sdk.O().a(this.tag, "Ignoring banner ad refresh for error code " + maxError.getCode());
                return;
            }
            return;
        }
        if (!this.u && !this.l.g()) {
            this.t = true;
            this.w = false;
            long longValue = ((Long) this.sdk.a(r3.z7)).longValue();
            if (longValue >= 0) {
                this.sdk.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.sdk.O().a(this.tag, "Scheduling failed banner ad refresh " + longValue + " milliseconds from now for '" + this.adUnitId + "'...");
                }
                this.l.a(longValue);
                return;
            }
            return;
        }
        if (this.w) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Refresh precache failed when auto-refresh is stopped");
            }
            this.w = false;
        }
        if (this.v.get()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Refresh precache failed - MaxAdListener.onAdLoadFailed(adUnitId=" + this.adUnitId + ", error=" + maxError + "), listener=" + this.adListener);
            }
            t2.a(this.adListener, this.adUnitId, maxError, true);
        }
    }

    private void a(View view, b3 b3Var) {
        int v0 = b3Var.v0();
        int t0 = b3Var.t0();
        int dpToPx = v0 == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), v0);
        int dpToPx2 = t0 != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), t0) : -1;
        RelativeLayout.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx2);
        } else {
            ((ViewGroup.LayoutParams) layoutParams).width = dpToPx;
            ((ViewGroup.LayoutParams) layoutParams).height = dpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Pinning ad view to MAX ad view with width: " + dpToPx + " and height: " + dpToPx2 + ".");
            }
            RelativeLayout.LayoutParams layoutParams2 = layoutParams;
            for (int i : e8.a(this.b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    private void a(b3 b3Var, long j) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.X().processViewabilityAdImpressionPostback(b3Var, j, this.j);
    }

    private void a(long j) {
        if (n7.a(j, ((Long) this.sdk.a(r3.M7)).longValue()) && !this.C) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Undesired flags matched - current: " + Long.toBinaryString(j) + ", undesired: " + Long.toBinaryString(j));
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Waiting for refresh timer to manually fire request");
            }
            this.t = true;
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "No undesired viewability flags matched or forcing precache - scheduling viewability");
        }
        this.t = false;
        d();
    }

    private void a(MaxAd maxAd) {
        this.w = false;
        if (this.v.compareAndSet(true, false)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.j.onAdLoaded(maxAd);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Saving precache ad...");
        }
        b3 b3Var = (b3) maxAd;
        this.f = b3Var;
        b3Var.g(this.g);
        this.f.f(this.h);
    }

    private boolean a() {
        boolean z;
        synchronized (this.o) {
            z = this.x;
        }
        return z;
    }
}
