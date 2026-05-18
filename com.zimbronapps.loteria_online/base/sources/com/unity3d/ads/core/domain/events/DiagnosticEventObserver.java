package com.unity3d.ads.core.domain.events;

import Ca.I;
import Ca.t;
import G4.b;
import G4.n;
import G4.o;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.K;
import cb.O;
import cb.P;
import cb.i;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventJob;
import com.unity3d.ads.core.domain.work.UniversalRequestWorkerData;
import fb.g;
import fb.z;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import java.util.List;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DiagnosticEventObserver {
    private final BackgroundWorker backgroundWorker;
    private final K defaultDispatcher;
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final z isRunning;
    private final UniversalRequestDataSource universalRequestDataSource;

    @f(c = "com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2", f = "DiagnosticEventObserver.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        int label;

        @f(c = "com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2$2", f = "DiagnosticEventObserver.kt", l = {42, 45}, m = "invokeSuspend")
        public static final class 2 extends l implements p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DiagnosticEventObserver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(DiagnosticEventObserver diagnosticEventObserver, e eVar) {
                super(2, eVar);
                this.this$0 = diagnosticEventObserver;
            }

            public final e create(Object obj, e eVar) {
                2 r0 = new 2(this.this$0, eVar);
                r0.L$0 = obj;
                return r0;
            }

            public final Object invokeSuspend(Object obj) {
                String str;
                Object f = c.f();
                int i = this.label;
                if (i == 0) {
                    t.b(obj);
                    List list = (List) this.L$0;
                    UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                    DiagnosticEventObserver diagnosticEventObserver = this.this$0;
                    UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.Companion;
                    UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                    kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
                    UniversalRequestKt.PayloadKt.Dsl _create = companion._create(newBuilder);
                    _create.setDiagnosticEventRequest(DiagnosticEventObserver.access$getGetDiagnosticEventBatchRequest$p(diagnosticEventObserver).invoke(list));
                    UniversalRequestOuterClass.UniversalRequest.Payload _build = _create._build();
                    GetUniversalRequestForPayLoad access$getGetUniversalRequestForPayLoad$p = DiagnosticEventObserver.access$getGetUniversalRequestForPayLoad$p(this.this$0);
                    this.label = 1;
                    obj = access$getGetUniversalRequestForPayLoad$p.invoke(_build, this);
                    if (obj == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (String) this.L$0;
                        t.b(obj);
                        UniversalRequestWorkerData universalRequestWorkerData = new UniversalRequestWorkerData(str);
                        BackgroundWorker access$getBackgroundWorker$p = DiagnosticEventObserver.access$getBackgroundWorker$p(this.this$0);
                        b a = new b.a().b(n.b).a();
                        kotlin.jvm.internal.t.f(a, "Builder()\n            .s…TED)\n            .build()");
                        o b = new o.a(DiagnosticEventJob.class).e(a).f(universalRequestWorkerData.invoke()).a("UnityAdsBackgroundWorker").b();
                        kotlin.jvm.internal.t.f(b, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
                        access$getBackgroundWorker$p.getWorkManager().b(b);
                        return I.a;
                    }
                    t.b(obj);
                }
                String uuid = UUID.randomUUID().toString();
                kotlin.jvm.internal.t.f(uuid, "randomUUID().toString()");
                UniversalRequestDataSource access$getUniversalRequestDataSource$p = DiagnosticEventObserver.access$getUniversalRequestDataSource$p(this.this$0);
                byte[] byteArray = ((UniversalRequestOuterClass.UniversalRequest) obj).toByteArray();
                kotlin.jvm.internal.t.f(byteArray, "fullRequest.toByteArray()");
                ByteString byteString = ByteStringsKt.toByteString(byteArray);
                this.L$0 = uuid;
                this.label = 2;
                if (access$getUniversalRequestDataSource$p.set(uuid, byteString, this) == f) {
                    return f;
                }
                str = uuid;
                UniversalRequestWorkerData universalRequestWorkerData2 = new UniversalRequestWorkerData(str);
                BackgroundWorker access$getBackgroundWorker$p2 = DiagnosticEventObserver.access$getBackgroundWorker$p(this.this$0);
                b a2 = new b.a().b(n.b).a();
                kotlin.jvm.internal.t.f(a2, "Builder()\n            .s…TED)\n            .build()");
                o b2 = new o.a(DiagnosticEventJob.class).e(a2).f(universalRequestWorkerData2.invoke()).a("UnityAdsBackgroundWorker").b();
                kotlin.jvm.internal.t.f(b2, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
                access$getBackgroundWorker$p2.getWorkManager().b(b2);
                return I.a;
            }

            public final Object invoke(List list, e eVar) {
                return ((2) create(list, eVar)).invokeSuspend(I.a);
            }
        }

        public 2(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return DiagnosticEventObserver.this.new 2(eVar);
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
            z access$isRunning$p = DiagnosticEventObserver.access$isRunning$p(DiagnosticEventObserver.this);
            do {
                value = access$isRunning$p.getValue();
                bool = (Boolean) value;
                bool.booleanValue();
            } while (!access$isRunning$p.e(value, Ia.b.a(true)));
            if (bool.booleanValue()) {
                return I.a;
            }
            g.z(g.C(DiagnosticEventObserver.access$getDiagnosticEventRepository$p(DiagnosticEventObserver.this).getDiagnosticEvents(), new 2(DiagnosticEventObserver.this, null)), P.a(DiagnosticEventObserver.access$getDefaultDispatcher$p(DiagnosticEventObserver.this)));
            return I.a;
        }
    }

    public DiagnosticEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest, K defaultDispatcher, DiagnosticEventRepository diagnosticEventRepository, UniversalRequestDataSource universalRequestDataSource, BackgroundWorker backgroundWorker) {
        kotlin.jvm.internal.t.g(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        kotlin.jvm.internal.t.g(getDiagnosticEventBatchRequest, "getDiagnosticEventBatchRequest");
        kotlin.jvm.internal.t.g(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.t.g(diagnosticEventRepository, "diagnosticEventRepository");
        kotlin.jvm.internal.t.g(universalRequestDataSource, "universalRequestDataSource");
        kotlin.jvm.internal.t.g(backgroundWorker, "backgroundWorker");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.getDiagnosticEventBatchRequest = getDiagnosticEventBatchRequest;
        this.defaultDispatcher = defaultDispatcher;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.isRunning = fb.P.a(Boolean.FALSE);
    }

    public static final /* synthetic */ BackgroundWorker access$getBackgroundWorker$p(DiagnosticEventObserver diagnosticEventObserver) {
        return diagnosticEventObserver.backgroundWorker;
    }

    public static final /* synthetic */ K access$getDefaultDispatcher$p(DiagnosticEventObserver diagnosticEventObserver) {
        return diagnosticEventObserver.defaultDispatcher;
    }

    public static final /* synthetic */ DiagnosticEventRepository access$getDiagnosticEventRepository$p(DiagnosticEventObserver diagnosticEventObserver) {
        return diagnosticEventObserver.diagnosticEventRepository;
    }

    public static final /* synthetic */ GetDiagnosticEventBatchRequest access$getGetDiagnosticEventBatchRequest$p(DiagnosticEventObserver diagnosticEventObserver) {
        return diagnosticEventObserver.getDiagnosticEventBatchRequest;
    }

    public static final /* synthetic */ GetUniversalRequestForPayLoad access$getGetUniversalRequestForPayLoad$p(DiagnosticEventObserver diagnosticEventObserver) {
        return diagnosticEventObserver.getUniversalRequestForPayLoad;
    }

    public static final /* synthetic */ UniversalRequestDataSource access$getUniversalRequestDataSource$p(DiagnosticEventObserver diagnosticEventObserver) {
        return diagnosticEventObserver.universalRequestDataSource;
    }

    public static final /* synthetic */ z access$isRunning$p(DiagnosticEventObserver diagnosticEventObserver) {
        return diagnosticEventObserver.isRunning;
    }

    public final Object invoke(e eVar) {
        Object g = i.g(this.defaultDispatcher, new 2(null), eVar);
        return g == c.f() ? g : I.a;
    }
}
