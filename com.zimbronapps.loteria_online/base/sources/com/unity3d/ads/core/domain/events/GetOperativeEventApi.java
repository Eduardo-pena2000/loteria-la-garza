package com.unity3d.ads.core.domain.events;

import Ca.I;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class GetOperativeEventApi {
    private final OperativeEventRepository operativeEventRepository;
    private final GetOperativeEventRequest operativeEventRequest;

    @f(c = "com.unity3d.ads.core.domain.events.GetOperativeEventApi", f = "GetOperativeEventApi.kt", l = {21}, m = "invoke")
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
            return GetOperativeEventApi.this.invoke(null, null, null, null, null, null, this);
        }
    }

    public GetOperativeEventApi(OperativeEventRepository operativeEventRepository, GetOperativeEventRequest operativeEventRequest) {
        t.g(operativeEventRepository, "operativeEventRepository");
        t.g(operativeEventRequest, "operativeEventRequest");
        this.operativeEventRepository = operativeEventRepository;
        this.operativeEventRequest = operativeEventRequest;
    }

    public static /* synthetic */ Object invoke$default(GetOperativeEventApi getOperativeEventApi, OperativeEventRequestOuterClass.OperativeEventType operativeEventType, ByteString byteString, ByteString byteString2, ByteString byteString3, String str, AdFormatOuterClass.AdFormat adFormat, e eVar, int i, Object obj) {
        return getOperativeEventApi.invoke(operativeEventType, byteString, byteString2, byteString3, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : adFormat, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType r12, com.google.protobuf.ByteString r13, com.google.protobuf.ByteString r14, com.google.protobuf.ByteString r15, java.lang.String r16, gatewayprotocol.v1.AdFormatOuterClass.AdFormat r17, Ga.e r18) {
        /*
            r11 = this;
            r0 = r11
            r1 = r18
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke.1
            if (r2 == 0) goto L17
            r2 = r1
            com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1 r2 = (com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke.1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
        L15:
            r10 = r2
            goto L1d
        L17:
            com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1 r2 = new com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1
            r2.<init>(r1)
            goto L15
        L1d:
            java.lang.Object r1 = r10.result
            java.lang.Object r2 = Ha.c.f()
            int r3 = r10.label
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            java.lang.Object r2 = r10.L$0
            com.unity3d.ads.core.domain.events.GetOperativeEventApi r2 = (com.unity3d.ads.core.domain.events.GetOperativeEventApi) r2
            Ca.t.b(r1)
            goto L53
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            Ca.t.b(r1)
            com.unity3d.ads.core.domain.events.GetOperativeEventRequest r3 = r0.operativeEventRequest
            r10.L$0 = r0
            r10.label = r4
            r4 = r12
            r5 = r14
            r6 = r13
            r7 = r15
            r8 = r16
            r9 = r17
            java.lang.Object r1 = r3.invoke(r4, r5, r6, r7, r8, r9, r10)
            if (r1 != r2) goto L52
            return r2
        L52:
            r2 = r0
        L53:
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest r1 = (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) r1
            com.unity3d.ads.core.data.repository.OperativeEventRepository r2 = r2.operativeEventRepository
            r2.addOperativeEvent(r1)
            Ca.I r1 = Ca.I.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, com.google.protobuf.ByteString, com.google.protobuf.ByteString, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.AdFormatOuterClass$AdFormat, Ga.e):java.lang.Object");
    }

    public final Object invoke(OperativeEventRequestOuterClass.OperativeEventType operativeEventType, AdObject adObject, ByteString byteString, e eVar) {
        Object invoke = invoke(operativeEventType, adObject.getOpportunityId(), adObject.getTrackingToken(), byteString, adObject.getPlayerServerId(), (adObject.getAdType() == DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER ? this : null) != null ? AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER : null, eVar);
        return invoke == c.f() ? invoke : I.a;
    }
}
