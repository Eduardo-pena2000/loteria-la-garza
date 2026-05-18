package com.unity3d.ads.core.domain;

import Ca.I;
import Ca.x;
import Da.S;
import Ga.e;
import Ia.d;
import Ia.f;
import Za.E;
import ab.j;
import ab.k;
import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.BannerSizeKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class LegacyLoadUseCase {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_AD_MARKUP = "adMarkup";
    public static final String KEY_OBJECT_ID = "objectId";
    private String adMarkup;
    private final AdRepository adRepository;
    private final AwaitInitialization awaitInitialization;
    private final CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires;
    private final GetInitializationState getInitializationState;
    private boolean isBanner;
    private boolean isHeaderBidding;
    private IUnityAdsLoadListener listener;
    private final Load load;
    private UnityAdsLoadOptions loadOptions;
    private ByteString opportunity;
    private String placement;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private j startTime;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    @f(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase", f = "LegacyLoadUseCase.kt", l = {98}, m = "invoke")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LegacyLoadUseCase.this.invoke(null, null, null, null, null, this);
        }
    }

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ LoadResult.Failure $loadResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(LoadResult.Failure failure) {
            super(0);
            this.$loadResult = failure;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            IUnityAdsLoadListener access$getListener$p = LegacyLoadUseCase.access$getListener$p(LegacyLoadUseCase.this);
            if (access$getListener$p != null) {
                access$getListener$p.onUnityAdsFailedToLoad(LegacyLoadUseCase.access$getPlacement$p(LegacyLoadUseCase.this), this.$loadResult.getError(), this.$loadResult.getMessage());
            }
        }
    }

    public static final class 1 extends u implements Qa.a {
        public 1() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            IUnityAdsLoadListener access$getListener$p = LegacyLoadUseCase.access$getListener$p(LegacyLoadUseCase.this);
            if (access$getListener$p != null) {
                access$getListener$p.onUnityAdsAdLoaded(LegacyLoadUseCase.access$getPlacement$p(LegacyLoadUseCase.this));
            }
        }
    }

    public LegacyLoadUseCase(Load load, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository, AdRepository adRepository, SafeCallbackInvoke safeCallbackInvoke, CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires) {
        t.g(load, "load");
        t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        t.g(getInitializationState, "getInitializationState");
        t.g(awaitInitialization, "awaitInitialization");
        t.g(sessionRepository, "sessionRepository");
        t.g(adRepository, "adRepository");
        t.g(safeCallbackInvoke, "safeCallbackInvoke");
        t.g(cleanUpWhenOpportunityExpires, "cleanUpWhenOpportunityExpires");
        this.load = load;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.adRepository = adRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.cleanUpWhenOpportunityExpires = cleanUpWhenOpportunityExpires;
    }

    public static final /* synthetic */ String access$getAdMarkup$p(LegacyLoadUseCase legacyLoadUseCase) {
        return legacyLoadUseCase.adMarkup;
    }

    public static final /* synthetic */ AdRepository access$getAdRepository$p(LegacyLoadUseCase legacyLoadUseCase) {
        return legacyLoadUseCase.adRepository;
    }

    public static final /* synthetic */ AwaitInitialization access$getAwaitInitialization$p(LegacyLoadUseCase legacyLoadUseCase) {
        return legacyLoadUseCase.awaitInitialization;
    }

    public static final /* synthetic */ GetInitializationState access$getGetInitializationState$p(LegacyLoadUseCase legacyLoadUseCase) {
        return legacyLoadUseCase.getInitializationState;
    }

    public static final /* synthetic */ HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup access$getHeaderBiddingAdMarkup(LegacyLoadUseCase legacyLoadUseCase, String str) {
        return legacyLoadUseCase.getHeaderBiddingAdMarkup(str);
    }

    public static final /* synthetic */ IUnityAdsLoadListener access$getListener$p(LegacyLoadUseCase legacyLoadUseCase) {
        return legacyLoadUseCase.listener;
    }

    public static final /* synthetic */ Load access$getLoad$p(LegacyLoadUseCase legacyLoadUseCase) {
        return legacyLoadUseCase.load;
    }

    public static final /* synthetic */ String access$getPlacement$p(LegacyLoadUseCase legacyLoadUseCase) {
        return legacyLoadUseCase.placement;
    }

    public static final /* synthetic */ void access$setOpportunity$p(LegacyLoadUseCase legacyLoadUseCase, ByteString byteString) {
        legacyLoadUseCase.opportunity = byteString;
    }

    private final String getAdMarkup(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object opt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (opt = data.opt("adMarkup")) == null) {
            return null;
        }
        return opt.toString();
    }

    private final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.isBanner ? DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
    }

    private final AdRequestOuterClass.BannerSize getBannerSize(UnityBannerSize unityBannerSize) {
        if (unityBannerSize == null) {
            return null;
        }
        BannerSizeKt.Dsl.Companion companion = BannerSizeKt.Dsl.Companion;
        AdRequestOuterClass.BannerSize.Builder newBuilder = AdRequestOuterClass.BannerSize.newBuilder();
        t.f(newBuilder, "newBuilder()");
        BannerSizeKt.Dsl _create = companion._create(newBuilder);
        _create.setWidth(unityBannerSize.getWidth());
        _create.setHeight(unityBannerSize.getHeight());
        return _create._build();
    }

    private final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup getHeaderBiddingAdMarkup(String str) {
        if (str == null || E.h0(str)) {
            return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.getDefaultInstance();
        }
        try {
            return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.parseFrom(ProtobufExtensionsKt.fromBase64$default(str, false, 1, null).toByteArray());
        } catch (Exception unused) {
            return null;
        }
    }

    private final String getOpportunityId(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object opt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (opt = data.opt("objectId")) == null) {
            return null;
        }
        return opt.toString();
    }

    private final Map getTags(String str, String str2) {
        Map o = S.o(x.a("state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), x.a("operation", OperationType.LOAD.toString()));
        if (str != null && str.length() != 0) {
            o.put("reason", str);
        }
        if (str2 != null && str2.length() != 0) {
            o.put("reason_debug", str2);
        }
        return o;
    }

    public static /* synthetic */ Map getTags$default(LegacyLoadUseCase legacyLoadUseCase, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return legacyLoadUseCase.getTags(str, str2);
    }

    private final AdObject getTmpAdObject(String str, boolean z) {
        UUID fromString = UUID.fromString(str);
        t.f(fromString, "fromString(opportunityId)");
        ByteString byteString = ProtobufExtensionsKt.toByteString(fromString);
        String str2 = this.placement;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        ByteString EMPTY = ByteString.EMPTY;
        UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions == null) {
            t.v("loadOptions");
            unityAdsLoadOptions = null;
        }
        UnityAdsLoadOptions unityAdsLoadOptions2 = unityAdsLoadOptions;
        boolean z2 = this.isHeaderBidding;
        DiagnosticEventRequestOuterClass.DiagnosticAdType adType = getAdType();
        t.f(EMPTY, "EMPTY");
        return new AdObject(byteString, str3, EMPTY, z, null, null, null, false, null, null, null, unityAdsLoadOptions2, z2, adType, null, null, 50672, null);
    }

    public static /* synthetic */ AdObject getTmpAdObject$default(LegacyLoadUseCase legacyLoadUseCase, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return legacyLoadUseCase.getTmpAdObject(str, z);
    }

    public static /* synthetic */ Object invoke$default(LegacyLoadUseCase legacyLoadUseCase, Context context, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, e eVar, int i, Object obj) {
        if ((i & 16) != 0) {
            unityBannerSize = null;
        }
        return legacyLoadUseCase.invoke(context, str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, eVar);
    }

    private final void loadFailure(String str, LoadResult.Failure failure) {
        DeviceLog.debug("Unity Ads Load Failure for placement: " + this.placement + " reason: " + failure.getError() + " :: " + failure.getMessage());
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        j jVar = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_failure_time", jVar != null ? Double.valueOf(TimeExtensionsKt.elapsedMillis(jVar)) : null, getTags(failure.getReason(), failure.getReasonDebug()), null, getTmpAdObject(str, failure.isScarAd()), null, 40, null);
        this.safeCallbackInvoke.invoke(new 1(failure));
    }

    private final j loadStart(String str) {
        long b = ab.k.a.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_load_started", null, getTags$default(this, null, null, 3, null), null, getTmpAdObject$default(this, str, false, 2, null), null, 42, null);
        return k.a.b(b);
    }

    private final void loadSuccess(AdObject adObject) {
        DeviceLog.debug("Unity Ads Load Success for placement: " + this.placement);
        adObject.getState().setValue(AdObjectState.LOADED);
        this.cleanUpWhenOpportunityExpires.invoke(adObject);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        j jVar = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_success_time", jVar != null ? Double.valueOf(TimeExtensionsKt.elapsedMillis(jVar)) : null, getTags$default(this, null, null, 3, null), null, adObject, null, 40, null);
        this.safeCallbackInvoke.invoke(new 1());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e1 A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:12:0x003e, B:13:0x00dd, B:15:0x00e1, B:16:0x0107, B:18:0x010b, B:22:0x0115, B:24:0x0119), top: B:11:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010b A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:12:0x003e, B:13:0x00dd, B:15:0x00e1, B:16:0x0107, B:18:0x010b, B:22:0x0115, B:24:0x0119), top: B:11:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0115 A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:12:0x003e, B:13:0x00dd, B:15:0x00e1, B:16:0x0107, B:18:0x010b, B:22:0x0115, B:24:0x0119), top: B:11:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(android.content.Context r27, java.lang.String r28, com.unity3d.ads.UnityAdsLoadOptions r29, com.unity3d.ads.IUnityAdsLoadListener r30, com.unity3d.services.banners.UnityBannerSize r31, Ga.e r32) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyLoadUseCase.invoke(android.content.Context, java.lang.String, com.unity3d.ads.UnityAdsLoadOptions, com.unity3d.ads.IUnityAdsLoadListener, com.unity3d.services.banners.UnityBannerSize, Ga.e):java.lang.Object");
    }
}
