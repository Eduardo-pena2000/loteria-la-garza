package com.unity3d.services.core.request.metrics;

import Da.S;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface SDKMetricsSender {

    public static final class DefaultImpls {
        public static void sendEvent(SDKMetricsSender sDKMetricsSender, String event) {
            t.g(event, "event");
            sendEvent$default(sDKMetricsSender, event, null, null, 4, null);
        }

        public static /* synthetic */ void sendEvent$default(SDKMetricsSender sDKMetricsSender, String str, String str2, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                map = S.h();
            }
            sDKMetricsSender.sendEvent(str, str2, map);
        }
    }

    String getMetricEndPoint();

    void sendEvent(String str);

    void sendEvent(String str, String str2, Map map);

    void sendMetric(Metric metric);

    void sendMetricWithInitState(Metric metric);

    void sendMetrics(List list);
}
