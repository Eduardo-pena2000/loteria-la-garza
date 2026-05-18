package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.AdOperationsConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AdOperationsConfigurationKtKt {
    public static final NativeConfigurationOuterClass.AdOperationsConfiguration -initializeadOperationsConfiguration(l block) {
        t.g(block, "block");
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder newBuilder = NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder();
        t.f(newBuilder, "newBuilder()");
        AdOperationsConfigurationKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.AdOperationsConfiguration copy(NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration, l block) {
        t.g(adOperationsConfiguration, "<this>");
        t.g(block, "block");
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = adOperationsConfiguration.toBuilder();
        t.f(builder, "this.toBuilder()");
        AdOperationsConfigurationKt.Dsl _create = companion._create((NativeConfigurationOuterClass.AdOperationsConfiguration.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
