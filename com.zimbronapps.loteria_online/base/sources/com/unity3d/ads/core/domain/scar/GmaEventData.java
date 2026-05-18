package com.unity3d.ads.core.domain.scar;

import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.banners.bridge.BannerBridge;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class GmaEventData {
    private final BannerBridge.BannerEvent bannerEvent;
    private final Integer errorCode;
    private final String errorMessage;
    private final c gmaEvent;
    private final String opportunityId;
    private final String placementId;
    private final String queryId;

    public GmaEventData(c gmaEvent, BannerBridge.BannerEvent bannerEvent, String str, String str2, String str3, String str4, Integer num) {
        t.g(gmaEvent, "gmaEvent");
        this.gmaEvent = gmaEvent;
        this.bannerEvent = bannerEvent;
        this.opportunityId = str;
        this.placementId = str2;
        this.queryId = str3;
        this.errorMessage = str4;
        this.errorCode = num;
    }

    public static /* synthetic */ GmaEventData copy$default(GmaEventData gmaEventData, c cVar, BannerBridge.BannerEvent bannerEvent, String str, String str2, String str3, String str4, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = gmaEventData.gmaEvent;
        }
        if ((i & 2) != 0) {
            bannerEvent = gmaEventData.bannerEvent;
        }
        BannerBridge.BannerEvent bannerEvent2 = bannerEvent;
        if ((i & 4) != 0) {
            str = gmaEventData.opportunityId;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = gmaEventData.placementId;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = gmaEventData.queryId;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = gmaEventData.errorMessage;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            num = gmaEventData.errorCode;
        }
        return gmaEventData.copy(cVar, bannerEvent2, str5, str6, str7, str8, num);
    }

    public final c component1() {
        return this.gmaEvent;
    }

    public final BannerBridge.BannerEvent component2() {
        return this.bannerEvent;
    }

    public final String component3() {
        return this.opportunityId;
    }

    public final String component4() {
        return this.placementId;
    }

    public final String component5() {
        return this.queryId;
    }

    public final String component6() {
        return this.errorMessage;
    }

    public final Integer component7() {
        return this.errorCode;
    }

    public final GmaEventData copy(c gmaEvent, BannerBridge.BannerEvent bannerEvent, String str, String str2, String str3, String str4, Integer num) {
        t.g(gmaEvent, "gmaEvent");
        return new GmaEventData(gmaEvent, bannerEvent, str, str2, str3, str4, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GmaEventData)) {
            return false;
        }
        GmaEventData gmaEventData = (GmaEventData) obj;
        return this.gmaEvent == gmaEventData.gmaEvent && this.bannerEvent == gmaEventData.bannerEvent && t.c(this.opportunityId, gmaEventData.opportunityId) && t.c(this.placementId, gmaEventData.placementId) && t.c(this.queryId, gmaEventData.queryId) && t.c(this.errorMessage, gmaEventData.errorMessage) && t.c(this.errorCode, gmaEventData.errorCode);
    }

    public final BannerBridge.BannerEvent getBannerEvent() {
        return this.bannerEvent;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final c getGmaEvent() {
        return this.gmaEvent;
    }

    public final String getOpportunityId() {
        return this.opportunityId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getQueryId() {
        return this.queryId;
    }

    public int hashCode() {
        int hashCode = this.gmaEvent.hashCode() * 31;
        BannerBridge.BannerEvent bannerEvent = this.bannerEvent;
        int hashCode2 = (hashCode + (bannerEvent == null ? 0 : bannerEvent.hashCode())) * 31;
        String str = this.opportunityId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placementId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.queryId;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorMessage;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.errorCode;
        return hashCode6 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "GmaEventData(gmaEvent=" + this.gmaEvent + ", bannerEvent=" + this.bannerEvent + ", opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", queryId=" + this.queryId + ", errorMessage=" + this.errorMessage + ", errorCode=" + this.errorCode + ')';
    }

    public /* synthetic */ GmaEventData(c cVar, BannerBridge.BannerEvent bannerEvent, String str, String str2, String str3, String str4, Integer num, int i, k kVar) {
        this(cVar, (i & 2) != 0 ? null : bannerEvent, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) == 0 ? num : null);
    }
}
