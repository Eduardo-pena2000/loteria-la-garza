package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestPolicyKt;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RequestPolicyKtKt {
    public static final NativeConfigurationOuterClass.RequestPolicy -initializerequestPolicy(l block) {
        t.g(block, "block");
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestPolicy.newBuilder();
        t.f(newBuilder, "newBuilder()");
        RequestPolicyKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.RequestPolicy copy(NativeConfigurationOuterClass.RequestPolicy requestPolicy, l block) {
        t.g(requestPolicy, "<this>");
        t.g(block, "block");
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = requestPolicy.toBuilder();
        t.f(builder, "this.toBuilder()");
        RequestPolicyKt.Dsl _create = companion._create((NativeConfigurationOuterClass.RequestPolicy.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.RequestRetryPolicy getRetryPolicyOrNull(NativeConfigurationOuterClass.RequestPolicyOrBuilder requestPolicyOrBuilder) {
        t.g(requestPolicyOrBuilder, "<this>");
        if (requestPolicyOrBuilder.hasRetryPolicy()) {
            return requestPolicyOrBuilder.getRetryPolicy();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.RequestTimeoutPolicy getTimeoutPolicyOrNull(NativeConfigurationOuterClass.RequestPolicyOrBuilder requestPolicyOrBuilder) {
        t.g(requestPolicyOrBuilder, "<this>");
        if (requestPolicyOrBuilder.hasTimeoutPolicy()) {
            return requestPolicyOrBuilder.getTimeoutPolicy();
        }
        return null;
    }
}
