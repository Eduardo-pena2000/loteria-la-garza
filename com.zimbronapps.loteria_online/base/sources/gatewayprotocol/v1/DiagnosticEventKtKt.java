package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.DiagnosticEventKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DiagnosticEventKtKt {
    public static final DiagnosticEventRequestOuterClass.DiagnosticEvent -initializediagnosticEvent(l block) {
        t.g(block, "block");
        DiagnosticEventKt.Dsl.Companion companion = DiagnosticEventKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder newBuilder = DiagnosticEventRequestOuterClass.DiagnosticEvent.newBuilder();
        t.f(newBuilder, "newBuilder()");
        DiagnosticEventKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DiagnosticEventRequestOuterClass.DiagnosticEvent copy(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent, l block) {
        t.g(diagnosticEvent, "<this>");
        t.g(block, "block");
        DiagnosticEventKt.Dsl.Companion companion = DiagnosticEventKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = diagnosticEvent.toBuilder();
        t.f(builder, "this.toBuilder()");
        DiagnosticEventKt.Dsl _create = companion._create((DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final TimestampsOuterClass.Timestamps getTimestampsOrNull(DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder diagnosticEventOrBuilder) {
        t.g(diagnosticEventOrBuilder, "<this>");
        if (diagnosticEventOrBuilder.hasTimestamps()) {
            return diagnosticEventOrBuilder.getTimestamps();
        }
        return null;
    }
}
