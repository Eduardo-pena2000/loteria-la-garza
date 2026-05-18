package com.unity3d.ads.core.domain.events;

import gatewayprotocol.v1.DiagnosticEventRequestKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class GetDiagnosticEventBatchRequest {
    public final DiagnosticEventRequestOuterClass.DiagnosticEventRequest invoke(List diagnosticEvents) {
        t.g(diagnosticEvents, "diagnosticEvents");
        DiagnosticEventRequestKt.Dsl.Companion companion = DiagnosticEventRequestKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder newBuilder = DiagnosticEventRequestOuterClass.DiagnosticEventRequest.newBuilder();
        t.f(newBuilder, "newBuilder()");
        DiagnosticEventRequestKt.Dsl _create = companion._create(newBuilder);
        _create.addAllBatch(_create.getBatch(), diagnosticEvents);
        return _create._build();
    }
}
