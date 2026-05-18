package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.InitializationRequestKt;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializationRequestKtKt {
    public static final InitializationRequestOuterClass.InitializationRequest -initializeinitializationRequest(l block) {
        t.g(block, "block");
        InitializationRequestKt.Dsl.Companion companion = InitializationRequestKt.Dsl.Companion;
        InitializationRequestOuterClass.InitializationRequest.Builder newBuilder = InitializationRequestOuterClass.InitializationRequest.newBuilder();
        t.f(newBuilder, "newBuilder()");
        InitializationRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final InitializationRequestOuterClass.InitializationRequest copy(InitializationRequestOuterClass.InitializationRequest initializationRequest, l block) {
        t.g(initializationRequest, "<this>");
        t.g(block, "block");
        InitializationRequestKt.Dsl.Companion companion = InitializationRequestKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = initializationRequest.toBuilder();
        t.f(builder, "this.toBuilder()");
        InitializationRequestKt.Dsl _create = companion._create((InitializationRequestOuterClass.InitializationRequest.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ClientInfoOuterClass.ClientInfo getClientInfoOrNull(InitializationRequestOuterClass.InitializationRequestOrBuilder initializationRequestOrBuilder) {
        t.g(initializationRequestOrBuilder, "<this>");
        if (initializationRequestOrBuilder.hasClientInfo()) {
            return initializationRequestOrBuilder.getClientInfo();
        }
        return null;
    }

    public static final InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfoOrNull(InitializationRequestOuterClass.InitializationRequestOrBuilder initializationRequestOrBuilder) {
        t.g(initializationRequestOrBuilder, "<this>");
        if (initializationRequestOrBuilder.hasDeviceInfo()) {
            return initializationRequestOrBuilder.getDeviceInfo();
        }
        return null;
    }
}
