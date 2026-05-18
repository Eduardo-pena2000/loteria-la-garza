package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.DebugSettingsKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DebugSettingsKtKt {
    public static final NativeConfigurationOuterClass.DebugSettings -initializedebugSettings(l block) {
        t.g(block, "block");
        DebugSettingsKt.Dsl.Companion companion = DebugSettingsKt.Dsl.Companion;
        NativeConfigurationOuterClass.DebugSettings.Builder newBuilder = NativeConfigurationOuterClass.DebugSettings.newBuilder();
        t.f(newBuilder, "newBuilder()");
        DebugSettingsKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.DebugSettings copy(NativeConfigurationOuterClass.DebugSettings debugSettings, l block) {
        t.g(debugSettings, "<this>");
        t.g(block, "block");
        DebugSettingsKt.Dsl.Companion companion = DebugSettingsKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = debugSettings.toBuilder();
        t.f(builder, "this.toBuilder()");
        DebugSettingsKt.Dsl _create = companion._create((NativeConfigurationOuterClass.DebugSettings.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
