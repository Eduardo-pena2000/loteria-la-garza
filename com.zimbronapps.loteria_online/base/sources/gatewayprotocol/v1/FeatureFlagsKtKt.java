package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.FeatureFlagsKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FeatureFlagsKtKt {
    public static final NativeConfigurationOuterClass.FeatureFlags -initializefeatureFlags(l block) {
        t.g(block, "block");
        FeatureFlagsKt.Dsl.Companion companion = FeatureFlagsKt.Dsl.Companion;
        NativeConfigurationOuterClass.FeatureFlags.Builder newBuilder = NativeConfigurationOuterClass.FeatureFlags.newBuilder();
        t.f(newBuilder, "newBuilder()");
        FeatureFlagsKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.FeatureFlags copy(NativeConfigurationOuterClass.FeatureFlags featureFlags, l block) {
        t.g(featureFlags, "<this>");
        t.g(block, "block");
        FeatureFlagsKt.Dsl.Companion companion = FeatureFlagsKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = featureFlags.toBuilder();
        t.f(builder, "this.toBuilder()");
        FeatureFlagsKt.Dsl _create = companion._create((NativeConfigurationOuterClass.FeatureFlags.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
