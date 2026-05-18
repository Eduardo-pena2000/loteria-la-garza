package com.unity3d.ads.core.domain;

import Ga.e;
import Ia.d;
import Ia.f;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidGetInitializationRequest implements GetInitializationRequest {
    private final GetInitializationRequestPayload getInitializationRequestPayload;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    @f(c = "com.unity3d.ads.core.domain.AndroidGetInitializationRequest", f = "AndroidGetInitializationRequest.kt", l = {11, 15}, m = "invoke")
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
            return AndroidGetInitializationRequest.this.invoke(this);
        }
    }

    public AndroidGetInitializationRequest(GetInitializationRequestPayload getInitializationRequestPayload, GetUniversalRequestForPayLoad getUniversalRequestForPayLoad) {
        t.g(getInitializationRequestPayload, "getInitializationRequestPayload");
        t.g(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        this.getInitializationRequestPayload = getInitializationRequestPayload;
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(Ga.e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.domain.AndroidGetInitializationRequest.invoke.1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.core.domain.AndroidGetInitializationRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequest.invoke.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetInitializationRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetInitializationRequest$invoke$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Ca.t.b(r8)
            goto L75
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.AndroidGetInitializationRequest r2 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequest) r2
            Ca.t.b(r8)
            goto L4d
        L3c:
            Ca.t.b(r8)
            com.unity3d.ads.core.domain.GetInitializationRequestPayload r8 = r7.getInitializationRequestPayload
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L4c
            return r1
        L4c:
            r2 = r7
        L4d:
            gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequest r8 = (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) r8
            gatewayprotocol.v1.UniversalRequestKt r4 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r4 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r5 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()
            java.lang.String r6 = "newBuilder()"
            kotlin.jvm.internal.t.f(r5, r6)
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r4 = r4._create(r5)
            r4.setInitializationRequest(r8)
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r8 = r4._build()
            com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r2 = r2.getUniversalRequestForPayLoad
            r4 = 0
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r8 = r2.invoke(r8, r0)
            if (r8 != r1) goto L75
            return r1
        L75:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetInitializationRequest.invoke(Ga.e):java.lang.Object");
    }
}
