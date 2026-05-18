package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.DiagnosticEventsConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DiagnosticEventsConfigurationKtKt {
    public static final NativeConfigurationOuterClass.DiagnosticEventsConfiguration -initializediagnosticEventsConfiguration(l block) {
        t.g(block, "block");
        DiagnosticEventsConfigurationKt.Dsl.Companion companion = DiagnosticEventsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder newBuilder = NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder();
        t.f(newBuilder, "newBuilder()");
        DiagnosticEventsConfigurationKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.DiagnosticEventsConfiguration copy(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration, l block) {
        t.g(diagnosticEventsConfiguration, "<this>");
        t.g(block, "block");
        DiagnosticEventsConfigurationKt.Dsl.Companion companion = DiagnosticEventsConfigurationKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = diagnosticEventsConfiguration.toBuilder();
        t.f(builder, "this.toBuilder()");
        DiagnosticEventsConfigurationKt.Dsl _create = companion._create((NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
