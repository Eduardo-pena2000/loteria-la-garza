package com.unity3d.ads.core.domain.work;

import Da.w;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslList;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.DiagnosticEventKt;
import gatewayprotocol.v1.DiagnosticEventRequestKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import java.util.ArrayList;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DiagnosticEventRequestWorkModifier {
    private final SessionRepository sessionRepository;

    public DiagnosticEventRequestWorkModifier(SessionRepository sessionRepository) {
        t.g(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    public final UniversalRequestOuterClass.UniversalRequest invoke(UniversalRequestOuterClass.UniversalRequest universalRequest) {
        t.g(universalRequest, "universalRequest");
        UniversalRequestKt.Dsl.Companion companion = UniversalRequestKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = universalRequest.toBuilder();
        t.f(builder, "this.toBuilder()");
        UniversalRequestKt.Dsl _create = companion._create((UniversalRequestOuterClass.UniversalRequest.Builder) builder);
        UniversalRequestOuterClass.UniversalRequest.Payload payload = _create.getPayload();
        UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder2 = payload.toBuilder();
        t.f(builder2, "this.toBuilder()");
        UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create((UniversalRequestOuterClass.UniversalRequest.Payload.Builder) builder2);
        DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest = _create2.getDiagnosticEventRequest();
        DiagnosticEventRequestKt.Dsl.Companion companion3 = DiagnosticEventRequestKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder3 = diagnosticEventRequest.toBuilder();
        t.f(builder3, "this.toBuilder()");
        DiagnosticEventRequestKt.Dsl _create3 = companion3._create((DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder) builder3);
        DslList<DiagnosticEventRequestOuterClass.DiagnosticEvent> batch = _create3.getBatch();
        ArrayList arrayList = new ArrayList(w.y(batch, 10));
        for (DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent : batch) {
            DiagnosticEventKt.Dsl.Companion companion4 = DiagnosticEventKt.Dsl.Companion;
            GeneratedMessageLite.Builder builder4 = diagnosticEvent.toBuilder();
            t.f(builder4, "this.toBuilder()");
            DiagnosticEventKt.Dsl _create4 = companion4._create((DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder) builder4);
            _create4.putStringTags(_create4.getStringTagsMap(), "same_session", String.valueOf(t.c(universalRequest.getSharedData().getSessionToken(), this.sessionRepository.getSessionToken())));
            arrayList.add(_create4._build());
        }
        _create3.clearBatch(_create3.getBatch());
        _create3.addAllBatch(_create3.getBatch(), arrayList);
        _create2.setDiagnosticEventRequest(_create3._build());
        _create.setPayload(_create2._build());
        return _create._build();
    }
}
