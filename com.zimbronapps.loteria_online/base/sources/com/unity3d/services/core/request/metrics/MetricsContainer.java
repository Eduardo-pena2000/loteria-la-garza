package com.unity3d.services.core.request.metrics;

import Da.Q;
import Da.w;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.Session;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MetricsContainer {
    public static final Companion Companion = new Companion(null);
    private static final String METRICS_CONTAINER = "m";
    private static final String METRICS_CONTAINER_TAGS = "t";
    private static final String METRIC_CONTAINER_API_LEVEL = "apil";
    private static final String METRIC_CONTAINER_DEVICE_MAKE = "deviceMake";
    private static final String METRIC_CONTAINER_DEVICE_MODEL = "deviceModel";
    private static final String METRIC_CONTAINER_DEVICE_NAME = "deviceName";
    private static final String METRIC_CONTAINER_GAME_ID = "gameId";
    private static final String METRIC_CONTAINER_SAMPLE_RATE = "msr";
    private static final String METRIC_CONTAINER_SESSION_TOKEN = "sTkn";
    private static final String METRIC_CONTAINER_SHARED_SESSION_ID = "shSid";
    private final String apiLevel;
    private final MetricCommonTags commonTags;
    private final String deviceManufacturer;
    private final String deviceModel;
    private final String deviceName;
    private final String gameId;
    private final String metricSampleRate;
    private final List metrics;
    private final String sTkn;
    private final String shSid;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public MetricsContainer(String metricSampleRate, MetricCommonTags commonTags, List metrics, String str) {
        t.g(metricSampleRate, "metricSampleRate");
        t.g(commonTags, "commonTags");
        t.g(metrics, "metrics");
        this.metricSampleRate = metricSampleRate;
        this.commonTags = commonTags;
        this.metrics = metrics;
        this.sTkn = str;
        this.shSid = Session.Default.getId();
        this.apiLevel = String.valueOf(Device.getApiLevel());
        this.deviceModel = Device.getModel();
        this.deviceName = Device.getDevice();
        this.deviceManufacturer = Device.getManufacturer();
        this.gameId = ClientProperties.getGameId();
    }

    public final Map toMap() {
        List list = this.metrics;
        ArrayList arrayList = new ArrayList(w.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Metric) it.next()).toMap());
        }
        Map c = Q.c();
        c.put("msr", this.metricSampleRate);
        c.put("m", arrayList);
        c.put("t", this.commonTags.toMap());
        c.put("shSid", this.shSid);
        c.put("apil", this.apiLevel);
        String str = this.sTkn;
        if (str != null) {
            c.put("sTkn", str);
        }
        String deviceModel = this.deviceModel;
        if (deviceModel != null) {
            t.f(deviceModel, "deviceModel");
            c.put("deviceModel", deviceModel);
        }
        String deviceName = this.deviceName;
        if (deviceName != null) {
            t.f(deviceName, "deviceName");
            c.put("deviceName", deviceName);
        }
        String deviceManufacturer = this.deviceManufacturer;
        if (deviceManufacturer != null) {
            t.f(deviceManufacturer, "deviceManufacturer");
            c.put("deviceMake", deviceManufacturer);
        }
        String gameId = this.gameId;
        if (gameId != null) {
            t.f(gameId, "gameId");
            c.put("gameId", gameId);
        }
        return Q.b(c);
    }
}
