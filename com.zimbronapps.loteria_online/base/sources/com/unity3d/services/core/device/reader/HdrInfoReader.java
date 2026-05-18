package com.unity3d.services.core.device.reader;

import android.app.Activity;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.applovin.impl.sdk.S;
import com.unity3d.services.core.configuration.ExperimentsReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class HdrInfoReader implements IHdrInfoReader {
    private static final AtomicBoolean _hdrMetricsCaptured = new AtomicBoolean(false);
    private static volatile HdrInfoReader _instance;
    private final SDKMetricsSender _sdkMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);

    private HdrInfoReader() {
    }

    public static HdrInfoReader getInstance() {
        if (_instance == null) {
            synchronized (HdrInfoReader.class) {
                try {
                    if (_instance == null) {
                        _instance = new HdrInfoReader();
                    }
                } finally {
                }
            }
        }
        return _instance;
    }

    public void captureHDRCapabilityMetrics(Activity activity, ExperimentsReader experimentsReader) {
        if (activity != null && experimentsReader.getCurrentlyActiveExperiments().isCaptureHDRCapabilitiesEnabled()) {
            if (_hdrMetricsCaptured.compareAndSet(false, true)) {
                List arrayList = new ArrayList(5);
                Display.HdrCapabilities hdrCapabilities = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getHdrCapabilities();
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                for (int i : hdrCapabilities.getSupportedHdrTypes()) {
                    if (i == 1) {
                        z = true;
                    } else if (i == 2) {
                        z2 = true;
                    } else if (i == 3) {
                        z4 = true;
                    } else if (i == 4) {
                        z3 = true;
                    }
                }
                long round = Math.round(hdrCapabilities.getDesiredMaxAverageLuminance());
                long round2 = Math.round(hdrCapabilities.getDesiredMaxLuminance());
                long round3 = Math.round(hdrCapabilities.getDesiredMinLuminance());
                arrayList.add(new Metric("native_device_hdr_lum_max_average", Long.valueOf(round)));
                arrayList.add(new Metric("native_device_hdr_lum_max", Long.valueOf(round2)));
                arrayList.add(new Metric("native_device_hdr_lum_min", Long.valueOf(round3)));
                boolean a = Build.VERSION.SDK_INT >= 26 ? S.a(activity.getResources().getConfiguration()) : false;
                if (z) {
                    arrayList.add(new Metric("native_device_hdr_dolby_vision_success"));
                } else {
                    arrayList.add(new Metric("native_device_hdr_dolby_vision_failure"));
                }
                if (z2) {
                    arrayList.add(new Metric("native_device_hdr_hdr10_success"));
                } else {
                    arrayList.add(new Metric("native_device_hdr_hdr10_failure"));
                }
                if (z3) {
                    arrayList.add(new Metric("native_device_hdr_hdr10_plus_success"));
                } else {
                    arrayList.add(new Metric("native_device_hdr_hdr10_plus_failure"));
                }
                if (z4) {
                    arrayList.add(new Metric("native_device_hdr_hlg_success"));
                } else {
                    arrayList.add(new Metric("native_device_hdr_hlg_failure"));
                }
                if (a) {
                    arrayList.add(new Metric("native_device_hdr_screen_hdr_success"));
                } else {
                    arrayList.add(new Metric("native_device_hdr_screen_hdr_failure"));
                }
                this._sdkMetricsSender.sendMetrics(arrayList);
            }
        }
    }
}
