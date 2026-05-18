package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.InitializationDeviceInfoKt;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializationDeviceInfoKtKt {
    public static final InitializationRequestOuterClass.InitializationDeviceInfo -initializeinitializationDeviceInfo(l block) {
        t.g(block, "block");
        InitializationDeviceInfoKt.Dsl.Companion companion = InitializationDeviceInfoKt.Dsl.Companion;
        InitializationRequestOuterClass.InitializationDeviceInfo.Builder newBuilder = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
        t.f(newBuilder, "newBuilder()");
        InitializationDeviceInfoKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final InitializationRequestOuterClass.InitializationDeviceInfo copy(InitializationRequestOuterClass.InitializationDeviceInfo initializationDeviceInfo, l block) {
        t.g(initializationDeviceInfo, "<this>");
        t.g(block, "block");
        InitializationDeviceInfoKt.Dsl.Companion companion = InitializationDeviceInfoKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = initializationDeviceInfo.toBuilder();
        t.f(builder, "this.toBuilder()");
        InitializationDeviceInfoKt.Dsl _create = companion._create((InitializationRequestOuterClass.InitializationDeviceInfo.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
