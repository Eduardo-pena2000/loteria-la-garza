package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestTimeoutPolicyKt;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RequestTimeoutPolicyKtKt {
    public static final NativeConfigurationOuterClass.RequestTimeoutPolicy -initializerequestTimeoutPolicy(l block) {
        t.g(block, "block");
        RequestTimeoutPolicyKt.Dsl.Companion companion = RequestTimeoutPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder();
        t.f(newBuilder, "newBuilder()");
        RequestTimeoutPolicyKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.RequestTimeoutPolicy copy(NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy, l block) {
        t.g(requestTimeoutPolicy, "<this>");
        t.g(block, "block");
        RequestTimeoutPolicyKt.Dsl.Companion companion = RequestTimeoutPolicyKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = requestTimeoutPolicy.toBuilder();
        t.f(builder, "this.toBuilder()");
        RequestTimeoutPolicyKt.Dsl _create = companion._create((NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
