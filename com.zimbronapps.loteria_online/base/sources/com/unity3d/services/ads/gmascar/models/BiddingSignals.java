package com.unity3d.services.ads.gmascar.models;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class BiddingSignals {
    private final String bannerSignal;
    private final String interstitialSignal;
    private final String rvSignal;

    public BiddingSignals(String str, String str2, String str3) {
        this.rvSignal = str;
        this.interstitialSignal = str2;
        this.bannerSignal = str3;
    }

    public String getBannerSignal() {
        return this.bannerSignal;
    }

    public String getInterstitialSignal() {
        return this.interstitialSignal;
    }

    public Map getMap() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(getRvSignal())) {
            hashMap.put("rv", getRvSignal());
        }
        if (!TextUtils.isEmpty(getInterstitialSignal())) {
            hashMap.put("in", getInterstitialSignal());
        }
        if (!TextUtils.isEmpty(getBannerSignal())) {
            hashMap.put("bn", getBannerSignal());
        }
        return hashMap;
    }

    public String getRvSignal() {
        return this.rvSignal;
    }

    public boolean isEmpty() {
        return TextUtils.isEmpty(getRvSignal()) && TextUtils.isEmpty(getInterstitialSignal()) && TextUtils.isEmpty(getBannerSignal());
    }

    public BiddingSignals(String str, String str2) {
        this.rvSignal = str;
        this.interstitialSignal = str2;
        this.bannerSignal = "";
    }
}
