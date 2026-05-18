package com.unity3d.services.core.request.metrics;

import Ca.I;
import Ca.t;
import Da.u;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import Za.E;
import cb.L;
import cb.O;
import cb.i;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import com.unity3d.services.core.properties.InitializationStatusReader;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.P;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class MetricSender extends MetricSenderBase implements IServiceComponent {
    private final MetricCommonTags commonTags;
    private final ISDKDispatchers dispatchers;
    private final HttpClient httpClient;
    private final String metricEndPoint;
    private final String metricSampleRate;
    private final O scope;
    private final String sessionToken;

    @f(c = "com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1", f = "MetricSender.kt", l = {65}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ List $metrics;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(List list, e eVar) {
            super(2, eVar);
            this.$metrics = list;
        }

        public final e create(Object obj, e eVar) {
            return MetricSender.this.new 1(this.$metrics, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object execute;
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                String jSONObject = new JSONObject(new MetricsContainer(MetricSender.access$getMetricSampleRate$p(MetricSender.this), MetricSender.access$getCommonTags$p(MetricSender.this), this.$metrics, MetricSender.access$getSessionToken$p(MetricSender.this)).toMap()).toString();
                kotlin.jvm.internal.t.f(jSONObject, "JSONObject(container.toMap()).toString()");
                String metricEndPoint = MetricSender.this.getMetricEndPoint();
                if (metricEndPoint == null) {
                    metricEndPoint = "";
                }
                HttpRequest httpRequest = new HttpRequest(metricEndPoint, null, RequestType.POST, jSONObject, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131058, null);
                HttpClient access$getHttpClient$p = MetricSender.access$getHttpClient$p(MetricSender.this);
                this.label = 1;
                execute = access$getHttpClient$p.execute(httpRequest, this);
                if (execute == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                execute = obj;
            }
            HttpResponse httpResponse = (HttpResponse) execute;
            if (httpResponse.getStatusCode() / 100 == 2) {
                DeviceLog.debug("Metric " + this.$metrics + " sent to " + MetricSender.this.getMetricEndPoint());
            } else {
                DeviceLog.debug("Metric " + this.$metrics + " failed to send with response code: " + httpResponse.getStatusCode());
            }
            return I.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender(Configuration configuration, InitializationStatusReader initializationStatusReader) {
        super(initializationStatusReader);
        kotlin.jvm.internal.t.g(configuration, "configuration");
        kotlin.jvm.internal.t.g(initializationStatusReader, "initializationStatusReader");
        MetricCommonTags metricCommonTags = new MetricCommonTags();
        metricCommonTags.updateWithConfig(configuration);
        this.commonTags = metricCommonTags;
        this.metricSampleRate = String.valueOf(Sa.c.c(configuration.getMetricSampleRate()));
        this.sessionToken = configuration.getSessionToken();
        ISDKDispatchers iSDKDispatchers = (ISDKDispatchers) getServiceProvider().getRegistry().getService("", P.b(ISDKDispatchers.class));
        this.dispatchers = iSDKDispatchers;
        this.httpClient = (HttpClient) getServiceProvider().getRegistry().getService("", P.b(HttpClient.class));
        this.scope = cb.P.a(iSDKDispatchers.getIo());
        this.metricEndPoint = configuration.getMetricsUrl();
    }

    public static final /* synthetic */ MetricCommonTags access$getCommonTags$p(MetricSender metricSender) {
        return metricSender.commonTags;
    }

    public static final /* synthetic */ HttpClient access$getHttpClient$p(MetricSender metricSender) {
        return metricSender.httpClient;
    }

    public static final /* synthetic */ String access$getMetricSampleRate$p(MetricSender metricSender) {
        return metricSender.metricSampleRate;
    }

    public static final /* synthetic */ String access$getSessionToken$p(MetricSender metricSender) {
        return metricSender.sessionToken;
    }

    public String getMetricEndPoint() {
        return this.metricEndPoint;
    }

    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public void sendEvent(String event, String str, Map tags) {
        kotlin.jvm.internal.t.g(event, "event");
        kotlin.jvm.internal.t.g(tags, "tags");
        if (event.length() != 0) {
            sendMetrics(u.e(new Metric(event, str, tags)));
            return;
        }
        DeviceLog.debug("Metric event not sent due to being null or empty: " + event);
    }

    public void sendMetric(Metric metric) {
        kotlin.jvm.internal.t.g(metric, "metric");
        sendMetrics(u.e(metric));
    }

    public void sendMetrics(List metrics) {
        kotlin.jvm.internal.t.g(metrics, "metrics");
        if (metrics.isEmpty()) {
            DeviceLog.debug("Metrics event not send due to being empty");
            return;
        }
        String metricEndPoint = getMetricEndPoint();
        if (metricEndPoint != null && !E.h0(metricEndPoint)) {
            i.d(this.scope, new MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(L.O8, metrics), null, new 1(metrics, null), 2, null);
            return;
        }
        DeviceLog.debug("Metrics: " + metrics + " was not sent to null or empty endpoint: " + getMetricEndPoint());
    }

    public final void shutdown() {
        this.commonTags.shutdown();
    }
}
