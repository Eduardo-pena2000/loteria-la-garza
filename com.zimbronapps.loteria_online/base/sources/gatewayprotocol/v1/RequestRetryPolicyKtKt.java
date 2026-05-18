package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestRetryPolicyKt;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RequestRetryPolicyKtKt {
    public static final NativeConfigurationOuterClass.RequestRetryPolicy -initializerequestRetryPolicy(l block) {
        t.g(block, "block");
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder();
        t.f(newBuilder, "newBuilder()");
        RequestRetryPolicyKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.RequestRetryPolicy copy(NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy, l block) {
        t.g(requestRetryPolicy, "<this>");
        t.g(block, "block");
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = requestRetryPolicy.toBuilder();
        t.f(builder, "this.toBuilder()");
        RequestRetryPolicyKt.Dsl _create = companion._create((NativeConfigurationOuterClass.RequestRetryPolicy.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
