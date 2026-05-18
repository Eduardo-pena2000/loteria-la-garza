package com.unity3d.ads.core.domain;

import android.content.Context;
import cb.K;
import cb.O;
import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.banners.BannerViewCache;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonGetAdPlayer implements GetAdPlayer {
    private final O adPlayerScope;
    private final AdRepository adRepository;
    private final Context context;
    private final K defaultDispatcher;
    private final DeviceInfoRepository deviceInfoRepository;
    private final LifecycleDataSource lifecycleDataSource;
    private final OfferwallManager offerwallManager;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final OrientationRepository orientationRepository;
    private final ScarManager scarManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public CommonGetAdPlayer(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, SendDiagnosticEvent sendDiagnosticEvent, K defaultDispatcher, O adPlayerScope, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager, OfferwallManager offerwallManager, AdRepository adRepository, LifecycleDataSource lifecycleDataSource, OrientationRepository orientationRepository, Context context) {
        t.g(deviceInfoRepository, "deviceInfoRepository");
        t.g(sessionRepository, "sessionRepository");
        t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        t.g(defaultDispatcher, "defaultDispatcher");
        t.g(adPlayerScope, "adPlayerScope");
        t.g(openMeasurementRepository, "openMeasurementRepository");
        t.g(scarManager, "scarManager");
        t.g(offerwallManager, "offerwallManager");
        t.g(adRepository, "adRepository");
        t.g(lifecycleDataSource, "lifecycleDataSource");
        t.g(orientationRepository, "orientationRepository");
        t.g(context, "context");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.defaultDispatcher = defaultDispatcher;
        this.adPlayerScope = adPlayerScope;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.offerwallManager = offerwallManager;
        this.adRepository = adRepository;
        this.lifecycleDataSource = lifecycleDataSource;
        this.orientationRepository = orientationRepository;
        this.context = context;
    }

    public AdPlayer invoke(WebViewBridge webviewBridge, AndroidWebViewContainer webviewContainer, ByteString opportunityId) {
        t.g(webviewBridge, "webviewBridge");
        t.g(webviewContainer, "webviewContainer");
        t.g(opportunityId, "opportunityId");
        WebViewAdPlayer webViewAdPlayer = new WebViewAdPlayer(webviewBridge, this.deviceInfoRepository, this.sessionRepository, this.defaultDispatcher, this.sendDiagnosticEvent, webviewContainer, this.adPlayerScope);
        if (BannerViewCache.getInstance().getBannerView(ProtobufExtensionsKt.toUUID(opportunityId).toString()) != null) {
            String uuid = ProtobufExtensionsKt.toUUID(opportunityId).toString();
            OpenMeasurementRepository openMeasurementRepository = this.openMeasurementRepository;
            ScarManager scarManager = this.scarManager;
            LifecycleDataSource lifecycleDataSource = this.lifecycleDataSource;
            Context context = this.context;
            t.f(uuid, "toString()");
            return new AndroidEmbeddableWebViewAdPlayer(webViewAdPlayer, uuid, webviewContainer, openMeasurementRepository, scarManager, lifecycleDataSource, context);
        }
        String uuid2 = ProtobufExtensionsKt.toUUID(opportunityId).toString();
        DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
        SessionRepository sessionRepository = this.sessionRepository;
        OpenMeasurementRepository openMeasurementRepository2 = this.openMeasurementRepository;
        ScarManager scarManager2 = this.scarManager;
        OfferwallManager offerwallManager = this.offerwallManager;
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        AdRepository adRepository = this.adRepository;
        OrientationRepository orientationRepository = this.orientationRepository;
        Context context2 = this.context;
        t.f(uuid2, "toString()");
        return new AndroidFullscreenWebViewAdPlayer(webViewAdPlayer, uuid2, webviewContainer, deviceInfoRepository, sessionRepository, openMeasurementRepository2, scarManager2, offerwallManager, sendDiagnosticEvent, adRepository, orientationRepository, context2);
    }
}
