package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.DiagnosticEventRequestKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DiagnosticEventRequestKtKt {
    public static final DiagnosticEventRequestOuterClass.DiagnosticEventRequest -initializediagnosticEventRequest(l block) {
        t.g(block, "block");
        DiagnosticEventRequestKt.Dsl.Companion companion = DiagnosticEventRequestKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder newBuilder = DiagnosticEventRequestOuterClass.DiagnosticEventRequest.newBuilder();
        t.f(newBuilder, "newBuilder()");
        DiagnosticEventRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DiagnosticEventRequestOuterClass.DiagnosticEventRequest copy(DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest, l block) {
        t.g(diagnosticEventRequest, "<this>");
        t.g(block, "block");
        DiagnosticEventRequestKt.Dsl.Companion companion = DiagnosticEventRequestKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = diagnosticEventRequest.toBuilder();
        t.f(builder, "this.toBuilder()");
        DiagnosticEventRequestKt.Dsl _create = companion._create((DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
