package com.unity3d.ads.core.domain;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;
import Ia.l;
import Qa.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidHandleGatewayAdResponse implements HandleGatewayAdResponse {
    private final AdPlayerScope adPlayerScope;
    private final AdRepository adRepository;
    private final CacheWebViewAssets cacheWebViewAssets;
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetAdPlayer getAdPlayer;
    private final HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer;
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;
    private final GetOperativeEventApi getOperativeEventApi;
    private final GetWebViewBridgeUseCase getWebViewBridge;
    private final AndroidGetWebViewContainerUseCase getWebViewContainerUseCase;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @f(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", l = {236, 242}, m = "cleanup")
    public static final class 1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHandleGatewayAdResponse.access$cleanup(AndroidHandleGatewayAdResponse.this, null, null, null, null, this);
        }
    }

    @f(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", l = {97, 114, 145, 188, 192, 218}, m = "invoke")
    public static final class 1 extends d {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHandleGatewayAdResponse.this.invoke(null, null, null, null, null, null, false, this);
        }
    }

    @f(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2", f = "AndroidHandleGatewayAdResponse.kt", l = {162}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ O $adPlayer;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(O o, e eVar) {
            super(2, eVar);
            this.$adPlayer = o;
        }

        public final e create(Object obj, e eVar) {
            2 r0 = new 2(this.$adPlayer, eVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(AllowedPiiOuterClass.AllowedPii allowedPii, e eVar) {
            return ((2) create(allowedPii, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                AllowedPiiOuterClass.AllowedPii allowedPii = (AllowedPiiOuterClass.AllowedPii) this.L$0;
                AdPlayer adPlayer = (AdPlayer) this.$adPlayer.a;
                byte[] byteArray = allowedPii.toByteArray();
                kotlin.jvm.internal.t.f(byteArray, "it.toByteArray()");
                this.label = 1;
                if (adPlayer.onAllowedPiiChange(byteArray, this) == f) {
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

    @f(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3", f = "AndroidHandleGatewayAdResponse.kt", l = {176}, m = "invokeSuspend")
    public static final class 3 extends l implements Qa.l {
        final /* synthetic */ AdObject $tmpAdObject;
        final /* synthetic */ String $webViewUrl;
        final /* synthetic */ AndroidWebViewContainer $webviewContainer;
        long J$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(AndroidWebViewContainer androidWebViewContainer, String str, AdObject adObject, e eVar) {
            super(1, eVar);
            this.$webviewContainer = androidWebViewContainer;
            this.$webViewUrl = str;
            this.$tmpAdObject = adObject;
        }

        public final e create(e eVar) {
            return AndroidHandleGatewayAdResponse.this.new 3(this.$webviewContainer, this.$webViewUrl, this.$tmpAdObject, eVar);
        }

        public final Object invoke(e eVar) {
            return ((3) create(eVar)).invokeSuspend(I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = Ha.c.f()
                int r1 = r12.label
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                long r0 = r12.J$0
                Ca.t.b(r13)     // Catch: java.lang.Throwable -> L11
                goto L36
            L11:
                r13 = move-exception
                goto L3f
            L13:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1b:
                Ca.t.b(r13)
                com.unity3d.ads.adplayer.AndroidWebViewContainer r13 = r12.$webviewContainer
                java.lang.String r1 = r12.$webViewUrl
                ab.k r3 = ab.k.a
                long r3 = r3.b()
                Ca.s$a r5 = Ca.s.b     // Catch: java.lang.Throwable -> L3d
                r12.J$0 = r3     // Catch: java.lang.Throwable -> L3d
                r12.label = r2     // Catch: java.lang.Throwable -> L3d
                java.lang.Object r13 = r13.loadUrl(r1, r12)     // Catch: java.lang.Throwable -> L3d
                if (r13 != r0) goto L35
                return r0
            L35:
                r0 = r3
            L36:
                Ca.I r13 = Ca.I.a     // Catch: java.lang.Throwable -> L11
                java.lang.Object r13 = Ca.s.b(r13)     // Catch: java.lang.Throwable -> L11
                goto L49
            L3d:
                r13 = move-exception
                r0 = r3
            L3f:
                Ca.s$a r2 = Ca.s.b
                java.lang.Object r13 = Ca.t.a(r13)
                java.lang.Object r13 = Ca.s.b(r13)
            L49:
                Ca.s r13 = Ca.s.a(r13)
                ab.m r2 = new ab.m
                long r0 = ab.k.a.e(r0)
                r3 = 0
                r2.<init>(r13, r0, r3)
                com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r13 = com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.this
                com.unity3d.ads.core.data.model.AdObject r8 = r12.$tmpAdObject
                java.lang.Object r0 = r2.a()
                Ca.s r0 = (Ca.s) r0
                java.lang.Object r0 = r0.j()
                long r1 = r2.b()
                com.unity3d.ads.core.domain.SendDiagnosticEvent r3 = com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getSendDiagnosticEvent$p(r13)
                boolean r13 = Ca.s.h(r0)
                if (r13 == 0) goto L77
                java.lang.String r13 = "native_load_file_task_success_time"
            L75:
                r4 = r13
                goto L7a
            L77:
                java.lang.String r13 = "native_load_file_task_failure_time"
                goto L75
            L7a:
                ab.e r13 = ab.e.d
                double r1 = ab.b.H(r1, r13)
                java.lang.Double r5 = Ia.b.b(r1)
                r10 = 44
                r11 = 0
                r6 = 0
                r7 = 0
                r9 = 0
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                Ca.t.b(r0)
                Ca.I r13 = Ca.I.a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke.3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @f(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4", f = "AndroidHandleGatewayAdResponse.kt", l = {193}, m = "invokeSuspend")
    public static final class 4 extends l implements p {
        final /* synthetic */ O $adPlayer;
        final /* synthetic */ LoadEvent $loadEvent;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ AdResponseOuterClass.AdResponse $response;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(LoadEvent loadEvent, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, O o, e eVar) {
            super(2, eVar);
            this.$loadEvent = loadEvent;
            this.$opportunityId = byteString;
            this.$response = adResponse;
            this.$adPlayer = o;
        }

        public final e create(Object obj, e eVar) {
            return AndroidHandleGatewayAdResponse.this.new 4(this.$loadEvent, this.$opportunityId, this.$response, this.$adPlayer, eVar);
        }

        public final Object invoke(cb.O o, e eVar) {
            return ((4) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = AndroidHandleGatewayAdResponse.this;
                Error error = new Error(((LoadEvent.Error) this.$loadEvent).getMessage());
                ByteString byteString = this.$opportunityId;
                AdResponseOuterClass.AdResponse adResponse = this.$response;
                AdPlayer adPlayer = (AdPlayer) this.$adPlayer.a;
                this.label = 1;
                if (AndroidHandleGatewayAdResponse.access$cleanup(androidHandleGatewayAdResponse, error, byteString, adResponse, adPlayer, this) == f) {
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

    @f(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5", f = "AndroidHandleGatewayAdResponse.kt", l = {219}, m = "invokeSuspend")
    public static final class 5 extends l implements p {
        final /* synthetic */ O $adPlayer;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ AdResponseOuterClass.AdResponse $response;
        final /* synthetic */ CancellationException $t;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 5(CancellationException cancellationException, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, O o, e eVar) {
            super(2, eVar);
            this.$t = cancellationException;
            this.$opportunityId = byteString;
            this.$response = adResponse;
            this.$adPlayer = o;
        }

        public final e create(Object obj, e eVar) {
            return AndroidHandleGatewayAdResponse.this.new 5(this.$t, this.$opportunityId, this.$response, this.$adPlayer, eVar);
        }

        public final Object invoke(cb.O o, e eVar) {
            return ((5) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = AndroidHandleGatewayAdResponse.this;
                CancellationException cancellationException = this.$t;
                ByteString byteString = this.$opportunityId;
                AdResponseOuterClass.AdResponse adResponse = this.$response;
                AdPlayer adPlayer = (AdPlayer) this.$adPlayer.a;
                this.label = 1;
                if (AndroidHandleGatewayAdResponse.access$cleanup(androidHandleGatewayAdResponse, cancellationException, byteString, adResponse, adPlayer, this) == f) {
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

    public AndroidHandleGatewayAdResponse(AdRepository adRepository, AndroidGetWebViewContainerUseCase getWebViewContainerUseCase, GetWebViewBridgeUseCase getWebViewBridge, DeviceInfoRepository deviceInfoRepository, HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer, CampaignRepository campaignRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetLatestWebViewConfiguration getLatestWebViewConfiguration, AdPlayerScope adPlayerScope, GetAdPlayer getAdPlayer, CacheWebViewAssets cacheWebViewAssets) {
        kotlin.jvm.internal.t.g(adRepository, "adRepository");
        kotlin.jvm.internal.t.g(getWebViewContainerUseCase, "getWebViewContainerUseCase");
        kotlin.jvm.internal.t.g(getWebViewBridge, "getWebViewBridge");
        kotlin.jvm.internal.t.g(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.t.g(getHandleInvocationsFromAdViewer, "getHandleInvocationsFromAdViewer");
        kotlin.jvm.internal.t.g(campaignRepository, "campaignRepository");
        kotlin.jvm.internal.t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.t.g(getOperativeEventApi, "getOperativeEventApi");
        kotlin.jvm.internal.t.g(getLatestWebViewConfiguration, "getLatestWebViewConfiguration");
        kotlin.jvm.internal.t.g(adPlayerScope, "adPlayerScope");
        kotlin.jvm.internal.t.g(getAdPlayer, "getAdPlayer");
        kotlin.jvm.internal.t.g(cacheWebViewAssets, "cacheWebViewAssets");
        this.adRepository = adRepository;
        this.getWebViewContainerUseCase = getWebViewContainerUseCase;
        this.getWebViewBridge = getWebViewBridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getHandleInvocationsFromAdViewer = getHandleInvocationsFromAdViewer;
        this.campaignRepository = campaignRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
        this.adPlayerScope = adPlayerScope;
        this.getAdPlayer = getAdPlayer;
        this.cacheWebViewAssets = cacheWebViewAssets;
    }

    public static final /* synthetic */ Object access$cleanup(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, Throwable th, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, AdPlayer adPlayer, e eVar) {
        return androidHandleGatewayAdResponse.cleanup(th, byteString, adResponse, adPlayer, eVar);
    }

    public static final /* synthetic */ SendDiagnosticEvent access$getSendDiagnosticEvent$p(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse) {
        return androidHandleGatewayAdResponse.sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object cleanup(java.lang.Throwable r16, com.google.protobuf.ByteString r17, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r18, com.unity3d.ads.adplayer.AdPlayer r19, Ga.e r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.cleanup.1
            if (r2 == 0) goto L16
            r2 = r1
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1 r2 = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.cleanup.1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
            goto L1b
        L16:
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1 r2 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.result
            java.lang.Object r13 = Ha.c.f()
            int r3 = r2.label
            r14 = 2
            r4 = 1
            if (r3 == 0) goto L41
            if (r3 == r4) goto L38
            if (r3 != r14) goto L30
            Ca.t.b(r1)
            goto Lad
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            java.lang.Object r3 = r2.L$0
            com.unity3d.ads.adplayer.AdPlayer r3 = (com.unity3d.ads.adplayer.AdPlayer) r3
            Ca.t.b(r1)
            r1 = r3
            goto L9f
        L41:
            Ca.t.b(r1)
            gatewayprotocol.v1.OperativeEventErrorDataKt$Dsl$Companion r1 = gatewayprotocol.v1.OperativeEventErrorDataKt.Dsl.Companion
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder r3 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder()
            java.lang.String r5 = "newBuilder()"
            kotlin.jvm.internal.t.f(r3, r5)
            gatewayprotocol.v1.OperativeEventErrorDataKt$Dsl r1 = r1._create(r3)
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType r3 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED
            r1.setErrorType(r3)
            java.lang.Throwable r3 = r16.getCause()
            if (r3 == 0) goto L64
            java.lang.String r3 = r3.getMessage()
            if (r3 != 0) goto L6c
        L64:
            java.lang.String r3 = r16.getMessage()
            if (r3 != 0) goto L6c
            java.lang.String r3 = ""
        L6c:
            r1.setMessage(r3)
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData r1 = r1._build()
            com.unity3d.ads.core.domain.events.GetOperativeEventApi r3 = r0.getOperativeEventApi
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType r5 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_LOAD_ERROR
            com.google.protobuf.ByteString r6 = r18.getTrackingToken()
            java.lang.String r7 = "response.trackingToken"
            kotlin.jvm.internal.t.f(r6, r7)
            com.google.protobuf.ByteString r7 = r1.toByteString()
            java.lang.String r1 = "operativeEventErrorData.toByteString()"
            kotlin.jvm.internal.t.f(r7, r1)
            r1 = r19
            r2.L$0 = r1
            r2.label = r4
            r8 = 0
            r9 = 0
            r11 = 48
            r12 = 0
            r4 = r5
            r5 = r17
            r10 = r2
            java.lang.Object r3 = com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r3 != r13) goto L9f
            return r13
        L9f:
            if (r1 == 0) goto Lb0
            r3 = 0
            r2.L$0 = r3
            r2.label = r14
            java.lang.Object r1 = r1.destroy(r2)
            if (r1 != r13) goto Lad
            return r13
        Lad:
            Ca.I r1 = Ca.I.a
            return r1
        Lb0:
            Ca.I r1 = Ca.I.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.cleanup(java.lang.Throwable, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, com.unity3d.ads.adplayer.AdPlayer, Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x023b A[Catch: CancellationException -> 0x00ee, TryCatch #11 {CancellationException -> 0x00ee, blocks: (B:91:0x02f1, B:94:0x00e8, B:96:0x0219, B:98:0x0223, B:100:0x023b, B:104:0x0253, B:107:0x025c, B:110:0x027a, B:129:0x0112, B:131:0x01c8), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0217 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x058e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0465 A[Catch: CancellationException -> 0x04d9, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x04d9, blocks: (B:40:0x045f, B:42:0x0465, B:46:0x04de, B:48:0x050d, B:50:0x0526, B:52:0x0513, B:54:0x0519, B:56:0x0521), top: B:39:0x045f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x04de A[Catch: CancellationException -> 0x04d9, TRY_ENTER, TryCatch #2 {CancellationException -> 0x04d9, blocks: (B:40:0x045f, B:42:0x0465, B:46:0x04de, B:48:0x050d, B:50:0x0526, B:52:0x0513, B:54:0x0519, B:56:0x0521), top: B:39:0x045f }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0455 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0223 A[Catch: CancellationException -> 0x00ee, TryCatch #11 {CancellationException -> 0x00ee, blocks: (B:91:0x02f1, B:94:0x00e8, B:96:0x0219, B:98:0x0223, B:100:0x023b, B:104:0x0253, B:107:0x025c, B:110:0x027a, B:129:0x0112, B:131:0x01c8), top: B:7:0x0025 }] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(com.unity3d.ads.UnityAdsLoadOptions r53, com.google.protobuf.ByteString r54, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r55, android.content.Context r56, java.lang.String r57, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r58, boolean r59, Ga.e r60) {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke(com.unity3d.ads.UnityAdsLoadOptions, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, android.content.Context, java.lang.String, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, boolean, Ga.e):java.lang.Object");
    }
}
