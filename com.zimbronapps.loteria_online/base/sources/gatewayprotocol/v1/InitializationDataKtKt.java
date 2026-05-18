package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.InitializationDataKt;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializationDataKtKt {
    public static final InitializationDataOuterClass.InitializationData -initializeinitializationData(l block) {
        t.g(block, "block");
        InitializationDataKt.Dsl.Companion companion = InitializationDataKt.Dsl.Companion;
        InitializationDataOuterClass.InitializationData.Builder newBuilder = InitializationDataOuterClass.InitializationData.newBuilder();
        t.f(newBuilder, "newBuilder()");
        InitializationDataKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final InitializationDataOuterClass.InitializationData copy(InitializationDataOuterClass.InitializationData initializationData, l block) {
        t.g(initializationData, "<this>");
        t.g(block, "block");
        InitializationDataKt.Dsl.Companion companion = InitializationDataKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = initializationData.toBuilder();
        t.f(builder, "this.toBuilder()");
        InitializationDataKt.Dsl _create = companion._create((InitializationDataOuterClass.InitializationData.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final InitializationRequestOuterClass.InitializationRequest getInitializationRequestOrNull(InitializationDataOuterClass.InitializationDataOrBuilder initializationDataOrBuilder) {
        t.g(initializationDataOrBuilder, "<this>");
        if (initializationDataOrBuilder.hasInitializationRequest()) {
            return initializationDataOrBuilder.getInitializationRequest();
        }
        return null;
    }

    public static final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedDataOrNull(InitializationDataOuterClass.InitializationDataOrBuilder initializationDataOrBuilder) {
        t.g(initializationDataOrBuilder, "<this>");
        if (initializationDataOrBuilder.hasSharedData()) {
            return initializationDataOrBuilder.getSharedData();
        }
        return null;
    }
}
