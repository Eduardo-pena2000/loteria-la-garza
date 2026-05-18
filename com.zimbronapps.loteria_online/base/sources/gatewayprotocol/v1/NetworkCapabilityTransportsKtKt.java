package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.NetworkCapabilityTransportsKt;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class NetworkCapabilityTransportsKtKt {
    public static final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports -initializenetworkCapabilityTransports(l block) {
        t.g(block, "block");
        NetworkCapabilityTransportsKt.Dsl.Companion companion = NetworkCapabilityTransportsKt.Dsl.Companion;
        NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder newBuilder = NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder();
        t.f(newBuilder, "newBuilder()");
        NetworkCapabilityTransportsKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports copy(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports, l block) {
        t.g(networkCapabilityTransports, "<this>");
        t.g(block, "block");
        NetworkCapabilityTransportsKt.Dsl.Companion companion = NetworkCapabilityTransportsKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = networkCapabilityTransports.toBuilder();
        t.f(builder, "this.toBuilder()");
        NetworkCapabilityTransportsKt.Dsl _create = companion._create((NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
