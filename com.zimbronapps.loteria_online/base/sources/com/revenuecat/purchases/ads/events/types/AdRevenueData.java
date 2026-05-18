package com.revenuecat.purchases.ads.events.types;

import com.revenuecat.purchases.ExperimentalPreviewRevenueCatPurchasesAPI;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

@ExperimentalPreviewRevenueCatPurchasesAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AdRevenueData {
    private final String adFormat;
    private final String adUnitId;
    private final String currency;
    private final String impressionId;
    private final String mediatorName;
    private final String networkName;
    private final String placement;
    private final String precision;
    private final long revenueMicros;

    public /* synthetic */ AdRevenueData(String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, String str8, k kVar) {
        this(str, str2, str3, str4, str5, str6, j, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdRevenueData)) {
            return false;
        }
        AdRevenueData adRevenueData = (AdRevenueData) obj;
        return t.c(this.networkName, adRevenueData.networkName) && AdMediatorName.equals-impl0(this.mediatorName, adRevenueData.mediatorName) && AdFormat.equals-impl0(this.adFormat, adRevenueData.adFormat) && t.c(this.placement, adRevenueData.placement) && t.c(this.adUnitId, adRevenueData.adUnitId) && t.c(this.impressionId, adRevenueData.impressionId) && this.revenueMicros == adRevenueData.revenueMicros && t.c(this.currency, adRevenueData.currency) && AdRevenuePrecision.equals-impl0(this.precision, adRevenueData.precision);
    }

    public final String getAdFormat-y0COY5Q() {
        return this.adFormat;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getCurrency() {
        return this.currency;
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

    public final String getPrecision-rAcPn4k() {
        return this.precision;
    }

    public final long getRevenueMicros() {
        return this.revenueMicros;
    }

    public int hashCode() {
        String str = this.networkName;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + AdMediatorName.hashCode-impl(this.mediatorName)) * 31) + AdFormat.hashCode-impl(this.adFormat)) * 31;
        String str2 = this.placement;
        return ((((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.adUnitId.hashCode()) * 31) + this.impressionId.hashCode()) * 31) + Long.hashCode(this.revenueMicros)) * 31) + this.currency.hashCode()) * 31) + AdRevenuePrecision.hashCode-impl(this.precision);
    }

    public String toString() {
        return "AdRevenueData(networkName=" + this.networkName + ", mediatorName=" + AdMediatorName.toString-impl(this.mediatorName) + ", adFormat=" + AdFormat.toString-impl(this.adFormat) + ", placement=" + this.placement + ", adUnitId=" + this.adUnitId + ", impressionId=" + this.impressionId + ", revenueMicros=" + this.revenueMicros + ", currency=" + this.currency + ", precision=" + AdRevenuePrecision.toString-impl(this.precision) + ')';
    }

    private AdRevenueData(String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, String str8) {
        t.g(str2, "mediatorName");
        t.g(str3, "adFormat");
        t.g(str5, "adUnitId");
        t.g(str6, "impressionId");
        t.g(str7, "currency");
        t.g(str8, "precision");
        this.networkName = str;
        this.mediatorName = str2;
        this.adFormat = str3;
        this.placement = str4;
        this.adUnitId = str5;
        this.impressionId = str6;
        this.revenueMicros = j;
        this.currency = str7;
        this.precision = str8;
    }
}
