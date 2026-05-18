package com.unity3d.services.core.request.metrics;

import Da.u;
import Da.v;
import android.text.TextUtils;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.InitializationStatusReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MetricSenderWithBatch extends MetricSenderBase {
    private SDKMetricsSender _original;
    private final LinkedBlockingQueue _queue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSenderWithBatch(SDKMetricsSender _original, InitializationStatusReader initializationStatusReader) {
        super(initializationStatusReader);
        t.g(_original, "_original");
        t.g(initializationStatusReader, "initializationStatusReader");
        this._original = _original;
        this._queue = new LinkedBlockingQueue();
    }

    public String getMetricEndPoint() {
        return this._original.getMetricEndPoint();
    }

    public void sendEvent(String event, String str, Map tags) {
        t.g(event, "event");
        t.g(tags, "tags");
        if (event.length() != 0) {
            sendMetrics(u.e(new Metric(event, str, tags)));
            return;
        }
        DeviceLog.debug("Metric event not sent due to being empty: " + event);
    }

    public void sendMetric(Metric metric) {
        t.g(metric, "metric");
        sendMetrics(u.e(metric));
    }

    public synchronized void sendMetrics(List metrics) {
        t.g(metrics, "metrics");
        this._queue.addAll(metrics);
        if (!TextUtils.isEmpty(this._original.getMetricEndPoint()) && this._queue.size() > 0) {
            List arrayList = new ArrayList();
            this._queue.drainTo(arrayList);
            this._original.sendMetrics(arrayList);
        }
    }

    public final void sendQueueIfNeeded() {
        sendMetrics(v.n());
    }

    public final void updateOriginal(SDKMetricsSender metrics) {
        t.g(metrics, "metrics");
        this._original = metrics;
    }
}
