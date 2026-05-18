package com.applovin.impl;

import android.content.Context;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class x2 extends MaxNativeAdListener implements MaxAdRevenueListener {
    private final int a;
    private final MaxNativeAdLoader b;
    private final Queue c = new LinkedList();
    private boolean d = false;
    private final Object e = new Object();
    private a f;

    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public x2(MaxAdPlacerSettings maxAdPlacerSettings, Context context, a aVar) {
        this.a = maxAdPlacerSettings.getMaxPreloadedAdCount();
        this.f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(maxAdPlacerSettings.getAdUnitId(), context);
        this.b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setPlacement(maxAdPlacerSettings.getPlacement());
        maxNativeAdLoader.setLocalExtraParameter("ad_request_type", i.NATIVE_AD_PLACER);
    }

    public void a(MaxAd maxAd) {
        this.b.destroy(maxAd);
    }

    public MaxAd b() {
        MaxAd maxAd;
        synchronized (this.e) {
            maxAd = null;
            while (!this.c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                try {
                    maxAd = (MaxAd) this.c.remove();
                } catch (Throwable th) {
                    throw th;
                }
            }
            e();
        }
        return maxAd;
    }

    public void c() {
        this.f = null;
        a();
        this.b.destroy();
    }

    public boolean d() {
        boolean z;
        synchronized (this.e) {
            z = !this.c.isEmpty();
        }
        return z;
    }

    public void e() {
        synchronized (this.e) {
            try {
                if (!this.d && this.c.size() < this.a) {
                    this.d = true;
                    this.b.loadAd();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.e) {
            this.c.add(maxAd);
            this.d = false;
            e();
        }
        a aVar = this.f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }

    public void a() {
        synchronized (this.e) {
            try {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    a((MaxAd) it.next());
                }
                this.c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.b.render(maxNativeAdView, maxAd);
    }
}
