package com.revenuecat.purchases.ads.events.types;

import com.revenuecat.purchases.ExperimentalPreviewRevenueCatPurchasesAPI;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

@ExperimentalPreviewRevenueCatPurchasesAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AdDisplayedData {
    private final String adFormat;
    private final String adUnitId;
    private final String impressionId;
    private final String mediatorName;
    private final String networkName;
    private final String placement;

    public /* synthetic */ AdDisplayedData(String str, String str2, String str3, String str4, String str5, String str6, k kVar) {
        this(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdDisplayedData)) {
            return false;
        }
        AdDisplayedData adDisplayedData = (AdDisplayedData) obj;
        return t.c(this.networkName, adDisplayedData.networkName) && AdMediatorName.equals-impl0(this.mediatorName, adDisplayedData.mediatorName) && AdFormat.equals-impl0(this.adFormat, adDisplayedData.adFormat) && t.c(this.placement, adDisplayedData.placement) && t.c(this.adUnitId, adDisplayedData.adUnitId) && t.c(this.impressionId, adDisplayedData.impressionId);
    }

    public final String getAdFormat-y0COY5Q() {
        return this.adFormat;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getImpressionId() {
        return this.impressionId;
    }

    public final String getMediatorName-GyoM_N4() {
        return this.mediatorName;
    }

    public final String getNetworkName() {
        return this.networkName;
    }

    public final String getPlacement() {
        return this.placement;
    }

    public int hashCode() {
        String str = this.networkName;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + AdMediatorName.hashCode-impl(this.mediatorName)) * 31) + AdFormat.hashCode-impl(this.adFormat)) * 31;
        String str2 = this.placement;
        return ((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.adUnitId.hashCode()) * 31) + this.impressionId.hashCode();
    }

    public String toString() {
        return "AdDisplayedData(networkName=" + this.networkName + ", mediatorName=" + AdMediatorName.toString-impl(this.mediatorName) + ", adFormat=" + AdFormat.toString-impl(this.adFormat) + ", placement=" + this.placement + ", adUnitId=" + this.adUnitId + ", impressionId=" + this.impressionId + ')';
    }

    private AdDisplayedData(String str, String str2, String str3, String str4, String str5, String str6) {
        t.g(str2, "mediatorName");
        t.g(str3, "adFormat");
        t.g(str5, "adUnitId");
        t.g(str6, "impressionId");
        this.networkName = str;
        this.mediatorName = str2;
        this.adFormat = str3;
        this.placement = str4;
        this.adUnitId = str5;
        this.impressionId = str6;
    }
}
