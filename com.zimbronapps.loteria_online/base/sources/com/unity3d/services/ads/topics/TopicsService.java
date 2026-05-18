package com.unity3d.services.ads.topics;

import P1.m;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import android.content.Context;
import cb.t0;
import com.unity3d.ads.core.domain.attribution.a;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import d4.E;
import d4.c;
import d4.d;
import d4.f;
import d4.y;
import d4.z;
import h.e;
import kotlin.jvm.internal.t;

@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TopicsService {
    private final ISDKDispatchers dispatchers;
    private final IEventSender eventSender;
    private final TopicsManager topicsManager;

    public TopicsService(Context context, ISDKDispatchers dispatchers, IEventSender eventSender) {
        t.g(context, "context");
        t.g(dispatchers, "dispatchers");
        t.g(eventSender, "eventSender");
        this.dispatchers = dispatchers;
        this.eventSender = eventSender;
        this.topicsManager = getTopicsManager(context);
    }

    private final TopicsManager getTopicsManager(Context context) {
        if (Device.getApiLevel() >= 33 && e.a(1000000) >= 4) {
            return z.a(context.getSystemService(y.a()));
        }
        return null;
    }

    public final TopicsStatus checkAvailability() {
        return Device.getApiLevel() < 33 ? TopicsStatus.ERROR_API_BELOW_33 : e.a(1000000) < 4 ? TopicsStatus.ERROR_EXTENSION_BELOW_4 : this.topicsManager == null ? TopicsStatus.ERROR_TOPICSMANAGER_NULL : !a.a() ? TopicsStatus.ERROR_AD_SERVICES_DISABLED : TopicsStatus.TOPICS_AVAILABLE;
    }

    public final void getTopics(String adsSdkName, boolean z) {
        t.g(adsSdkName, "adsSdkName");
        TopicsReceiver topicsReceiver = new TopicsReceiver(this.eventSender);
        GetTopicsRequest a = d4.e.a(f.a(d.a(c.a(), adsSdkName), z));
        t.f(a, "Builder().setAdsSdkName(…ecordObservation).build()");
        try {
            TopicsManager topicsManager = this.topicsManager;
            if (topicsManager != null) {
                E.a(topicsManager, a, t0.a(this.dispatchers.getDefault()), m.a(topicsReceiver));
            }
        } catch (Exception e) {
            this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.NOT_AVAILABLE, TopicsErrors.ERROR_EXCEPTION, e.toString());
            DeviceLog.debug("Failed to get topics with error: " + e);
        }
    }
}
