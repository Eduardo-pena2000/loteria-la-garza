package com.revenuecat.purchases.ads.events.types;

import com.revenuecat.purchases.ExperimentalPreviewRevenueCatPurchasesAPI;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

@ExperimentalPreviewRevenueCatPurchasesAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AdFailedToLoadData {
    private final String adFormat;
    private final String adUnitId;
    private final Integer mediatorErrorCode;
    private final String mediatorName;
    private final String placement;

    public /* synthetic */ AdFailedToLoadData(String str, String str2, String str3, String str4, Integer num, k kVar) {
        this(str, str2, str3, str4, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdFailedToLoadData)) {
            return false;
        }
        AdFailedToLoadData adFailedToLoadData = (AdFailedToLoadData) obj;
        return AdMediatorName.equals-impl0(this.mediatorName, adFailedToLoadData.mediatorName) && AdFormat.equals-impl0(this.adFormat, adFailedToLoadData.adFormat) && t.c(this.placement, adFailedToLoadData.placement) && t.c(this.adUnitId, adFailedToLoadData.adUnitId) && t.c(this.mediatorErrorCode, adFailedToLoadData.mediatorErrorCode);
    }

    public final String getAdFormat-y0COY5Q() {
        return this.adFormat;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final Integer getMediatorErrorCode() {
        return this.mediatorErrorCode;
    }

    public final String getMediatorName-GyoM_N4() {
        return this.mediatorName;
    }

    public final String getPlacement() {
        return this.placement;
    }

    public int hashCode() {
        int i = ((AdMediatorName.hashCode-impl(this.mediatorName) * 31) + AdFormat.hashCode-impl(this.adFormat)) * 31;
        String str = this.placement;
        int hashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.adUnitId.hashCode()) * 31;
        Integer num = this.mediatorErrorCode;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "AdFailedToLoadData(mediatorName=" + AdMediatorName.toString-impl(this.mediatorName) + ", adFormat=" + AdFormat.toString-impl(this.adFormat) + ", placement=" + this.placement + ", adUnitId=" + this.adUnitId + ", mediatorErrorCode=" + this.mediatorErrorCode + ')';
    }

    private AdFailedToLoadData(String str, String str2, String str3, String str4, Integer num) {
        t.g(str, "mediatorName");
        t.g(str2, "adFormat");
        t.g(str4, "adUnitId");
        this.mediatorName = str;
        this.adFormat = str2;
        this.placement = str3;
        this.adUnitId = str4;
        this.mediatorErrorCode = num;
    }
}
