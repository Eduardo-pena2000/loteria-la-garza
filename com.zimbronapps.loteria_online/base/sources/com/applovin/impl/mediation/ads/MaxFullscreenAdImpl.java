package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.applovin.impl.c3;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.f2;
import com.applovin.impl.g0;
import com.applovin.impl.j;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.r3;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.t1;
import com.applovin.impl.t2;
import com.applovin.impl.w3;
import com.applovin.impl.x3;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements a.a, j.b {
    private final a a;
    private final WeakReference b;
    private final b c;
    private final com.applovin.impl.mediation.b d;
    private final Object e;
    private c3 f;
    private c g;
    private final AtomicBoolean h;
    private final AtomicBoolean i;
    private g0 j;
    private long k;
    private boolean l;
    private boolean m;
    private String n;
    private String o;
    private String p;
    private WeakReference q;
    private WeakReference r;
    private WeakReference s;

    public interface a {
        Activity getActivity();
    }

    public class b implements MaxAdListener, MaxAdRevenueListener, a.a {
        public b() {
        }

        public static /* synthetic */ void a(b bVar, MaxAd maxAd, boolean z, c3 c3Var, MaxError maxError) {
            bVar.a(maxAd, z, c3Var, maxError);
        }

        public static /* synthetic */ void b(b bVar, String str, MaxError maxError) {
            bVar.a(str, maxError);
        }

        public static /* synthetic */ void c(b bVar, c3 c3Var, MaxAd maxAd) {
            bVar.a(c3Var, maxAd);
        }

        public static /* synthetic */ void d(b bVar) {
            bVar.a();
        }

        public static /* synthetic */ void e(b bVar, MaxAd maxAd) {
            bVar.a(maxAd);
        }

        public static /* synthetic */ void f(b bVar, c3 c3Var) {
            bVar.a(c3Var);
        }

        public void onAdClicked(MaxAd maxAd) {
            com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            c3 c3Var = (c3) maxAd;
            MaxFullscreenAdImpl.d(MaxFullscreenAdImpl.this);
            boolean l = MaxFullscreenAdImpl.l(MaxFullscreenAdImpl.this);
            if (l) {
                com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "Ad failover failed");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(d2.B0, c3Var, CollectionUtils.hashMap("details", c3Var.u0()));
                MaxFullscreenAdImpl.a(MaxFullscreenAdImpl.this, false);
            }
            MaxFullscreenAdImpl.a(MaxFullscreenAdImpl.this, c.IDLE, new t(this, maxAd, l, c3Var, maxError));
        }

        public void onAdDisplayed(MaxAd maxAd) {
            c3 c3Var = (c3) maxAd;
            if (MaxFullscreenAdImpl.l(MaxFullscreenAdImpl.this)) {
                com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "Ad failover succeeded");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(d2.A0, c3Var, CollectionUtils.hashMap("details", c3Var.u0()));
                MaxFullscreenAdImpl.a(MaxFullscreenAdImpl.this, false);
            }
            MaxFullscreenAdImpl.this.sdk.f().a(c3Var);
            MaxFullscreenAdImpl.a(MaxFullscreenAdImpl.this, (y2) c3Var);
            MaxFullscreenAdImpl.c(MaxFullscreenAdImpl.this);
            if (((Integer) MaxFullscreenAdImpl.this.sdk.a(r3.p8)).intValue() > 0) {
                MaxFullscreenAdImpl.this.sdk.q0().b(new r6(MaxFullscreenAdImpl.this.sdk, "ReportAdHiddenCallbackNotCalled", new u(this, c3Var)), d6.b.TIMEOUT, TimeUnit.SECONDS.toMillis(r1.intValue()));
            }
            com.applovin.impl.sdk.o oVar2 = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.logger.a(maxFullscreenAdImpl2.tag, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onAdHidden(MaxAd maxAd) {
            MaxFullscreenAdImpl.a(MaxFullscreenAdImpl.this, false);
            MaxFullscreenAdImpl.d(MaxFullscreenAdImpl.this);
            MaxFullscreenAdImpl.a(MaxFullscreenAdImpl.this, c.IDLE, new p(this, maxAd));
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxFullscreenAdImpl.k(MaxFullscreenAdImpl.this);
            MaxFullscreenAdImpl.a(MaxFullscreenAdImpl.this, c.IDLE, new r(this, str, maxError));
        }

        public void onAdLoaded(MaxAd maxAd) {
            c3 b;
            synchronized (MaxFullscreenAdImpl.a(MaxFullscreenAdImpl.this)) {
                b = MaxFullscreenAdImpl.b(MaxFullscreenAdImpl.this);
            }
            MaxFullscreenAdImpl.this.sdk.H().a(MaxFullscreenAdImpl.this.adUnitId);
            c3 c3Var = (c3) maxAd;
            MaxFullscreenAdImpl.a(MaxFullscreenAdImpl.this, c3Var);
            if (!MaxFullscreenAdImpl.h(MaxFullscreenAdImpl.this).compareAndSet(true, false)) {
                MaxFullscreenAdImpl.a(MaxFullscreenAdImpl.this, c.READY, new q(this, c3Var, maxAd));
                return;
            }
            MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            if (MaxFullscreenAdImpl.i(MaxFullscreenAdImpl.this).compareAndSet(true, false)) {
                MaxFullscreenAdImpl.j(MaxFullscreenAdImpl.this);
            }
            com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onExpiredAdReloaded(expiredAd=" + b + ", newAd=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.expirationListener);
            }
            t2.a(MaxFullscreenAdImpl.this.expirationListener, (MaxAd) b, maxAd, true);
        }

        public void onAdRequestStarted(String str) {
            com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxFullscreenAdImpl.this.requestListener);
            }
            t2.a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
            com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            t2.a(MaxFullscreenAdImpl.this.revenueListener, maxAd, true);
        }

        private /* synthetic */ void a(c3 c3Var, MaxAd maxAd) {
            if (MaxFullscreenAdImpl.l(MaxFullscreenAdImpl.this)) {
                com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "Attempting ad failover");
                }
                c3Var.j(MaxFullscreenAdImpl.f(MaxFullscreenAdImpl.this));
                MaxFullscreenAdImpl.this.sdk.P().a(d2.z0, c3Var, CollectionUtils.hashMap("details", MaxFullscreenAdImpl.f(MaxFullscreenAdImpl.this)));
                MaxFullscreenAdImpl.j(MaxFullscreenAdImpl.this);
                return;
            }
            com.applovin.impl.sdk.o oVar2 = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.logger.a(maxFullscreenAdImpl2.tag, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        private /* synthetic */ void a(String str, MaxError maxError) {
            com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
        }

        private /* synthetic */ void a(c3 c3Var) {
            if (c3Var.w().get()) {
                return;
            }
            MaxFullscreenAdImpl.this.sdk.P().a(d2.t0, c3Var);
        }

        private /* synthetic */ void a(MaxAd maxAd) {
            MaxFullscreenAdImpl.a(MaxFullscreenAdImpl.this, maxAd);
            com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        private /* synthetic */ void a(MaxAd maxAd, boolean z, c3 c3Var, MaxError maxError) {
            MaxFullscreenAdImpl.a(MaxFullscreenAdImpl.this, maxAd);
            if (!z && c3Var.z0()) {
                if (MaxFullscreenAdImpl.e(MaxFullscreenAdImpl.this)) {
                    AppLovinSdkUtils.runOnUiThread(true, new s(this));
                    return;
                }
                com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "Unable to attempt ad failover due to missing cached ad");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(d2.y0, c3Var);
            }
            com.applovin.impl.sdk.o oVar2 = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.logger.a(maxFullscreenAdImpl2.tag, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
        }

        private /* synthetic */ void a() {
            MaxFullscreenAdImpl.a(MaxFullscreenAdImpl.this, true);
            MaxFullscreenAdImpl.this.loadAd();
        }
    }

    public enum c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, a aVar, String str2, com.applovin.impl.sdk.k kVar, Context context) {
        super(str, maxAdFormat, str2, kVar);
        this.e = new Object();
        this.f = null;
        this.g = c.IDLE;
        this.h = new AtomicBoolean();
        this.i = new AtomicBoolean();
        this.q = new WeakReference((Object) null);
        this.r = new WeakReference((Object) null);
        this.s = new WeakReference((Object) null);
        this.a = aVar;
        this.c = createAdListenerWrapper();
        this.d = new com.applovin.impl.mediation.b(kVar);
        this.b = new WeakReference(context);
        kVar.j().a(this);
        com.applovin.impl.sdk.o.g(str2, "Created new " + str2 + " (" + this + ")");
    }

    public static /* synthetic */ Object a(MaxFullscreenAdImpl maxFullscreenAdImpl) {
        return maxFullscreenAdImpl.e;
    }

    public static /* synthetic */ c3 b(MaxFullscreenAdImpl maxFullscreenAdImpl) {
        return maxFullscreenAdImpl.f;
    }

    public static /* synthetic */ void c(MaxFullscreenAdImpl maxFullscreenAdImpl, String str) {
        maxFullscreenAdImpl.c(str);
    }

    public static /* synthetic */ void d(MaxFullscreenAdImpl maxFullscreenAdImpl, String str, String str2, Activity activity) {
        maxFullscreenAdImpl.a(str, str2, activity);
    }

    public static /* synthetic */ boolean e(MaxFullscreenAdImpl maxFullscreenAdImpl) {
        return maxFullscreenAdImpl.b();
    }

    public static /* synthetic */ String f(MaxFullscreenAdImpl maxFullscreenAdImpl) {
        return maxFullscreenAdImpl.p;
    }

    public static /* synthetic */ void g(MaxFullscreenAdImpl maxFullscreenAdImpl) {
        super.destroy();
    }

    public static /* synthetic */ AtomicBoolean h(MaxFullscreenAdImpl maxFullscreenAdImpl) {
        return maxFullscreenAdImpl.h;
    }

    public static /* synthetic */ AtomicBoolean i(MaxFullscreenAdImpl maxFullscreenAdImpl) {
        return maxFullscreenAdImpl.i;
    }

    public static /* synthetic */ void j(MaxFullscreenAdImpl maxFullscreenAdImpl) {
        maxFullscreenAdImpl.g();
    }

    public static /* synthetic */ void k(MaxFullscreenAdImpl maxFullscreenAdImpl) {
        maxFullscreenAdImpl.e();
    }

    public static /* synthetic */ boolean l(MaxFullscreenAdImpl maxFullscreenAdImpl) {
        return maxFullscreenAdImpl.m;
    }

    public static /* synthetic */ void m(MaxFullscreenAdImpl maxFullscreenAdImpl) {
        maxFullscreenAdImpl.c();
    }

    public static /* synthetic */ void n(MaxFullscreenAdImpl maxFullscreenAdImpl, Long l) {
        maxFullscreenAdImpl.a(l);
    }

    public static /* synthetic */ void o(MaxFullscreenAdImpl maxFullscreenAdImpl, String str, String str2, Activity activity, ViewGroup viewGroup, androidx.lifecycle.k kVar) {
        maxFullscreenAdImpl.a(str, str2, activity, viewGroup, kVar);
    }

    public static /* synthetic */ void p(MaxFullscreenAdImpl maxFullscreenAdImpl, Activity activity, Context context, com.applovin.impl.i iVar) {
        maxFullscreenAdImpl.a(activity, context, iVar);
    }

    public static /* synthetic */ void q(MaxFullscreenAdImpl maxFullscreenAdImpl, String str) {
        maxFullscreenAdImpl.b(str);
    }

    public static /* synthetic */ void r(MaxFullscreenAdImpl maxFullscreenAdImpl, String str) {
        maxFullscreenAdImpl.a(str);
    }

    public b createAdListenerWrapper() {
        return new b();
    }

    public void destroy() {
        a(c.DESTROYED, new k(this));
    }

    public boolean isReady() {
        boolean z;
        synchronized (this.e) {
            try {
                c3 c3Var = this.f;
                z = c3Var != null && c3Var.X() && this.g == c.READY;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            this.sdk.H().c(this.adUnitId);
        }
        return z;
    }

    public void loadAd() {
        loadAd(com.applovin.impl.i.PUBLISHER_INITIATED);
    }

    public void onAdExpired(t1 t1Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Ad expired " + getAdUnitId());
        }
        this.h.set(true);
        a aVar = this.a;
        Activity activity = aVar != null ? aVar.getActivity() : null;
        if (activity == null && (activity = this.sdk.e().b()) == null) {
            e();
            this.c.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
            this.sdk.X().loadAd(this.adUnitId, null, this.adFormat, com.applovin.impl.i.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.c);
        }
    }

    public void onCreativeIdGenerated(String str, String str2) {
        c3 c3Var = this.f;
        if (c3Var == null || !c3Var.Q().equalsIgnoreCase(str)) {
            return;
        }
        this.f.h(str2);
        t2.b(this.adReviewListener, str2, this.f);
    }

    public void showAd(String str, String str2, Activity activity) {
        c3 c3Var;
        List b2 = this.sdk.s0().b();
        if (!this.sdk.s0().d() || b2 == null || (c3Var = this.f) == null || b2.contains(c3Var.c())) {
            if (activity == null) {
                activity = this.sdk.u0();
            }
            if (a(activity, str)) {
                a(c.SHOWING, new n(this, str, str2, activity));
                return;
            }
            return;
        }
        String str3 = "Attempting to show ad from <" + this.f.c() + "> which is not in the list of selected ad networks " + b2;
        com.applovin.impl.sdk.o.h(this.tag, str3);
        a(c.IDLE, new m(this, str3));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.tag);
        sb.append("{adUnitId='");
        sb.append(this.adUnitId);
        sb.append('\'');
        sb.append(", adListener=");
        String str = this.adListener;
        if (str == this.a) {
            str = "this";
        }
        sb.append(str);
        sb.append(", revenueListener=");
        sb.append(this.revenueListener);
        sb.append(", requestListener");
        sb.append(this.requestListener);
        sb.append(", adReviewListener");
        sb.append(this.adReviewListener);
        sb.append(", isReady=");
        sb.append(isReady());
        sb.append('}');
        return sb.toString();
    }

    public static /* synthetic */ void a(MaxFullscreenAdImpl maxFullscreenAdImpl, MaxAd maxAd) {
        maxFullscreenAdImpl.a(maxAd);
    }

    private /* synthetic */ void b(String str) {
        c3 c3Var = this.f;
        a((MaxAd) c3Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-4205, str);
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + c3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        t2.a(this.adListener, (MaxAd) c3Var, (MaxError) maxErrorImpl, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, c3Var);
    }

    public static /* synthetic */ void c(MaxFullscreenAdImpl maxFullscreenAdImpl) {
        maxFullscreenAdImpl.f();
    }

    public static /* synthetic */ void d(MaxFullscreenAdImpl maxFullscreenAdImpl) {
        maxFullscreenAdImpl.d();
    }

    private void e() {
        c3 c3Var;
        if (this.h.compareAndSet(true, false)) {
            synchronized (this.e) {
                c3Var = this.f;
                this.f = null;
            }
            this.sdk.X().destroyAd(c3Var);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    private void f() {
        Long l = (Long) this.sdk.a(x4.D2);
        if (l.longValue() <= 0) {
            return;
        }
        this.j = g0.a(l.longValue(), true, this.sdk, new o(this, l));
    }

    private void g() {
        Activity activity = (Activity) this.q.get();
        if (activity == null) {
            activity = this.sdk.u0();
        }
        Activity activity2 = activity;
        if (this.l) {
            showAd(this.n, this.o, (ViewGroup) this.r.get(), (androidx.lifecycle.k) this.s.get(), activity2);
        } else {
            showAd(this.n, this.o, activity2);
        }
    }

    public void loadAd(com.applovin.impl.i iVar) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (this.g == c.DESTROYED) {
            boolean c2 = n7.c(this.sdk);
            this.sdk.D().a(d2.S0, "attemptingToLoadDestroyedAd", CollectionUtils.hashMap("details", "debug=" + c2));
            if (c2) {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            a aVar = this.a;
            a(c.LOADING, new l(this, aVar != null ? aVar.getActivity() : null, (Context) this.b.get(), iVar));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdLoaded(ad=" + this.f + "), listener=" + this.adListener);
        }
        t2.f(this.adListener, (MaxAd) this.f, true);
    }

    public static /* synthetic */ void a(MaxFullscreenAdImpl maxFullscreenAdImpl, c3 c3Var) {
        maxFullscreenAdImpl.a(c3Var);
    }

    private /* synthetic */ void c() {
        synchronized (this.e) {
            try {
                if (this.f != null) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.logger.a(this.tag, "Destroying ad for '" + this.adUnitId + "'; current ad: " + this.f + "...");
                    }
                    this.sdk.X().destroyAd(this.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.sdk.j().b(this);
        this.d.a();
        g0 g0Var = this.j;
        if (g0Var != null) {
            g0Var.a();
            this.j = null;
        }
        g(this);
    }

    private void d() {
        if (((Boolean) this.sdk.a(x4.C2)).booleanValue()) {
            this.sdk.p0().b(z4.R);
        }
        if (this.j != null) {
            this.sdk.p0().b(z4.S);
            this.j.a();
            this.j = null;
        }
    }

    public static /* synthetic */ void a(MaxFullscreenAdImpl maxFullscreenAdImpl, c cVar, Runnable runnable) {
        maxFullscreenAdImpl.a(cVar, runnable);
    }

    public static /* synthetic */ boolean a(MaxFullscreenAdImpl maxFullscreenAdImpl, boolean z) {
        maxFullscreenAdImpl.m = z;
        return z;
    }

    public static /* synthetic */ void a(MaxFullscreenAdImpl maxFullscreenAdImpl, y2 y2Var) {
        maxFullscreenAdImpl.b(y2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ void a(Activity activity, Context context, com.applovin.impl.i iVar) {
        Activity activity2;
        if (activity != null) {
            activity2 = activity;
        } else if (context != 0) {
            activity2 = context;
        } else {
            if (this.sdk.u0() != null) {
                activity = this.sdk.u0();
            } else {
                activity = com.applovin.impl.sdk.k.o();
            }
            activity2 = activity;
        }
        this.sdk.X().loadAd(this.adUnitId, null, this.adFormat, iVar, this.localExtraParameters, this.extraParameters, activity2, this.c);
    }

    private void b(y2 y2Var) {
        if (((Boolean) this.sdk.a(x4.C2)).booleanValue()) {
            List b2 = y2Var.b("mappk_urls");
            if (CollectionUtils.isEmpty((Collection) b2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putLong(jSONObject, "timestamp_ms", System.currentTimeMillis());
            JsonUtils.putJsonArray(jSONObject, "app_killed_urls", new JSONArray(b2));
            JsonUtils.putJSONObject(jSONObject, "ad_info", new JSONObject(f2.a(y2Var)));
            JsonUtils.putJSONObject(jSONObject, "user_info", new JSONObject(w3.a(y2Var, this.sdk)));
            this.sdk.p0().b(z4.R, jSONObject.toString());
        }
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, androidx.lifecycle.k kVar, Activity activity) {
        c3 c3Var;
        if (viewGroup != null && kVar != null) {
            if (!viewGroup.isShown() && ((Boolean) this.sdk.a(r3.k8)).booleanValue()) {
                com.applovin.impl.sdk.o.h(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
                t2.a(this.adListener, (MaxAd) this.f, (MaxError) maxErrorImpl, true);
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f);
                return;
            }
            List b2 = this.sdk.s0().b();
            if (this.sdk.s0().d() && b2 != null && (c3Var = this.f) != null && !b2.contains(c3Var.c())) {
                String str3 = "Attempting to show ad from <" + this.f.c() + "> which is not in the list of selected ad networks " + b2;
                com.applovin.impl.sdk.o.h(this.tag, str3);
                a(c.IDLE, new h(this, str3));
                return;
            }
            if (activity == null) {
                activity = this.sdk.u0();
            }
            Activity activity2 = activity;
            if (a(activity2, str)) {
                a(c.SHOWING, new i(this, str, str2, activity2, viewGroup, kVar));
                return;
            }
            return;
        }
        com.applovin.impl.sdk.o.h(this.tag, "Attempting to show ad with null containerView or lifecycle.");
        MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
        }
        t2.a(this.adListener, (MaxAd) this.f, (MaxError) maxErrorImpl2, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f);
    }

    private /* synthetic */ void a(String str, String str2, Activity activity) {
        a(str, str2);
        this.l = false;
        this.q = new WeakReference(activity);
        this.sdk.X().showFullscreenAd(this.f, activity, this.localExtraParameters, this.extraParameters, this.c);
    }

    private /* synthetic */ void a(String str, String str2, Activity activity, ViewGroup viewGroup, androidx.lifecycle.k kVar) {
        a(str, str2);
        this.l = true;
        this.q = new WeakReference(activity);
        this.r = new WeakReference(viewGroup);
        this.s = new WeakReference(kVar);
        this.sdk.X().showFullscreenAd(this.f, viewGroup, kVar, activity, this.localExtraParameters, this.extraParameters, this.c);
    }

    private /* synthetic */ void c(String str) {
        c3 c3Var = this.f;
        a((MaxAd) c3Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-4205, str);
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + c3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        t2.a(this.adListener, (MaxAd) c3Var, (MaxError) maxErrorImpl, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, c3Var);
    }

    private boolean b() {
        if (this.sdk.R() != null) {
            return this.sdk.R().e(this.adUnitId);
        }
        return this.sdk.Q().d(this.adUnitId);
    }

    private boolean a(Activity activity, String str) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (this.g == c.DESTROYED) {
            boolean c2 = n7.c(this.sdk);
            this.sdk.D().a(d2.S0, "attemptingToShowDestroyedAd", CollectionUtils.hashMap("details", "debug=" + c2));
            if (c2) {
                throw new IllegalStateException("Attempting to show ad that is destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            String str2 = "Attempting to show ad before it is ready - please check ad readiness using " + this.tag + "#isReady()";
            com.applovin.impl.sdk.o.h(this.tag, str2);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, str2);
            x3 x3Var = new x3(this.adUnitId, this.adFormat, str);
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + x3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            t2.a(this.adListener, (MaxAd) x3Var, (MaxError) maxErrorImpl, true);
            if (this.f != null) {
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f);
            }
            return false;
        }
        Long l = (Long) this.sdk.a(r3.V7);
        Long l2 = (Long) this.sdk.a(r3.O7);
        if (l.longValue() > 0 && (this.f.getTimeToLiveMillis() < l2.longValue() || this.h.get())) {
            this.i.set(true);
            this.sdk.q0().a(new r6(this.sdk, "handleShowOnLoadTimeoutError", new j(this, str)), d6.b.TIMEOUT, l.longValue());
            return false;
        }
        if (n7.a(com.applovin.impl.sdk.k.o()) != 0 && this.sdk.n0().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            if (!n7.c(this.sdk)) {
                if (((Boolean) this.sdk.a(r3.j8)).booleanValue()) {
                    com.applovin.impl.sdk.o.h(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    if (com.applovin.impl.sdk.o.a()) {
                        this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
                    }
                    t2.a(this.adListener, (MaxAd) this.f, (MaxError) maxErrorImpl2, true);
                    this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f);
                    return false;
                }
            } else {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
        }
        if (!this.sdk.H().e() && !this.sdk.H().d()) {
            return true;
        }
        com.applovin.impl.sdk.o.h(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
        MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f + ", error=" + maxErrorImpl3 + "), listener=" + this.adListener);
        }
        t2.a(this.adListener, (MaxAd) this.f, (MaxError) maxErrorImpl3, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.f);
        return false;
    }

    private /* synthetic */ void a(String str) {
        if (this.i.compareAndSet(true, false)) {
            com.applovin.impl.sdk.o.h(this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
            this.sdk.H().c(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
            x3 x3Var = new x3(this.adUnitId, this.adFormat, str);
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + x3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            t2.a(this.adListener, (MaxAd) x3Var, (MaxError) maxErrorImpl, true);
            if (this.f != null) {
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f);
            }
        }
    }

    private void a(String str, String str2) {
        this.d.e(this.f);
        this.f.g(str);
        this.f.f(str2);
        this.n = str;
        this.o = str2;
        this.p = this.f.getNetworkName();
        this.sdk.y().d(this.f);
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f + "...");
        }
        a((y2) this.f);
    }

    private void a() {
        c3 c3Var;
        synchronized (this.e) {
            c3Var = this.f;
            this.f = null;
        }
        this.sdk.X().destroyAd(c3Var);
    }

    private /* synthetic */ void a(Long l) {
        this.k += l.longValue();
        this.sdk.p0().b(z4.S, Long.valueOf(this.k));
    }

    private void a(c3 c3Var) {
        if (this.sdk.f().a(c3Var, this)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Handle ad loaded for regular ad: " + c3Var);
            }
            this.f = c3Var;
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired(c3Var);
    }

    private void a(c cVar, Runnable runnable) {
        boolean z;
        c cVar2 = this.g;
        synchronized (this.e) {
            try {
                c cVar3 = c.IDLE;
                if (cVar2 == cVar3) {
                    if (cVar != c.LOADING && cVar != c.DESTROYED) {
                        if (cVar == c.SHOWING) {
                            com.applovin.impl.sdk.o.h(this.tag, "No ad is loading or loaded");
                        } else if (com.applovin.impl.sdk.o.a()) {
                            this.logger.b(this.tag, "Unable to transition to: " + cVar);
                        }
                        z = false;
                    }
                    z = true;
                } else {
                    c cVar4 = c.LOADING;
                    if (cVar2 == cVar4) {
                        if (cVar != cVar3) {
                            if (cVar == cVar4) {
                                com.applovin.impl.sdk.o.h(this.tag, "An ad is already loading");
                            } else if (cVar != c.READY) {
                                if (cVar == c.SHOWING) {
                                    com.applovin.impl.sdk.o.h(this.tag, "An ad is not ready to be shown yet");
                                } else if (cVar != c.DESTROYED) {
                                    if (com.applovin.impl.sdk.o.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                    }
                                }
                            }
                            z = false;
                        }
                        z = true;
                    } else {
                        c cVar5 = c.READY;
                        if (cVar2 == cVar5) {
                            if (cVar != cVar3) {
                                if (cVar == cVar4) {
                                    com.applovin.impl.sdk.o.h(this.tag, "An ad is already loaded");
                                } else if (cVar == cVar5) {
                                    if (com.applovin.impl.sdk.o.a()) {
                                        this.logger.b(this.tag, "An ad is already marked as ready");
                                    }
                                } else if (cVar != c.SHOWING && cVar != c.DESTROYED) {
                                    if (com.applovin.impl.sdk.o.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                    }
                                }
                                z = false;
                            }
                            z = true;
                        } else {
                            c cVar6 = c.SHOWING;
                            if (cVar2 == cVar6) {
                                if (cVar != cVar3) {
                                    if (cVar == cVar4) {
                                        com.applovin.impl.sdk.o.h(this.tag, "Can not load another ad while the ad is showing");
                                    } else if (cVar == cVar5) {
                                        if (com.applovin.impl.sdk.o.a()) {
                                            this.logger.b(this.tag, "An ad is already showing, ignoring");
                                        }
                                    } else if (cVar == cVar6) {
                                        com.applovin.impl.sdk.o.h(this.tag, "The ad is already showing, not showing another one");
                                    } else if (cVar != c.DESTROYED) {
                                        if (com.applovin.impl.sdk.o.a()) {
                                            this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                        }
                                    }
                                }
                                z = true;
                            } else if (cVar2 == c.DESTROYED) {
                                com.applovin.impl.sdk.o.h(this.tag, "No operations are allowed on a destroyed instance");
                            } else if (com.applovin.impl.sdk.o.a()) {
                                this.logger.b(this.tag, "Unknown state: " + this.g);
                            }
                            z = false;
                        }
                    }
                }
                if (z) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.logger.a(this.tag, "Transitioning from " + this.g + " to " + cVar + "...");
                    }
                    this.g = cVar;
                } else if (com.applovin.impl.sdk.o.a()) {
                    this.logger.k(this.tag, "Not allowed to transition from " + this.g + " to " + cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            runnable.run();
        }
    }

    private void a(MaxAd maxAd) {
        this.sdk.f().a((c3) maxAd);
        this.d.a();
        a();
        this.sdk.a0().a((y2) maxAd);
    }
}
