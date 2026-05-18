package com.unity3d.ads.core.domain.events;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.b;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.K;
import cb.O;
import cb.P;
import cb.i;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient;
import fb.g;
import fb.z;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TransactionEventObserver {
    private final K defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final ByteStringDataSource iapTransactionStore;
    private final z isRunning;
    private final TransactionEventRepository transactionEventRepository;

    @f(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2", f = "TransactionEventObserver.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        int label;

        @f(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2$2", f = "TransactionEventObserver.kt", l = {44, 46, 55}, m = "invokeSuspend")
        public static final class 2 extends l implements p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TransactionEventObserver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(TransactionEventObserver transactionEventObserver, e eVar) {
                super(2, eVar);
                this.this$0 = transactionEventObserver;
            }

            public final e create(Object obj, e eVar) {
                2 r0 = new 2(this.this$0, eVar);
                r0.L$0 = obj;
                return r0;
            }

            public final Object invoke(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, e eVar) {
                return ((2) create(transactionEventRequest, eVar)).invokeSuspend(I.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = Ha.c.f()
                    int r1 = r12.label
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L2a
                    if (r1 == r4) goto L26
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    Ca.t.b(r13)
                    goto Lac
                L16:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1e:
                    java.lang.Object r1 = r12.L$0
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r1 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r1
                    Ca.t.b(r13)
                    goto L7d
                L26:
                    Ca.t.b(r13)
                    goto L58
                L2a:
                    Ca.t.b(r13)
                    java.lang.Object r13 = r12.L$0
                    gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequest r13 = (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) r13
                    gatewayprotocol.v1.UniversalRequestKt r1 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE
                    gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r1 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r5 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()
                    java.lang.String r6 = "newBuilder()"
                    kotlin.jvm.internal.t.f(r5, r6)
                    gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r1 = r1._create(r5)
                    r1.setTransactionEventRequest(r13)
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r13 = r1._build()
                    com.unity3d.ads.core.domain.events.TransactionEventObserver r1 = r12.this$0
                    com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r1 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGetUniversalRequestForPayLoad$p(r1)
                    r12.label = r4
                    java.lang.Object r13 = r1.invoke(r13, r12)
                    if (r13 != r0) goto L58
                    return r0
                L58:
                    r1 = r13
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r1 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r1
                    com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = r12.this$0
                    com.unity3d.ads.gatewayclient.GatewayClient r4 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGatewayClient$p(r13)
                    com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = r12.this$0
                    com.unity3d.ads.core.domain.GetRequestPolicy r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGetRequestPolicy$p(r13)
                    com.unity3d.ads.gatewayclient.RequestPolicy r7 = r13.invoke()
                    com.unity3d.ads.core.data.model.OperationType r8 = com.unity3d.ads.core.data.model.OperationType.TRANSACTION_EVENT
                    r12.L$0 = r1
                    r12.label = r3
                    r5 = 0
                    r10 = 1
                    r11 = 0
                    r6 = r1
                    r9 = r12
                    java.lang.Object r13 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, r5, r6, r7, r8, r9, r10, r11)
                    if (r13 != r0) goto L7d
                    return r0
                L7d:
                    gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r13 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13
                    gatewayprotocol.v1.ErrorOuterClass$Error r13 = r13.getError()
                    if (r13 == 0) goto Lac
                    com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = r12.this$0
                    com.unity3d.ads.core.data.datasource.ByteStringDataSource r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getIapTransactionStore$p(r13)
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData r1 = r1.getSharedData()
                    gatewayprotocol.v1.TimestampsOuterClass$Timestamps r1 = r1.getTimestamps()
                    com.google.protobuf.Timestamp r1 = r1.getTimestamp()
                    com.google.protobuf.ByteString r1 = r1.toByteString()
                    java.lang.String r3 = "fullRequest.sharedData.t….timestamp.toByteString()"
                    kotlin.jvm.internal.t.f(r1, r3)
                    r3 = 0
                    r12.L$0 = r3
                    r12.label = r2
                    java.lang.Object r13 = r13.set(r1, r12)
                    if (r13 != r0) goto Lac
                    return r0
                Lac:
                    Ca.I r13 = Ca.I.a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.TransactionEventObserver.invoke.2.2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public 2(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return TransactionEventObserver.this.new 2(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Boolean bool;
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            z access$isRunning$p = TransactionEventObserver.access$isRunning$p(TransactionEventObserver.this);
            do {
                value = access$isRunning$p.getValue();
                bool = (Boolean) value;
                bool.booleanValue();
            } while (!access$isRunning$p.e(value, b.a(true)));
            if (bool.booleanValue()) {
                return I.a;
            }
            g.z(g.C(TransactionEventObserver.access$getTransactionEventRepository$p(TransactionEventObserver.this).getTransactionEvents(), new 2(TransactionEventObserver.this, null)), P.a(TransactionEventObserver.access$getDefaultDispatcher$p(TransactionEventObserver.this)));
            return I.a;
        }
    }

    public TransactionEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, K defaultDispatcher, TransactionEventRepository transactionEventRepository, GatewayClient gatewayClient, GetRequestPolicy getRequestPolicy, ByteStringDataSource iapTransactionStore) {
        kotlin.jvm.internal.t.g(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        kotlin.jvm.internal.t.g(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.t.g(transactionEventRepository, "transactionEventRepository");
        kotlin.jvm.internal.t.g(gatewayClient, "gatewayClient");
        kotlin.jvm.internal.t.g(getRequestPolicy, "getRequestPolicy");
        kotlin.jvm.internal.t.g(iapTransactionStore, "iapTransactionStore");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.defaultDispatcher = defaultDispatcher;
        this.transactionEventRepository = transactionEventRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.iapTransactionStore = iapTransactionStore;
        this.isRunning = fb.P.a(Boolean.FALSE);
    }

    public static final /* synthetic */ K access$getDefaultDispatcher$p(TransactionEventObserver transactionEventObserver) {
        return transactionEventObserver.defaultDispatcher;
    }

    public static final /* synthetic */ GatewayClient access$getGatewayClient$p(TransactionEventObserver transactionEventObserver) {
        return transactionEventObserver.gatewayClient;
    }

    public static final /* synthetic */ GetRequestPolicy access$getGetRequestPolicy$p(TransactionEventObserver transactionEventObserver) {
        return transactionEventObserver.getRequestPolicy;
    }

    public static final /* synthetic */ GetUniversalRequestForPayLoad access$getGetUniversalRequestForPayLoad$p(TransactionEventObserver transactionEventObserver) {
        return transactionEventObserver.getUniversalRequestForPayLoad;
    }

    public static final /* synthetic */ ByteStringDataSource access$getIapTransactionStore$p(TransactionEventObserver transactionEventObserver) {
        return transactionEventObserver.iapTransactionStore;
    }

    public static final /* synthetic */ TransactionEventRepository access$getTransactionEventRepository$p(TransactionEventObserver transactionEventObserver) {
        return transactionEventObserver.transactionEventRepository;
    }

    public static final /* synthetic */ z access$isRunning$p(TransactionEventObserver transactionEventObserver) {
        return transactionEventObserver.isRunning;
    }

    public final Object invoke(e eVar) {
        Object g = i.g(this.defaultDispatcher, new 2(null), eVar);
        return g == c.f() ? g : I.a;
    }
}
