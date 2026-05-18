package com.unity3d.services.ads.measurements;

import android.annotation.SuppressLint;
import android.os.OutcomeReceiver;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.jvm.internal.t;

@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MeasurementsReceiver implements OutcomeReceiver {
    private final MeasurementsEvents errorEvent;
    private final IEventSender eventSender;
    private final MeasurementsEvents successEvent;

    public MeasurementsReceiver(IEventSender eventSender, MeasurementsEvents successEvent, MeasurementsEvents errorEvent) {
        t.g(eventSender, "eventSender");
        t.g(successEvent, "successEvent");
        t.g(errorEvent, "errorEvent");
        this.eventSender = eventSender;
        this.successEvent = successEvent;
        this.errorEvent = errorEvent;
    }

    public void onResult(Object p0) {
        t.g(p0, "p0");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, this.successEvent, new Object[0]);
    }

    public void onError(Exception error) {
        t.g(error, "error");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, this.errorEvent, error.toString());
    }
}
