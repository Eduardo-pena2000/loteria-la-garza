package com.unity3d.ads.core.domain;

import Ca.I;
import Ga.e;
import Ia.f;
import Ia.l;
import Qa.p;
import android.content.Context;
import cb.K;
import cb.O;
import cb.i;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.GatewayClient;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidLoad implements Load {
    private final AdRepository adRepository;
    private final K defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetAdPlayerConfigRequest getAdPlayerConfigRequest;
    private final GetAdRequest getAdRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final HandleGatewayAdResponse handleGatewayAdResponse;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    @f(c = "com.unity3d.ads.core.domain.AndroidLoad$invoke$2", f = "AndroidLoad.kt", l = {72, 76, 93, 97, 136}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ AdRequestOuterClass.BannerSize $bannerSize;
        final /* synthetic */ Context $context;
        final /* synthetic */ HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup $headerBiddingAdMarkup;
        final /* synthetic */ UnityAdsLoadOptions $loadOptions;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ String $placement;
        int I$0;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(AdRequestOuterClass.BannerSize bannerSize, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, ByteString byteString, String str, UnityAdsLoadOptions unityAdsLoadOptions, Context context, e eVar) {
            super(2, eVar);
            this.$bannerSize = bannerSize;
            this.$headerBiddingAdMarkup = headerBiddingAdMarkup;
            this.$opportunityId = byteString;
            this.$placement = str;
            this.$loadOptions = unityAdsLoadOptions;
            this.$context = context;
        }

        public final e create(Object obj, e eVar) {
            2 r9 = AndroidLoad.this.new 2(this.$bannerSize, this.$headerBiddingAdMarkup, this.$opportunityId, this.$placement, this.$loadOptions, this.$context, eVar);
            r9.L$0 = obj;
            return r9;
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0174 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x03e8 A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #7 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:11:0x03e2, B:13:0x03e8, B:15:0x03f6, B:18:0x0409, B:20:0x0410, B:24:0x0415, B:25:0x041a, B:35:0x02a7, B:38:0x02d3, B:40:0x02ff, B:42:0x031d, B:44:0x0386, B:45:0x0392, B:47:0x039f, B:48:0x03b0, B:50:0x03b6, B:53:0x03cf, B:60:0x029c, B:65:0x0062, B:67:0x023f, B:89:0x01a2, B:92:0x01ce, B:96:0x0197, B:101:0x00a1, B:103:0x0130, B:119:0x00b2, B:121:0x00be, B:123:0x00d6, B:127:0x00df, B:129:0x00e6, B:131:0x010c, B:135:0x0200, B:137:0x0223, B:138:0x0227, B:143:0x00e3), top: B:2:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0410 A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #7 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:11:0x03e2, B:13:0x03e8, B:15:0x03f6, B:18:0x0409, B:20:0x0410, B:24:0x0415, B:25:0x041a, B:35:0x02a7, B:38:0x02d3, B:40:0x02ff, B:42:0x031d, B:44:0x0386, B:45:0x0392, B:47:0x039f, B:48:0x03b0, B:50:0x03b6, B:53:0x03cf, B:60:0x029c, B:65:0x0062, B:67:0x023f, B:89:0x01a2, B:92:0x01ce, B:96:0x0197, B:101:0x00a1, B:103:0x0130, B:119:0x00b2, B:121:0x00be, B:123:0x00d6, B:127:0x00df, B:129:0x00e6, B:131:0x010c, B:135:0x0200, B:137:0x0223, B:138:0x0227, B:143:0x00e3), top: B:2:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x02ce  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x02ff A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #7 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:11:0x03e2, B:13:0x03e8, B:15:0x03f6, B:18:0x0409, B:20:0x0410, B:24:0x0415, B:25:0x041a, B:35:0x02a7, B:38:0x02d3, B:40:0x02ff, B:42:0x031d, B:44:0x0386, B:45:0x0392, B:47:0x039f, B:48:0x03b0, B:50:0x03b6, B:53:0x03cf, B:60:0x029c, B:65:0x0062, B:67:0x023f, B:89:0x01a2, B:92:0x01ce, B:96:0x0197, B:101:0x00a1, B:103:0x0130, B:119:0x00b2, B:121:0x00be, B:123:0x00d6, B:127:0x00df, B:129:0x00e6, B:131:0x010c, B:135:0x0200, B:137:0x0223, B:138:0x0227, B:143:0x00e3), top: B:2:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x031d A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #7 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:11:0x03e2, B:13:0x03e8, B:15:0x03f6, B:18:0x0409, B:20:0x0410, B:24:0x0415, B:25:0x041a, B:35:0x02a7, B:38:0x02d3, B:40:0x02ff, B:42:0x031d, B:44:0x0386, B:45:0x0392, B:47:0x039f, B:48:0x03b0, B:50:0x03b6, B:53:0x03cf, B:60:0x029c, B:65:0x0062, B:67:0x023f, B:89:0x01a2, B:92:0x01ce, B:96:0x0197, B:101:0x00a1, B:103:0x0130, B:119:0x00b2, B:121:0x00be, B:123:0x00d6, B:127:0x00df, B:129:0x00e6, B:131:0x010c, B:135:0x0200, B:137:0x0223, B:138:0x0227, B:143:0x00e3), top: B:2:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x03cb  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x03e1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x03ce  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x02d1  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x027c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x027d  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01cc  */
        /* JADX WARN: Type inference failed for: r15v1, types: [int] */
        /* JADX WARN: Type inference failed for: r15v2, types: [int] */
        /* JADX WARN: Type inference failed for: r15v3 */
        /* JADX WARN: Type inference failed for: r15v4 */
        /* JADX WARN: Type inference failed for: r15v7 */
        /* JADX WARN: Type inference failed for: r15v8 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r34) {
            /*
                Method dump skipped, instructions count: 1058
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.invoke.2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AndroidLoad(K defaultDispatcher, GetAdRequest getAdRequest, GetAdPlayerConfigRequest getAdPlayerConfigRequest, GetRequestPolicy getRequestPolicy, HandleGatewayAdResponse handleGatewayAdResponse, SessionRepository sessionRepository, GatewayClient gatewayClient, AdRepository adRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        t.g(defaultDispatcher, "defaultDispatcher");
        t.g(getAdRequest, "getAdRequest");
        t.g(getAdPlayerConfigRequest, "getAdPlayerConfigRequest");
        t.g(getRequestPolicy, "getRequestPolicy");
        t.g(handleGatewayAdResponse, "handleGatewayAdResponse");
        t.g(sessionRepository, "sessionRepository");
        t.g(gatewayClient, "gatewayClient");
        t.g(adRepository, "adRepository");
        t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.defaultDispatcher = defaultDispatcher;
        this.getAdRequest = getAdRequest;
        this.getAdPlayerConfigRequest = getAdPlayerConfigRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.handleGatewayAdResponse = handleGatewayAdResponse;
        this.sessionRepository = sessionRepository;
        this.gatewayClient = gatewayClient;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    public static final /* synthetic */ AdRepository access$getAdRepository$p(AndroidLoad androidLoad) {
        return androidLoad.adRepository;
    }

    public static final /* synthetic */ GatewayClient access$getGatewayClient$p(AndroidLoad androidLoad) {
        return androidLoad.gatewayClient;
    }

    public static final /* synthetic */ GetAdPlayerConfigRequest access$getGetAdPlayerConfigRequest$p(AndroidLoad androidLoad) {
        return androidLoad.getAdPlayerConfigRequest;
    }

    public static final /* synthetic */ GetAdRequest access$getGetAdRequest$p(AndroidLoad androidLoad) {
        return androidLoad.getAdRequest;
    }

    public static final /* synthetic */ GetRequestPolicy access$getGetRequestPolicy$p(AndroidLoad androidLoad) {
        return androidLoad.getRequestPolicy;
    }

    public static final /* synthetic */ HandleGatewayAdResponse access$getHandleGatewayAdResponse$p(AndroidLoad androidLoad) {
        return androidLoad.handleGatewayAdResponse;
    }

    public static final /* synthetic */ SendDiagnosticEvent access$getSendDiagnosticEvent$p(AndroidLoad androidLoad) {
        return androidLoad.sendDiagnosticEvent;
    }

    public static final /* synthetic */ SessionRepository access$getSessionRepository$p(AndroidLoad androidLoad) {
        return androidLoad.sessionRepository;
    }

    public static final /* synthetic */ AdObject access$getTmpAdObject(AndroidLoad androidLoad, ByteString byteString, String str, boolean z, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, UnityAdsLoadOptions unityAdsLoadOptions) {
        return androidLoad.getTmpAdObject(byteString, str, z, diagnosticAdType, unityAdsLoadOptions);
    }

    public static final /* synthetic */ LoadResult.Failure access$handleGatewayException(AndroidLoad androidLoad, UnityAdsNetworkException unityAdsNetworkException) {
        return androidLoad.handleGatewayException(unityAdsNetworkException);
    }

    public static final /* synthetic */ void access$incrementLoadRequestAdmCount(AndroidLoad androidLoad, boolean z) {
        androidLoad.incrementLoadRequestAdmCount(z);
    }

    public static final /* synthetic */ void access$incrementLoadRequestCount(AndroidLoad androidLoad, boolean z) {
        androidLoad.incrementLoadRequestCount(z);
    }

    private final AdObject getTmpAdObject(ByteString byteString, String str, boolean z, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, UnityAdsLoadOptions unityAdsLoadOptions) {
        ByteString EMPTY = ByteString.EMPTY;
        t.f(EMPTY, "EMPTY");
        return new AdObject(byteString, str, EMPTY, false, null, null, null, false, null, null, null, unityAdsLoadOptions, z, diagnosticAdType, null, null, 50680, null);
    }

    private final LoadResult.Failure handleGatewayException(UnityAdsNetworkException unityAdsNetworkException) {
        boolean z = unityAdsNetworkException instanceof NetworkTimeoutException;
        return new LoadResult.Failure(z ? UnityAds.UnityAdsLoadError.TIMEOUT : UnityAds.UnityAdsLoadError.INTERNAL_ERROR, z ? "[UnityAds] Timeout while loading " : unityAdsNetworkException instanceof GatewayException ? unityAdsNetworkException.getMessage() : "[UnityAds] Internal communication failure", unityAdsNetworkException, z ? "timeout" : "gateway", unityAdsNetworkException.getMessage(), false, 32, null);
    }

    private final void incrementLoadRequestAdmCount(boolean z) {
        if (z) {
            this.sessionRepository.incrementBannerLoadRequestAdmCount();
        } else {
            this.sessionRepository.incrementLoadRequestAdmCount();
        }
    }

    private final void incrementLoadRequestCount(boolean z) {
        if (z) {
            this.sessionRepository.incrementBannerLoadRequestCount();
        } else {
            this.sessionRepository.incrementLoadRequestCount();
        }
    }

    public Object invoke(Context context, String str, ByteString byteString, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, AdRequestOuterClass.BannerSize bannerSize, UnityAdsLoadOptions unityAdsLoadOptions, e eVar) {
        return i.g(this.defaultDispatcher, new 2(bannerSize, headerBiddingAdMarkup, byteString, str, unityAdsLoadOptions, context, null), eVar);
    }
}
