package com.unity3d.ads.core.domain.exposure;

import Ca.I;
import Da.Q;
import Da.r;
import Ga.e;
import Ga.k;
import Ha.b;
import Ha.c;
import Ia.h;
import ab.b;
import ab.d;
import android.util.Base64;
import com.google.protobuf.GeneratedMessageLite;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.utils.ContinuationFromCallback;
import com.unity3d.services.core.api.Storage;
import com.unity3d.services.core.network.model.RequestType;
import fb.z;
import gatewayprotocol.v1.AllowedPiiKt;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonAdViewerExposedFunctionsKt {

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ AndroidAttribution $androidAttribution;

        public 1(AndroidAttribution androidAttribution, AdObject adObject) {
            this.$androidAttribution = androidAttribution;
            this.$adObject = adObject;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            AndroidAttribution androidAttribution = this.$androidAttribution;
            Object obj = objArr[0];
            t.e(obj, "null cannot be cast to non-null type kotlin.String");
            return androidAttribution.registerClick((String) obj, this.$adObject, eVar);
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ AndroidAttribution $androidAttribution;

        public 1(AndroidAttribution androidAttribution, AdObject adObject) {
            this.$androidAttribution = androidAttribution;
            this.$adObject = adObject;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            AndroidAttribution androidAttribution = this.$androidAttribution;
            Object obj = objArr[0];
            t.e(obj, "null cannot be cast to non-null type kotlin.String");
            return androidAttribution.registerView((String) obj, this.$adObject, eVar);
        }
    }

    public static final class 1 implements ExposedFunction {
        public static final 1 INSTANCE = new 1();

        public final Object invoke(Object[] objArr, e eVar) {
            k kVar = new k(b.c(eVar));
            Object obj = objArr[0];
            t.e(obj, "null cannot be cast to non-null type kotlin.String");
            Storage.clear((String) obj, new ContinuationFromCallback(kVar));
            Object a = kVar.a();
            if (a == c.f()) {
                h.c(eVar);
            }
            return a;
        }
    }

    public static final class 1 implements ExposedFunction {
        public static final 1 INSTANCE = new 1();

        public final Object invoke(Object[] objArr, e eVar) {
            k kVar = new k(b.c(eVar));
            Object obj = objArr[0];
            t.e(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = objArr[1];
            t.e(obj2, "null cannot be cast to non-null type kotlin.String");
            Storage.delete((String) obj, (String) obj2, new ContinuationFromCallback(kVar));
            Object a = kVar.a();
            if (a == c.f()) {
                h.c(eVar);
            }
            return a;
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ CacheFile $cacheFile;

        public 1(CacheFile cacheFile, AdObject adObject) {
            this.$cacheFile = cacheFile;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r8, Ga.e r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1
                if (r0 == 0) goto L14
                r0 = r9
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.label = r1
            L12:
                r6 = r0
                goto L1a
            L14:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1
                r0.<init>(r7, r9)
                goto L12
            L1a:
                java.lang.Object r9 = r6.result
                java.lang.Object r0 = Ha.c.f()
                int r1 = r6.label
                r2 = 1
                if (r1 == 0) goto L33
                if (r1 != r2) goto L2b
                Ca.t.b(r9)
                goto L65
            L2b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L33:
                Ca.t.b(r9)
                r9 = 0
                r1 = r8[r9]
                java.lang.String r3 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.t.e(r1, r3)
                org.json.JSONObject r1 = (org.json.JSONObject) r1
                java.lang.String r3 = "url"
                java.lang.String r4 = r1.getString(r3)
                r5 = 2
                java.lang.Object r8 = Da.r.b0(r8, r5)
                org.json.JSONArray r8 = (org.json.JSONArray) r8
                java.lang.String r5 = "priority"
                int r5 = r1.optInt(r5, r9)
                com.unity3d.ads.core.domain.CacheFile r1 = r7.$cacheFile
                kotlin.jvm.internal.t.f(r4, r3)
                com.unity3d.ads.core.data.model.AdObject r3 = r7.$adObject
                r6.label = r2
                r2 = r4
                r4 = r8
                java.lang.Object r9 = r1.invoke(r2, r3, r4, r5, r6)
                if (r9 != r0) goto L65
                return r0
            L65:
                com.unity3d.ads.core.data.model.CacheResult r9 = (com.unity3d.ads.core.data.model.CacheResult) r9
                boolean r8 = r9 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
                if (r8 == 0) goto L87
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "unity-ads-cache://unity.ads.cache/"
                r8.append(r0)
                com.unity3d.ads.core.data.model.CacheResult$Success r9 = (com.unity3d.ads.core.data.model.CacheResult.Success) r9
                com.unity3d.ads.core.data.model.CachedFile r9 = r9.getCachedFile()
                java.lang.String r9 = r9.getName()
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                return r8
            L87:
                boolean r8 = r9 instanceof com.unity3d.ads.core.data.model.CacheResult.Failure
                if (r8 == 0) goto L9f
                com.unity3d.ads.core.data.model.CacheResult$Failure r9 = (com.unity3d.ads.core.data.model.CacheResult.Failure) r9
                com.unity3d.ads.core.data.model.CacheError r8 = r9.getError()
                java.lang.String r8 = r8.name()
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r8 = r8.toString()
                r9.<init>(r8)
                throw r9
            L9f:
                Ca.o r8 = new Ca.o
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.download.1.invoke(java.lang.Object[], Ga.e):java.lang.Object");
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ DeviceInfoRepository $deviceInfoRepository;

        public 1(DeviceInfoRepository deviceInfoRepository) {
            this.$deviceInfoRepository = deviceInfoRepository;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            String encodeToString = Base64.encodeToString(((AllowedPiiOuterClass.AllowedPii) this.$deviceInfoRepository.getAllowedPii().getValue()).toByteArray(), 2);
            t.f(encodeToString, "encodeToString(deviceInf…eArray(), Base64.NO_WRAP)");
            return encodeToString;
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ DeviceInfoRepository $deviceInfoRepository;

        public 1(DeviceInfoRepository deviceInfoRepository) {
            this.$deviceInfoRepository = deviceInfoRepository;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            DynamicDeviceInfoOuterClass.ConnectionType connectionType = this.$deviceInfoRepository.getDynamicDeviceInfo().getConnectionType();
            t.f(connectionType, "deviceInfoRepository.dyn…DeviceInfo.connectionType");
            return connectionType;
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ DeviceInfoRepository $deviceInfoRepository;

        public 1(DeviceInfoRepository deviceInfoRepository) {
            this.$deviceInfoRepository = deviceInfoRepository;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            return Ia.b.b(this.$deviceInfoRepository.getDynamicDeviceInfo().getAndroid().getMaxVolume());
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ DeviceInfoRepository $deviceInfoRepository;

        public 1(DeviceInfoRepository deviceInfoRepository) {
            this.$deviceInfoRepository = deviceInfoRepository;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            return Ia.b.b(this.$deviceInfoRepository.getDynamicDeviceInfo().getAndroid().getVolume());
        }
    }

    public static final class 1 implements ExposedFunction {
        public static final 1 INSTANCE = new 1();

        public final Object invoke(Object[] objArr, e eVar) {
            k kVar = new k(b.c(eVar));
            Object obj = objArr[0];
            t.e(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = objArr[1];
            t.e(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = objArr[2];
            t.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            Storage.getKeys((String) obj, (String) obj2, (Boolean) obj3, new ContinuationFromCallback(kVar));
            Object a = kVar.a();
            if (a == c.f()) {
                h.c(eVar);
            }
            return a;
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public 1(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r4, Ga.e r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1
                if (r4 == 0) goto L13
                r4 = r5
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 r4 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1) r4
                int r0 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r4.label = r0
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 r4 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1
                r4.<init>(r3, r5)
            L18:
                java.lang.Object r5 = r4.result
                java.lang.Object r0 = Ha.c.f()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L31
                if (r1 != r2) goto L29
                Ca.t.b(r5)
                goto L3f
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                Ca.t.b(r5)
                com.unity3d.ads.core.data.repository.SessionRepository r5 = r3.$sessionRepository
                r4.label = r2
                java.lang.Object r5 = r5.getPrivacy(r4)
                if (r5 != r0) goto L3f
                return r0
            L3f:
                com.google.protobuf.ByteString r5 = (com.google.protobuf.ByteString) r5
                r4 = 0
                r0 = 0
                java.lang.String r4 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r5, r4, r2, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getPrivacy.1.invoke(java.lang.Object[], Ga.e):java.lang.Object");
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public 1(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r4, Ga.e r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1
                if (r4 == 0) goto L13
                r4 = r5
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 r4 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1) r4
                int r0 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r4.label = r0
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 r4 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1
                r4.<init>(r3, r5)
            L18:
                java.lang.Object r5 = r4.result
                java.lang.Object r0 = Ha.c.f()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L31
                if (r1 != r2) goto L29
                Ca.t.b(r5)
                goto L3f
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                Ca.t.b(r5)
                com.unity3d.ads.core.data.repository.SessionRepository r5 = r3.$sessionRepository
                r4.label = r2
                java.lang.Object r5 = r5.getPrivacyFsm(r4)
                if (r5 != r0) goto L3f
                return r0
            L3f:
                com.google.protobuf.ByteString r5 = (com.google.protobuf.ByteString) r5
                r4 = 0
                r0 = 0
                java.lang.String r4 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r5, r4, r2, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getPrivacyFsm.1.invoke(java.lang.Object[], Ga.e):java.lang.Object");
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ DeviceInfoRepository $deviceInfoRepository;

        public 1(DeviceInfoRepository deviceInfoRepository) {
            this.$deviceInfoRepository = deviceInfoRepository;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            return Ia.b.d(this.$deviceInfoRepository.getDynamicDeviceInfo().getScreenHeight());
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ DeviceInfoRepository $deviceInfoRepository;

        public 1(DeviceInfoRepository deviceInfoRepository) {
            this.$deviceInfoRepository = deviceInfoRepository;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            return Ia.b.d(this.$deviceInfoRepository.getDynamicDeviceInfo().getScreenWidth());
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public 1(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            return ProtobufExtensionsKt.toBase64$default(this.$sessionRepository.getSessionToken(), false, 1, null);
        }
    }

    public static final class 1 implements ExposedFunction {
        public static final 1 INSTANCE = new 1();

        public final Object invoke(Object[] objArr, e eVar) {
            k kVar = new k(b.c(eVar));
            Object obj = objArr[0];
            t.e(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = objArr[1];
            t.e(obj2, "null cannot be cast to non-null type kotlin.String");
            Storage.get((String) obj, (String) obj2, new ContinuationFromCallback(kVar));
            Object a = kVar.a();
            if (a == c.f()) {
                h.c(eVar);
            }
            return a;
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public 1(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            this.$sessionRepository.incrementTokenStartsCount();
            return I.a;
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public 1(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            this.$sessionRepository.incrementTokenWinsCount();
            return I.a;
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public 1(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            this.$sessionRepository.resetTokenCounters();
            return I.a;
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public 1(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            this.$sessionRepository.incrementBannerImpressionCount();
            return I.a;
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ AndroidAttribution $androidAttribution;

        public 1(AndroidAttribution androidAttribution) {
            this.$androidAttribution = androidAttribution;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            return this.$androidAttribution.isAvailable(eVar);
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ GetIsFileCache $getIfFileCache;

        public 1(GetIsFileCache getIsFileCache) {
            this.$getIfFileCache = getIsFileCache;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            Object obj = objArr[0];
            t.e(obj, "null cannot be cast to non-null type kotlin.String");
            return this.$getIfFileCache.invoke((String) obj, eVar);
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ GetIsOfferwallAdReady $getIsOfferwallAdReady;

        public 1(GetIsOfferwallAdReady getIsOfferwallAdReady) {
            this.$getIsOfferwallAdReady = getIsOfferwallAdReady;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            Object obj = objArr[0];
            t.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
            String placementName = ((JSONObject) obj).optString("placementName");
            GetIsOfferwallAdReady getIsOfferwallAdReady = this.$getIsOfferwallAdReady;
            t.f(placementName, "placementName");
            return getIsOfferwallAdReady.invoke(placementName, eVar);
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ LoadOfferwallAd $loadOfferwallAd;

        public 1(AdObject adObject, LoadOfferwallAd loadOfferwallAd) {
            this.$adObject = adObject;
            this.$loadOfferwallAd = loadOfferwallAd;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r5, Ga.e r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Ca.t.b(r6)
                goto L5c
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                Ca.t.b(r6)
                r6 = 0
                r5 = r5[r6]
                java.lang.String r6 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.t.e(r5, r6)
                org.json.JSONObject r5 = (org.json.JSONObject) r5
                java.lang.String r6 = "placementName"
                java.lang.String r5 = r5.optString(r6)
                com.unity3d.ads.core.data.model.AdObject r2 = r4.$adObject
                r2.setOfferwallAd(r3)
                com.unity3d.ads.core.data.model.AdObject r2 = r4.$adObject
                r2.setOfferwallPlacementName(r5)
                com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd r2 = r4.$loadOfferwallAd
                kotlin.jvm.internal.t.f(r5, r6)
                r0.label = r3
                java.lang.Object r5 = r2.invoke(r5, r0)
                if (r5 != r1) goto L5c
                return r1
            L5c:
                Ca.I r5 = Ca.I.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.loadOfferwallAd.1.invoke(java.lang.Object[], Ga.e):java.lang.Object");
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ LoadScarAd $loadScarAd;

        public 1(AdObject adObject, LoadScarAd loadScarAd) {
            this.$adObject = adObject;
            this.$loadScarAd = loadScarAd;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r12, Ga.e r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1
                if (r0 == 0) goto L14
                r0 = r13
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.label = r1
            L12:
                r8 = r0
                goto L1a
            L14:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1
                r0.<init>(r11, r13)
                goto L12
            L1a:
                java.lang.Object r13 = r8.result
                java.lang.Object r0 = Ha.c.f()
                int r1 = r8.label
                r2 = 1
                if (r1 == 0) goto L33
                if (r1 != r2) goto L2b
                Ca.t.b(r13)
                goto L96
            L2b:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L33:
                Ca.t.b(r13)
                r13 = 0
                r12 = r12[r13]
                java.lang.String r13 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.t.e(r12, r13)
                org.json.JSONObject r12 = (org.json.JSONObject) r12
                java.lang.String r13 = "type"
                java.lang.String r13 = r12.optString(r13)
                java.lang.String r1 = "adUnitId"
                java.lang.String r4 = r12.optString(r1)
                java.lang.String r3 = "adString"
                java.lang.String r5 = r12.optString(r3)
                java.lang.String r6 = "queryId"
                java.lang.String r7 = r12.optString(r6)
                java.lang.String r9 = "videoLength"
                int r12 = r12.optInt(r9)
                com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
                r9.setScarAd(r2)
                com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
                r9.setScarAdUnitId(r4)
                com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
                r9.setScarQueryId(r7)
                com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
                r9.setScarAdString(r5)
                com.unity3d.ads.core.domain.scar.LoadScarAd r9 = r11.$loadScarAd
                java.lang.String r10 = "adType"
                kotlin.jvm.internal.t.f(r13, r10)
                com.unity3d.ads.core.data.model.AdObject r10 = r11.$adObject
                java.lang.String r10 = r10.getPlacementId()
                kotlin.jvm.internal.t.f(r4, r1)
                kotlin.jvm.internal.t.f(r5, r3)
                kotlin.jvm.internal.t.f(r7, r6)
                r8.label = r2
                r1 = r9
                r2 = r13
                r3 = r10
                r6 = r7
                r7 = r12
                java.lang.Object r12 = r1.invoke(r2, r3, r4, r5, r6, r7, r8)
                if (r12 != r0) goto L96
                return r0
            L96:
                Ca.I r12 = Ca.I.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.loadScarAd.1.invoke(java.lang.Object[], Ga.e):java.lang.Object");
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ CampaignRepository $campaignRepository;

        public 1(CampaignRepository campaignRepository, AdObject adObject) {
            this.$campaignRepository = campaignRepository;
            this.$adObject = adObject;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            this.$campaignRepository.setShowTimestamp(this.$adObject.getOpportunityId());
            return I.a;
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ OmFinishSession $omFinishSession;

        public 1(OmFinishSession omFinishSession, AdObject adObject) {
            this.$omFinishSession = omFinishSession;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r4, Ga.e r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1
                if (r4 == 0) goto L13
                r4 = r5
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 r4 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1) r4
                int r0 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r4.label = r0
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 r4 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1
                r4.<init>(r3, r5)
            L18:
                java.lang.Object r5 = r4.result
                java.lang.Object r0 = Ha.c.f()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L31
                if (r1 != r2) goto L29
                Ca.t.b(r5)
                goto L41
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                Ca.t.b(r5)
                com.unity3d.ads.core.domain.om.OmFinishSession r5 = r3.$omFinishSession
                com.unity3d.ads.core.data.model.AdObject r1 = r3.$adObject
                r4.label = r2
                java.lang.Object r4 = r5.invoke(r1, r4)
                if (r4 != r0) goto L41
                return r0
            L41:
                Ca.I r4 = Ca.I.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omFinishSession.1.invoke(java.lang.Object[], Ga.e):java.lang.Object");
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ GetOmData $getOmData;

        public 1(GetOmData getOmData) {
            this.$getOmData = getOmData;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r4, Ga.e r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1
                if (r4 == 0) goto L13
                r4 = r5
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 r4 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1) r4
                int r0 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r4.label = r0
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 r4 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1
                r4.<init>(r3, r5)
            L18:
                java.lang.Object r5 = r4.result
                java.lang.Object r0 = Ha.c.f()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L31
                if (r1 != r2) goto L29
                Ca.t.b(r5)
                goto L3f
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                Ca.t.b(r5)
                com.unity3d.ads.core.domain.om.GetOmData r5 = r3.$getOmData
                r4.label = r2
                java.lang.Object r5 = r5.invoke(r4)
                if (r5 != r0) goto L3f
                return r0
            L3f:
                com.unity3d.ads.core.data.model.OMData r5 = (com.unity3d.ads.core.data.model.OMData) r5
                java.util.Map r4 = Da.Q.c()
                java.lang.String r0 = r5.getVersion()
                java.lang.String r1 = "version"
                r4.put(r1, r0)
                java.lang.String r0 = "partnerName"
                java.lang.String r1 = r5.getPartnerName()
                r4.put(r0, r1)
                java.lang.String r0 = "partnerVersion"
                java.lang.String r5 = r5.getPartnerVersion()
                r4.put(r0, r5)
                java.util.Map r4 = Da.Q.b(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omGetData.1.invoke(java.lang.Object[], Ga.e):java.lang.Object");
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ OmImpressionOccurred $omImpressionOccurred;

        public 1(OmImpressionOccurred omImpressionOccurred, AdObject adObject) {
            this.$omImpressionOccurred = omImpressionOccurred;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r5, Ga.e r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Ca.t.b(r6)
                goto L4f
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                Ca.t.b(r6)
                r6 = 0
                r5 = r5[r6]
                java.lang.String r6 = "null cannot be cast to non-null type kotlin.Boolean"
                kotlin.jvm.internal.t.e(r5, r6)
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                com.unity3d.ads.core.domain.om.OmImpressionOccurred r6 = r4.$omImpressionOccurred
                com.unity3d.ads.core.data.model.AdObject r2 = r4.$adObject
                r0.label = r3
                java.lang.Object r5 = r6.invoke(r2, r5, r0)
                if (r5 != r1) goto L4f
                return r1
            L4f:
                Ca.I r5 = Ca.I.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omImpression.1.invoke(java.lang.Object[], Ga.e):java.lang.Object");
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ AndroidOmInteraction $omStartSession;

        public 1(AndroidOmInteraction androidOmInteraction, AdObject adObject) {
            this.$omStartSession = androidOmInteraction;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r5, Ga.e r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Ca.t.b(r6)
                goto L4b
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                Ca.t.b(r6)
                r6 = 0
                r5 = r5[r6]
                java.lang.String r6 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.t.e(r5, r6)
                org.json.JSONObject r5 = (org.json.JSONObject) r5
                com.unity3d.ads.core.domain.om.AndroidOmInteraction r6 = r4.$omStartSession
                com.unity3d.ads.core.data.model.AdObject r2 = r4.$adObject
                r0.label = r3
                java.lang.Object r5 = r6.invoke(r2, r5, r0)
                if (r5 != r1) goto L4b
                return r1
            L4b:
                Ca.I r5 = Ca.I.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omStartSession.1.invoke(java.lang.Object[], Ga.e):java.lang.Object");
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ HandleOpenUrl $handleOpenUrl;

        public 1(HandleOpenUrl handleOpenUrl) {
            this.$handleOpenUrl = handleOpenUrl;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            Object obj = objArr[0];
            t.e(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            Object b0 = r.b0(objArr, 1);
            JSONObject jSONObject = b0 instanceof JSONObject ? (JSONObject) b0 : null;
            this.$handleOpenUrl.invoke(str, jSONObject != null ? jSONObject.optString("packageName") : null);
            return I.a;
        }
    }

    public static final class 1 implements ExposedFunction {
        public static final 1 INSTANCE = new 1();

        public final Object invoke(Object[] objArr, e eVar) {
            k kVar = new k(b.c(eVar));
            Object obj = objArr[0];
            t.e(obj, "null cannot be cast to non-null type kotlin.String");
            Storage.read((String) obj, new ContinuationFromCallback(kVar));
            Object a = kVar.a();
            if (a == c.f()) {
                h.c(eVar);
            }
            return a;
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ Refresh $refresh;

        public 1(Refresh refresh, AdObject adObject) {
            this.$refresh = refresh;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r8, Ga.e r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r9
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.label
                java.lang.String r3 = "adDataRefreshToken"
                r4 = 0
                r5 = 0
                r6 = 1
                if (r2 == 0) goto L35
                if (r2 != r6) goto L2d
                Ca.t.b(r9)
                goto L6a
            L2d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L35:
                Ca.t.b(r9)
                int r9 = r8.length
                if (r9 != 0) goto L3e
                com.google.protobuf.ByteString r8 = com.google.protobuf.ByteString.EMPTY
                goto L54
            L3e:
                r8 = r8[r5]
                java.lang.String r9 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.t.e(r8, r9)
                org.json.JSONObject r8 = (org.json.JSONObject) r8
                java.lang.String r8 = r8.optString(r3)
                java.lang.String r9 = "refreshToken"
                kotlin.jvm.internal.t.f(r8, r9)
                com.google.protobuf.ByteString r8 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r8, r5, r6, r4)
            L54:
                com.unity3d.ads.core.domain.Refresh r9 = r7.$refresh
                java.lang.String r2 = "refreshTokenByteString"
                kotlin.jvm.internal.t.f(r8, r2)
                com.unity3d.ads.core.data.model.AdObject r2 = r7.$adObject
                com.google.protobuf.ByteString r2 = r2.getOpportunityId()
                r0.label = r6
                java.lang.Object r9 = r9.invoke(r8, r2, r0)
                if (r9 != r1) goto L6a
                return r1
            L6a:
                gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse r9 = (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) r9
                boolean r8 = r9.hasError()
                if (r8 != 0) goto Laf
                java.util.Map r8 = Da.Q.c()
                com.google.protobuf.ByteString r0 = r9.getAdData()
                java.lang.String r1 = "adRefreshResponse.adData"
                kotlin.jvm.internal.t.f(r0, r1)
                java.lang.String r0 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r0, r5, r6, r4)
                java.lang.String r1 = "adData"
                r8.put(r1, r0)
                com.google.protobuf.ByteString r0 = r9.getAdDataRefreshToken()
                java.lang.String r1 = "adRefreshResponse.adDataRefreshToken"
                kotlin.jvm.internal.t.f(r0, r1)
                java.lang.String r0 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r0, r5, r6, r4)
                r8.put(r3, r0)
                com.google.protobuf.ByteString r9 = r9.getTrackingToken()
                java.lang.String r0 = "adRefreshResponse.trackingToken"
                kotlin.jvm.internal.t.f(r9, r0)
                java.lang.String r9 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r9, r5, r6, r4)
                java.lang.String r0 = "trackingToken"
                r8.put(r0, r9)
                java.util.Map r8 = Da.Q.b(r8)
                return r8
            Laf:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r9 = "Refresh failed"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.refreshAdData.1.invoke(java.lang.Object[], Ga.e):java.lang.Object");
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ ExecuteAdViewerRequest $executeAdViewerRequest;
        final /* synthetic */ RequestType $type;

        public 1(ExecuteAdViewerRequest executeAdViewerRequest, RequestType requestType) {
            this.$executeAdViewerRequest = executeAdViewerRequest;
            this.$type = requestType;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r7, Ga.e r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r8
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3c
                if (r2 != r3) goto L34
                java.lang.Object r7 = r0.L$1
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r0 = r0.L$0
                java.lang.String r0 = (java.lang.String) r0
                Ca.t.b(r8)     // Catch: java.lang.Exception -> L31
                goto L64
            L31:
                r8 = move-exception
                goto La7
            L34:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3c:
                Ca.t.b(r8)
                java.lang.Object r8 = Da.r.U(r7)
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
                kotlin.jvm.internal.t.e(r8, r2)
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r2 = Da.r.b0(r7, r3)
                java.lang.String r2 = (java.lang.String) r2
                com.unity3d.ads.core.domain.ExecuteAdViewerRequest r4 = r6.$executeAdViewerRequest     // Catch: java.lang.Exception -> La3
                com.unity3d.services.core.network.model.RequestType r5 = r6.$type     // Catch: java.lang.Exception -> La3
                r0.L$0 = r8     // Catch: java.lang.Exception -> La3
                r0.L$1 = r2     // Catch: java.lang.Exception -> La3
                r0.label = r3     // Catch: java.lang.Exception -> La3
                java.lang.Object r7 = r4.invoke(r5, r7, r0)     // Catch: java.lang.Exception -> La3
                if (r7 != r1) goto L61
                return r1
            L61:
                r0 = r8
                r8 = r7
                r7 = r2
            L64:
                com.unity3d.services.core.network.model.HttpResponse r8 = (com.unity3d.services.core.network.model.HttpResponse) r8     // Catch: java.lang.Exception -> L31
                java.lang.Object r1 = r8.getBody()     // Catch: java.lang.Exception -> L31
                boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Exception -> L31
                if (r2 == 0) goto L71
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L31
                goto L81
            L71:
                boolean r2 = r1 instanceof byte[]     // Catch: java.lang.Exception -> L31
                if (r2 == 0) goto L80
                java.lang.String r2 = new java.lang.String     // Catch: java.lang.Exception -> L31
                byte[] r1 = (byte[]) r1     // Catch: java.lang.Exception -> L31
                java.nio.charset.Charset r3 = Za.c.b     // Catch: java.lang.Exception -> L31
                r2.<init>(r1, r3)     // Catch: java.lang.Exception -> L31
                r1 = r2
                goto L81
            L80:
                r1 = 0
            L81:
                com.unity3d.ads.adplayer.model.OnWebRequestComplete r2 = new com.unity3d.ads.adplayer.model.OnWebRequestComplete     // Catch: java.lang.Exception -> L31
                java.lang.String r3 = r8.getUrlString()     // Catch: java.lang.Exception -> L31
                int r4 = r8.getStatusCode()     // Catch: java.lang.Exception -> L31
                java.lang.Integer r4 = Ia.b.d(r4)     // Catch: java.lang.Exception -> L31
                java.util.Map r8 = r8.getHeaders()     // Catch: java.lang.Exception -> L31
                org.json.JSONArray r8 = com.unity3d.services.core.network.mapper.HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(r8)     // Catch: java.lang.Exception -> L31
                java.lang.Object[] r8 = new java.lang.Object[]{r0, r3, r1, r4, r8}     // Catch: java.lang.Exception -> L31
                java.util.List r8 = Da.v.q(r8)     // Catch: java.lang.Exception -> L31
                r2.<init>(r8)     // Catch: java.lang.Exception -> L31
                goto Lbc
            La3:
                r7 = move-exception
                r0 = r8
                r8 = r7
                r7 = r2
            La7:
                com.unity3d.ads.adplayer.model.OnWebRequestFailed r2 = new com.unity3d.ads.adplayer.model.OnWebRequestFailed
                java.lang.String r8 = r8.getMessage()
                if (r8 != 0) goto Lb1
                java.lang.String r8 = ""
            Lb1:
                java.lang.String[] r7 = new java.lang.String[]{r0, r7, r8}
                java.util.List r7 = Da.v.q(r7)
                r2.<init>(r7)
            Lbc:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.request.1.invoke(java.lang.Object[], Ga.e):java.lang.Object");
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ SendDiagnosticEvent $sendDiagnosticEvent;

        public 1(SendDiagnosticEvent sendDiagnosticEvent, AdObject adObject) {
            this.$sendDiagnosticEvent = sendDiagnosticEvent;
            this.$adObject = adObject;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            String obj;
            Object obj2 = objArr[0];
            t.e(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = objArr[1];
            t.e(obj3, "null cannot be cast to non-null type org.json.JSONObject");
            JSONObject jSONObject = (JSONObject) obj3;
            Map c = Q.c();
            Iterator keys = jSONObject.keys();
            t.f(keys, "tags.keys()");
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                c.put(str2, jSONObject.getString(str2));
            }
            Map b = Q.b(c);
            Object b0 = r.b0(objArr, 2);
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.$sendDiagnosticEvent, str, (b0 == null || (obj = b0.toString()) == null) ? null : Ia.b.b(Double.parseDouble(obj)), b, null, this.$adObject, null, 40, null);
            return I.a;
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ GetOperativeEventApi $getOperativeEventApi;

        public 1(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
            this.$getOperativeEventApi = getOperativeEventApi;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r6, Ga.e r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r7
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Ca.t.b(r7)
                goto L5b
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                Ca.t.b(r7)
                gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType r7 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER
                r2 = 0
                r6 = r6[r2]
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
                kotlin.jvm.internal.t.e(r6, r2)
                java.lang.String r6 = (java.lang.String) r6
                r2 = 2
                byte[] r6 = android.util.Base64.decode(r6, r2)
                java.lang.String r2 = "decode(it[0] as String, Base64.NO_WRAP)"
                kotlin.jvm.internal.t.f(r6, r2)
                com.google.protobuf.ByteString r6 = com.google.protobuf.kotlin.ByteStringsKt.toByteString(r6)
                com.unity3d.ads.core.domain.events.GetOperativeEventApi r2 = r5.$getOperativeEventApi
                com.unity3d.ads.core.data.model.AdObject r4 = r5.$adObject
                r0.label = r3
                java.lang.Object r6 = r2.invoke(r7, r4, r6, r0)
                if (r6 != r1) goto L5b
                return r1
            L5b:
                Ca.I r6 = Ca.I.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.sendOperativeEvent.1.invoke(java.lang.Object[], Ga.e):java.lang.Object");
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ SendPrivacyUpdateRequest $sendPrivacyUpdateRequest;

        public 1(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
            this.$sendPrivacyUpdateRequest = sendPrivacyUpdateRequest;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r10, Ga.e r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r11
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1
                r0.<init>(r9, r11)
            L18:
                java.lang.Object r11 = r0.result
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.label
                r3 = 0
                java.lang.String r4 = "version"
                java.lang.String r5 = "content"
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L37
                if (r2 != r7) goto L2f
                Ca.t.b(r11)
                goto L5f
            L2f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L37:
                Ca.t.b(r11)
                r10 = r10[r6]
                java.lang.String r11 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.t.e(r10, r11)
                org.json.JSONObject r10 = (org.json.JSONObject) r10
                java.lang.String r11 = r10.optString(r5)
                int r10 = r10.optInt(r4)
                com.unity3d.ads.core.domain.SendPrivacyUpdateRequest r2 = r9.$sendPrivacyUpdateRequest
                java.lang.String r8 = "privacyUpdateContentBase64"
                kotlin.jvm.internal.t.f(r11, r8)
                com.google.protobuf.ByteString r11 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r11, r6, r7, r3)
                r0.label = r7
                java.lang.Object r11 = r2.invoke(r10, r11, r0)
                if (r11 != r1) goto L5f
                return r1
            L5f:
                gatewayprotocol.v1.PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse r11 = (gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) r11
                java.util.Map r10 = Da.Q.c()
                int r0 = r11.getVersion()
                java.lang.Integer r0 = Ia.b.d(r0)
                r10.put(r4, r0)
                com.google.protobuf.ByteString r11 = r11.getContent()
                java.lang.String r0 = "response.content"
                kotlin.jvm.internal.t.f(r11, r0)
                java.lang.String r11 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r11, r6, r7, r3)
                r10.put(r5, r11)
                java.util.Map r10 = Da.Q.b(r10)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.sendPrivacyUpdateRequest.1.invoke(java.lang.Object[], Ga.e):java.lang.Object");
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ DeviceInfoRepository $deviceInfoRepository;

        public 1(DeviceInfoRepository deviceInfoRepository) {
            this.$deviceInfoRepository = deviceInfoRepository;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            Object value;
            AllowedPiiKt.Dsl _create;
            Object obj = objArr[0];
            t.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
            JSONObject jSONObject = (JSONObject) obj;
            z allowedPii = this.$deviceInfoRepository.getAllowedPii();
            do {
                value = allowedPii.getValue();
                AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
                GeneratedMessageLite.Builder builder = ((AllowedPiiOuterClass.AllowedPii) value).toBuilder();
                t.f(builder, "this.toBuilder()");
                _create = companion._create((AllowedPiiOuterClass.AllowedPii.Builder) builder);
                Object opt = jSONObject.opt("idfa");
                Boolean bool = opt instanceof Boolean ? (Boolean) opt : null;
                if (bool != null) {
                    new CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$2(_create).set(Ia.b.a(bool.booleanValue()));
                }
                Object opt2 = jSONObject.opt("idfv");
                Boolean bool2 = opt2 instanceof Boolean ? (Boolean) opt2 : null;
                if (bool2 != null) {
                    new CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$4(_create).set(Ia.b.a(bool2.booleanValue()));
                }
                Object opt3 = jSONObject.opt("appset_id");
                Boolean bool3 = opt3 instanceof Boolean ? (Boolean) opt3 : null;
                if (bool3 != null) {
                    new CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$6(_create).set(Ia.b.a(bool3.booleanValue()));
                }
            } while (!allowedPii.e(value, _create._build()));
            return I.a;
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;

        public 1(AdObject adObject) {
            this.$adObject = adObject;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            Object obj = objArr[0];
            t.e(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            z ttl = this.$adObject.getTtl();
            b.a aVar = ab.b.b;
            ttl.setValue(ab.b.f(d.s(intValue, ab.e.e)));
            return I.a;
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;

        public 1(AdObject adObject) {
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r7, Ga.e r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r8
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Ca.t.b(r8)
                goto L65
            L29:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L31:
                Ca.t.b(r8)
                r8 = 0
                r7 = r7[r8]
                java.lang.String r8 = "null cannot be cast to non-null type kotlin.Int"
                kotlin.jvm.internal.t.e(r7, r8)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$Companion r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.Companion
                fb.y r8 = r8.getDisplayMessages()
                com.unity3d.ads.adplayer.DisplayMessage$SetOrientation r2 = new com.unity3d.ads.adplayer.DisplayMessage$SetOrientation
                com.unity3d.ads.core.data.model.AdObject r4 = r6.$adObject
                com.google.protobuf.ByteString r4 = r4.getOpportunityId()
                java.lang.String r4 = r4.toStringUtf8()
                java.lang.String r5 = "adObject.opportunityId.toStringUtf8()"
                kotlin.jvm.internal.t.f(r4, r5)
                r2.<init>(r4, r7)
                r0.label = r3
                java.lang.Object r7 = r8.emit(r2, r0)
                if (r7 != r1) goto L65
                return r1
            L65:
                Ca.I r7 = Ca.I.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setOrientation.1.invoke(java.lang.Object[], Ga.e):java.lang.Object");
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public 1(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r5, Ga.e r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Ca.t.b(r6)
                goto L57
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                Ca.t.b(r6)
                com.unity3d.ads.core.data.repository.SessionRepository r6 = r4.$sessionRepository
                r2 = 0
                r5 = r5[r2]
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
                kotlin.jvm.internal.t.e(r5, r2)
                java.lang.String r5 = (java.lang.String) r5
                r2 = 2
                byte[] r5 = android.util.Base64.decode(r5, r2)
                java.lang.String r2 = "decode(it[0] as String, Base64.NO_WRAP)"
                kotlin.jvm.internal.t.f(r5, r2)
                com.google.protobuf.ByteString r5 = com.google.protobuf.kotlin.ByteStringsKt.toByteString(r5)
                r0.label = r3
                java.lang.Object r5 = r6.setPrivacy(r5, r0)
                if (r5 != r1) goto L57
                return r1
            L57:
                Ca.I r5 = Ca.I.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setPrivacy.1.invoke(java.lang.Object[], Ga.e):java.lang.Object");
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public 1(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r5, Ga.e r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Ca.t.b(r6)
                goto L57
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                Ca.t.b(r6)
                com.unity3d.ads.core.data.repository.SessionRepository r6 = r4.$sessionRepository
                r2 = 0
                r5 = r5[r2]
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
                kotlin.jvm.internal.t.e(r5, r2)
                java.lang.String r5 = (java.lang.String) r5
                r2 = 2
                byte[] r5 = android.util.Base64.decode(r5, r2)
                java.lang.String r2 = "decode(it[0] as String, Base64.NO_WRAP)"
                kotlin.jvm.internal.t.f(r5, r2)
                com.google.protobuf.ByteString r5 = com.google.protobuf.kotlin.ByteStringsKt.toByteString(r5)
                r0.label = r3
                java.lang.Object r5 = r6.setPrivacyFsm(r5, r0)
                if (r5 != r1) goto L57
                return r1
            L57:
                Ca.I r5 = Ca.I.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setPrivacyFsm.1.invoke(java.lang.Object[], Ga.e):java.lang.Object");
        }
    }

    public static final class 1 implements ExposedFunction {
        public static final 1 INSTANCE = new 1();

        public final Object invoke(Object[] objArr, e eVar) {
            k kVar = new k(Ha.b.c(eVar));
            Object obj = objArr[0];
            t.e(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = objArr[1];
            t.e(obj2, "null cannot be cast to non-null type kotlin.String");
            Storage.set((String) obj, (String) obj2, objArr[2], new ContinuationFromCallback(kVar));
            Object a = kVar.a();
            if (a == c.f()) {
                h.c(eVar);
            }
            return a;
        }
    }

    public static final class 1 implements ExposedFunction {
        public static final 1 INSTANCE = new 1();

        public final Object invoke(Object[] objArr, e eVar) {
            return I.a;
        }
    }

    public static final class 1 implements ExposedFunction {
        public static final 1 INSTANCE = new 1();

        public final Object invoke(Object[] objArr, e eVar) {
            return I.a;
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ CampaignRepository $campaignRepository;

        public 1(AdObject adObject, CampaignRepository campaignRepository) {
            this.$adObject = adObject;
            this.$campaignRepository = campaignRepository;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r7, Ga.e r8) {
            /*
                r6 = this;
                java.lang.Object r7 = Da.r.V(r7)
                boolean r8 = r7 instanceof org.json.JSONObject
                r0 = 0
                if (r8 == 0) goto Lc
                org.json.JSONObject r7 = (org.json.JSONObject) r7
                goto Ld
            Lc:
                r7 = r0
            Ld:
                if (r7 == 0) goto Lab
                java.lang.String r8 = "data"
                java.lang.String r1 = r7.optString(r8)
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L22
                boolean r4 = Za.E.h0(r1)
                if (r4 == 0) goto L20
                goto L22
            L20:
                r4 = r3
                goto L23
            L22:
                r4 = r2
            L23:
                if (r4 != 0) goto La3
                java.lang.String r4 = "dataVersion"
                int r7 = r7.optInt(r4)
                if (r7 == 0) goto L9b
                com.unity3d.ads.core.data.model.AdObject r4 = r6.$adObject
                com.google.protobuf.ByteString r4 = r4.getOpportunityId()
                com.unity3d.ads.core.data.model.AdObject r5 = r6.$adObject
                java.lang.String r5 = r5.getPlacementId()
                kotlin.jvm.internal.t.f(r1, r8)
                com.google.protobuf.ByteString r8 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r1, r3, r2, r0)
                boolean r0 = r8.isEmpty()
                if (r0 != 0) goto L93
                com.unity3d.ads.core.data.repository.CampaignRepository r0 = r6.$campaignRepository
                gatewayprotocol.v1.CampaignStateOuterClass$Campaign r0 = r0.getCampaign(r4)
                if (r0 == 0) goto L6c
                gatewayprotocol.v1.CampaignKt$Dsl$Companion r1 = gatewayprotocol.v1.CampaignKt.Dsl.Companion
                com.google.protobuf.GeneratedMessageLite$Builder r0 = r0.toBuilder()
                java.lang.String r2 = "this.toBuilder()"
                kotlin.jvm.internal.t.f(r0, r2)
                gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder r0 = (gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder) r0
                gatewayprotocol.v1.CampaignKt$Dsl r0 = r1._create(r0)
                r0.setData(r8)
                r0.setDataVersion(r7)
                gatewayprotocol.v1.CampaignStateOuterClass$Campaign r0 = r0._build()
                if (r0 == 0) goto L6c
                goto L8b
            L6c:
                gatewayprotocol.v1.CampaignKt$Dsl$Companion r0 = gatewayprotocol.v1.CampaignKt.Dsl.Companion
                gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder r1 = gatewayprotocol.v1.CampaignStateOuterClass.Campaign.newBuilder()
                java.lang.String r2 = "newBuilder()"
                kotlin.jvm.internal.t.f(r1, r2)
                gatewayprotocol.v1.CampaignKt$Dsl r0 = r0._create(r1)
                r0.setData(r8)
                r0.setDataVersion(r7)
                r0.setPlacementId(r5)
                r0.setImpressionOpportunityId(r4)
                gatewayprotocol.v1.CampaignStateOuterClass$Campaign r0 = r0._build()
            L8b:
                com.unity3d.ads.core.data.repository.CampaignRepository r7 = r6.$campaignRepository
                r7.setCampaign(r4, r0)
                Ca.I r7 = Ca.I.a
                return r7
            L93:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r8 = "Update campaign state requires a non-empty data byte string"
                r7.<init>(r8)
                throw r7
            L9b:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r8 = "Update campaign state requires a dataVersion integer"
                r7.<init>(r8)
                throw r7
            La3:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r8 = "Update campaign state requires a data string"
                r7.<init>(r8)
                throw r7
            Lab:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r8 = "Update campaign state requires a JSONObject"
                r7.<init>(r8)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.updateCampaignState.1.invoke(java.lang.Object[], Ga.e):java.lang.Object");
        }
    }

    public static final class 1 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;

        public 1(AdObject adObject) {
            this.$adObject = adObject;
        }

        public final Object invoke(Object[] objArr, e eVar) {
            Object obj = objArr[0];
            t.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
            String token = ((JSONObject) obj).optString("trackingToken");
            if (token != null && token.length() != 0) {
                AdObject adObject = this.$adObject;
                t.f(token, "token");
                adObject.setTrackingToken(ProtobufExtensionsKt.fromBase64$default(token, false, 1, null));
            }
            return I.a;
        }
    }

    public static final class 1 implements ExposedFunction {
        public static final 1 INSTANCE = new 1();

        public final Object invoke(Object[] objArr, e eVar) {
            k kVar = new k(Ha.b.c(eVar));
            Object obj = objArr[0];
            t.e(obj, "null cannot be cast to non-null type kotlin.String");
            Storage.write((String) obj, new ContinuationFromCallback(kVar));
            Object a = kVar.a();
            if (a == c.f()) {
                h.c(eVar);
            }
            return a;
        }
    }

    public static final ExposedFunction attributionRegisterClick(AndroidAttribution androidAttribution, AdObject adObject) {
        t.g(androidAttribution, "androidAttribution");
        t.g(adObject, "adObject");
        return new 1(androidAttribution, adObject);
    }

    public static final ExposedFunction attributionRegisterView(AndroidAttribution androidAttribution, AdObject adObject) {
        t.g(androidAttribution, "androidAttribution");
        t.g(adObject, "adObject");
        return new 1(androidAttribution, adObject);
    }

    public static final ExposedFunction clearStorage() {
        return 1.INSTANCE;
    }

    public static final ExposedFunction deleteStorage() {
        return 1.INSTANCE;
    }

    public static final ExposedFunction download(CacheFile cacheFile, AdObject adObject) {
        t.g(cacheFile, "cacheFile");
        t.g(adObject, "adObject");
        return new 1(cacheFile, adObject);
    }

    public static final ExposedFunction getAdContext-yLuu4LI(AndroidGetAdPlayerContext getAndroidAdPlayerContext, String adData, String impressionConfig, String adDataRefreshToken, IsOMActivated isOMActivated, AdObject adObject) {
        t.g(getAndroidAdPlayerContext, "getAndroidAdPlayerContext");
        t.g(adData, "adData");
        t.g(impressionConfig, "impressionConfig");
        t.g(adDataRefreshToken, "adDataRefreshToken");
        t.g(isOMActivated, "isOMActivated");
        t.g(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$getAdContext$1(adData, impressionConfig, adDataRefreshToken, getAndroidAdPlayerContext, adObject, isOMActivated);
    }

    public static final ExposedFunction getAllowedPii(DeviceInfoRepository deviceInfoRepository) {
        t.g(deviceInfoRepository, "deviceInfoRepository");
        return new 1(deviceInfoRepository);
    }

    public static final ExposedFunction getConnectionType(DeviceInfoRepository deviceInfoRepository) {
        t.g(deviceInfoRepository, "deviceInfoRepository");
        return new 1(deviceInfoRepository);
    }

    public static final ExposedFunction getDeviceMaxVolume(DeviceInfoRepository deviceInfoRepository) {
        t.g(deviceInfoRepository, "deviceInfoRepository");
        return new 1(deviceInfoRepository);
    }

    public static final ExposedFunction getDeviceVolume(DeviceInfoRepository deviceInfoRepository) {
        t.g(deviceInfoRepository, "deviceInfoRepository");
        return new 1(deviceInfoRepository);
    }

    public static final ExposedFunction getKeysStorage() {
        return 1.INSTANCE;
    }

    public static final ExposedFunction getPrivacy(SessionRepository sessionRepository) {
        t.g(sessionRepository, "sessionRepository");
        return new 1(sessionRepository);
    }

    public static final ExposedFunction getPrivacyFsm(SessionRepository sessionRepository) {
        t.g(sessionRepository, "sessionRepository");
        return new 1(sessionRepository);
    }

    public static final ExposedFunction getScreenHeight(DeviceInfoRepository deviceInfoRepository) {
        t.g(deviceInfoRepository, "deviceInfoRepository");
        return new 1(deviceInfoRepository);
    }

    public static final ExposedFunction getScreenWidth(DeviceInfoRepository deviceInfoRepository) {
        t.g(deviceInfoRepository, "deviceInfoRepository");
        return new 1(deviceInfoRepository);
    }

    public static final ExposedFunction getSessionToken(SessionRepository sessionRepository) {
        t.g(sessionRepository, "sessionRepository");
        return new 1(sessionRepository);
    }

    public static final ExposedFunction getStorage() {
        return 1.INSTANCE;
    }

    public static final ExposedFunction hbTokenIncrementStarts(SessionRepository sessionRepository) {
        t.g(sessionRepository, "sessionRepository");
        return new 1(sessionRepository);
    }

    public static final ExposedFunction hbTokenIncrementWins(SessionRepository sessionRepository) {
        t.g(sessionRepository, "sessionRepository");
        return new 1(sessionRepository);
    }

    public static final ExposedFunction hbTokenReset(SessionRepository sessionRepository) {
        t.g(sessionRepository, "sessionRepository");
        return new 1(sessionRepository);
    }

    public static final ExposedFunction incrementBannerImpressionCount(SessionRepository sessionRepository) {
        t.g(sessionRepository, "sessionRepository");
        return new 1(sessionRepository);
    }

    public static final ExposedFunction isAttributionAvailable(AndroidAttribution androidAttribution) {
        t.g(androidAttribution, "androidAttribution");
        return new 1(androidAttribution);
    }

    public static final ExposedFunction isFileCached(GetIsFileCache getIfFileCache) {
        t.g(getIfFileCache, "getIfFileCache");
        return new 1(getIfFileCache);
    }

    public static final ExposedFunction isOfferwallAdReady(GetIsOfferwallAdReady getIsOfferwallAdReady) {
        t.g(getIsOfferwallAdReady, "getIsOfferwallAdReady");
        return new 1(getIsOfferwallAdReady);
    }

    public static final ExposedFunction loadOfferwallAd(LoadOfferwallAd loadOfferwallAd, AdObject adObject) {
        t.g(loadOfferwallAd, "loadOfferwallAd");
        t.g(adObject, "adObject");
        return new 1(adObject, loadOfferwallAd);
    }

    public static final ExposedFunction loadScarAd(LoadScarAd loadScarAd, AdObject adObject) {
        t.g(loadScarAd, "loadScarAd");
        t.g(adObject, "adObject");
        return new 1(adObject, loadScarAd);
    }

    public static final ExposedFunction markCampaignStateShown(CampaignRepository campaignRepository, AdObject adObject) {
        t.g(campaignRepository, "campaignRepository");
        t.g(adObject, "adObject");
        return new 1(campaignRepository, adObject);
    }

    public static final ExposedFunction omFinishSession(OmFinishSession omFinishSession, AdObject adObject) {
        t.g(omFinishSession, "omFinishSession");
        t.g(adObject, "adObject");
        return new 1(omFinishSession, adObject);
    }

    public static final ExposedFunction omGetData(GetOmData getOmData) {
        t.g(getOmData, "getOmData");
        return new 1(getOmData);
    }

    public static final ExposedFunction omImpression(OmImpressionOccurred omImpressionOccurred, AdObject adObject) {
        t.g(omImpressionOccurred, "omImpressionOccurred");
        t.g(adObject, "adObject");
        return new 1(omImpressionOccurred, adObject);
    }

    public static final ExposedFunction omStartSession(AndroidOmInteraction omStartSession, AdObject adObject) {
        t.g(omStartSession, "omStartSession");
        t.g(adObject, "adObject");
        return new 1(omStartSession, adObject);
    }

    public static final ExposedFunction openUrl(HandleOpenUrl handleOpenUrl) {
        t.g(handleOpenUrl, "handleOpenUrl");
        return new 1(handleOpenUrl);
    }

    public static final ExposedFunction readStorage() {
        return 1.INSTANCE;
    }

    public static final ExposedFunction refreshAdData(Refresh refresh, AdObject adObject) {
        t.g(refresh, "refresh");
        t.g(adObject, "adObject");
        return new 1(refresh, adObject);
    }

    public static final ExposedFunction request(RequestType type, ExecuteAdViewerRequest executeAdViewerRequest) {
        t.g(type, "type");
        t.g(executeAdViewerRequest, "executeAdViewerRequest");
        return new 1(executeAdViewerRequest, type);
    }

    public static final ExposedFunction sendDiagnosticEvent(SendDiagnosticEvent sendDiagnosticEvent, AdObject adObject) {
        t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        t.g(adObject, "adObject");
        return new 1(sendDiagnosticEvent, adObject);
    }

    public static final ExposedFunction sendOperativeEvent(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
        t.g(getOperativeEventApi, "getOperativeEventApi");
        t.g(adObject, "adObject");
        return new 1(getOperativeEventApi, adObject);
    }

    public static final ExposedFunction sendPrivacyUpdateRequest(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        t.g(sendPrivacyUpdateRequest, "sendPrivacyUpdateRequest");
        return new 1(sendPrivacyUpdateRequest);
    }

    public static final ExposedFunction setAllowedPii(DeviceInfoRepository deviceInfoRepository) {
        t.g(deviceInfoRepository, "deviceInfoRepository");
        return new 1(deviceInfoRepository);
    }

    public static final ExposedFunction setOpportunityTTL(AdObject adObject) {
        t.g(adObject, "adObject");
        return new 1(adObject);
    }

    public static final ExposedFunction setOrientation(AdObject adObject) {
        t.g(adObject, "adObject");
        return new 1(adObject);
    }

    public static final ExposedFunction setPrivacy(SessionRepository sessionRepository) {
        t.g(sessionRepository, "sessionRepository");
        return new 1(sessionRepository);
    }

    public static final ExposedFunction setPrivacyFsm(SessionRepository sessionRepository) {
        t.g(sessionRepository, "sessionRepository");
        return new 1(sessionRepository);
    }

    public static final ExposedFunction setStorage() {
        return 1.INSTANCE;
    }

    public static final ExposedFunction showOfferwallAd() {
        return 1.INSTANCE;
    }

    public static final ExposedFunction showScarAd() {
        return 1.INSTANCE;
    }

    public static final ExposedFunction updateCampaignState(CampaignRepository campaignRepository, AdObject adObject) {
        t.g(campaignRepository, "campaignRepository");
        t.g(adObject, "adObject");
        return new 1(adObject, campaignRepository);
    }

    public static final ExposedFunction updateTrackingToken(AdObject adObject) {
        t.g(adObject, "adObject");
        return new 1(adObject);
    }

    public static final ExposedFunction writeStorage() {
        return 1.INSTANCE;
    }
}
