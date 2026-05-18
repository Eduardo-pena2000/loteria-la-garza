package com.unity3d.ads.core.domain;

import Da.S;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidSendDiagnosticEvent implements SendDiagnosticEvent {
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private final LifecycleDataSource lifecycleDataSource;

    public AndroidSendDiagnosticEvent(DiagnosticEventRepository diagnosticEventRepository, GetDiagnosticEventRequest getDiagnosticEventRequest, LifecycleDataSource lifecycleDataSource) {
        t.g(diagnosticEventRepository, "diagnosticEventRepository");
        t.g(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        t.g(lifecycleDataSource, "lifecycleDataSource");
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.lifecycleDataSource = lifecycleDataSource;
    }

    public void invoke(String event, Double d, Map map, Map map2, AdObject adObject, Integer num) {
        Map linkedHashMap;
        t.g(event, "event");
        Boolean valueOf = adObject != null ? Boolean.valueOf(adObject.isHeaderBidding()) : null;
        ByteString opportunityId = adObject != null ? adObject.getOpportunityId() : null;
        String placementId = adObject != null ? adObject.getPlacementId() : null;
        DiagnosticEventRequestOuterClass.DiagnosticAdType adType = adObject != null ? adObject.getAdType() : null;
        if (map == null || (linkedHashMap = S.C(map)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        Map map3 = linkedHashMap;
        if (adObject != null && adObject.isScarAd()) {
            map3.put("scar", "true");
        }
        if (adObject != null && adObject.isOfferwallAd()) {
            map3.put("offerwall", "true");
        }
        map3.put("app_active", String.valueOf(this.lifecycleDataSource.appIsForeground()));
        this.diagnosticEventRepository.addDiagnosticEvent(this.getDiagnosticEventRequest.invoke(event, map3, map2, d, valueOf, opportunityId, placementId, adType, num));
    }
}
