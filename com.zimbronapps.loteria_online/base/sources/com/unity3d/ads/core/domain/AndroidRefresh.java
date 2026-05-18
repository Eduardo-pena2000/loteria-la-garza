package com.unity3d.ads.core.domain;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.K;
import cb.O;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidRefresh implements Refresh {
    private final K defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetAdDataRefreshRequest getAdDataRefreshRequest;
    private final GetRequestPolicy getRequestPolicy;

    @f(c = "com.unity3d.ads.core.domain.AndroidRefresh", f = "AndroidRefresh.kt", l = {25}, m = "invoke")
    public static final class 1 extends d {
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidRefresh.this.invoke(null, null, this);
        }
    }

    @f(c = "com.unity3d.ads.core.domain.AndroidRefresh$invoke$2", f = "AndroidRefresh.kt", l = {26, 28}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ ByteString $adDataRefreshToken;
        final /* synthetic */ ByteString $opportunityId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(ByteString byteString, ByteString byteString2, e eVar) {
            super(2, eVar);
            this.$adDataRefreshToken = byteString;
            this.$opportunityId = byteString2;
        }

        public final e create(Object obj, e eVar) {
            return AndroidRefresh.this.new 2(this.$adDataRefreshToken, this.$opportunityId, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                GetAdDataRefreshRequest access$getGetAdDataRefreshRequest$p = AndroidRefresh.access$getGetAdDataRefreshRequest$p(AndroidRefresh.this);
                ByteString byteString = this.$adDataRefreshToken;
                ByteString byteString2 = this.$opportunityId;
                this.label = 1;
                obj = access$getGetAdDataRefreshRequest$p.invoke(byteString, byteString2, this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return ((UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getAdDataRefreshResponse();
                }
                t.b(obj);
            }
            RequestPolicy invoke = AndroidRefresh.access$getGetRequestPolicy$p(AndroidRefresh.this).invoke();
            GatewayClient access$getGatewayClient$p = AndroidRefresh.access$getGatewayClient$p(AndroidRefresh.this);
            OperationType operationType = OperationType.REFRESH;
            this.label = 2;
            obj = GatewayClient.DefaultImpls.request$default(access$getGatewayClient$p, null, (UniversalRequestOuterClass.UniversalRequest) obj, invoke, operationType, this, 1, null);
            if (obj == f) {
                return f;
            }
            return ((UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getAdDataRefreshResponse();
        }
    }

    public AndroidRefresh(K defaultDispatcher, GetAdDataRefreshRequest getAdDataRefreshRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient) {
        kotlin.jvm.internal.t.g(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.t.g(getAdDataRefreshRequest, "getAdDataRefreshRequest");
        kotlin.jvm.internal.t.g(getRequestPolicy, "getRequestPolicy");
        kotlin.jvm.internal.t.g(gatewayClient, "gatewayClient");
        this.defaultDispatcher = defaultDispatcher;
        this.getAdDataRefreshRequest = getAdDataRefreshRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    public static final /* synthetic */ GatewayClient access$getGatewayClient$p(AndroidRefresh androidRefresh) {
        return androidRefresh.gatewayClient;
    }

    public static final /* synthetic */ GetAdDataRefreshRequest access$getGetAdDataRefreshRequest$p(AndroidRefresh androidRefresh) {
        return androidRefresh.getAdDataRefreshRequest;
    }

    public static final /* synthetic */ GetRequestPolicy access$getGetRequestPolicy$p(AndroidRefresh androidRefresh) {
        return androidRefresh.getRequestPolicy;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(com.google.protobuf.ByteString r6, com.google.protobuf.ByteString r7, Ga.e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.domain.AndroidRefresh.invoke.1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.core.domain.AndroidRefresh$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidRefresh.invoke.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidRefresh$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidRefresh$invoke$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Ca.t.b(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            Ca.t.b(r8)
            cb.K r8 = r5.defaultDispatcher
            com.unity3d.ads.core.domain.AndroidRefresh$invoke$2 r2 = new com.unity3d.ads.core.domain.AndroidRefresh$invoke$2
            r4 = 0
            r2.<init>(r7, r6, r4)
            r0.label = r3
            java.lang.Object r8 = cb.i.g(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            java.lang.String r6 = "override suspend fun inv…RefreshResponse\n        }"
            kotlin.jvm.internal.t.f(r8, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidRefresh.invoke(com.google.protobuf.ByteString, com.google.protobuf.ByteString, Ga.e):java.lang.Object");
    }
}
