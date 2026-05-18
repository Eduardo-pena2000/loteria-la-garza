package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import fb.P;
import fb.z;
import gatewayprotocol.v1.DiagnosticEventKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class GetDiagnosticEventRequest {
    private final GetSharedDataTimestamps getSharedDataTimestamps;
    private final z uniqueId;

    public GetDiagnosticEventRequest(GetSharedDataTimestamps getSharedDataTimestamps) {
        t.g(getSharedDataTimestamps, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.uniqueId = P.a(-1);
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(String eventName, Map map, Map map2, Double d, Boolean bool, ByteString byteString, String str, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, Integer num) {
        Object value;
        Integer valueOf;
        t.g(eventName, "eventName");
        DiagnosticEventKt.Dsl.Companion companion = DiagnosticEventKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder newBuilder = DiagnosticEventRequestOuterClass.DiagnosticEvent.newBuilder();
        t.f(newBuilder, "newBuilder()");
        DiagnosticEventKt.Dsl _create = companion._create(newBuilder);
        z zVar = this.uniqueId;
        do {
            value = zVar.getValue();
            valueOf = Integer.valueOf(((Number) value).intValue() + 1);
        } while (!zVar.e(value, valueOf));
        _create.setEventId(valueOf.intValue());
        _create.setEventType(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_CUSTOM);
        _create.setTimestamps(this.getSharedDataTimestamps.invoke());
        _create.setCustomEventType(eventName);
        if (map != null) {
            _create.putAllStringTags(_create.getStringTagsMap(), map);
        }
        if (map2 != null) {
            _create.putAllIntTags(_create.getIntTagsMap(), map2);
        }
        if (d != null) {
            _create.setTimeValue(d.doubleValue());
        }
        if (bool != null) {
            _create.setIsHeaderBidding(bool.booleanValue());
        }
        if (byteString != null) {
            _create.setImpressionOpportunityId(byteString);
        }
        if (str != null) {
            _create.setPlacementId(str);
        }
        if (diagnosticAdType != null) {
            _create.setAdType(diagnosticAdType);
        }
        if (num != null) {
            _create.setHeaderBiddingTokenNumber(num.intValue());
        }
        return _create._build();
    }
}
