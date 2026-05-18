package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.MaxRewardedAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class MaxRewardedAd implements MaxFullscreenAdImpl.a {
    private static final Map b = new HashMap();
    private static final Object c = new Object();
    private static WeakReference d = new WeakReference((Object) null);
    private final MaxRewardedAdImpl a;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk, Context context) {
        this.a = new MaxRewardedAdImpl(str.trim(), MaxAdFormat.REWARDED, this, "MaxRewardedAd", appLovinSdk.a(), context);
    }

    public static MaxRewardedAd getInstance(String str) {
        return getInstance(str, k.o());
    }

    public void destroy() {
        this.a.logApiCall("destroy()");
        synchronized (c) {
            b.remove(this.a.getAdUnitId());
        }
        this.a.destroy();
    }

    public Activity getActivity() {
        this.a.logApiCall("getActivity()");
        return (Activity) d.get();
    }

    public String getAdUnitId() {
        return this.a.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.a.isReady();
        this.a.logApiCall("isReady() " + isReady + " for ad unit id " + this.a.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.a.logApiCall("loadAd()");
        this.a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.a.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        this.a.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.a.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return "" + this.a;
    }

    @Deprecated
    public static MaxRewardedAd getInstance(String str, Context context) {
        return getInstance(str, AppLovinSdk.getInstance(context), context);
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    @Deprecated
    public static MaxRewardedAd getInstance(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxRewardedAd", "getInstance(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (context == null) {
                throw new IllegalArgumentException("No context specified");
            }
            if (appLovinSdk != null) {
                if (context instanceof Activity) {
                    d = new WeakReference((Activity) context);
                }
                synchronized (c) {
                    try {
                        Map map = b;
                        MaxRewardedAd maxRewardedAd = (MaxRewardedAd) map.get(str);
                        if (maxRewardedAd != null) {
                            return maxRewardedAd;
                        }
                        MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk, context);
                        map.put(str, maxRewardedAd2);
                        return maxRewardedAd2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str, String str2, Activity activity) {
        this.a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", activity=" + activity + ")");
        n7.b(str2, "MaxRewardedAd");
        this.a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, androidx.lifecycle.k kVar, Activity activity) {
        showAd((String) null, viewGroup, kVar, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, androidx.lifecycle.k kVar, Activity activity) {
        showAd(str, null, viewGroup, kVar, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, androidx.lifecycle.k kVar, Activity activity) {
        this.a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + kVar + ", activity=" + activity + ")");
        this.a.showAd(str, str2, viewGroup, kVar, activity);
    }

    @Deprecated
    public void showAd() {
        showAd((String) null);
    }

    @Deprecated
    public void showAd(String str) {
        showAd(str, (String) null);
    }

    @Deprecated
    public void showAd(String str, String str2) {
        this.a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        n7.b(str2, "MaxRewardedAd");
        this.a.showAd(str, str2, getActivity());
    }

    @Deprecated
    public void showAd(ViewGroup viewGroup, androidx.lifecycle.k kVar) {
        showAd((String) null, viewGroup, kVar);
    }

    @Deprecated
    public void showAd(String str, ViewGroup viewGroup, androidx.lifecycle.k kVar) {
        showAd(str, (String) null, viewGroup, kVar);
    }

    @Deprecated
    public void showAd(String str, String str2, ViewGroup viewGroup, androidx.lifecycle.k kVar) {
        this.a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + kVar + ")");
        this.a.showAd(str, str2, viewGroup, kVar, getActivity());
    }
}
