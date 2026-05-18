package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.DiagnosticTagKt;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DiagnosticTagKtKt {
    public static final DiagnosticEventRequestOuterClass.DiagnosticTag -initializediagnosticTag(l block) {
        t.g(block, "block");
        DiagnosticTagKt.Dsl.Companion companion = DiagnosticTagKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticTag.Builder newBuilder = DiagnosticEventRequestOuterClass.DiagnosticTag.newBuilder();
        t.f(newBuilder, "newBuilder()");
        DiagnosticTagKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DiagnosticEventRequestOuterClass.DiagnosticTag copy(DiagnosticEventRequestOuterClass.DiagnosticTag diagnosticTag, l block) {
        t.g(diagnosticTag, "<this>");
        t.g(block, "block");
        DiagnosticTagKt.Dsl.Companion companion = DiagnosticTagKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = diagnosticTag.toBuilder();
        t.f(builder, "this.toBuilder()");
        DiagnosticTagKt.Dsl _create = companion._create((DiagnosticEventRequestOuterClass.DiagnosticTag.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
