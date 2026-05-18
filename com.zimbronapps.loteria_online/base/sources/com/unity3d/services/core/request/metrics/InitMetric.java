package com.unity3d.services.core.request.metrics;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class InitMetric {
    private static final String INIT_METRIC_ENVIRONMENT_NOT_OK = "native_init_environment_not_ok";
    private static final String INIT_METRIC_ENVIRONMENT_OK = "native_init_environment_ok";

    public static Metric newInitEnvironmentNotOk() {
        return new Metric("native_init_environment_not_ok", null);
    }

    public static Metric newInitEnvironmentOk() {
        return new Metric("native_init_environment_ok", null);
    }
}
