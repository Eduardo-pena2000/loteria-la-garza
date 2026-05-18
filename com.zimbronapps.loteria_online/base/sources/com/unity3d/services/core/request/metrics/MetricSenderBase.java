package com.unity3d.services.core.request.metrics;

import Ca.x;
import Da.Q;
import Da.S;
import com.unity3d.services.core.properties.InitializationStatusReader;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class MetricSenderBase implements SDKMetricsSender {
    private final InitializationStatusReader _initStatusReader;

    public MetricSenderBase(InitializationStatusReader _initStatusReader) {
        t.g(_initStatusReader, "_initStatusReader");
        this._initStatusReader = _initStatusReader;
    }

    public void sendEvent(String str) {
        SDKMetricsSender.DefaultImpls.sendEvent(this, str);
    }

    public void sendMetricWithInitState(Metric metric) {
        t.g(metric, "metric");
        sendMetric(Metric.copy$default(metric, null, null, S.r(metric.getTags(), Q.f(x.a("state", this._initStatusReader.getInitializationStateString(SdkProperties.getCurrentInitializationState())))), 3, null));
    }
}
