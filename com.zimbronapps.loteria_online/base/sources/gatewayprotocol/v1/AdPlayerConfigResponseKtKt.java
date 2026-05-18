package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.AdPlayerConfigResponseKt;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.WebviewConfiguration;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AdPlayerConfigResponseKtKt {
    public static final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse -initializeadPlayerConfigResponse(l block) {
        t.g(block, "block");
        AdPlayerConfigResponseKt.Dsl.Companion companion = AdPlayerConfigResponseKt.Dsl.Companion;
        AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder newBuilder = AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.newBuilder();
        t.f(newBuilder, "newBuilder()");
        AdPlayerConfigResponseKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse copy(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse, l block) {
        t.g(adPlayerConfigResponse, "<this>");
        t.g(block, "block");
        AdPlayerConfigResponseKt.Dsl.Companion companion = AdPlayerConfigResponseKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = adPlayerConfigResponse.toBuilder();
        t.f(builder, "this.toBuilder()");
        AdPlayerConfigResponseKt.Dsl _create = companion._create((AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder adPlayerConfigResponseOrBuilder) {
        t.g(adPlayerConfigResponseOrBuilder, "<this>");
        if (adPlayerConfigResponseOrBuilder.hasError()) {
            return adPlayerConfigResponseOrBuilder.getError();
        }
        return null;
    }

    public static final WebviewConfiguration.WebViewConfiguration getWebviewConfigurationOrNull(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder adPlayerConfigResponseOrBuilder) {
        t.g(adPlayerConfigResponseOrBuilder, "<this>");
        if (adPlayerConfigResponseOrBuilder.hasWebviewConfiguration()) {
            return adPlayerConfigResponseOrBuilder.getWebviewConfiguration();
        }
        return null;
    }
}
