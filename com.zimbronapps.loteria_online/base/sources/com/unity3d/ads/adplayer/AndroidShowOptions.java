package com.unity3d.ads.adplayer;

import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidShowOptions implements ShowOptions {
    private final boolean isOfferwallAd;
    private final boolean isScarAd;
    private final String offerwallPlacementName;
    private final String placementId;
    private final String scarAdString;
    private final String scarAdUnitId;
    private final String scarQueryId;
    private final Map unityAdsShowOptions;

    public AndroidShowOptions(Map map, String str, boolean z, String str2, String str3, String str4, boolean z2, String str5) {
        this.unityAdsShowOptions = map;
        this.placementId = str;
        this.isScarAd = z;
        this.scarQueryId = str2;
        this.scarAdString = str3;
        this.scarAdUnitId = str4;
        this.isOfferwallAd = z2;
        this.offerwallPlacementName = str5;
    }

    public static /* synthetic */ AndroidShowOptions copy$default(AndroidShowOptions androidShowOptions, Map map, String str, boolean z, String str2, String str3, String str4, boolean z2, String str5, int i, Object obj) {
        return androidShowOptions.copy((i & 1) != 0 ? androidShowOptions.unityAdsShowOptions : map, (i & 2) != 0 ? androidShowOptions.placementId : str, (i & 4) != 0 ? androidShowOptions.isScarAd : z, (i & 8) != 0 ? androidShowOptions.scarQueryId : str2, (i & 16) != 0 ? androidShowOptions.scarAdString : str3, (i & 32) != 0 ? androidShowOptions.scarAdUnitId : str4, (i & 64) != 0 ? androidShowOptions.isOfferwallAd : z2, (i & 128) != 0 ? androidShowOptions.offerwallPlacementName : str5);
    }

    public final Map component1() {
        return this.unityAdsShowOptions;
    }

    public final String component2() {
        return this.placementId;
    }

    public final boolean component3() {
        return this.isScarAd;
    }

    public final String component4() {
        return this.scarQueryId;
    }

    public final String component5() {
        return this.scarAdString;
    }

    public final String component6() {
        return this.scarAdUnitId;
    }

    public final boolean component7() {
        return this.isOfferwallAd;
    }

    public final String component8() {
        return this.offerwallPlacementName;
    }

    public final AndroidShowOptions copy(Map map, String str, boolean z, String str2, String str3, String str4, boolean z2, String str5) {
        return new AndroidShowOptions(map, str, z, str2, str3, str4, z2, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidShowOptions)) {
            return false;
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) obj;
        return t.c(this.unityAdsShowOptions, androidShowOptions.unityAdsShowOptions) && t.c(this.placementId, androidShowOptions.placementId) && this.isScarAd == androidShowOptions.isScarAd && t.c(this.scarQueryId, androidShowOptions.scarQueryId) && t.c(this.scarAdString, androidShowOptions.scarAdString) && t.c(this.scarAdUnitId, androidShowOptions.scarAdUnitId) && this.isOfferwallAd == androidShowOptions.isOfferwallAd && t.c(this.offerwallPlacementName, androidShowOptions.offerwallPlacementName);
    }

    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getScarAdString() {
        return this.scarAdString;
    }

    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    public final Map getUnityAdsShowOptions() {
        return this.unityAdsShowOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Map map = this.unityAdsShowOptions;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.placementId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.isScarAd;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        String str2 = this.scarQueryId;
        int hashCode3 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scarAdUnitId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z2 = this.isOfferwallAd;
        int i3 = (hashCode5 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        String str5 = this.offerwallPlacementName;
        return i3 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public String toString() {
        return "AndroidShowOptions(unityAdsShowOptions=" + this.unityAdsShowOptions + ", placementId=" + this.placementId + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdString=" + this.scarAdString + ", scarAdUnitId=" + this.scarAdUnitId + ", isOfferwallAd=" + this.isOfferwallAd + ", offerwallPlacementName=" + this.offerwallPlacementName + ')';
    }

    public /* synthetic */ AndroidShowOptions(Map map, String str, boolean z, String str2, String str3, String str4, boolean z2, String str5, int i, k kVar) {
        this(map, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) == 0 ? z2 : false, (i & 128) == 0 ? str5 : null);
    }
}
