package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class NativeConfigurationKtKt {
    public static final NativeConfigurationOuterClass.NativeConfiguration -initializenativeConfiguration(l block) {
        t.g(block, "block");
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.NativeConfiguration.Builder newBuilder = NativeConfigurationOuterClass.NativeConfiguration.newBuilder();
        t.f(newBuilder, "newBuilder()");
        NativeConfigurationKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.NativeConfiguration copy(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, l block) {
        t.g(nativeConfiguration, "<this>");
        t.g(block, "block");
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = nativeConfiguration.toBuilder();
        t.f(builder, "this.toBuilder()");
        NativeConfigurationKt.Dsl _create = companion._create((NativeConfigurationOuterClass.NativeConfiguration.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.AdOperationsConfiguration getAdOperationsOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        t.g(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasAdOperations()) {
            return nativeConfigurationOrBuilder.getAdOperations();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.RequestPolicy getAdPolicyOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        t.g(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasAdPolicy()) {
            return nativeConfigurationOrBuilder.getAdPolicy();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedAssetsConfigurationOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        t.g(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasCachedAssetsConfiguration()) {
            return nativeConfigurationOrBuilder.getCachedAssetsConfiguration();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedWebviewFilesConfigurationOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        t.g(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasCachedWebviewFilesConfiguration()) {
            return nativeConfigurationOrBuilder.getCachedWebviewFilesConfiguration();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.DebugSettings getDebugSettingsOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        t.g(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasDebugSettings()) {
            return nativeConfigurationOrBuilder.getDebugSettings();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDiagnosticEventsOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        t.g(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasDiagnosticEvents()) {
            return nativeConfigurationOrBuilder.getDiagnosticEvents();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.RequestPolicy getDownloadPolicyOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        t.g(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasDownloadPolicy()) {
            return nativeConfigurationOrBuilder.getDownloadPolicy();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.FeatureFlags getFeatureFlagsOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        t.g(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasFeatureFlags()) {
            return nativeConfigurationOrBuilder.getFeatureFlags();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.RequestPolicy getInitPolicyOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        t.g(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasInitPolicy()) {
            return nativeConfigurationOrBuilder.getInitPolicy();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicyOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        t.g(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasOperativeEventPolicy()) {
            return nativeConfigurationOrBuilder.getOperativeEventPolicy();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.RequestPolicy getOtherPolicyOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        t.g(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasOtherPolicy()) {
            return nativeConfigurationOrBuilder.getOtherPolicy();
        }
        return null;
    }
}
