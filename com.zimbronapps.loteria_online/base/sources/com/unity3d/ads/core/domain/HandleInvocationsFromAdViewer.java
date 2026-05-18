package com.unity3d.ads.core.domain;

import Ca.I;
import Ca.t;
import Ca.x;
import Da.S;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.Invocation;
import com.unity3d.ads.core.data.model.AdData;
import com.unity3d.ads.core.data.model.AdDataRefreshToken;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ImpressionConfig;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import fb.D;
import fb.g;
import java.util.Map;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HandleInvocationsFromAdViewer implements IServiceComponent {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_AD_DATA = "adData";
    public static final String KEY_AD_DATA_REFRESH_TOKEN = "adDataRefreshToken";
    public static final String KEY_AD_STRING = "adString";
    public static final String KEY_AD_TYPE = "type";
    public static final String KEY_AD_UNIT_ID = "adUnitId";
    public static final String KEY_DOWNLOAD_PRIORITY = "priority";
    public static final String KEY_DOWNLOAD_URL = "url";
    public static final String KEY_IMPRESSION_CONFIG = "impressionConfig";
    public static final String KEY_IS_HEADER_BIDDING = "isHeaderBidding";
    public static final String KEY_LOAD_OPTIONS = "loadOptions";
    public static final String KEY_NATIVE_CONTEXT = "nativeContext";
    public static final String KEY_OMID = "openMeasurement";
    public static final String KEY_OMJS_SERVICE = "serviceFilePath";
    public static final String KEY_OMJS_SESSION = "sessionFilePath";
    public static final String KEY_OM_PARTNER = "partnerName";
    public static final String KEY_OM_PARTNER_VERSION = "partnerVersion";
    public static final String KEY_OM_VERSION = "version";
    public static final String KEY_PACKAGE_NAME = "packageName";
    public static final String KEY_PLACEMENT_ID = "placementId";
    public static final String KEY_PLACEMENT_NAME = "placementName";
    public static final String KEY_PRIVACY_UPDATE_CONTENT = "content";
    public static final String KEY_PRIVACY_UPDATE_VERSION = "version";
    public static final String KEY_QUERY_ID = "queryId";
    public static final String KEY_TRACKING_TOKEN = "trackingToken";
    public static final String KEY_VIDEO_LENGTH = "videoLength";

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    @f(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$1", f = "HandleInvocationsFromAdViewer.kt", l = {184}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ Qa.l $onSubscription;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Qa.l lVar, e eVar) {
            super(2, eVar);
            this.$onSubscription = lVar;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.$onSubscription, eVar);
        }

        public final Object invoke(fb.f fVar, e eVar) {
            return ((1) create(fVar, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                Qa.l lVar = this.$onSubscription;
                this.label = 1;
                if (lVar.invoke(this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return I.a;
        }
    }

    @f(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2", f = "HandleInvocationsFromAdViewer.kt", l = {188}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ Map $definition;
        /* synthetic */ Object L$0;
        int label;

        @f(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1", f = "HandleInvocationsFromAdViewer.kt", l = {188}, m = "invokeSuspend")
        public static final class 1 extends l implements Qa.l {
            final /* synthetic */ ExposedFunction $exposedFunction;
            final /* synthetic */ Invocation $it;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(ExposedFunction exposedFunction, Invocation invocation, e eVar) {
                super(1, eVar);
                this.$exposedFunction = exposedFunction;
                this.$it = invocation;
            }

            public final e create(e eVar) {
                return new 1(this.$exposedFunction, this.$it, eVar);
            }

            public final Object invoke(e eVar) {
                return ((1) create(eVar)).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = c.f();
                int i = this.label;
                if (i == 0) {
                    t.b(obj);
                    ExposedFunction exposedFunction = this.$exposedFunction;
                    Object[] parameters = this.$it.getParameters();
                    this.label = 1;
                    obj = exposedFunction.invoke(parameters, this);
                    if (obj == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Map map, e eVar) {
            super(2, eVar);
            this.$definition = map;
        }

        public final e create(Object obj, e eVar) {
            2 r0 = new 2(this.$definition, eVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(Invocation invocation, e eVar) {
            return ((2) create(invocation, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            ExposedFunction exposedFunction;
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                Invocation invocation = (Invocation) this.L$0;
                Qa.a aVar = (Qa.a) this.$definition.get(invocation.getLocation());
                if (aVar == null || (exposedFunction = (ExposedFunction) aVar.invoke()) == null) {
                    return I.a;
                }
                1 r3 = new 1(exposedFunction, invocation, null);
                this.label = 1;
                if (invocation.handle(r3, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return I.a;
        }
    }

    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public final fb.e invoke(D onInvocations, String adData, String adDataRefreshToken, String impressionConfig, AdObject adObject, Qa.l onSubscription) {
        kotlin.jvm.internal.t.g(onInvocations, "onInvocations");
        kotlin.jvm.internal.t.g(adData, "adData");
        kotlin.jvm.internal.t.g(adDataRefreshToken, "adDataRefreshToken");
        kotlin.jvm.internal.t.g(impressionConfig, "impressionConfig");
        kotlin.jvm.internal.t.g(adObject, "adObject");
        kotlin.jvm.internal.t.g(onSubscription, "onSubscription");
        return g.C(g.E(onInvocations, new 1(onSubscription, null)), new 2(S.l(x.a("com.unity3d.services.ads.api.AdViewer.getAdContext", new HandleInvocationsFromAdViewer$invoke$definition$1(this, AdData.constructor-impl(adData), ImpressionConfig.constructor-impl(impressionConfig), AdDataRefreshToken.constructor-impl(adDataRefreshToken), adObject)), x.a("com.unity3d.services.core.api.DeviceInfo.getConnectionType", new HandleInvocationsFromAdViewer$invoke$definition$2(this)), x.a("com.unity3d.services.core.api.DeviceInfo.getDeviceVolume", new HandleInvocationsFromAdViewer$invoke$definition$3(this)), x.a("com.unity3d.services.core.api.DeviceInfo.getDeviceMaxVolume", new HandleInvocationsFromAdViewer$invoke$definition$4(this)), x.a("com.unity3d.services.core.api.DeviceInfo.getScreenHeight", new HandleInvocationsFromAdViewer$invoke$definition$5(this)), x.a("com.unity3d.services.core.api.DeviceInfo.getScreenWidth", new HandleInvocationsFromAdViewer$invoke$definition$6(this)), x.a("com.unity3d.services.ads.api.AdViewer.openUrl", new HandleInvocationsFromAdViewer$invoke$definition$7(this)), x.a("com.unity3d.services.ads.api.AdViewer.setOrientation", new HandleInvocationsFromAdViewer$invoke$definition$8(adObject)), x.a("com.unity3d.services.ads.api.AdViewer.sendOperativeEvent", new HandleInvocationsFromAdViewer$invoke$definition$9(this, adObject)), x.a("com.unity3d.services.core.api.Storage.write", HandleInvocationsFromAdViewer$invoke$definition$10.INSTANCE), x.a("com.unity3d.services.core.api.Storage.read", HandleInvocationsFromAdViewer$invoke$definition$11.INSTANCE), x.a("com.unity3d.services.core.api.Storage.delete", HandleInvocationsFromAdViewer$invoke$definition$12.INSTANCE), x.a("com.unity3d.services.core.api.Storage.clear", HandleInvocationsFromAdViewer$invoke$definition$13.INSTANCE), x.a("com.unity3d.services.core.api.Storage.getKeys", HandleInvocationsFromAdViewer$invoke$definition$14.INSTANCE), x.a("com.unity3d.services.core.api.Storage.get", HandleInvocationsFromAdViewer$invoke$definition$15.INSTANCE), x.a("com.unity3d.services.core.api.Storage.set", HandleInvocationsFromAdViewer$invoke$definition$16.INSTANCE), x.a("com.unity3d.services.ads.api.AdViewer.getPrivacyFsm", new HandleInvocationsFromAdViewer$invoke$definition$17(this)), x.a("com.unity3d.services.ads.api.AdViewer.setPrivacyFsm", new HandleInvocationsFromAdViewer$invoke$definition$18(this)), x.a("com.unity3d.services.ads.api.AdViewer.getPrivacyPayload", new HandleInvocationsFromAdViewer$invoke$definition$19(this)), x.a("com.unity3d.services.ads.api.AdViewer.setPrivacyPayload", new HandleInvocationsFromAdViewer$invoke$definition$20(this)), x.a("com.unity3d.services.ads.api.AdViewer.getPrivacyAllowedPii", new HandleInvocationsFromAdViewer$invoke$definition$21(this)), x.a("com.unity3d.services.ads.api.AdViewer.setPrivacyAllowedPii", new HandleInvocationsFromAdViewer$invoke$definition$22(this)), x.a("com.unity3d.services.ads.api.AdViewer.getSessionToken", new HandleInvocationsFromAdViewer$invoke$definition$23(this)), x.a("com.unity3d.services.ads.api.AdViewer.markCampaignStateAsShown", new HandleInvocationsFromAdViewer$invoke$definition$24(this, adObject)), x.a("com.unity3d.services.ads.api.AdViewer.refreshAdData", new HandleInvocationsFromAdViewer$invoke$definition$25(this, adObject)), x.a("com.unity3d.services.ads.api.AdViewer.updateCampaignState", new HandleInvocationsFromAdViewer$invoke$definition$26(this, adObject)), x.a("com.unity3d.services.ads.api.AdViewer.updateTrackingToken", new HandleInvocationsFromAdViewer$invoke$definition$27(adObject)), x.a("com.unity3d.services.ads.api.AdViewer.sendPrivacyUpdateRequest", new HandleInvocationsFromAdViewer$invoke$definition$28(this)), x.a("com.unity3d.services.ads.api.AdViewer.sendDiagnosticEvent", new HandleInvocationsFromAdViewer$invoke$definition$29(this, adObject)), x.a("com.unity3d.services.ads.api.AdViewer.incrementBannerImpressionCount", new HandleInvocationsFromAdViewer$invoke$definition$30(this)), x.a("com.unity3d.services.ads.api.AdViewer.download", new HandleInvocationsFromAdViewer$invoke$definition$31(this, adObject)), x.a("com.unity3d.services.ads.api.AdViewer.isFileCached", new HandleInvocationsFromAdViewer$invoke$definition$32(this)), x.a("com.unity3d.services.ads.api.AdViewer.omidStartSession", new HandleInvocationsFromAdViewer$invoke$definition$33(this, adObject)), x.a("com.unity3d.services.ads.api.AdViewer.omidFinishSession", new HandleInvocationsFromAdViewer$invoke$definition$34(this, adObject)), x.a("com.unity3d.services.ads.api.AdViewer.omidImpression", new HandleInvocationsFromAdViewer$invoke$definition$35(this, adObject)), x.a("com.unity3d.services.ads.api.AdViewer.omidGetData", new HandleInvocationsFromAdViewer$invoke$definition$36(this)), x.a("com.unity3d.services.ads.api.AdViewer.isAttributionAvailable", new HandleInvocationsFromAdViewer$invoke$definition$37(this)), x.a("com.unity3d.services.ads.api.AdViewer.attributionRegisterView", new HandleInvocationsFromAdViewer$invoke$definition$38(this, adObject)), x.a("com.unity3d.services.ads.api.AdViewer.attributionRegisterClick", new HandleInvocationsFromAdViewer$invoke$definition$39(this, adObject)), x.a("com.unity3d.services.ads.api.AdViewer.loadScarAd", new HandleInvocationsFromAdViewer$invoke$definition$40(this, adObject)), x.a("com.unity3d.services.ads.api.AdViewer.showScarAd", HandleInvocationsFromAdViewer$invoke$definition$41.INSTANCE), x.a("com.unity3d.services.ads.api.AdViewer.hbTokenIncrementWins", new HandleInvocationsFromAdViewer$invoke$definition$42(this)), x.a("com.unity3d.services.ads.api.AdViewer.hbTokenIncrementStarts", new HandleInvocationsFromAdViewer$invoke$definition$43(this)), x.a("com.unity3d.services.ads.api.AdViewer.hbTokenReset", new HandleInvocationsFromAdViewer$invoke$definition$44(this)), x.a("com.unity3d.services.ads.api.AdViewer.loadOfferwallAd", new HandleInvocationsFromAdViewer$invoke$definition$45(this, adObject)), x.a("com.unity3d.services.ads.api.AdViewer.showOfferwallAd", HandleInvocationsFromAdViewer$invoke$definition$46.INSTANCE), x.a("com.unity3d.services.ads.api.AdViewer.isOfferwallAdReady", new HandleInvocationsFromAdViewer$invoke$definition$47(this)), x.a("com.unity3d.services.core.api.Request.get", new HandleInvocationsFromAdViewer$invoke$definition$48(this)), x.a("com.unity3d.services.core.api.Request.post", new HandleInvocationsFromAdViewer$invoke$definition$49(this)), x.a("com.unity3d.services.core.api.Request.head", new HandleInvocationsFromAdViewer$invoke$definition$50(this)), x.a("com.unity3d.services.ads.api.AdViewer.setOpportunityTTL", new HandleInvocationsFromAdViewer$invoke$definition$51(adObject))), null));
    }
}
