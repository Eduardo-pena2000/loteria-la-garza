package com.applovin.mediation.nativeAds.adPlacer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.d3;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.w2;
import com.applovin.impl.x2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class MaxAdPlacer implements x2.a {
    private AppLovinSdkUtils.Size a;
    private MaxNativeAdViewBinder b;
    private final w2 c;
    private final x2 d;
    private Listener e;
    protected final o logger;
    protected final k sdk;

    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i);

        void onAdRemoved(int i);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings) {
        this(maxAdPlacerSettings, k.o());
    }

    public static /* synthetic */ void a(MaxAdPlacer maxAdPlacer, int i) {
        maxAdPlacer.a(i);
    }

    public static /* synthetic */ void b(MaxAdPlacer maxAdPlacer, int i, Collection collection) {
        maxAdPlacer.a(i, collection);
    }

    public static /* synthetic */ void c(MaxAdPlacer maxAdPlacer) {
        maxAdPlacer.b();
    }

    public void clearAds() {
        a(this.c.b(), new b(this));
    }

    public Collection clearTrailingAds(int i) {
        Collection e = this.c.e(i);
        if (!e.isEmpty()) {
            a(e, new c(this, i, e));
        }
        return e;
    }

    public void destroy() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Destroying ad placer");
        }
        clearAds();
        this.d.c();
    }

    public long getAdItemId(int i) {
        if (isFilledPosition(i)) {
            return -System.identityHashCode(this.c.a(i));
        }
        return 0L;
    }

    public AppLovinSdkUtils.Size getAdSize(int i) {
        if (isFilledPosition(i)) {
            boolean z = this.a != AppLovinSdkUtils.Size.ZERO;
            d3 d3Var = (d3) this.c.a(i);
            if (z) {
                return this.a;
            }
            if (d3Var.s0() != null) {
                View mainView = d3Var.s0().getMainView();
                return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i) {
        return this.c.b(i);
    }

    public int getAdjustedPosition(int i) {
        return this.c.c(i);
    }

    public int getOriginalPosition(int i) {
        return this.c.d(i);
    }

    public void insertItem(int i) {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Inserting item at position: " + i);
        }
        this.c.f(i);
    }

    public boolean isAdPosition(int i) {
        return this.c.g(i);
    }

    public boolean isFilledPosition(int i) {
        return this.c.h(i);
    }

    public void loadAds() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Loading ads");
        }
        this.d.e();
    }

    public void moveItem(int i, int i2) {
        this.c.b(i, i2);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        if (o.a()) {
            this.logger.b("MaxAdPlacer", "Native ad failed to load: " + maxError);
        }
    }

    public void onNativeAdLoaded() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Native ad enqueued");
        }
        a();
    }

    public void removeItem(int i) {
        a((Collection) (isFilledPosition(i) ? Collections.singletonList(Integer.valueOf(i)) : Collections.emptyList()), (Runnable) new a(this, i));
    }

    public void renderAd(int i, ViewGroup viewGroup) {
        MaxAd a = this.c.a(i);
        if (a == null) {
            if (o.a()) {
                this.logger.a("MaxAdPlacer", "An ad is not available for position: " + i);
                return;
            }
            return;
        }
        View s0 = ((d3) a).s0();
        if (s0 == null) {
            if (this.b == null) {
                if (o.a()) {
                    this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i + ". If you're using a custom ad template, check that nativeAdViewBinder is set.");
                    return;
                }
                return;
            }
            s0 = new MaxNativeAdView(this.b, viewGroup.getContext());
            if (this.d.a(s0, a)) {
                if (o.a()) {
                    this.logger.a("MaxAdPlacer", "Rendered ad at position: " + i);
                }
            } else if (o.a()) {
                this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i);
            }
        } else if (o.a()) {
            this.logger.a("MaxAdPlacer", "Using pre-rendered ad at position: " + i);
        }
        for (int childCount = viewGroup.getChildCount(); childCount >= 0; childCount--) {
            if (viewGroup.getChildAt(childCount) instanceof MaxNativeAdView) {
                viewGroup.removeViewAt(childCount);
            }
        }
        if (s0.getParent() != null) {
            s0.getParent().removeView(s0);
        }
        viewGroup.addView(s0, -1, -1);
    }

    public void setAdSize(int i, int i2) {
        this.a = new AppLovinSdkUtils.Size(i, i2);
    }

    public void setListener(Listener listener) {
        this.e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i, int i2) {
        this.c.c(i, i2);
        if (i == -1 || i2 == -1) {
            return;
        }
        a();
    }

    @Deprecated
    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    private /* synthetic */ void a(int i, Collection collection) {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Clearing trailing ads after position " + i);
        }
        this.c.a(collection);
    }

    private /* synthetic */ void b() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Clearing all cached ads");
        }
        this.c.a();
        this.d.a();
    }

    @Deprecated
    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.a = AppLovinSdkUtils.Size.ZERO;
        k a = appLovinSdk.a();
        this.sdk = a;
        o O = a.O();
        this.logger = O;
        this.c = new w2(maxAdPlacerSettings);
        this.d = new x2(maxAdPlacerSettings, context, this);
        if (o.a()) {
            O.a("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
        }
    }

    private /* synthetic */ void a(int i) {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Removing item at position: " + i);
        }
        this.c.i(i);
    }

    private void a() {
        int c;
        while (this.d.d() && (c = this.c.c()) != -1) {
            if (o.a()) {
                this.logger.a("MaxAdPlacer", "Placing ad at position: " + c);
            }
            this.c.a(this.d.b(), c);
            Listener listener = this.e;
            if (listener != null) {
                listener.onAdLoaded(c);
            }
        }
    }

    private void a(Collection collection, Runnable runnable) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.d.a(this.c.a(((Integer) it.next()).intValue()));
        }
        runnable.run();
        if (collection.isEmpty()) {
            return;
        }
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
        }
        if (this.e != null) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                this.e.onAdRemoved(((Integer) it2.next()).intValue());
            }
        }
    }
}
