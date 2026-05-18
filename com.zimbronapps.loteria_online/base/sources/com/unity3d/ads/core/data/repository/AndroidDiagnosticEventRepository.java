package com.unity3d.ads.core.data.repository;

import Ca.I;
import Ca.t;
import Da.v;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.a;
import Qa.p;
import Ya.r;
import cb.K;
import cb.N;
import cb.O;
import cb.P;
import cb.i;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.services.core.log.DeviceLog;
import fb.D;
import fb.F;
import fb.g;
import fb.y;
import fb.z;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidDiagnosticEventRepository implements DiagnosticEventRepository {
    private final y _diagnosticEvents;
    private final Set allowedEvents;
    private final z batch;
    private final Set blockedEvents;
    private final z configured;
    private final O coroutineScope;
    private final D diagnosticEvents;
    private final z enabled;
    private final CoroutineTimer flushTimer;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private int maxBatchSize;

    public static final class 1 extends u implements a {
        public 1() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            AndroidDiagnosticEventRepository.this.flush();
        }
    }

    @f(c = "com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$1", f = "AndroidDiagnosticEventRepository.kt", l = {68}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ List $events;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(List list, e eVar) {
            super(2, eVar);
            this.$events = list;
        }

        public final e create(Object obj, e eVar) {
            return AndroidDiagnosticEventRepository.this.new 1(this.$events, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                y access$get_diagnosticEvents$p = AndroidDiagnosticEventRepository.access$get_diagnosticEvents$p(AndroidDiagnosticEventRepository.this);
                List list = this.$events;
                this.label = 1;
                if (access$get_diagnosticEvents$p.emit(list, this) == f) {
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

    public AndroidDiagnosticEventRepository(CoroutineTimer flushTimer, GetDiagnosticEventRequest getDiagnosticEventRequest, K dispatcher) {
        kotlin.jvm.internal.t.g(flushTimer, "flushTimer");
        kotlin.jvm.internal.t.g(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        kotlin.jvm.internal.t.g(dispatcher, "dispatcher");
        this.flushTimer = flushTimer;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.coroutineScope = P.h(P.a(dispatcher), new N("DiagnosticEventRepository"));
        this.batch = fb.P.a(v.n());
        this.maxBatchSize = Integer.MAX_VALUE;
        this.allowedEvents = Collections.synchronizedSet(new LinkedHashSet());
        this.blockedEvents = Collections.synchronizedSet(new LinkedHashSet());
        Boolean bool = Boolean.FALSE;
        this.enabled = fb.P.a(bool);
        this.configured = fb.P.a(bool);
        y b = F.b(100, 0, null, 6, null);
        this._diagnosticEvents = b;
        this.diagnosticEvents = g.a(b);
    }

    public static final /* synthetic */ Set access$getAllowedEvents$p(AndroidDiagnosticEventRepository androidDiagnosticEventRepository) {
        return androidDiagnosticEventRepository.allowedEvents;
    }

    public static final /* synthetic */ Set access$getBlockedEvents$p(AndroidDiagnosticEventRepository androidDiagnosticEventRepository) {
        return androidDiagnosticEventRepository.blockedEvents;
    }

    public static final /* synthetic */ GetDiagnosticEventRequest access$getGetDiagnosticEventRequest$p(AndroidDiagnosticEventRepository androidDiagnosticEventRepository) {
        return androidDiagnosticEventRepository.getDiagnosticEventRequest;
    }

    public static final /* synthetic */ y access$get_diagnosticEvents$p(AndroidDiagnosticEventRepository androidDiagnosticEventRepository) {
        return androidDiagnosticEventRepository._diagnosticEvents;
    }

    public void addDiagnosticEvent(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        Object value;
        Object value2;
        kotlin.jvm.internal.t.g(diagnosticEvent, "diagnosticEvent");
        if (!((Boolean) this.configured.getValue()).booleanValue()) {
            z zVar = this.batch;
            do {
                value2 = zVar.getValue();
            } while (!zVar.e(value2, Da.D.w0((List) value2, diagnosticEvent)));
        } else if (((Boolean) this.enabled.getValue()).booleanValue()) {
            z zVar2 = this.batch;
            do {
                value = zVar2.getValue();
            } while (!zVar2.e(value, Da.D.w0((List) value, diagnosticEvent)));
            if (((List) this.batch.getValue()).size() >= this.maxBatchSize) {
                flush();
            }
        }
    }

    public void clear() {
        Object value;
        z zVar = this.batch;
        do {
            value = zVar.getValue();
        } while (!zVar.e(value, v.n()));
    }

    public void configure(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticsEventsConfiguration) {
        kotlin.jvm.internal.t.g(diagnosticsEventsConfiguration, "diagnosticsEventsConfiguration");
        this.configured.setValue(Boolean.TRUE);
        this.enabled.setValue(Boolean.valueOf(diagnosticsEventsConfiguration.getEnabled()));
        if (!((Boolean) this.enabled.getValue()).booleanValue()) {
            clear();
            return;
        }
        this.maxBatchSize = diagnosticsEventsConfiguration.getMaxBatchSize();
        Set set = this.allowedEvents;
        List allowedEventsList = diagnosticsEventsConfiguration.getAllowedEventsList();
        kotlin.jvm.internal.t.f(allowedEventsList, "diagnosticsEventsConfiguration.allowedEventsList");
        set.addAll(allowedEventsList);
        Set set2 = this.blockedEvents;
        List blockedEventsList = diagnosticsEventsConfiguration.getBlockedEventsList();
        kotlin.jvm.internal.t.f(blockedEventsList, "diagnosticsEventsConfiguration.blockedEventsList");
        set2.addAll(blockedEventsList);
        this.flushTimer.start(0L, diagnosticsEventsConfiguration.getMaxBatchIntervalMs(), new 1());
    }

    public void flush() {
        Object value;
        if (((Boolean) this.enabled.getValue()).booleanValue()) {
            z zVar = this.batch;
            do {
                value = zVar.getValue();
            } while (!zVar.e(value, v.n()));
            List G = r.G(r.r(r.r(r.z(Da.D.W((Iterable) value), new AndroidDiagnosticEventRepository$flush$events$2(this)), new AndroidDiagnosticEventRepository$flush$events$3(this)), new AndroidDiagnosticEventRepository$flush$events$4(this)));
            if (G.isEmpty()) {
                return;
            }
            DeviceLog.debug("Unity Ads Sending diagnostic batch enabled: " + ((Boolean) this.enabled.getValue()).booleanValue() + " size: " + G.size() + " :: " + G);
            i.d(this.coroutineScope, null, null, new 1(G, null), 3, null);
        }
    }

    public D getDiagnosticEvents() {
        return this.diagnosticEvents;
    }
}
