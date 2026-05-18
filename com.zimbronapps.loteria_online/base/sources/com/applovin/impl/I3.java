package com.applovin.impl;

import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class i3 implements MaxAdListener, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.a {
    private final a.a a;

    public i3(a.a aVar) {
        this.a = aVar;
    }

    public void onAdClicked(MaxAd maxAd) {
        t2.a((MaxAdListener) this.a, maxAd);
    }

    public void onAdCollapsed(MaxAd maxAd) {
        t2.b(this.a, maxAd);
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        t2.a(this.a, maxAd, maxError);
    }

    public void onAdDisplayed(MaxAd maxAd) {
        t2.c(this.a, maxAd);
    }

    public void onAdExpanded(MaxAd maxAd) {
        t2.d(this.a, maxAd);
    }

    public void onAdHidden(MaxAd maxAd) {
        t2.e(this.a, maxAd);
    }

    public void onAdRequestStarted(String str) {
        t2.a(this.a, str);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        t2.a((MaxAdRevenueListener) this.a, maxAd);
    }

    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        t2.a(this.a, maxAd, maxReward);
    }
}
