package com.applovin.impl.mediation.ads;

import android.content.Context;
import com.applovin.impl.c3;
import com.applovin.impl.d2;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.t2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class MaxRewardedAdImpl extends MaxFullscreenAdImpl {

    public class b extends MaxFullscreenAdImpl.b implements MaxRewardedAdListener {
        private b() {
            super(MaxRewardedAdImpl.this);
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            MaxRewardedAdImpl.a(MaxRewardedAdImpl.this, (c3) maxAd, maxError);
            super.onAdDisplayFailed(maxAd, maxError);
        }

        public void onAdHidden(MaxAd maxAd) {
            MaxRewardedAdImpl.a(MaxRewardedAdImpl.this, (c3) maxAd, (MaxError) null);
            super.onAdHidden(maxAd);
        }

        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            com.applovin.impl.sdk.o oVar = MaxRewardedAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxRewardedAdImpl maxRewardedAdImpl = MaxRewardedAdImpl.this;
                maxRewardedAdImpl.logger.a(maxRewardedAdImpl.tag, "MaxRewardedAdListener.onUserRewarded(ad=" + maxAd + ", reward=" + maxReward + "), listener=" + MaxRewardedAdImpl.this.adListener);
            }
            t2.a(MaxRewardedAdImpl.this.adListener, maxAd, maxReward, true);
        }

        public /* synthetic */ b(MaxRewardedAdImpl maxRewardedAdImpl, a aVar) {
            this();
        }
    }

    public MaxRewardedAdImpl(String str, MaxAdFormat maxAdFormat, MaxFullscreenAdImpl.a aVar, String str2, com.applovin.impl.sdk.k kVar, Context context) {
        super(str, maxAdFormat, aVar, str2, kVar, context);
    }

    public static /* synthetic */ void a(MaxRewardedAdImpl maxRewardedAdImpl, c3 c3Var, MaxError maxError) {
        maxRewardedAdImpl.a(c3Var, maxError);
    }

    public MaxFullscreenAdImpl.b createAdListenerWrapper() {
        return new b(this, null);
    }

    private void a(c3 c3Var, MaxError maxError) {
        if (c3Var.t0().get() || !c3Var.v0().compareAndSet(false, true)) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "User not rewarded for ad: " + c3Var + " with error: " + maxError);
        }
        this.sdk.P().a(d2.w0, c3Var, maxError);
    }
}
