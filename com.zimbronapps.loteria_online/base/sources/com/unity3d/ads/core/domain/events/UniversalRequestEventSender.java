package com.unity3d.ads.core.domain.events;

import Ga.e;
import Ia.d;
import Ia.f;
import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UniversalRequestEventSender {
    private final GatewayClient gatewayClient;
    private final HandleGatewayEventResponse handleGatewayEventResponse;
    private final UniversalRequestTtlValidator universalRequestTtlValidator;

    @f(c = "com.unity3d.ads.core.domain.events.UniversalRequestEventSender", f = "UniversalRequestEventSender.kt", l = {21, 35}, m = "invoke")
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
            return UniversalRequestEventSender.this.invoke(null, null, this);
        }
    }

    public UniversalRequestEventSender(GatewayClient gatewayClient, HandleGatewayEventResponse handleGatewayEventResponse, UniversalRequestTtlValidator universalRequestTtlValidator) {
        t.g(gatewayClient, "gatewayClient");
        t.g(handleGatewayEventResponse, "handleGatewayEventResponse");
        t.g(universalRequestTtlValidator, "universalRequestTtlValidator");
        this.gatewayClient = gatewayClient;
        this.handleGatewayEventResponse = handleGatewayEventResponse;
        this.universalRequestTtlValidator = universalRequestTtlValidator;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest r12, com.unity3d.ads.gatewayclient.RequestPolicy r13, Ga.e r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.core.domain.events.UniversalRequestEventSender.invoke.1
            if (r0 == 0) goto L13
            r0 = r14
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1 r0 = (com.unity3d.ads.core.domain.events.UniversalRequestEventSender.invoke.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1 r0 = new com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r9 = Ha.c.f()
            int r1 = r0.label
            r10 = 2
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 == r2) goto L35
            if (r1 != r10) goto L2d
            Ca.t.b(r14)
            goto L96
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            java.lang.Object r12 = r0.L$0
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender r12 = (com.unity3d.ads.core.domain.events.UniversalRequestEventSender) r12
            Ca.t.b(r14)     // Catch: java.lang.Throwable -> L3d
            goto L65
        L3d:
            r13 = move-exception
            goto L6e
        L3f:
            Ca.t.b(r14)
            com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator r14 = r11.universalRequestTtlValidator
            boolean r14 = r14.invoke(r12, r13)
            if (r14 != 0) goto L4d
            Ca.I r12 = Ca.I.a
            return r12
        L4d:
            Ca.s$a r14 = Ca.s.b     // Catch: java.lang.Throwable -> L6c
            com.unity3d.ads.gatewayclient.GatewayClient r1 = r11.gatewayClient     // Catch: java.lang.Throwable -> L6c
            com.unity3d.ads.core.data.model.OperationType r5 = com.unity3d.ads.core.data.model.OperationType.UNIVERSAL_EVENT     // Catch: java.lang.Throwable -> L6c
            r0.L$0 = r11     // Catch: java.lang.Throwable -> L6c
            r0.label = r2     // Catch: java.lang.Throwable -> L6c
            r2 = 0
            r7 = 1
            r8 = 0
            r3 = r12
            r4 = r13
            r6 = r0
            java.lang.Object r14 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6c
            if (r14 != r9) goto L64
            return r9
        L64:
            r12 = r11
        L65:
            gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r14 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r14     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r13 = Ca.s.b(r14)     // Catch: java.lang.Throwable -> L3d
            goto L78
        L6c:
            r13 = move-exception
            r12 = r11
        L6e:
            Ca.s$a r14 = Ca.s.b
            java.lang.Object r13 = Ca.t.a(r13)
            java.lang.Object r13 = Ca.s.b(r13)
        L78:
            java.lang.Throwable r14 = Ca.s.e(r13)
            boolean r14 = r14 instanceof com.unity3d.ads.core.data.model.exception.GatewayException
            if (r14 == 0) goto L83
            Ca.I r12 = Ca.I.a
            return r12
        L83:
            com.unity3d.ads.core.domain.events.HandleGatewayEventResponse r12 = r12.handleGatewayEventResponse
            Ca.t.b(r13)
            gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r13 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13
            r14 = 0
            r0.L$0 = r14
            r0.label = r10
            java.lang.Object r12 = r12.invoke(r13, r0)
            if (r12 != r9) goto L96
            return r9
        L96:
            Ca.I r12 = Ca.I.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.UniversalRequestEventSender.invoke(gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest, com.unity3d.ads.gatewayclient.RequestPolicy, Ga.e):java.lang.Object");
    }
}
