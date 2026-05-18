package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.CachedAssetsConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CachedAssetsConfigurationKtKt {
    public static final NativeConfigurationOuterClass.CachedAssetsConfiguration -initializecachedAssetsConfiguration(l block) {
        t.g(block, "block");
        CachedAssetsConfigurationKt.Dsl.Companion companion = CachedAssetsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder newBuilder = NativeConfigurationOuterClass.CachedAssetsConfiguration.newBuilder();
        t.f(newBuilder, "newBuilder()");
        CachedAssetsConfigurationKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.CachedAssetsConfiguration copy(NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration, l block) {
        t.g(cachedAssetsConfiguration, "<this>");
        t.g(block, "block");
        CachedAssetsConfigurationKt.Dsl.Companion companion = CachedAssetsConfigurationKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = cachedAssetsConfiguration.toBuilder();
        t.f(builder, "this.toBuilder()");
        CachedAssetsConfigurationKt.Dsl _create = companion._create((NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
