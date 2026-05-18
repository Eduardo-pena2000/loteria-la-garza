package com.unity3d.ads.gatewayclient;

import Ca.I;
import Ca.t;
import Ca.x;
import Da.Q;
import Da.S;
import Da.u;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;
import Ia.l;
import Qa.p;
import ab.j;
import cb.O;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import gatewayprotocol.v1.ErrorKt;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseKt;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.Map;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonGatewayClient implements GatewayClient {
    public static final int CODE_400 = 400;
    public static final int CODE_599 = 599;
    public static final int CODE_TOO_MANY_REQUESTS = 429;
    public static final Companion Companion = new Companion(null);
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_PROTOBUF = "application/x-protobuf";
    public static final String HEADER_RETRY_AFTER = "Retry-After";
    public static final String HEADER_RETRY_ATTEMPT = "X-RETRY-ATTEMPT";
    private final HandleGatewayUniversalResponse handleGatewayUniversalResponse;
    private final HttpClient httpClient;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    @f(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", l = {118}, m = "executeRequest")
    public static final class 1 extends d {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGatewayClient.access$executeRequest(CommonGatewayClient.this, null, 0, null, this);
        }
    }

    @f(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", l = {75, 81, 105}, m = "executeWithRetry")
    public static final class 1 extends d {
        int I$0;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGatewayClient.access$executeWithRetry(CommonGatewayClient.this, null, null, null, null, this);
        }
    }

    @f(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", l = {59}, m = "request")
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
            return CommonGatewayClient.this.request(null, null, null, null, this);
        }
    }

    @f(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2", f = "CommonGatewayClient.kt", l = {60}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ OperationType $operationType;
        final /* synthetic */ UniversalRequestOuterClass.UniversalRequest $request;
        final /* synthetic */ RequestPolicy $requestPolicy;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, e eVar) {
            super(2, eVar);
            this.$url = str;
            this.$request = universalRequest;
            this.$requestPolicy = requestPolicy;
            this.$operationType = operationType;
        }

        public final e create(Object obj, e eVar) {
            return CommonGatewayClient.this.new 2(this.$url, this.$request, this.$requestPolicy, this.$operationType, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                CommonGatewayClient commonGatewayClient = CommonGatewayClient.this;
                String str = this.$url;
                UniversalRequestOuterClass.UniversalRequest universalRequest = this.$request;
                RequestPolicy requestPolicy = this.$requestPolicy;
                OperationType operationType = this.$operationType;
                this.label = 1;
                obj = CommonGatewayClient.access$executeWithRetry(commonGatewayClient, str, universalRequest, requestPolicy, operationType, this);
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

    public CommonGatewayClient(HttpClient httpClient, HandleGatewayUniversalResponse handleGatewayUniversalResponse, SendDiagnosticEvent sendDiagnosticEvent, SessionRepository sessionRepository) {
        kotlin.jvm.internal.t.g(httpClient, "httpClient");
        kotlin.jvm.internal.t.g(handleGatewayUniversalResponse, "handleGatewayUniversalResponse");
        kotlin.jvm.internal.t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.t.g(sessionRepository, "sessionRepository");
        this.httpClient = httpClient;
        this.handleGatewayUniversalResponse = handleGatewayUniversalResponse;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
    }

    public static final /* synthetic */ Object access$executeRequest(CommonGatewayClient commonGatewayClient, HttpRequest httpRequest, int i, OperationType operationType, e eVar) {
        return commonGatewayClient.executeRequest(httpRequest, i, operationType, eVar);
    }

    public static final /* synthetic */ Object access$executeWithRetry(CommonGatewayClient commonGatewayClient, String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, e eVar) {
        return commonGatewayClient.executeWithRetry(str, universalRequest, requestPolicy, operationType, eVar);
    }

    private final HttpRequest buildHttpRequest(String str, Map map, RequestPolicy requestPolicy, UniversalRequestOuterClass.UniversalRequest universalRequest) {
        return new HttpRequest(str, null, RequestType.POST, universalRequest.toByteArray(), map, null, null, null, null, requestPolicy.getConnectTimeout(), requestPolicy.getReadTimeout(), requestPolicy.getWriteTimeout(), requestPolicy.getOverallTimeout(), true, null, null, 0, 115170, null);
    }

    private final long calculateDelayTime(long j, RequestPolicy requestPolicy, int i) {
        return Math.min(calculateExponentialBackoff(j, requestPolicy, i) + calculateJitter(requestPolicy.getRetryWaitBase(), requestPolicy.getRetryJitterPct()), requestPolicy.getRetryMaxInterval());
    }

    private final long calculateExponentialBackoff(long j, RequestPolicy requestPolicy, int i) {
        return i == 0 ? j : (long) (j * requestPolicy.getRetryScalingFactor());
    }

    private final long calculateJitter(int i, float f) {
        if (f == 0.0f) {
            return 0L;
        }
        long j = (long) (i * f);
        return Ua.c.a.f(-j, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object executeRequest(com.unity3d.services.core.network.model.HttpRequest r22, int r23, com.unity3d.ads.core.data.model.OperationType r24, Ga.e r25) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.gatewayclient.CommonGatewayClient.executeRequest(com.unity3d.services.core.network.model.HttpRequest, int, com.unity3d.ads.core.data.model.OperationType, Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0183 -> B:12:0x018a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object executeWithRetry(java.lang.String r30, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest r31, com.unity3d.ads.gatewayclient.RequestPolicy r32, com.unity3d.ads.core.data.model.OperationType r33, Ga.e r34) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.gatewayclient.CommonGatewayClient.executeWithRetry(java.lang.String, gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest, com.unity3d.ads.gatewayclient.RequestPolicy, com.unity3d.ads.core.data.model.OperationType, Ga.e):java.lang.Object");
    }

    private final String getGatewayUrl(String str) {
        return !kotlin.jvm.internal.t.c(str, "https://gateway.unityads.unity3d.com/v1") ? str : this.sessionRepository.getGatewayUrl();
    }

    private final Map getHeaders(int i) {
        Map c = Q.c();
        c.put("Content-Type", u.e("application/x-protobuf"));
        if (i > 0) {
            c.put("X-RETRY-ATTEMPT", u.e(String.valueOf(i)));
        }
        return Q.b(c);
    }

    private final UniversalResponseOuterClass.UniversalResponse getUniversalResponse(HttpResponse httpResponse, OperationType operationType) {
        try {
            Object body = httpResponse.getBody();
            if (body instanceof byte[]) {
                UniversalResponseOuterClass.UniversalResponse parseFrom = UniversalResponseOuterClass.UniversalResponse.parseFrom((byte[]) body);
                kotlin.jvm.internal.t.f(parseFrom, "parseFrom(responseBody)");
                return parseFrom;
            }
            if (!(body instanceof String)) {
                throw new InvalidProtocolBufferException("Could not parse response from gateway service");
            }
            byte[] bytes = ((String) body).getBytes(Za.c.b);
            kotlin.jvm.internal.t.f(bytes, "this as java.lang.String).getBytes(charset)");
            UniversalResponseOuterClass.UniversalResponse parseFrom2 = UniversalResponseOuterClass.UniversalResponse.parseFrom(bytes);
            kotlin.jvm.internal.t.f(parseFrom2, "parseFrom(\n             ….UTF_8)\n                )");
            return parseFrom2;
        } catch (InvalidProtocolBufferException e) {
            DeviceLog.debug("Failed to parse response from gateway service with exception: %s", e.getLocalizedMessage());
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_parse_failure", null, S.l(x.a("operation", operationType.toString()), x.a("reason", "protobuf_parsing"), x.a("reason_debug", httpResponse.getBody().toString())), null, null, null, 58, null);
            UniversalResponseKt.Dsl.Companion companion = UniversalResponseKt.Dsl.Companion;
            UniversalResponseOuterClass.UniversalResponse.Builder newBuilder = UniversalResponseOuterClass.UniversalResponse.newBuilder();
            kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
            UniversalResponseKt.Dsl _create = companion._create(newBuilder);
            ErrorKt.Dsl.Companion companion2 = ErrorKt.Dsl.Companion;
            ErrorOuterClass.Error.Builder newBuilder2 = ErrorOuterClass.Error.newBuilder();
            kotlin.jvm.internal.t.f(newBuilder2, "newBuilder()");
            ErrorKt.Dsl _create2 = companion2._create(newBuilder2);
            _create2.setErrorText("ERROR: Could not parse response from gateway service");
            _create.setError(_create2._build());
            return _create._build();
        }
    }

    private final void sendNetworkErrorDiagnosticEvent(UnityAdsNetworkException unityAdsNetworkException, int i, OperationType operationType, j jVar) {
        if (operationType == OperationType.UNIVERSAL_EVENT) {
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(jVar)), S.o(x.a("operation", operationType.toString()), x.a("retries", String.valueOf(i)), x.a("protocol", String.valueOf(unityAdsNetworkException.getProtocol())), x.a("network_client", String.valueOf(unityAdsNetworkException.getClient())), x.a("reason_code", String.valueOf(unityAdsNetworkException.getCode())), x.a("reason_debug", unityAdsNetworkException.getMessage())), null, null, null, 56, null);
    }

    private final void sendNetworkSuccessDiagnosticEvent(HttpResponse httpResponse, int i, OperationType operationType, j jVar) {
        if (operationType == OperationType.UNIVERSAL_EVENT) {
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(jVar)), S.o(x.a("operation", operationType.toString()), x.a("retries", String.valueOf(i)), x.a("protocol", httpResponse.getProtocol()), x.a("network_client", httpResponse.getClient()), x.a("reason_code", String.valueOf(httpResponse.getStatusCode()))), null, null, null, 56, null);
    }

    private final boolean shouldRetry(int i, long j, int i2) {
        return 400 <= i && i < 600 && j < ((long) i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object request(java.lang.String r21, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest r22, com.unity3d.ads.gatewayclient.RequestPolicy r23, com.unity3d.ads.core.data.model.OperationType r24, Ga.e r25) {
        /*
            r20 = this;
            r0 = r25
            boolean r1 = r0 instanceof com.unity3d.ads.gatewayclient.CommonGatewayClient.request.1
            if (r1 == 0) goto L17
            r1 = r0
            com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1 r1 = (com.unity3d.ads.gatewayclient.CommonGatewayClient.request.1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.label = r2
            r9 = r20
            goto L1e
        L17:
            com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1 r1 = new com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1
            r9 = r20
            r1.<init>(r0)
        L1e:
            java.lang.Object r0 = r1.result
            java.lang.Object r10 = Ha.c.f()
            int r2 = r1.label
            r11 = 1
            if (r2 == 0) goto L3b
            if (r2 != r11) goto L33
            java.lang.Object r1 = r1.L$0
            com.unity3d.ads.gatewayclient.RequestPolicy r1 = (com.unity3d.ads.gatewayclient.RequestPolicy) r1
            Ca.t.b(r0)
            goto L69
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3b:
            Ca.t.b(r0)
            ab.b$a r0 = ab.b.b
            int r0 = r23.getMaxDuration()
            ab.e r2 = ab.e.d
            long r12 = ab.d.s(r0, r2)
            com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2 r0 = new com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2
            r8 = 0
            r2 = r0
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r2.<init>(r4, r5, r6, r7, r8)
            r2 = r23
            r1.L$0 = r2
            r1.label = r11
            java.lang.Object r0 = cb.c1.e(r12, r0, r1)
            if (r0 != r10) goto L68
            return r10
        L68:
            r1 = r2
        L69:
            gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r0 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r0
            if (r0 == 0) goto L6e
            return r0
        L6e:
            com.unity3d.ads.core.data.model.exception.NetworkTimeoutException r0 = new com.unity3d.ads.core.data.model.exception.NetworkTimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Gateway request timed out after "
            r2.append(r3)
            int r1 = r1.getMaxDuration()
            r2.append(r1)
            java.lang.String r1 = "ms"
            r2.append(r1)
            java.lang.String r11 = r2.toString()
            r18 = 126(0x7e, float:1.77E-43)
            r19 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.gatewayclient.CommonGatewayClient.request(java.lang.String, gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest, com.unity3d.ads.gatewayclient.RequestPolicy, com.unity3d.ads.core.data.model.OperationType, Ga.e):java.lang.Object");
    }
}
