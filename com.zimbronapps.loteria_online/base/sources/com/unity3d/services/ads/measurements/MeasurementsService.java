package com.unity3d.services.ads.measurements;

import P1.m;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import c4.f;
import c4.h;
import c4.i;
import c4.j;
import cb.t0;
import com.unity3d.ads.core.domain.attribution.a;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import h.e;
import kotlin.jvm.internal.t;

@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MeasurementsService {
    private final ISDKDispatchers dispatchers;
    private final IEventSender eventSender;
    private final MeasurementManager measurementManager;

    public MeasurementsService(Context context, ISDKDispatchers dispatchers, IEventSender eventSender) {
        t.g(context, "context");
        t.g(dispatchers, "dispatchers");
        t.g(eventSender, "eventSender");
        this.dispatchers = dispatchers;
        this.eventSender = eventSender;
        this.measurementManager = getMeasurementManager(context);
    }

    private final MeasurementManager getMeasurementManager(Context context) {
        if (Device.getApiLevel() >= 33 && e.a(1000000) >= 4) {
            return f.a(context.getSystemService(c4.e.a()));
        }
        return null;
    }

    public final void checkAvailability() {
        if (Device.getApiLevel() < 33) {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, MeasurementsErrors.ERROR_API_BELOW_33);
            return;
        }
        if (e.a(1000000) < 4) {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, MeasurementsErrors.ERROR_EXTENSION_BELOW_4);
            return;
        }
        if (this.measurementManager == null) {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, MeasurementsErrors.ERROR_MANAGER_NULL);
        } else if (a.a()) {
            i.a(this.measurementManager, t0.a(this.dispatchers.getDefault()), m.a(new MeasurementsStatusReceiver(this.eventSender)));
        } else {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, MeasurementsErrors.ERROR_AD_SERVICES_DISABLED);
        }
    }

    public final void registerClick(String url, InputEvent inputEvent) {
        t.g(url, "url");
        t.g(inputEvent, "inputEvent");
        MeasurementManager measurementManager = this.measurementManager;
        if (measurementManager != null) {
            j.a(measurementManager, Uri.parse(url), inputEvent, t0.a(this.dispatchers.getDefault()), m.a(new MeasurementsReceiver(this.eventSender, MeasurementsEvents.CLICK_SUCCESSFUL, MeasurementsEvents.CLICK_ERROR)));
        }
    }

    public final void registerTrigger(String url) {
        t.g(url, "url");
        MeasurementManager measurementManager = this.measurementManager;
        if (measurementManager != null) {
            h.a(measurementManager, Uri.parse(url), t0.a(this.dispatchers.getDefault()), m.a(new MeasurementsReceiver(this.eventSender, MeasurementsEvents.TRIGGER_SUCCESSFUL, MeasurementsEvents.TRIGGER_ERROR)));
        }
    }

    public final void registerView(String url) {
        t.g(url, "url");
        MeasurementManager measurementManager = this.measurementManager;
        if (measurementManager != null) {
            j.a(measurementManager, Uri.parse(url), (InputEvent) null, t0.a(this.dispatchers.getDefault()), m.a(new MeasurementsReceiver(this.eventSender, MeasurementsEvents.VIEW_SUCCESSFUL, MeasurementsEvents.VIEW_ERROR)));
        }
    }
}
