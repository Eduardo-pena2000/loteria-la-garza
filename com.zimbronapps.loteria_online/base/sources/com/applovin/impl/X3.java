package com.applovin.impl;

import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class x3 implements MaxAd {
    private final a3 a;
    private final String b;

    public x3(String str, MaxAdFormat maxAdFormat, String str2) {
        this.a = new a3(str, maxAdFormat, Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap(), new h(-1, -1, -1, -1));
        this.b = str2;
    }

    public String getAdReviewCreativeId() {
        return null;
    }

    public String getAdUnitId() {
        return this.a.b();
    }

    public String getAdValue(String str) {
        return null;
    }

    public String getCreativeId() {
        return null;
    }

    public String getDspId() {
        return null;
    }

    public String getDspName() {
        return null;
    }

    public MaxAdFormat getFormat() {
        return this.a.a();
    }

    public MaxNativeAd getNativeAd() {
        return null;
    }

    public String getNetworkName() {
        return "";
    }

    public String getNetworkPlacement() {
        return null;
    }

    public String getPlacement() {
        return this.b;
    }

    public long getRequestLatencyMillis() {
        return 0L;
    }

    public double getRevenue() {
        return 0.0d;
    }

    public String getRevenuePrecision() {
        return "undefined";
    }

    public AppLovinSdkUtils.Size getSize() {
        return getFormat().getSize();
    }

    public MaxAdWaterfallInfo getWaterfall() {
        return new MaxAdWaterfallInfoImpl(null, "", "", 0L, new ArrayList(), this.a, Collections.EMPTY_LIST, "", "");
    }

    public String toString() {
        return "MaxAd{adUnitId=" + this.a.b() + ", format=" + this.a.a() + "}";
    }

    public String getAdValue(String str, String str2) {
        return null;
    }
}
