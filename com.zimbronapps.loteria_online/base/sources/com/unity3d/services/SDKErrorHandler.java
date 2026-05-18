package com.unity3d.services;

import Ca.I;
import Ca.t;
import Ca.x;
import Da.S;
import Ga.e;
import Ga.i;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.K;
import cb.L;
import cb.N;
import cb.O;
import cb.P;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SDKErrorHandler implements L {
    public static final Companion Companion = new Companion(null);
    public static final String UNITY_PACKAGE = "com.unity3d";
    public static final String UNKNOWN_FILE = "unknown";
    private final AlternativeFlowReader alternativeFlowReader;
    private final K ioDispatcher;
    private final L.b key;
    private final O scope;
    private final SDKMetricsSender sdkMetricsSender;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    @f(c = "com.unity3d.services.SDKErrorHandler$sendDiagnostic$1", f = "SDKErrorHandler.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ String $name;
        final /* synthetic */ String $reason;
        final /* synthetic */ String $scopeName;
        final /* synthetic */ String $stackTrace;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str, String str2, String str3, String str4, e eVar) {
            super(2, eVar);
            this.$name = str;
            this.$reason = str2;
            this.$stackTrace = str3;
            this.$scopeName = str4;
        }

        public final e create(Object obj, e eVar) {
            return SDKErrorHandler.this.new 1(this.$name, this.$reason, this.$stackTrace, this.$scopeName, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            SendDiagnosticEvent.DefaultImpls.invoke$default(SDKErrorHandler.access$getSendDiagnosticEvent$p(SDKErrorHandler.this), this.$name, null, S.l(x.a("reason", this.$reason), x.a("reason_debug", this.$stackTrace), x.a("coroutine_name", this.$scopeName)), null, null, null, 58, null);
            return I.a;
        }
    }

    public SDKErrorHandler(K ioDispatcher, AlternativeFlowReader alternativeFlowReader, SendDiagnosticEvent sendDiagnosticEvent, SDKMetricsSender sdkMetricsSender) {
        kotlin.jvm.internal.t.g(ioDispatcher, "ioDispatcher");
        kotlin.jvm.internal.t.g(alternativeFlowReader, "alternativeFlowReader");
        kotlin.jvm.internal.t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.t.g(sdkMetricsSender, "sdkMetricsSender");
        this.ioDispatcher = ioDispatcher;
        this.alternativeFlowReader = alternativeFlowReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sdkMetricsSender = sdkMetricsSender;
        this.scope = P.h(P.a(ioDispatcher), new N("SDKErrorHandler"));
        this.key = L.O8;
    }

    public static final /* synthetic */ SendDiagnosticEvent access$getSendDiagnosticEvent$p(SDKErrorHandler sDKErrorHandler) {
        return sDKErrorHandler.sendDiagnosticEvent;
    }

    private final String retrieveCoroutineName(i iVar) {
        String x;
        N n = (N) iVar.get(N.b);
        return (n == null || (x = n.x()) == null) ? "unknown" : x;
    }

    private final void sendDiagnostic(String str, String str2, String str3, String str4) {
        cb.i.d(this.scope, null, null, new 1(str, str2, str4, str3, null), 3, null);
    }

    private final void sendMetric(Metric metric) {
        this.sdkMetricsSender.sendMetric(metric);
    }

    public Object fold(Object obj, p pVar) {
        return L.a.a(this, obj, pVar);
    }

    public i.b get(i.c cVar) {
        return L.a.b(this, cVar);
    }

    public void handleException(i context, Throwable exception) {
        kotlin.jvm.internal.t.g(context, "context");
        kotlin.jvm.internal.t.g(exception, "exception");
        String retrieveCoroutineName = retrieveCoroutineName(context);
        String str = exception instanceof NullPointerException ? "native_exception_npe" : exception instanceof OutOfMemoryError ? "native_exception_oom" : exception instanceof IllegalStateException ? "native_exception_ise" : exception instanceof SecurityException ? "native_exception_se" : exception instanceof RuntimeException ? "native_exception_re" : "native_exception";
        boolean invoke = this.alternativeFlowReader.invoke();
        String retrieveUnityCrashValue = ExceptionExtensionsKt.retrieveUnityCrashValue(exception);
        DeviceLog.error("Unity Ads SDK encountered an exception: " + retrieveUnityCrashValue);
        if (invoke) {
            sendDiagnostic(str, retrieveUnityCrashValue, retrieveCoroutineName, ExceptionExtensionsKt.getShortenedStackTrace(exception, 15));
        } else {
            sendMetric(new Metric(str, retrieveUnityCrashValue, null, 4, null));
        }
    }

    public i minusKey(i.c cVar) {
        return L.a.c(this, cVar);
    }

    public i plus(i iVar) {
        return L.a.d(this, iVar);
    }

    public L.b getKey() {
        return this.key;
    }
}
