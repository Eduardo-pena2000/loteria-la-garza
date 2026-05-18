package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import fb.P;
import fb.z;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AdObject {
    private final AdPlayer adPlayer;
    private final DiagnosticEventRequestOuterClass.DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isOfferwallAd;
    private boolean isScarAd;
    private final UnityAdsLoadOptions loadOptions;
    private String offerwallPlacementName;
    private final ByteString opportunityId;
    private final String placementId;
    private String playerServerId;
    private String scarAdString;
    private String scarAdUnitId;
    private String scarQueryId;
    private z state;
    private ByteString trackingToken;
    private z ttl;

    public AdObject(ByteString opportunityId, String placementId, ByteString trackingToken, boolean z, String str, String str2, String str3, boolean z2, String str4, AdPlayer adPlayer, String str5, UnityAdsLoadOptions loadOptions, boolean z3, DiagnosticEventRequestOuterClass.DiagnosticAdType adType, z ttl, z state) {
        t.g(opportunityId, "opportunityId");
        t.g(placementId, "placementId");
        t.g(trackingToken, "trackingToken");
        t.g(loadOptions, "loadOptions");
        t.g(adType, "adType");
        t.g(ttl, "ttl");
        t.g(state, "state");
        this.opportunityId = opportunityId;
        this.placementId = placementId;
        this.trackingToken = trackingToken;
        this.isScarAd = z;
        this.scarQueryId = str;
        this.scarAdUnitId = str2;
        this.scarAdString = str3;
        this.isOfferwallAd = z2;
        this.offerwallPlacementName = str4;
        this.adPlayer = adPlayer;
        this.playerServerId = str5;
        this.loadOptions = loadOptions;
        this.isHeaderBidding = z3;
        this.adType = adType;
        this.ttl = ttl;
        this.state = state;
    }

    public static /* synthetic */ AdObject copy$default(AdObject adObject, ByteString byteString, String str, ByteString byteString2, boolean z, String str2, String str3, String str4, boolean z2, String str5, AdPlayer adPlayer, String str6, UnityAdsLoadOptions unityAdsLoadOptions, boolean z3, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, z zVar, z zVar2, int i, Object obj) {
        return adObject.copy((i & 1) != 0 ? adObject.opportunityId : byteString, (i & 2) != 0 ? adObject.placementId : str, (i & 4) != 0 ? adObject.trackingToken : byteString2, (i & 8) != 0 ? adObject.isScarAd : z, (i & 16) != 0 ? adObject.scarQueryId : str2, (i & 32) != 0 ? adObject.scarAdUnitId : str3, (i & 64) != 0 ? adObject.scarAdString : str4, (i & 128) != 0 ? adObject.isOfferwallAd : z2, (i & 256) != 0 ? adObject.offerwallPlacementName : str5, (i & 512) != 0 ? adObject.adPlayer : adPlayer, (i & 1024) != 0 ? adObject.playerServerId : str6, (i & 2048) != 0 ? adObject.loadOptions : unityAdsLoadOptions, (i & 4096) != 0 ? adObject.isHeaderBidding : z3, (i & 8192) != 0 ? adObject.adType : diagnosticAdType, (i & 16384) != 0 ? adObject.ttl : zVar, (i & 32768) != 0 ? adObject.state : zVar2);
    }

    public final ByteString component1() {
        return this.opportunityId;
    }

    public final AdPlayer component10() {
        return this.adPlayer;
    }

    public final String component11() {
        return this.playerServerId;
    }

    public final UnityAdsLoadOptions component12() {
        return this.loadOptions;
    }

    public final boolean component13() {
        return this.isHeaderBidding;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticAdType component14() {
        return this.adType;
    }

    public final z component15() {
        return this.ttl;
    }

    public final z component16() {
        return this.state;
    }

    public final String component2() {
        return this.placementId;
    }

    public final ByteString component3() {
        return this.trackingToken;
    }

    public final boolean component4() {
        return this.isScarAd;
    }

    public final String component5() {
        return this.scarQueryId;
    }

    public final String component6() {
        return this.scarAdUnitId;
    }

    public final String component7() {
        return this.scarAdString;
    }

    public final boolean component8() {
        return this.isOfferwallAd;
    }

    public final String component9() {
        return this.offerwallPlacementName;
    }

    public final AdObject copy(ByteString opportunityId, String placementId, ByteString trackingToken, boolean z, String str, String str2, String str3, boolean z2, String str4, AdPlayer adPlayer, String str5, UnityAdsLoadOptions loadOptions, boolean z3, DiagnosticEventRequestOuterClass.DiagnosticAdType adType, z ttl, z state) {
        t.g(opportunityId, "opportunityId");
        t.g(placementId, "placementId");
        t.g(trackingToken, "trackingToken");
        t.g(loadOptions, "loadOptions");
        t.g(adType, "adType");
        t.g(ttl, "ttl");
        t.g(state, "state");
        return new AdObject(opportunityId, placementId, trackingToken, z, str, str2, str3, z2, str4, adPlayer, str5, loadOptions, z3, adType, ttl, state);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdObject)) {
            return false;
        }
        AdObject adObject = (AdObject) obj;
        return t.c(this.opportunityId, adObject.opportunityId) && t.c(this.placementId, adObject.placementId) && t.c(this.trackingToken, adObject.trackingToken) && this.isScarAd == adObject.isScarAd && t.c(this.scarQueryId, adObject.scarQueryId) && t.c(this.scarAdUnitId, adObject.scarAdUnitId) && t.c(this.scarAdString, adObject.scarAdString) && this.isOfferwallAd == adObject.isOfferwallAd && t.c(this.offerwallPlacementName, adObject.offerwallPlacementName) && t.c(this.adPlayer, adObject.adPlayer) && t.c(this.playerServerId, adObject.playerServerId) && t.c(this.loadOptions, adObject.loadOptions) && this.isHeaderBidding == adObject.isHeaderBidding && this.adType == adObject.adType && t.c(this.ttl, adObject.ttl) && t.c(this.state, adObject.state);
    }

    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getPlayerServerId() {
        return this.playerServerId;
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

    public final z getState() {
        return this.state;
    }

    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    public final z getTtl() {
        return this.ttl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.opportunityId.hashCode() * 31) + this.placementId.hashCode()) * 31) + this.trackingToken.hashCode()) * 31;
        boolean z = this.isScarAd;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.scarQueryId;
        int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scarAdUnitId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z2 = this.isOfferwallAd;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode4 + i3) * 31;
        String str4 = this.offerwallPlacementName;
        int hashCode5 = (i4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AdPlayer adPlayer = this.adPlayer;
        int hashCode6 = (hashCode5 + (adPlayer == null ? 0 : adPlayer.hashCode())) * 31;
        String str5 = this.playerServerId;
        int hashCode7 = (((hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.loadOptions.hashCode()) * 31;
        boolean z3 = this.isHeaderBidding;
        return ((((((hashCode7 + (z3 ? 1 : z3 ? 1 : 0)) * 31) + this.adType.hashCode()) * 31) + this.ttl.hashCode()) * 31) + this.state.hashCode();
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public final void setOfferwallAd(boolean z) {
        this.isOfferwallAd = z;
    }

    public final void setOfferwallPlacementName(String str) {
        this.offerwallPlacementName = str;
    }

    public final void setPlayerServerId(String str) {
        this.playerServerId = str;
    }

    public final void setScarAd(boolean z) {
        this.isScarAd = z;
    }

    public final void setScarAdString(String str) {
        this.scarAdString = str;
    }

    public final void setScarAdUnitId(String str) {
        this.scarAdUnitId = str;
    }

    public final void setScarQueryId(String str) {
        this.scarQueryId = str;
    }

    public final void setState(z zVar) {
        t.g(zVar, "<set-?>");
        this.state = zVar;
    }

    public final void setTrackingToken(ByteString byteString) {
        t.g(byteString, "<set-?>");
        this.trackingToken = byteString;
    }

    public final void setTtl(z zVar) {
        t.g(zVar, "<set-?>");
        this.ttl = zVar;
    }

    public String toString() {
        return "AdObject(opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdUnitId=" + this.scarAdUnitId + ", scarAdString=" + this.scarAdString + ", isOfferwallAd=" + this.isOfferwallAd + ", offerwallPlacementName=" + this.offerwallPlacementName + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ", ttl=" + this.ttl + ", state=" + this.state + ')';
    }

    public /* synthetic */ AdObject(ByteString byteString, String str, ByteString byteString2, boolean z, String str2, String str3, String str4, boolean z2, String str5, AdPlayer adPlayer, String str6, UnityAdsLoadOptions unityAdsLoadOptions, boolean z3, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, z zVar, z zVar2, int i, k kVar) {
        this(byteString, str, byteString2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : adPlayer, (i & 1024) != 0 ? null : str6, unityAdsLoadOptions, z3, diagnosticAdType, (i & 16384) != 0 ? P.a(null) : zVar, (i & 32768) != 0 ? P.a(AdObjectState.INIT) : zVar2);
    }
}
