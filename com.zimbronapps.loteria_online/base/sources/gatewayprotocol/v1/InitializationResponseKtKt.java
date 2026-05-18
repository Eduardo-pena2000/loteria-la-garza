package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseKt;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializationResponseKtKt {
    public static final InitializationResponseOuterClass.InitializationResponse -initializeinitializationResponse(l block) {
        t.g(block, "block");
        InitializationResponseKt.Dsl.Companion companion = InitializationResponseKt.Dsl.Companion;
        InitializationResponseOuterClass.InitializationResponse.Builder newBuilder = InitializationResponseOuterClass.InitializationResponse.newBuilder();
        t.f(newBuilder, "newBuilder()");
        InitializationResponseKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final InitializationResponseOuterClass.InitializationResponse copy(InitializationResponseOuterClass.InitializationResponse initializationResponse, l block) {
        t.g(initializationResponse, "<this>");
        t.g(block, "block");
        InitializationResponseKt.Dsl.Companion companion = InitializationResponseKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = initializationResponse.toBuilder();
        t.f(builder, "this.toBuilder()");
        InitializationResponseKt.Dsl _create = companion._create((InitializationResponseOuterClass.InitializationResponse.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(InitializationResponseOuterClass.InitializationResponseOrBuilder initializationResponseOrBuilder) {
        t.g(initializationResponseOrBuilder, "<this>");
        if (initializationResponseOrBuilder.hasError()) {
            return initializationResponseOrBuilder.getError();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.NativeConfiguration getNativeConfigurationOrNull(InitializationResponseOuterClass.InitializationResponseOrBuilder initializationResponseOrBuilder) {
        t.g(initializationResponseOrBuilder, "<this>");
        if (initializationResponseOrBuilder.hasNativeConfiguration()) {
            return initializationResponseOrBuilder.getNativeConfiguration();
        }
        return null;
    }
}
